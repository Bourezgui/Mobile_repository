#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * CAdxWebServiceXmlCCService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.adonix.www.WSS4;

public interface CAdxWebServiceXmlCCService extends javax.xml.rpc.Service {
    public java.lang.String getCAdxWebServiceXmlCCAddress();

    public com.adonix.www.WSS4.CAdxWebServiceXmlCC getCAdxWebServiceXmlCC() throws javax.xml.rpc.ServiceException;

    public com.adonix.www.WSS4.CAdxWebServiceXmlCC getCAdxWebServiceXmlCC(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
