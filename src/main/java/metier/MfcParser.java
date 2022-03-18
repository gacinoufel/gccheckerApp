package metier;
import javax.xml.parsers.*; 
import org.xml.sax.InputSource;
import org.w3c.dom.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class MfcParser {
	private List<String>listFluxMfc =new ArrayList<>() ; 
	private List<String>listActeursMfc =new ArrayList<>() ;

	public MfcParser (List<String> listFluxMfc, List<String> listActeursMfc) { 
		this.listFluxMfc=listFluxMfc; 
		this.listActeursMfc=listActeursMfc; 

	} 

	public MfcParser() {
		super(); 
	}

public void parseMfcMethode(String xmlRecords) { 
	    try {
	        DocumentBuilderFactory dbf =
	            DocumentBuilderFactory.newInstance();
	        DocumentBuilder db = dbf.newDocumentBuilder();
	        InputSource is = new InputSource();
	        is.setCharacterStream(new StringReader(xmlRecords)); 
	        Document doc = db.parse(is);
	        NodeList fluxMfc = doc.getElementsByTagName("mxCell"); 
	        NodeList acteursMfc = doc.getElementsByTagName("mxCell"); 
	        
	        
	        // extraire les flux du MFC 
	        for (int i = 0; i < fluxMfc.getLength(); i++) {
	           Element element = (Element) fluxMfc.item(i); 
	           if (! (element.getAttribute("connectable").isEmpty())) { 
	        	   listFluxMfc.add(element.getAttribute("value").replaceAll("&nbsp;", ""));
	           }
	        }  
	        
	        // extraire les acteurs 
	        for (int i = 0; i < acteursMfc.getLength(); i++) {
		           Element element = (Element) acteursMfc.item(i); 
		           if ((element.getAttribute("connectable").isEmpty() ) && (element.getAttribute("style").contains("ellipse")) ) { 
		        	   listActeursMfc.add(element.getAttribute("value"));
		           }
		    }     
	    }
	    catch (Exception e) {
	        e.printStackTrace();
	    } 
	 }

		public List<String> getListFluxMfc() { 
			return listFluxMfc;
		}

		public void setListFluxMfc(List<String> listFluxMfc) {
			this.listFluxMfc = listFluxMfc;
		}

		public List<String> getListActeursMfc() {
			return listActeursMfc;
		}

		public void setListActeursMfc(List<String> listActeursMfc) {
			this.listActeursMfc = listActeursMfc;
		} 

}

