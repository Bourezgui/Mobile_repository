#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * CAdxWebServiceXmlCC.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connexioWS;

public interface CAdxWebServiceXmlCC extends java.rmi.Remote {
    public connexioWS.CAdxResultXml run(connexioWS.CAdxCallContext callContext, java.lang.String publicName, java.lang.String inputXml) throws java.rmi.RemoteException;
    public connexioWS.CAdxResultXml save(connexioWS.CAdxCallContext callContext, java.lang.String publicName, java.lang.String objectXml) throws java.rmi.RemoteException;
    public connexioWS.CAdxResultXml delete(connexioWS.CAdxCallContext callContext, java.lang.String publicName, connexioWS.CAdxParamKeyValue[] objectKeys) throws java.rmi.RemoteException;
    public connexioWS.CAdxResultXml read(connexioWS.CAdxCallContext callContext, java.lang.String publicName, connexioWS.CAdxParamKeyValue[] objectKeys) throws java.rmi.RemoteException;
    public connexioWS.CAdxResultXml query(connexioWS.CAdxCallContext callContext, java.lang.String publicName, connexioWS.CAdxParamKeyValue[] objectKeys, int listSize) throws java.rmi.RemoteException;
    public connexioWS.CAdxResultXml getDescription(connexioWS.CAdxCallContext callContext, java.lang.String publicName) throws java.rmi.RemoteException;
    public connexioWS.CAdxResultXml actionObjectKeys(connexioWS.CAdxCallContext callContext, java.lang.String publicName, java.lang.String actionCode, connexioWS.CAdxParamKeyValue[] objectKeys) throws java.rmi.RemoteException;
    public connexioWS.CAdxResultXml actionObject(connexioWS.CAdxCallContext callContext, java.lang.String publicName, java.lang.String actionCode, java.lang.String objectXml) throws java.rmi.RemoteException;
    public connexioWS.CAdxResultXml getDataXmlSchema(connexioWS.CAdxCallContext callContext, java.lang.String publicName) throws java.rmi.RemoteException;
    public connexioWS.CAdxResultXml modify(connexioWS.CAdxCallContext callContext, java.lang.String publicName, connexioWS.CAdxParamKeyValue[] objectKeys, java.lang.String objectXml) throws java.rmi.RemoteException;
    public connexioWS.CAdxResultXml deleteLines(connexioWS.CAdxCallContext callContext, java.lang.String publicName, connexioWS.CAdxParamKeyValue[] objectKeys, java.lang.String blocKey, java.lang.String[] lineKeys) throws java.rmi.RemoteException;
    public connexioWS.CAdxResultXml insertLines(connexioWS.CAdxCallContext callContext, java.lang.String publicName, connexioWS.CAdxParamKeyValue[] objectKeys, java.lang.String blocKey, java.lang.String lineKey, java.lang.String lineXml) throws java.rmi.RemoteException;
}
