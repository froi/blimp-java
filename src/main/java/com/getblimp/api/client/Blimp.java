/* github_apache_lic */

package com.getblimp.api.client;

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-2
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */

import com.getblimp.api.utils.BlimpHttpHeaders;
import com.getblimp.api.utils.BlimpResources;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Blimp {
	private String userName = null;
	private String apiKey = null;
	private String applicationId = null;
	private String applicationSecret = null;

	public Blimp(String userName, String apiKey, String applicationId,
			String applicationSecret) {
		super();
		this.userName = userName;
		this.apiKey = apiKey;
		this.applicationId = applicationId;
		this.applicationSecret = applicationSecret;
	}
	
	public String get(BlimpResources resource) {
		
		//Builds the Base endpoint URL
		StringBuilder url = new StringBuilder();
		url.append(BlimpResources.ENDPOINT.resource());
		url.append(resource.resource());

		// Response output variable
		StringBuilder output = null;

        CloseableHttpClient client = HttpClients.createDefault();
		
		//Set http get object and headers
		HttpGet getRequest = new HttpGet(url.toString());
		getRequest.addHeader(BlimpHttpHeaders.AUTHORIZATION.getValue(),
				"ApiKey " + this.userName + ":" + this.apiKey);
		getRequest.addHeader(BlimpHttpHeaders.APPID.getValue(), 
				this.applicationId);
		getRequest.addHeader(BlimpHttpHeaders.APPSECRET.getValue(), 
				this.applicationSecret);
		
		try {
			HttpResponse response = client.execute(getRequest);
			
			if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
				throw new RuntimeException("Request Failed: " +
						"HTTP Status code: " + String.valueOf(
								response.getStatusLine().getStatusCode()));
			}
			
			BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

			String tmpOutput;
			output = new StringBuilder();
			System.out.println("Output from Server .... \n");
			while ((tmpOutput = br.readLine()) != null) {
				output.append(tmpOutput);
			}

			client.close();

		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return output.toString();
	}
	public String getSchema(BlimpResources resource) {
		//Builds the Base endpoint URL
		StringBuilder url = new StringBuilder();
		url.append(BlimpResources.ENDPOINT.resource());
		url.append(resource.resource());
		url.append(BlimpResources.SCHEMA.resource());

		// Response output variable
		StringBuilder output = null;

        CloseableHttpClient client = HttpClients.createDefault();

        //Set http get object and headers
		HttpGet getRequest = new HttpGet(url.toString());
		getRequest.addHeader(BlimpHttpHeaders.AUTHORIZATION.getValue(), 
				"ApiKey " + this.userName + ":" + this.apiKey);
		getRequest.addHeader(BlimpHttpHeaders.APPID.getValue(), 
				this.applicationId);
		getRequest.addHeader(BlimpHttpHeaders.APPSECRET.getValue(), 
				this.applicationSecret);
		
		try {
			HttpResponse response = client.execute(getRequest);
			
			if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
				throw new RuntimeException("Request Failed: " +
						"HTTP Status code: " + String.valueOf(
								response.getStatusLine().getStatusCode()));
			}
			
			BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

			String tmpOutput;
			output = new StringBuilder();
			System.out.println("Output from Server .... \n");
			while ((tmpOutput = br.readLine()) != null) {
				output.append(tmpOutput);
			}
            client.close();

		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return output.toString();
	}
}
