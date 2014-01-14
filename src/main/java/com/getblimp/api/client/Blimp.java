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
import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Blimp {
	private String userName = null;
	private String apiKey = null;
	private String applicationId = null;
	private String applicationSecret = null;
    private ResourceBundle resourceBundle = null;
    private String baseUrl = null;
    private final static Logger logger = Logger.getLogger(Blimp.class.getName());

	public Blimp(String userName, String apiKey, String applicationId, String applicationSecret) {
		super();
		this.userName = userName;
		this.apiKey = apiKey;
		this.applicationId = applicationId;
		this.applicationSecret = applicationSecret;
        this.resourceBundle = ResourceBundle.getBundle("blimp-constants");
        this.baseUrl = resourceBundle.getString("base_url");
        Blimp.logger.setLevel(Level.FINER);

	}
	
	public String fetch(BlimpResources resource) {
		logger.fine("Entering Blimp.fetch method.");

		// Response output variable
		String output = null;

		try {
            String tmpUri = new StringBuilder().append(resourceBundle.getString("base_api_uri"))
                    .append(resourceBundle.getString(resource.resource())).toString();

			output = execute(createRequestMethod(createRequestUrl(tmpUri), HttpMethods.GET));

		} catch (ClientProtocolException e) {
			errorHandler(e);
		} catch (IOException e) {
            errorHandler(e);
		} catch (Exception e) {
            errorHandler(e);
        }

        logger.fine("Blimp.fetch output: " + output);
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

        logger.fine("Blimp.fetch output: " + output);
        return output;
    }
    public String post(String resource, BlimpObject data) {
        logger.fine("Entering Blimp.post method.");

        // Response output variable
        String output = null;

        try {

            HttpPost tmpPost =(HttpPost)createRequestMethod(createRequestUrl(resource), HttpMethods.POST);

            tmpPost.setEntity(createStringEntity(data));

            output = execute(tmpPost);

        } catch (UnsupportedEncodingException e) {
            errorHandler(e);
        } catch (ClientProtocolException e) {
            errorHandler(e);
        } catch (IOException e) {
            errorHandler(e);
        } catch (Exception e) {
            errorHandler(e);
        }

        logger.fine("Blimp.post output: " + output);
        return output;
    }

    public String put(String resourceUri, BlimpObject data) {
        logger.fine("Entering Blimp.update method.");

        // Response output variable
        String output = null;

        try {

            HttpPut tmpPut =(HttpPut)createRequestMethod(createRequestUrl(resourceUri), HttpMethods.PUT);

            tmpPut.setEntity(createStringEntity(data));

            output = execute(tmpPut);

        } catch (UnsupportedEncodingException e) {
            errorHandler(e);
        } catch (ClientProtocolException e) {
            errorHandler(e);
        } catch (IOException e) {
            errorHandler(e);
        } catch (Exception e) {
            errorHandler(e);
        }

        logger.fine("Blimp.update output: " + output);
        return output;
    }

    public String patch(String resourceUri, BlimpObject data) {
        logger.fine("Entering Blimp.update method.");

        // Response output variable
        String output = null;

        try {

            HttpPatch tmpPatch =(HttpPatch)createRequestMethod(createRequestUrl(resourceUri), HttpMethods.PATCH);

            tmpPatch.setEntity(createStringEntity(data));

            output = execute(tmpPatch);

        } catch (UnsupportedEncodingException e) {
            errorHandler(e);
        }
        catch (ClientProtocolException e) {
            errorHandler(e);
        } catch (IOException e) {
            errorHandler(e);
        } catch (Exception e) {
            errorHandler(e);
        }

        logger.fine("Blimp.update output: " + output);
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
        logger.fine("Blimp.getSchema output: " + output);
        return output;
	}
    private String createRequestUrl(String resourceUri) {
        logger.fine("Entering Blimp.createRequestUrl");
        StringBuilder url = new StringBuilder();
        url.append(this.baseUrl).append(resourceUri);
        logger.finer("Request url: " + url.toString());

        return url.toString();
    }
    private HttpRequestBase createRequestMethod(String url, HttpMethods method) throws Exception{
        logger.fine("Entering Blimp.createRequestMethod");
        logger.finer("HTTP method: " + method.toString());

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
            case PATCH:
                tmpRequest = new HttpPatch(url);
                break;
            default:
                throw new Exception("Wrong HTTP method.");
        }
        logger.finer("Adding request headers");
        tmpRequest.addHeader(resourceBundle.getString(BlimpHttpHeaders.AUTHORIZATION.getValue()), "ApiKey " + this.userName + ":" + this.apiKey);
        tmpRequest.addHeader(resourceBundle.getString(BlimpHttpHeaders.APPID.getValue()), this.applicationId);
        tmpRequest.addHeader(resourceBundle.getString(BlimpHttpHeaders.APPSECRET.getValue()), this.applicationSecret);

        logger.finer("Created request method: " + tmpRequest.getMethod());
        return tmpRequest;
    }

    private String execute(HttpRequestBase request) throws IOException, RuntimeException {
        logger.fine("Entering Blimp.execute");

        CloseableHttpClient client = HttpClients.createDefault();

        logger.finer("Blimp.execute executing HTTP method: " + request.getMethod());
        HttpResponse response = client.execute(request);

        logger.finer("Response status code: " + String.valueOf(response.getStatusLine().getStatusCode()));
        if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK && response.getStatusLine().getStatusCode() != HttpStatus.SC_ACCEPTED) {
            throw new RuntimeException("Request Failed: " +
                    "HTTP Status code: " + String.valueOf( response.getStatusLine().getStatusCode() ));
        }
        BufferedReader br = new BufferedReader( new InputStreamReader(response.getEntity().getContent()) );

        logger.finer("Reading response entity.");
        logger.finer("Output from Server ....");
        String tmpOutput;
        StringBuilder output = new StringBuilder();
        while ((tmpOutput = br.readLine()) != null) {
            output.append(tmpOutput);
        }

        client.close();

        logger.finer("Blimp.execute output: " + output.toString());
        return output.toString();
    }

    private void errorHandler(Exception e) {
        logger.fine("Entering Blimp.errorHandler.");
        logger.severe(e.getMessage());
        if(logger.getLevel().equals(Level.FINEST)) {
            e.printStackTrace();
        }
    }

    private StringEntity createStringEntity(BlimpObject data) throws UnsupportedEncodingException {
        StringEntity entity = new StringEntity(data.toJson());
        entity.setContentType(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
        return entity;
    }
}
