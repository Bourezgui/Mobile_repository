package connexion;


public class Urlconx {
	private static String[] ipadresse= {"127.0.0.1","192.168.1.51","172.16.10.20"};
	//L'url utiliser pour connecter du webservice
	public static final String url="http://"+ ipadresse[1] +":28880/adxwsvc/services/CAdxWebServiceXmlCC?wsdl";

}
