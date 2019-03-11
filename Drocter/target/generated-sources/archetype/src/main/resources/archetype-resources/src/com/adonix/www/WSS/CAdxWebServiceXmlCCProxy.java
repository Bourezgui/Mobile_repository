#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package com.adonix.www.WSS;

public class CAdxWebServiceXmlCCProxy implements com.adonix.www.WSS.CAdxWebServiceXmlCC {
	private String _endpoint = null;
	private com.adonix.www.WSS.CAdxWebServiceXmlCC cAdxWebServiceXmlCC = null;

	public CAdxWebServiceXmlCCProxy() {
		_initCAdxWebServiceXmlCCProxy();
	}

	public CAdxWebServiceXmlCCProxy(String endpoint) {
		_endpoint = endpoint;
		_initCAdxWebServiceXmlCCProxy();
	}

	private void _initCAdxWebServiceXmlCCProxy() {
		try {
			cAdxWebServiceXmlCC = (new com.adonix.www.WSS.CAdxWebServiceXmlCCServiceLocator()).getCAdxWebServiceXmlCC();
			if (cAdxWebServiceXmlCC != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub) cAdxWebServiceXmlCC)._setProperty("javax.xml.rpc.service.endpoint.address",
							_endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) cAdxWebServiceXmlCC)
							._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		} catch (javax.xml.rpc.ServiceException serviceException) {
		}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (cAdxWebServiceXmlCC != null)
			((javax.xml.rpc.Stub) cAdxWebServiceXmlCC)._setProperty("javax.xml.rpc.service.endpoint.address",
					_endpoint);

	}

	public com.adonix.www.WSS.CAdxWebServiceXmlCC getCAdxWebServiceXmlCC() {
		if (cAdxWebServiceXmlCC == null)
			_initCAdxWebServiceXmlCCProxy();
		return cAdxWebServiceXmlCC;
	}

	public com.adonix.www.WSS.CAdxResultXml run(com.adonix.www.WSS.CAdxCallContext callContext,
			java.lang.String publicName, java.lang.String inputXml) throws java.rmi.RemoteException {
		if (cAdxWebServiceXmlCC == null)
			_initCAdxWebServiceXmlCCProxy();
		return cAdxWebServiceXmlCC.run(callContext, publicName, inputXml);
	}

	public com.adonix.www.WSS.CAdxResultXml save(com.adonix.www.WSS.CAdxCallContext callContext,
			java.lang.String publicName, java.lang.String objectXml) throws java.rmi.RemoteException {
		if (cAdxWebServiceXmlCC == null)
			_initCAdxWebServiceXmlCCProxy();
		return cAdxWebServiceXmlCC.save(callContext, publicName, objectXml);
	}

	public com.adonix.www.WSS.CAdxResultXml delete(com.adonix.www.WSS.CAdxCallContext callContext,
			java.lang.String publicName, com.adonix.www.WSS.CAdxParamKeyValue[] objectKeys)
					throws java.rmi.RemoteException {
		if (cAdxWebServiceXmlCC == null)
			_initCAdxWebServiceXmlCCProxy();
		return cAdxWebServiceXmlCC.delete(callContext, publicName, objectKeys);
	}

	public com.adonix.www.WSS.CAdxResultXml read(com.adonix.www.WSS.CAdxCallContext callContext,
			java.lang.String publicName, com.adonix.www.WSS.CAdxParamKeyValue[] objectKeys)
					throws java.rmi.RemoteException {
		if (cAdxWebServiceXmlCC == null)
			_initCAdxWebServiceXmlCCProxy();
		return cAdxWebServiceXmlCC.read(callContext, publicName, objectKeys);
	}

	public com.adonix.www.WSS.CAdxResultXml query(com.adonix.www.WSS.CAdxCallContext callContext,
			java.lang.String publicName, com.adonix.www.WSS.CAdxParamKeyValue[] objectKeys, int listSize)
					throws java.rmi.RemoteException {
		if (cAdxWebServiceXmlCC == null)
			_initCAdxWebServiceXmlCCProxy();
		return cAdxWebServiceXmlCC.query(callContext, publicName, objectKeys, listSize);
	}

	public com.adonix.www.WSS.CAdxResultXml getDescription(com.adonix.www.WSS.CAdxCallContext callContext,
			java.lang.String publicName) throws java.rmi.RemoteException {
		if (cAdxWebServiceXmlCC == null)
			_initCAdxWebServiceXmlCCProxy();
		return cAdxWebServiceXmlCC.getDescription(callContext, publicName);
	}

	public com.adonix.www.WSS.CAdxResultXml modify(com.adonix.www.WSS.CAdxCallContext callContext,
			java.lang.String publicName, com.adonix.www.WSS.CAdxParamKeyValue[] objectKeys, java.lang.String objectXml)
					throws java.rmi.RemoteException {
		if (cAdxWebServiceXmlCC == null)
			_initCAdxWebServiceXmlCCProxy();
		return cAdxWebServiceXmlCC.modify(callContext, publicName, objectKeys, objectXml);
	}

	public com.adonix.www.WSS.CAdxResultXml actionObject(com.adonix.www.WSS.CAdxCallContext callContext,
			java.lang.String publicName, java.lang.String actionCode, java.lang.String objectXml)
					throws java.rmi.RemoteException {
		if (cAdxWebServiceXmlCC == null)
			_initCAdxWebServiceXmlCCProxy();
		return cAdxWebServiceXmlCC.actionObject(callContext, publicName, actionCode, objectXml);
	}

	public com.adonix.www.WSS.CAdxResultXml actionObjectKeys(com.adonix.www.WSS.CAdxCallContext callContext,
			java.lang.String publicName, java.lang.String actionCode, com.adonix.www.WSS.CAdxParamKeyValue[] objectKeys)
					throws java.rmi.RemoteException {
		if (cAdxWebServiceXmlCC == null)
			_initCAdxWebServiceXmlCCProxy();
		return cAdxWebServiceXmlCC.actionObjectKeys(callContext, publicName, actionCode, objectKeys);
	}

	public com.adonix.www.WSS.CAdxResultXml getDataXmlSchema(com.adonix.www.WSS.CAdxCallContext callContext,
			java.lang.String publicName) throws java.rmi.RemoteException {
		if (cAdxWebServiceXmlCC == null)
			_initCAdxWebServiceXmlCCProxy();
		return cAdxWebServiceXmlCC.getDataXmlSchema(callContext, publicName);
	}

	public com.adonix.www.WSS.CAdxResultXml insertLines(com.adonix.www.WSS.CAdxCallContext callContext,
			java.lang.String publicName, com.adonix.www.WSS.CAdxParamKeyValue[] objectKeys, java.lang.String blocKey,
			java.lang.String lineKey, java.lang.String lineXml) throws java.rmi.RemoteException {
		if (cAdxWebServiceXmlCC == null)
			_initCAdxWebServiceXmlCCProxy();
		return cAdxWebServiceXmlCC.insertLines(callContext, publicName, objectKeys, blocKey, lineKey, lineXml);
	}

	public com.adonix.www.WSS.CAdxResultXml deleteLines(com.adonix.www.WSS.CAdxCallContext callContext,
			java.lang.String publicName, com.adonix.www.WSS.CAdxParamKeyValue[] objectKeys, java.lang.String blocKey,
			java.lang.String[] lineKeys) throws java.rmi.RemoteException {
		if (cAdxWebServiceXmlCC == null)
			_initCAdxWebServiceXmlCCProxy();
		return cAdxWebServiceXmlCC.deleteLines(callContext, publicName, objectKeys, blocKey, lineKeys);
	}

}