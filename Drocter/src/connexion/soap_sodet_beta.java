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
	                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "SRA", "SRA2019", "DEMOWS", "",RequestConfigDebug);
	                                    String publicName="YDCTRSO";//YZDCTR
	                                    sb = new StringBuffer();
	                                    String inputXml="";	                                    
	                                    sb.append("{");
	                                    sb.append("\"GRP2\": {");		                                
		                                sb.append("\"YMAT\" : \""+YMAT+"\",");
		                                sb.append("\"YLOT\" : \""+YLOT+"\",");
		                                sb.append("\"YPAL\" : \""+YPAL+"\",");
		                                sb.append("\"YITM\" : \""+YITM+"\",");
		                                sb.append("\"YOF\" : \""+YOF+"\",");	
		                                sb.append("\"YLIN\" : \""+YLIN+"\",");
		                                sb.append("\"LOC\" : \""+LOC+"\",");	
		                                sb.append("\"TYP\" : \""+TYP+"\",");
		                                sb.append("\"NAS\" :" +SLO.length+",");
		                                sb.append("\"IME\" : \""+IME+"\"");
		                                sb.append("},\n");		                                
		                                sb.append("\"GRP1\": [");		                                
		                                for(int j=0 ; j<=Qty.length-1;j++) {
		                                if(j>0) sb.append(","); 		                                
		                                sb.append("{");
		                                sb.append("\"YQTY\" :" +Qty[j]+",");
		                                sb.append("\"YSLO\" :\""+SLO[j]+"\"");			                                
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
	                    return resultXml;}
	public String ListArticle () throws ServiceException 

	{       
	                  	  CAdxWebServiceXmlCCServiceLocator serviceLocator = new CAdxWebServiceXmlCCServiceLocator();
	              	    serviceLocator.setCAdxWebServiceXmlCCEndpointAddress(Urlconx.url);
	              	          
	                    	  StringBuffer sb;
	                        CAdxWebServiceXmlCC serviceXmlCC = serviceLocator.getCAdxWebServiceXmlCC();	                                    
	                                    String RequestConfigDebug = "adxwss.beautify=true&adxwss.optreturn=JSON";  
	                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "SRA", "SRA2019", "DEMOWS", "",RequestConfigDebug);
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

	
	public String Typepal () throws ServiceException 

	{       
	                  	  CAdxWebServiceXmlCCServiceLocator serviceLocator = new CAdxWebServiceXmlCCServiceLocator();
	              	    serviceLocator.setCAdxWebServiceXmlCCEndpointAddress(Urlconx.url);
	              	          
	                    	  StringBuffer sb;
	                        CAdxWebServiceXmlCC serviceXmlCC = serviceLocator.getCAdxWebServiceXmlCC();	                                    
	                                    String RequestConfigDebug = "adxwss.beautify=true&adxwss.optreturn=JSON";  
	                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "SRA", "SRA2019", "DEMOWS", "",RequestConfigDebug);
	                                    String publicName="TYPPAL";
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
	                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "SRA", "SRA2019", "DEMOWS", "",RequestConfigDebug);
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
	                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "SRA", "SRA2019", "DEMOWS", "",RequestConfigDebug);
	                                    String publicName="YXSYNCHRO";
	                                    sb = new StringBuffer();
	                                    String inputXml=""; 
	                                    sb.append("{");
	                                    sb.append("\"GRP3\": {");		                                
		                                sb.append("\"RET\" : \""+Pal+"\",");
		                                sb.append("} \n }");
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
	                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "SRA", "SRA2019", "DEMOWS", "",RequestConfigDebug);
	                                    String publicName="YPALN";
	                                    sb = new StringBuffer();
	                                    String inputXml=""; 
	                                    sb.append("{");
	                                    sb.append("\"GRP3\": {");		                                
		                                sb.append("\"PAL\" : \""+Pal+"\",");
		                                sb.append("} \n }");
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
	                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "SRA", "SRA2019", "DEMOWS", "",RequestConfigDebug);
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
	                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "SRA", "SRA2019", "DEMOWS", "",RequestConfigDebug);
	                                    String publicName="YMFGNUM";
	                                    sb = new StringBuffer();
	                                    
	                                    String inputXml;
	                                    sb.append("{");
	                                    sb.append("\"GRP1\": {");		                                
		                                //sb.append("\"ART\" : \""+YMAT+"\",");
		                                sb.append("},\n }");	
		                                
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
	                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "SRA", "SRA2019", "DEMOV6WS", "",RequestConfigDebug);
	                                    String publicName="YLISTLOC";
	                                    sb = new StringBuffer();
	                                    String inputXml="";                                    
	                                    sb.append("{");
	                                    sb.append("\"GRP1\": {");
                                        sb.append("\"SITE\" : \""+site+"\"");
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
                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "SRA", "SRA2019", "DEMOV6WS", "",RequestConfigDebug);
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
                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "SRA", "SRA2019", "DEMOV6WS", "",RequestConfigDebug);
                                    String publicName="YLISTEAN";
                                    sb = new StringBuffer();
                                    String inputXml="";
                                    
                                    sb.append("{");
                                    sb.append("\"GRP1\": {");
                                    sb.append("\"YEAN\" : \""+ean+"\"");
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


public String insertdate (String dt,String ynum,String palnum) throws ServiceException 

{       
                   
                  	  CAdxWebServiceXmlCCServiceLocator serviceLocator = new CAdxWebServiceXmlCCServiceLocator();
              	    //sString address="http://x3erpv11eapvm:8124/soap-generic/syracuse/collaboration/syracuse/CAdxWebServiceXmlCC";
              	    serviceLocator.setCAdxWebServiceXmlCCEndpointAddress(Urlconx.url);
              	          
                    	  StringBuffer sb;
                        CAdxWebServiceXmlCC    serviceXmlCC = serviceLocator.getCAdxWebServiceXmlCC();
                                    
                                    String RequestConfigDebug = "adxwss.beautify=true&adxwss.optreturn=JSON";  
                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "SRA", "SRA2019", "DEMOWS", "",RequestConfigDebug);
                                    String publicName="YINSRTDT";
                                    sb = new StringBuffer();
                                    String inputXml="";
                                    
                                    sb.append("{");
                                    sb.append("\"GRP1\": {");
                                    sb.append("\"DT\" : \""+dt+"\",");
                                    sb.append("\"YNUM\" : \""+ynum+"\",");
                                    sb.append("\"PAL\" : \""+palnum+"\"");

                                    sb.append("}");	                                                
                                    sb.append("}");
                                    inputXml = sb.toString();
                                    System.out.println(Urlconx.url);
                                    System.out.println(inputXml);
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
                      CAdxCallContext CallContext = new CAdxCallContext("FRA", "SRA", "SRA2019", "DEMOV6WS", "",RequestConfigDebug);
                      String publicName="YIMP";
                      sb = new StringBuffer();
                      String inputXml="";
                      
                      sb.append("{");
                      sb.append("\"GRP1\":{");
                      sb.append("\"ETAT\":\""+etat+"\",");
                      sb.append("\"DEST\":\""+destination+"\"");                                                
                      sb.append("},");            
                      sb.append("\n");
                      sb.append("\"GRP2\": [");
                      
                      for(int i=0;i<TABVAL.length;i++) {
                    	  sb.append("\n{\"TBPAR\":");
                    	  sb.append("\""+TABPARAM[i]+"\""+",");
                   	  
                          sb.append("\"TBVAL\":");
                          sb.append("\""+TABVAL[i]+"\"");
                          sb.append("}");
                          if (i!=TABPARAM.length-1) {
                          sb.append(",");}
                    	                   }
                      sb.append("\n\t]\n");
                      	                                                
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


//*********************************************************************************************************\\

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
                                    CAdxCallContext CallContext = new CAdxCallContext("FRA", "SRA", "SRA2019", "DEMOWS", "",RequestConfigDebug);
                                    String publicName="YZEMP";
                                    sb = new StringBuffer();
                                    String inputXml="";	                                    
                                    sb.append("{");
                                    sb.append("\"GRP2\": {");		                                
	                                sb.append("\"YLOT\" : \""+YLOT+"\",");
	                                sb.append("\"YPAL\" : \""+YPAL+"\",");
	                                sb.append("\"YITM\" : \""+YITM+"\",");
	                                sb.append("\"YCP\" : \""+YCP+"\",");
	                                sb.append("\"EDP\" : \""+EDP+"\",");		
	                                sb.append("\"EDD\" : \""+EDD+"\",");	
	                                sb.append("\"MVT\" : \""+MVT+"\",");		                         		                                                                		                             
	                                sb.append("\"PALNUM\" : \""+palnum+"\"");		

	                                sb.append("},\n");		                                
	                                sb.append("\"GRP1\": [");		                                
	                                for(int j=0 ; j<=Qty.length-1;j++) {
	                                if(j>0) sb.append(","); 		                                
	                                sb.append("{");
	                                sb.append("\"YQTY\" :" +Qty[j]+",");
	                                sb.append("\"YSLO\" :\""+SLO[j]+"\"");	
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



//*********************************************************************************************************\\




}	


