package com.aimco.ws;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class CalClient {


	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:8080/cal?wsdl");

		QName qname = new QName("http://ws.aimco.com/","CallWebserviceImplService");
		
		Service service = Service.create(url, qname);
		CallWebservice calserv = service.getPort(CallWebservice.class);
		System.out.println(calserv.add(10,20));
	}

}
