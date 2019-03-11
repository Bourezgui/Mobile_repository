#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package connexioWS;

public class CAdxWebServiceXmlCCProxy implements connexioWS.CAdxWebServiceXmlCC {
  private String _endpoint = null;
  private connexioWS.CAdxWebServiceXmlCC cAdxWebServiceXmlCC = null;
  
  public CAdxWebServiceXmlCCProxy() {
    _initCAdxWebServiceXmlCCProxy();
  }
  
  public CAdxWebServiceXmlCCProxy(String endpoint) {
    _endpoint = endpoint;
    _initCAdxWebServiceXmlCCProxy();
  }
  
  private void _initCAdxWebServiceXmlCCProxy() {
    try {
      cAdxWebServiceXmlCC = (new connexioWS.CAdxWebServiceXmlCCServiceLocator()).getCAdxWebServiceXmlCC();
      if (cAdxWebServiceXmlCC != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cAdxWebServiceXmlCC)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cAdxWebServiceXmlCC)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cAdxWebServiceXmlCC != null)
      ((javax.xml.rpc.Stub)cAdxWebServiceXmlCC)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public connexioWS.CAdxWebServiceXmlCC getCAdxWebServiceXmlCC() {
    if (cAdxWebServiceXmlCC == null)
      _initCAdxWebServiceXmlCCProxy();
    return cAdxWebServiceXmlCC;
  }
  
  public connexioWS.CAdxResultXml run(connexioWS.CAdxCallContext callContext, java.lang.String publicName, java.lang.String inputXml) throws java.rmi.RemoteException{
    if (cAdxWebServiceXmlCC == null)
      _initCAdxWebServiceXmlCCProxy();
    return cAdxWebServiceXmlCC.run(callContext, publicName, inputXml);
  }
  
  public connexioWS.CAdxResultXml save(connexioWS.CAdxCallContext callContext, java.lang.String publicName, java.lang.String objectXml) throws java.rmi.RemoteException{
    if (cAdxWebServiceXmlCC == null)
      _initCAdxWebServiceXmlCCProxy();
    return cAdxWebServiceXmlCC.save(callContext, publicName, objectXml);
  }
  
  public connexioWS.CAdxResultXml delete(connexioWS.CAdxCallContext callContext, java.lang.String publicName, connexioWS.CAdxParamKeyValue[] objectKeys) throws java.rmi.RemoteException{
    if (cAdxWebServiceXmlCC == null)
      _initCAdxWebServiceXmlCCProxy();
    return cAdxWebServiceXmlCC.delete(callContext, publicName, objectKeys);
  }
  
  public connexioWS.CAdxResultXml read(connexioWS.CAdxCallContext callContext, java.lang.String publicName, connexioWS.CAdxParamKeyValue[] objectKeys) throws java.rmi.RemoteException{
    if (cAdxWebServiceXmlCC == null)
      _initCAdxWebServiceXmlCCProxy();
    return cAdxWebServiceXmlCC.read(callContext, publicName, objectKeys);
  }
  
  public connexioWS.CAdxResultXml query(connexioWS.CAdxCallContext callContext, java.lang.String publicName, connexioWS.CAdxParamKeyValue[] objectKeys, int listSize) throws java.rmi.RemoteException{
    if (cAdxWebServiceXmlCC == null)
      _initCAdxWebServiceXmlCCProxy();
    return cAdxWebServiceXmlCC.query(callContext, publicName, objectKeys, listSize);
  }
  
  public connexioWS.CAdxResultXml getDescription(connexioWS.CAdxCallContext callContext, java.lang.String publicName) throws java.rmi.RemoteException{
    if (cAdxWebServiceXmlCC == null)
      _initCAdxWebServiceXmlCCProxy();
    return cAdxWebServiceXmlCC.getDescription(callContext, publicName);
  }
  
  public connexioWS.CAdxResultXml modify(connexioWS.CAdxCallContext callContext, java.lang.String publicName, connexioWS.CAdxParamKeyValue[] objectKeys, java.lang.String objectXml) throws java.rmi.RemoteException{
    if (cAdxWebServiceXmlCC == null)
      _initCAdxWebServiceXmlCCProxy();
    return cAdxWebServiceXmlCC.modify(callContext, publicName, objectKeys, objectXml);
  }
  
  public connexioWS.CAdxResultXml actionObject(connexioWS.CAdxCallContext callContext, java.lang.String publicName, java.lang.String actionCode, java.lang.String objectXml) throws java.rmi.RemoteException{
    if (cAdxWebServiceXmlCC == null)
      _initCAdxWebServiceXmlCCProxy();
    return cAdxWebServiceXmlCC.actionObject(callContext, publicName, actionCode, objectXml);
  }
  
  public connexioWS.CAdxResultXml actionObjectKeys(connexioWS.CAdxCallContext callContext, java.lang.String publicName, java.lang.String actionCode, connexioWS.CAdxParamKeyValue[] objectKeys) throws java.rmi.RemoteException{
    if (cAdxWebServiceXmlCC == null)
      _initCAdxWebServiceXmlCCProxy();
    return cAdxWebServiceXmlCC.actionObjectKeys(callContext, publicName, actionCode, objectKeys);
  }
  
  public connexioWS.CAdxResultXml getDataXmlSchema(connexioWS.CAdxCallContext callContext, java.lang.String publicName) throws java.rmi.RemoteException{
    if (cAdxWebServiceXmlCC == null)
      _initCAdxWebServiceXmlCCProxy();
    return cAdxWebServiceXmlCC.getDataXmlSchema(callContext, publicName);
  }
  
  public connexioWS.CAdxResultXml insertLines(connexioWS.CAdxCallContext callContext, java.lang.String publicName, connexioWS.CAdxParamKeyValue[] objectKeys, java.lang.String blocKey, java.lang.String lineKey, java.lang.String lineXml) throws java.rmi.RemoteException{
    if (cAdxWebServiceXmlCC == null)
      _initCAdxWebServiceXmlCCProxy();
    return cAdxWebServiceXmlCC.insertLines(callContext, publicName, objectKeys, blocKey, lineKey, lineXml);
  }
  
  public connexioWS.CAdxResultXml deleteLines(connexioWS.CAdxCallContext callContext, java.lang.String publicName, connexioWS.CAdxParamKeyValue[] objectKeys, java.lang.String blocKey, java.lang.String[] lineKeys) throws java.rmi.RemoteException{
    if (cAdxWebServiceXmlCC == null)
      _initCAdxWebServiceXmlCCProxy();
    return cAdxWebServiceXmlCC.deleteLines(callContext, publicName, objectKeys, blocKey, lineKeys);
  }
  
  
}