package com.aimco.ws;

import javax.xml.ws.Endpoint;

public class Publish {

	public static void main(String[] args) {
		
		Endpoint endpoint = Endpoint.publish("http://localhost:8080/cal", new CallWebserviceImpl());
		System.out.println("%%%%%"+endpoint.isPublished());

	}

}
