package com.nix.tryout;

import java.net.MalformedURLException;
import java.net.URL;

public class URLTryout {

	public static void main(String[] args) throws MalformedURLException {

		URL uri = new URL("http://www.amazon.international.co.in");
		
		System.out.println("Protocol : " + uri.getProtocol());
		
		System.out.println("Host : " + uri.getHost());
		
		System.out.println("Port : " + uri.getPort());
		
		System.out.println("Path : " + uri.getPath());		
	}
}
