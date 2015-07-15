package com.aimco.ws;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(endpointInterface="com.aimco.ws.CallWebservice")
@SOAPBinding(style=Style.RPC)
public class CallWebserviceImpl implements CallWebservice{

	@Override
	public int add(int x, int y) {
		return x+y;
	}

}
