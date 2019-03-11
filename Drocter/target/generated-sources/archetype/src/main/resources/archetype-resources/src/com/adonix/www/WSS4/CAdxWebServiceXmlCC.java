#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * CAdxWebServiceXmlCC.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.adonix.www.WSS4;

public interface CAdxWebServiceXmlCC extends java.rmi.Remote {
    public com.adonix.www.WSS4.CAdxResultXml run(com.adonix.www.WSS4.CAdxCallContext callContext, java.lang.String publicName, java.lang.String inputXml) throws java.rmi.RemoteException;
    public com.adonix.www.WSS4.CAdxResultXml save(com.adonix.www.WSS4.CAdxCallContext callContext, java.lang.String publicName, java.lang.String objectXml) throws java.rmi.RemoteException;
    public com.adonix.www.WSS4.CAdxResultXml delete(com.adonix.www.WSS4.CAdxCallContext callContext, java.lang.String publicName, com.adonix.www.WSS4.CAdxParamKeyValue[] objectKeys) throws java.rmi.RemoteException;
    public com.adonix.www.WSS4.CAdxResultXml read(com.adonix.www.WSS4.CAdxCallContext callContext, java.lang.String publicName, com.adonix.www.WSS4.CAdxParamKeyValue[] objectKeys) throws java.rmi.RemoteException;
    public com.adonix.www.WSS4.CAdxResultXml query(com.adonix.www.WSS4.CAdxCallContext callContext, java.lang.String publicName, com.adonix.www.WSS4.CAdxParamKeyValue[] objectKeys, int listSize) throws java.rmi.RemoteException;
    public com.adonix.www.WSS4.CAdxResultXml getDescription(com.adonix.www.WSS4.CAdxCallContext callContext, java.lang.String publicName) throws java.rmi.RemoteException;
    public com.adonix.www.WSS4.CAdxResultXml modify(com.adonix.www.WSS4.CAdxCallContext callContext, java.lang.String publicName, com.adonix.www.WSS4.CAdxParamKeyValue[] objectKeys, java.lang.String objectXml) throws java.rmi.RemoteException;
    public com.adonix.www.WSS4.CAdxResultXml actionObject(com.adonix.www.WSS4.CAdxCallContext callContext, java.lang.String publicName, java.lang.String actionCode, com.adonix.www.WSS4.CAdxParamKeyValue[] objectKeys) throws java.rmi.RemoteException;
    public com.adonix.www.WSS4.CAdxResultXml actionObject(com.adonix.www.WSS4.CAdxCallContext callContext, java.lang.String publicName, java.lang.String actionCode, java.lang.String objectXml) throws java.rmi.RemoteException;
    public com.adonix.www.WSS4.CAdxResultXml deleteLines(com.adonix.www.WSS4.CAdxCallContext callContext, java.lang.String publicName, com.adonix.www.WSS4.CAdxParamKeyValue[] objectKeys, java.lang.String blocKey, java.lang.String[] lineKeys) throws java.rmi.RemoteException;
    public com.adonix.www.WSS4.CAdxResultXml insertLines(com.adonix.www.WSS4.CAdxCallContext callContext, java.lang.String publicName, com.adonix.www.WSS4.CAdxParamKeyValue[] objectKeys, java.lang.String blocKey, java.lang.String lineKey, java.lang.String lineXml) throws java.rmi.RemoteException;
    public com.adonix.www.WSS4.CAdxResultXml getDataXmlSchema(com.adonix.www.WSS4.CAdxCallContext callContext, java.lang.String publicName) throws java.rmi.RemoteException;
}
