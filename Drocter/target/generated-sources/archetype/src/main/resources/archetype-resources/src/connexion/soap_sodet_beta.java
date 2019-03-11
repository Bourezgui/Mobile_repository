#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package connexion;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;
import connexioWS.CAdxCallContext;
import connexioWS.CAdxResultXml;
import connexioWS.CAdxWebServiceXmlCC;
import connexioWS.CAdxWebServiceXmlCCServiceLocator;
public class soap_sodet_beta {

	private CAdxWebServiceXmlCCServiceLocator ServiceLocator;
	private CAdxWebServiceXmlCC Service ;
	private CAdxResultXml X3Reply ;    
	
	public String insert_information (String YQTY,String YMAT,String YLOT,String YPAL
			,String YITM,String YOF,String YSLO,String YLIN,String LOC,String TYP,String IME) throws ServiceException 

	
	
	{
						System.out.println(Urlconx.url);
	                     System.out.println(YQTY);
		                 String[]Qty = YQTY.split("&");			                 
		                 String[]SLO = YSLO.split("&");
	                  	  CAdxWebServiceXmlCCServiceLocator serviceLocator = new CAdxWebServiceXmlCCServiceLocator();

	                  	  serviceLocator.setCAdxWebServiceXmlCCEndpointAddress(Urlconx.url);
	                  			  //"http://192.168.1.51:28880/adxwsvc/services/CAdxWebServiceXmlCC?wsdl");
	              	          
	                        StringBuffer sb;
	                        CAdxWebServiceXmlCC serviceXmlCC = serviceLocator.getCAdxWebServiceXmlCC();	                                    
	                                    String RequestConfigDebug = "adxwss.beautify=true&adxwss.optreturn=JSON";  
	                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "ADMIN", "", "DEMOWS", "",RequestConfigDebug);
	                                    String publicName="YDCTRS3";//YZDCTR
	                                    sb = new StringBuffer();
	                                    String inputXml="";	                                    
	                                    sb.append("{");
	                                    sb.append("${symbol_escape}"GRP2${symbol_escape}": {");		                                
		                                sb.append("${symbol_escape}"YMAT${symbol_escape}" : ${symbol_escape}""+YMAT+"${symbol_escape}",");
		                                sb.append("${symbol_escape}"YLOT${symbol_escape}" : ${symbol_escape}""+YLOT+"${symbol_escape}",");
		                                sb.append("${symbol_escape}"YPAL${symbol_escape}" : ${symbol_escape}""+YPAL+"${symbol_escape}",");
		                                sb.append("${symbol_escape}"YITM${symbol_escape}" : ${symbol_escape}""+YITM+"${symbol_escape}",");
		                                sb.append("${symbol_escape}"YOF${symbol_escape}" : ${symbol_escape}""+YOF+"${symbol_escape}",");	
		                                sb.append("${symbol_escape}"YLIN${symbol_escape}" : ${symbol_escape}""+YLIN+"${symbol_escape}",");
		                                sb.append("${symbol_escape}"LOC${symbol_escape}" : ${symbol_escape}""+LOC+"${symbol_escape}",");	
		                                sb.append("${symbol_escape}"TYP${symbol_escape}" : ${symbol_escape}""+TYP+"${symbol_escape}",");
		                                sb.append("${symbol_escape}"IME${symbol_escape}" : ${symbol_escape}""+IME+"${symbol_escape}"");
		                                sb.append("},${symbol_escape}n");		                                
		                                sb.append("${symbol_escape}"GRP1${symbol_escape}": [");		                                
		                                for(int j=0 ; j<=Qty.length-1;j++) {
		                                if(j>0) sb.append(","); 		                                
		                                sb.append("{");
		                                sb.append("${symbol_escape}"YQTY${symbol_escape}" :" +Qty[j]+",");
		                                sb.append("${symbol_escape}"YSLO${symbol_escape}" :${symbol_escape}""+SLO[j]+"${symbol_escape}"");	
		                                sb.append("}");
		                                }
		                                
		                                sb.append("]");
		                                
		                                
		                                sb.append("}");
	                                    
	                                    inputXml = sb.toString();
	                                    System.out.println(inputXml);
	                                    	try {
												X3Reply=serviceXmlCC.run(CallContext, publicName, inputXml);
											} catch (RemoteException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
	                    		                                  
	                                    int  status=X3Reply.getStatus();
	                                    System.out.println(inputXml);
	                                    String  resultXml=X3Reply.getResultXml();	                                   
	                                    System.out.println("status:"+status);
	                                    System.out.println("resultXmJJJl:"+resultXml);
	                    return resultXml;

	}
	
	public String ListArticle () throws ServiceException 

	{       
	                   
	                  	  CAdxWebServiceXmlCCServiceLocator serviceLocator = new CAdxWebServiceXmlCCServiceLocator();
	              	    serviceLocator.setCAdxWebServiceXmlCCEndpointAddress(Urlconx.url);
	              	          
	                    	  StringBuffer sb;
	                        CAdxWebServiceXmlCC serviceXmlCC = serviceLocator.getCAdxWebServiceXmlCC();
	                                    
	                                    String RequestConfigDebug = "adxwss.beautify=true&adxwss.optreturn=JSON";  
	                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "ADMIN", "", "DEMOWS", "",RequestConfigDebug);
	                                    String publicName="YLSART";
	                                    sb = new StringBuffer();
	                                    String inputXml="";
	                                    inputXml = sb.toString();
	                              	try {
												X3Reply=serviceXmlCC.run(CallContext, publicName, inputXml);
											} catch (RemoteException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}

	                    
		                                   
	                                   int  status=X3Reply.getStatus();
	                                   String  resultXml=X3Reply.getResultXml();
	                                   
	                                    System.out.println("status:"+status);
	                                    System.out.println("resultXmJJJl:"+resultXml);
	                    return resultXml;

	}		

	
	public String ListEmp () throws ServiceException 

	{       
	                   
	                  	  CAdxWebServiceXmlCCServiceLocator serviceLocator = new CAdxWebServiceXmlCCServiceLocator();
	              	    serviceLocator.setCAdxWebServiceXmlCCEndpointAddress(Urlconx.url);
	              	          
	                    	  StringBuffer sb;
	                        CAdxWebServiceXmlCC serviceXmlCC = serviceLocator.getCAdxWebServiceXmlCC();
	                                    
	                                    String RequestConfigDebug = "adxwss.beautify=true&adxwss.optreturn=JSON";  
	                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "ADMIN", "", "DEMOWS", "",RequestConfigDebug);
	                                    String publicName="YLOCS";
	                                    sb = new StringBuffer();
	                                    String inputXml="";
	                                    inputXml = sb.toString();
	                              	try {
												X3Reply=serviceXmlCC.run(CallContext, publicName, inputXml);
											} catch (RemoteException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}

	                    
		                                   
	                                   int  status=X3Reply.getStatus();
	                                   String  resultXml=X3Reply.getResultXml();
	                                   
	                                    System.out.println("status:"+status);
	                                    System.out.println("resultXmJJJl:"+resultXml);
	                    return resultXml;

	}		

	
	public String synchro (String Pal) throws ServiceException 

	{       
	                   
	                  	  CAdxWebServiceXmlCCServiceLocator serviceLocator = new CAdxWebServiceXmlCCServiceLocator();
	              	    serviceLocator.setCAdxWebServiceXmlCCEndpointAddress(Urlconx.url);
	              	          
	                    	  StringBuffer sb;
	                        CAdxWebServiceXmlCC serviceXmlCC = serviceLocator.getCAdxWebServiceXmlCC();
	                                    
	                                    String RequestConfigDebug = "adxwss.beautify=true&adxwss.optreturn=JSON";  
	                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "ADMIN", "", "DEMOWS", "",RequestConfigDebug);
	                                    String publicName="YSYNCHRO";
	                                    sb = new StringBuffer();
	                                    String inputXml=""; 
	                                    sb.append("{");
	                                    sb.append("${symbol_escape}"GRP3${symbol_escape}": {");		                                
		                                sb.append("${symbol_escape}"RET${symbol_escape}" : ${symbol_escape}""+Pal+"${symbol_escape}",");
		                                sb.append("} ${symbol_escape}n }");
		                                inputXml = sb.toString();
		                                System.out.println(inputXml);
	                              	try {
												X3Reply=serviceXmlCC.run(CallContext, publicName, inputXml);
											} catch (RemoteException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}

	                    
		                                   
	                                   int  status=X3Reply.getStatus();
	                                   String  resultXml=X3Reply.getResultXml();
	                                   
	                                    System.out.println("status:"+status);
	                                    System.out.println("resultXmJJJl:"+resultXml);
	                    return resultXml;

	}		

	
	
	public String listInfoByPal (String Pal) throws ServiceException 

	{       
	                   
	                  	  CAdxWebServiceXmlCCServiceLocator serviceLocator = new CAdxWebServiceXmlCCServiceLocator();
	              	    serviceLocator.setCAdxWebServiceXmlCCEndpointAddress(Urlconx.url);
	              	          
	                    	  StringBuffer sb;
	                        CAdxWebServiceXmlCC serviceXmlCC = serviceLocator.getCAdxWebServiceXmlCC();
	                                    
	                                    String RequestConfigDebug = "adxwss.beautify=true&adxwss.optreturn=JSON";  
	                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "ADMIN", "", "DEMOWS", "",RequestConfigDebug);
	                                    String publicName="YPALN";
	                                    sb = new StringBuffer();
	                                    String inputXml=""; 
	                                    sb.append("{");
	                                    sb.append("${symbol_escape}"GRP3${symbol_escape}": {");		                                
		                                sb.append("${symbol_escape}"PAL${symbol_escape}" : ${symbol_escape}""+Pal+"${symbol_escape}",");
		                                sb.append("} ${symbol_escape}n }");
		                                inputXml = sb.toString();
		                                System.out.println(inputXml);
	                              	try {
												X3Reply=serviceXmlCC.run(CallContext, publicName, inputXml);
											} catch (RemoteException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}

	                    
		                                   
	                                   int  status=X3Reply.getStatus();
	                                   String  resultXml=X3Reply.getResultXml();
	                                   
	                                    System.out.println("status:"+status);
	                                    System.out.println("resultXmJJJl:"+resultXml);
	                    return resultXml;

	}		

	
	public String Listmatricule () throws ServiceException 

	{       
	                   
	                  	CAdxWebServiceXmlCCServiceLocator serviceLocator = new CAdxWebServiceXmlCCServiceLocator();
	              	    serviceLocator.setCAdxWebServiceXmlCCEndpointAddress(Urlconx.url);
	              	          
	                    	  StringBuffer sb;
	                        CAdxWebServiceXmlCC serviceXmlCC = serviceLocator.getCAdxWebServiceXmlCC();
	                                    
	                                    String RequestConfigDebug = "adxwss.beautify=true&adxwss.optreturn=JSON";  
	                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "ADMIN", "", "DEMOWS", "",RequestConfigDebug);
	                                    String publicName="YMATRIC";
	                                    sb = new StringBuffer();
	                                    String inputXml="";
	                                    inputXml = sb.toString();
	                              	try {
												X3Reply=serviceXmlCC.run(CallContext, publicName, inputXml);
											} catch (RemoteException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}

	                    
		                                   
	                                   int  status=X3Reply.getStatus();
	                                   String  resultXml=X3Reply.getResultXml();
	                                   
	                                    System.out.println("status:"+status);
	                                    System.out.println("resultXmJJJl:"+resultXml);
	                    return resultXml;

	}		


	
	
	
	public String Listof () throws ServiceException 

	{       
	                   
	                  	CAdxWebServiceXmlCCServiceLocator serviceLocator = new CAdxWebServiceXmlCCServiceLocator();
	              	    serviceLocator.setCAdxWebServiceXmlCCEndpointAddress(Urlconx.url);
	              	          
	                    	  StringBuffer sb;
	                        CAdxWebServiceXmlCC serviceXmlCC = serviceLocator.getCAdxWebServiceXmlCC();
	                                    
	                                    String RequestConfigDebug = "adxwss.beautify=true&adxwss.optreturn=JSON";  
	                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "ADMIN", "", "DEMOWS", "",RequestConfigDebug);
	                                    String publicName="YMFGNUM";
	                                    sb = new StringBuffer();
	                                    
	                                    String inputXml;
	                                    sb.append("{");
	                                    sb.append("${symbol_escape}"GRP1${symbol_escape}": {");		                                
		                                //sb.append("${symbol_escape}"ART${symbol_escape}" : ${symbol_escape}""+YMAT+"${symbol_escape}",");
		                                sb.append("},${symbol_escape}n }");	
		                                
	                                    inputXml = "";  //sb.toString();
	                              	try {
												X3Reply=serviceXmlCC.run(CallContext, publicName, inputXml);
											} catch (RemoteException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}

	                    
		                                   
	                                   int  status=X3Reply.getStatus();
	                                   String  resultXml=X3Reply.getResultXml();
	                                   
	                                    System.out.println("status:"+status);
	                                    System.out.println("resultXmJJJl:"+resultXml);
	                    return resultXml;

	}		

	public String ListLoc (String site) throws ServiceException 

	{                         
	                  	CAdxWebServiceXmlCCServiceLocator serviceLocator = new CAdxWebServiceXmlCCServiceLocator();
	              	    serviceLocator.setCAdxWebServiceXmlCCEndpointAddress(Urlconx.url);	              	          
	                    	StringBuffer sb;
	                        CAdxWebServiceXmlCC serviceXmlCC = serviceLocator.getCAdxWebServiceXmlCC();	                        
	                                    String RequestConfigDebug = "adxwss.beautify=true&adxwss.optreturn=JSON";  
	                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "ADMIN", "", "DEMOV6WS", "",RequestConfigDebug);
	                                    String publicName="YLISTLOC";
	                                    sb = new StringBuffer();
	                                    String inputXml="";                                    
	                                    sb.append("{");
	                                    sb.append("${symbol_escape}"GRP1${symbol_escape}": {");
                                        sb.append("${symbol_escape}"SITE${symbol_escape}" : ${symbol_escape}""+site+"${symbol_escape}"");
                                        sb.append("};");	                                                
	                                    sb.append("}");
	                                    inputXml = sb.toString();	                                    	                               	                                   
	                                    	try {
												X3Reply=serviceXmlCC.run(CallContext, publicName, inputXml);
											} catch (RemoteException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}	                                   
	                                    int  status=X3Reply.getStatus();
	                                   String  resultXml=X3Reply.getResultXml();
	                                   
	                                    System.out.println("status:"+status);
	                                    System.out.println("resultXmJJJl:"+resultXml);
	                    return resultXml;  }		
			

public String Listsite () throws ServiceException 

{                         
                  	CAdxWebServiceXmlCCServiceLocator serviceLocator = new CAdxWebServiceXmlCCServiceLocator();
              	    serviceLocator.setCAdxWebServiceXmlCCEndpointAddress(Urlconx.url);	              	          
                    	StringBuffer sb;
                        CAdxWebServiceXmlCC serviceXmlCC = serviceLocator.getCAdxWebServiceXmlCC();	                        
                                    String RequestConfigDebug = "adxwss.beautify=true&adxwss.optreturn=JSON";  
                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "ADMIN", "", "DEMOV6WS", "",RequestConfigDebug);
                                    String publicName="YLISTSITE";
                                    sb = new StringBuffer();
                                    String inputXml="";                                    
                                    inputXml = sb.toString();	                                    	                               	                                   
                                    	try {
											X3Reply=serviceXmlCC.run(CallContext, publicName, inputXml);
										} catch (RemoteException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}	                                   
                                    int  status=X3Reply.getStatus();
                                   String  resultXml=X3Reply.getResultXml();
                                   
                                    System.out.println("status:"+status);
                                    System.out.println("resultXmJJJl:"+resultXml);
                    return resultXml;  }		
	
public String Listean (String ean) throws ServiceException 

{       
                   
                  	  CAdxWebServiceXmlCCServiceLocator serviceLocator = new CAdxWebServiceXmlCCServiceLocator();
              	    //sString address="http://x3erpv11eapvm:8124/soap-generic/syracuse/collaboration/syracuse/CAdxWebServiceXmlCC";
              	    serviceLocator.setCAdxWebServiceXmlCCEndpointAddress(Urlconx.url);
              	          
                    	  StringBuffer sb;
                        CAdxWebServiceXmlCC    serviceXmlCC = serviceLocator.getCAdxWebServiceXmlCC();
                                    
                                    String RequestConfigDebug = "adxwss.beautify=true&adxwss.optreturn=JSON";  
                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "ADMIN", "", "DEMOV6WS", "",RequestConfigDebug);
                                    String publicName="YLISTEAN";
                                    sb = new StringBuffer();
                                    String inputXml="";
                                    
                                    sb.append("{");
                                    sb.append("${symbol_escape}"GRP1${symbol_escape}": {");
                                    sb.append("${symbol_escape}"YEAN${symbol_escape}" : ${symbol_escape}""+ean+"${symbol_escape}"");
                                    sb.append("};");	                                                
                                    sb.append("}");
                                    inputXml = sb.toString();
                                    System.out.println(inputXml);
                                   
                                   
                                    	try {
											X3Reply=serviceXmlCC.run(CallContext, publicName, inputXml);
										} catch (RemoteException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
                                    int  status=X3Reply.getStatus();
                                   String  resultXml=X3Reply.getResultXml();
                                   
                                    System.out.println("status:"+status);
                                    System.out.println("resultXmJJJl:"+resultXml);
                    return resultXml;

}		

public String impression(String etat ,String destination ,String[] TABPARAM ,String[] TABVAL) throws ServiceException {
	  CAdxWebServiceXmlCCServiceLocator serviceLocator = new CAdxWebServiceXmlCCServiceLocator();
	    //sString address="http://x3erpv11eapvm:8124/soap-generic/syracuse/collaboration/syracuse/CAdxWebServiceXmlCC";
	    serviceLocator.setCAdxWebServiceXmlCCEndpointAddress(Urlconx.url);
	          
      	  StringBuffer sb;
          CAdxWebServiceXmlCC    serviceXmlCC = serviceLocator.getCAdxWebServiceXmlCC();
                      
                      String RequestConfigDebug = "adxwss.beautify=true&adxwss.optreturn=JSON";  
                      CAdxCallContext CallContext = new CAdxCallContext("FRA", "ADMIN", "", "DEMOV6WS", "",RequestConfigDebug);
                      String publicName="YIMP";
                      sb = new StringBuffer();
                      String inputXml="";
                      
                      sb.append("{");
                      sb.append("${symbol_escape}"GRP1${symbol_escape}":{");
                      sb.append("${symbol_escape}"ETAT${symbol_escape}":${symbol_escape}""+etat+"${symbol_escape}",");
                      sb.append("${symbol_escape}"DEST${symbol_escape}":${symbol_escape}""+destination+"${symbol_escape}"");                                                
                      sb.append("},");            
                      sb.append("${symbol_escape}n");
                      sb.append("${symbol_escape}"GRP2${symbol_escape}": [");
                      
                      for(int i=0;i<TABVAL.length;i++) {
                    	  sb.append("${symbol_escape}n{${symbol_escape}"TBPAR${symbol_escape}":");
                    	  sb.append("${symbol_escape}""+TABPARAM[i]+"${symbol_escape}""+",");
                   	  
                          sb.append("${symbol_escape}"TBVAL${symbol_escape}":");
                          sb.append("${symbol_escape}""+TABVAL[i]+"${symbol_escape}"");
                          sb.append("}");
                          if (i!=TABPARAM.length-1) {
                          sb.append(",");}
                    	                   }
                      sb.append("${symbol_escape}n${symbol_escape}t]${symbol_escape}n");
                      	                                                
                      sb.append("}");


                      
                      inputXml = sb.toString();
                      System.out.println(inputXml);
                     
                     
                      	try {
								X3Reply=serviceXmlCC.run(CallContext, publicName, inputXml);
							} catch (RemoteException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

      
                         
                     int  status=X3Reply.getStatus();
                     String  resultXml=X3Reply.getResultXml();
                     
                      System.out.println("status:"+status);
                      System.out.println("resultXmJJJl:"+resultXml);
      return resultXml;	
}


//*********************************************************************************************************${symbol_escape}${symbol_escape}

public String insertion (String YQTY,String YLOT,String YPAL,String YITM,String YCP,String EDD,String EDP,String YSLO,String MVT,String palnum) throws ServiceException 



{                    
                     System.out.println(YQTY);
	                 String[]Qty = YQTY.split("&");			                 
	                 String[]SLO = YSLO.split("&");
                  	  CAdxWebServiceXmlCCServiceLocator serviceLocator = new CAdxWebServiceXmlCCServiceLocator();

                  	  serviceLocator.setCAdxWebServiceXmlCCEndpointAddress(Urlconx.url);
              	          
                        StringBuffer sb;
                        CAdxWebServiceXmlCC serviceXmlCC = serviceLocator.getCAdxWebServiceXmlCC();	                                    
                                    String RequestConfigDebug = "adxwss.beautify=true&adxwss.optreturn=JSON";  
                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "ADMIN", "", "DEMOWS", "",RequestConfigDebug);
                                    String publicName="YZEMP";
                                    sb = new StringBuffer();
                                    String inputXml="";	                                    
                                    sb.append("{");
                                    sb.append("${symbol_escape}"GRP2${symbol_escape}": {");		                                
	                                sb.append("${symbol_escape}"YLOT${symbol_escape}" : ${symbol_escape}""+YLOT+"${symbol_escape}",");
	                                sb.append("${symbol_escape}"YPAL${symbol_escape}" : ${symbol_escape}""+YPAL+"${symbol_escape}",");
	                                sb.append("${symbol_escape}"YITM${symbol_escape}" : ${symbol_escape}""+YITM+"${symbol_escape}",");
	                                sb.append("${symbol_escape}"YCP${symbol_escape}" : ${symbol_escape}""+YCP+"${symbol_escape}",");
	                                sb.append("${symbol_escape}"EDP${symbol_escape}" : ${symbol_escape}""+EDP+"${symbol_escape}",");		
	                                sb.append("${symbol_escape}"EDD${symbol_escape}" : ${symbol_escape}""+EDD+"${symbol_escape}",");	
	                                sb.append("${symbol_escape}"MVT${symbol_escape}" : ${symbol_escape}""+MVT+"${symbol_escape}",");		                         		                                                                		                             
	                                sb.append("${symbol_escape}"PALNUM${symbol_escape}" : ${symbol_escape}""+palnum+"${symbol_escape}"");		

	                                sb.append("},${symbol_escape}n");		                                
	                                sb.append("${symbol_escape}"GRP1${symbol_escape}": [");		                                
	                                for(int j=0 ; j<=Qty.length-1;j++) {
	                                if(j>0) sb.append(","); 		                                
	                                sb.append("{");
	                                sb.append("${symbol_escape}"YQTY${symbol_escape}" :" +Qty[j]+",");
	                                sb.append("${symbol_escape}"YSLO${symbol_escape}" :${symbol_escape}""+SLO[j]+"${symbol_escape}"");	
	                                sb.append("}");
	                                }
	                                
	                                sb.append("]");
	                                
	                                
	                                sb.append("}");
                                    
                                    inputXml = sb.toString();
                                    System.out.println(inputXml);
                                    	try {
											X3Reply=serviceXmlCC.run(CallContext, publicName, inputXml);
										} catch (RemoteException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
                    		                                  
                                    int  status=X3Reply.getStatus();
                                    System.out.println(inputXml);
                                    String  resultXml=X3Reply.getResultXml();	                                   
                                    System.out.println("status:"+status);
                                    System.out.println("resultXmJJJl:"+resultXml);
                    return resultXml;

}



//*********************************************************************************************************${symbol_escape}${symbol_escape}




}	


