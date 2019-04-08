package com.nix.tryout.urls;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpResponseTry {
	
	public int getHttpResponseCode(String url) throws IOException {
		
		HttpURLConnection conn = (HttpURLConnection)(new URL(url).openConnection());
		
		conn.setRequestMethod("HEAD");
		
		return conn.getResponseCode();  
	}

	public static void main(String[] args) throws IOException {
		
		HttpResponseTry res = new HttpResponseTry();
		
		System.out.println(res.getHttpResponseCode("https://www.amazon.co.in"));
	}
}