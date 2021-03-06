package wsclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "AccountManagerDelegate", targetNamespace = "http://imp.domain/")
public interface AccountManagerDelegate {

	/**
	 * 
	 * @param arg1
	 * @param arg0
	 * @return returns boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "fetch", targetNamespace = "http://imp.domain/", className = "wsclient.Fetch")
	@ResponseWrapper(localName = "fetchResponse", targetNamespace = "http://imp.domain/", className = "wsclient.FetchResponse")
	public boolean fetch(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") double arg1);

	/**
	 * 
	 * @param arg1
	 * @param arg0
	 * @return returns boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "deposit", targetNamespace = "http://imp.domain/", className = "wsclient.Deposit")
	@ResponseWrapper(localName = "depositResponse", targetNamespace = "http://imp.domain/", className = "wsclient.DepositResponse")
	public boolean deposit(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") double arg1);

	/**
	 * 
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "changepin", targetNamespace = "http://imp.domain/", className = "wsclient.Changepin")
	@ResponseWrapper(localName = "changepinResponse", targetNamespace = "http://imp.domain/", className = "wsclient.ChangepinResponse")
	public boolean changepin(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2);

	/**
	 * 
	 * @param arg0
	 * @return returns double
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "querybalance", targetNamespace = "http://imp.domain/", className = "wsclient.Querybalance")
	@ResponseWrapper(localName = "querybalanceResponse", targetNamespace = "http://imp.domain/", className = "wsclient.QuerybalanceResponse")
	public double querybalance(
			@WebParam(name = "arg0", targetNamespace = "") String arg0);

	/**
	 * 
	 * @param arg1
	 * @param arg0
	 * @return returns boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "login", targetNamespace = "http://imp.domain/", className = "wsclient.Login")
	@ResponseWrapper(localName = "loginResponse", targetNamespace = "http://imp.domain/", className = "wsclient.LoginResponse")
	public boolean login(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1);

}
