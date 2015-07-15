package com.aimco.ws;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding(style=Style.RPC)
public interface CallWebservice {
	
	public int add(int x, int y);

}
