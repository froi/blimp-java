/**********************************************************************************************************************
 * Copyright 2014 Froilan Irizarry                                                                                    *
 * http://froilanirizarry.me                                                                                          *
 * https://github.com/froi                                                                                            *
 *                                                                                                                    *
 * Code can be downloaded, forked, or revied at:                                                                      *
 * 	https://github.com/froi/blimp-java                                                                                *
 *                                                                                                                    *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not                                        *
 * use this file except in compliance with the License. You may obtain a copy of                                      *
 * the License at:                                                                                                    *
 * 	http://www.apache.org/licenses/LICENSE-2.0                                                                        *
 * Unless required by applicable law or agreed to in writing, software                                                *
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT                                          *
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the                                           *
 * License for the specific language governing permissions and limitations under                                      *
 * the License.                                                                                                       *
 **********************************************************************************************************************/

package com.getblimp.api.client;

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-2
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */

import com.getblimp.api.beans.BlimpObject;
import com.getblimp.api.utils.BlimpHttpHeaders;
import com.getblimp.api.utils.BlimpResources;
import com.getblimp.api.utils.HttpMethods;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Blimp {
	private String userName = null;
	private String apiKey = null;
	private String applicationId = null;
	private String applicationSecret = null;
    private ResourceBundle resourceBundle = null;
    private Logger logger = Logger.getLogger(this.getClass().getName());

	public Blimp(String userName, String apiKey, String applicationId, String applicationSecret) {
		super();
		this.userName = userName;
		this.apiKey = apiKey;
		this.applicationId = applicationId;
		this.applicationSecret = applicationSecret;
        this.resourceBundle = ResourceBundle.getBundle("blimp-constants");
        this.logger.setLevel(Level.INFO);
	}
	
	public String fetch(BlimpResources resource) {
		logger.fine("Entering Blimp.fetch method.");

		// Response output variable
		String output = null;

		try {

			output = execute(createRequestMethod(createRequestUrl(resource.resource()), HttpMethods.GET));

		} catch (ClientProtocolException e) {
			errorHandler(e);
		} catch (IOException e) {
            errorHandler(e);
		} catch (Exception e) {
            errorHandler(e);
        }
		return output;
	}

    public String fetch(String resourceUrl) {
        logger.fine("Entering Blimp.fetch method.");

        // Response output variable
        String output = null;

        try {

            output = execute(createRequestMethod(createRequestUrl(resourceUrl), HttpMethods.GET));

        } catch (ClientProtocolException e) {
            errorHandler(e);
        } catch (IOException e) {
            errorHandler(e);
        } catch (Exception e) {
            errorHandler(e);
        }
        return output;
    }
    public String post(BlimpResources resource, BlimpObject data) {
        logger.fine("Entering Blimp.post method.");

        // Response output variable
        String output = null;

        try {

            HttpPost tmpPost =(HttpPost)createRequestMethod(createRequestUrl(resource.resource()), HttpMethods.POST);
            tmpPost.setEntity(new StringEntity(data.toJson()));

            output = execute(tmpPost);

        } catch (ClientProtocolException e) {
            errorHandler(e);
        } catch (IOException e) {
            errorHandler(e);
        } catch (Exception e) {
            errorHandler(e);
        }

        return output;
    }

    public String update(BlimpResources resource, BlimpObject data) {
        logger.fine("Entering Blimp.update method.");

        // Response output variable
        String output = null;

        try {

            HttpPut tmpPut =(HttpPut)createRequestMethod(createRequestUrl(resource.resource()), HttpMethods.PUT);
            tmpPut.setEntity(new StringEntity(data.toJson()));

            output = execute(tmpPut);

        } catch (ClientProtocolException e) {
            errorHandler(e);
        } catch (IOException e) {
            errorHandler(e);
        } catch (Exception e) {
            errorHandler(e);
        }

        return output;
    }

	public String getSchema(BlimpResources resource) {
        logger.fine("Entering Blimp.update method.");

        // Response output variable
        String output = null;

        try {

            output = execute(createRequestMethod(createRequestUrl(
                    resource.resource() + BlimpResources.SCHEMA.resource()), HttpMethods.GET));

        } catch (ClientProtocolException e) {
            errorHandler(e);
        } catch (IOException e) {
            errorHandler(e);
        } catch (Exception e) {
            errorHandler(e);
        }
        return output;
	}
    private String createRequestUrl(String resourceUri) {
        StringBuilder url = new StringBuilder();
        url.append(resourceBundle.getString("base_url")).append(resourceUri);
        logger.fine("Request url: " + url.toString());

        return url.toString();
    }
    private HttpRequestBase createRequestMethod(String url, HttpMethods method) throws Exception{
        HttpRequestBase tmpRequest;

        switch (method) {
            case GET:
                tmpRequest = new HttpGet(url);
                break;
            case POST:
                tmpRequest = new HttpPost(url);
                break;
            case PUT:
                tmpRequest = new HttpPut(url);
                break;
            default:
                throw new Exception("Wrong HTTP method.");
        }

        tmpRequest.addHeader(resourceBundle.getString(BlimpHttpHeaders.AUTHORIZATION.getValue()), "ApiKey " + this.userName + ":" + this.apiKey);
        tmpRequest.addHeader(resourceBundle.getString(BlimpHttpHeaders.APPID.getValue()), this.applicationId);
        tmpRequest.addHeader(resourceBundle.getString(BlimpHttpHeaders.APPSECRET.getValue()), this.applicationSecret);

        return tmpRequest;
    }

    private String execute(HttpRequestBase request) throws IOException, RuntimeException {
        logger.fine("Entering Blimp.execute");

        CloseableHttpClient client = HttpClients.createDefault();

        logger.fine("Blimp.execute executing HTTP method: " + request.getMethod() );
        HttpResponse response = client.execute(request);

        if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
            throw new RuntimeException("Request Failed: " +
                    "HTTP Status code: " + String.valueOf( response.getStatusLine().getStatusCode() ));
        }
        BufferedReader br = new BufferedReader( new InputStreamReader(response.getEntity().getContent()) );

        String tmpOutput;
        StringBuilder output = new StringBuilder();
        System.out.println("Output from Server .... \n");
        while ((tmpOutput = br.readLine()) != null) {
            output.append(tmpOutput);
        }

        client.close();

        return output.toString();
    }

    private void errorHandler(Exception e) {
        logger.severe(e.getMessage());
        if(logger.getLevel().intValue() <= Level.FINE.intValue()) {
            e.printStackTrace();
        }
    }
}
