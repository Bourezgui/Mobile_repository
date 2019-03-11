#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package connexion;


public class Urlconx {
	private static String[] ipadresse= {"127.0.0.1","192.168.1.51"};
	public static final String url="http://"+ipadresse[1]+":28880/adxwsvc/services/CAdxWebServiceXmlCC?wsdl";

}
