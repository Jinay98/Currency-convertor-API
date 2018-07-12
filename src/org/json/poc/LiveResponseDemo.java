package org.json.poc;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.	CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class LiveResponseDemo{
	public static final String ACCESS_KEY = "d032d7882007d149240aaa0836348cc4";
	public static final String BASE_URL = "http://apilayer.net/api/";
	public static final String ENDPOINT = "live";

	// this object is used for executing requests to the (REST) API
	static CloseableHttpClient httpClient = HttpClients.createDefault();
	
	public static void sendConvertRequest(){

		// the "from", "to" and "amount" can be set as variables
		HttpGet get = new HttpGet(BASE_URL + ENDPOINT + "?access_key=" + ACCESS_KEY);
		try {
			CloseableHttpResponse response =  httpClient.execute(get);
			HttpEntity entity = response.getEntity();
			JSONObject jsonObject = new JSONObject(EntityUtils.toString(entity));
			
			System.out.println(jsonObject+"\n");
int i;
float a[]=new a[200];
			// access the parsed JSON objects
			 //System.out.println("From : " + jsonObject.getJSONObject("quotes").getString("from"));
			System.out.println("USD to INR : " + jsonObject.getJSONObject("quotes").getDouble("USDINR"));
			for(i=1;i<=200;i++)
				a[i]= jsonObject.getJSONObject("quotes");
			// System.out.println("Amount : " + jsonObject.getString("source"));
			// System.out.println("Conversion Result : " + jsonObject.getDouble("result"));
			System.out.println("\n");
			response.close();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public static void main(String[] args) throws IOException{
		sendConvertRequest();
		httpClient.close();
	}
}