#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package connexion;

import javax.xml.rpc.ServiceException;

public class Testcase {
    static int i =0;
	public static void main(String[] args) throws ServiceException, InterruptedException {

		System.out.println(new soap_sodet_beta().insert_information("1", "YMAT", "YLOT", "10", "YITM", "YOF", "YSLO", "1000"
				, "LOC", "TYP", "IME"));

	
	}
	

}

