package metier;
import javax.xml.parsers.*;
import org.xml.sax.InputSource;
import org.w3c.dom.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class BpmnParser {
	private List<String> listFluxBpmn =new ArrayList<>() ; 
	private List<String> listActeursBpmn =new ArrayList<>() ; 
	/*Constructor of BPMN*/
	public BpmnParser (List<String> listFluxBpmn, List<String> listActeursBpmn) { 
		this.listFluxBpmn=listFluxBpmn; 
		this.listActeursBpmn=listActeursBpmn; 

	} 

	public BpmnParser() {
		super(); 
	}

public void parseBpmnMethode(String xmlRecords) { 
	    try {
	        DocumentBuilderFactory dbf =
	            DocumentBuilderFactory.newInstance();
	        DocumentBuilder db = dbf.newDocumentBuilder();
	        InputSource is = new InputSource();
	        is.setCharacterStream(new StringReader(xmlRecords)); 
	        Document doc = db.parse(is);
	        NodeList fluxV1 = doc.getElementsByTagName("bpmn:messageFlow"); 
	        NodeList acteursV1 = doc.getElementsByTagName("bpmn:participant"); 
	        NodeList fluxV2 = doc.getElementsByTagName("bpmn2:messageFlow"); 
	        NodeList acteursV2 = doc.getElementsByTagName("bpmn2:participant"); 
	        
	        // iterate les flux et acteurs en version 1.0
	        for (int i = 0; i < fluxV1.getLength(); i++) {
	           Element element = (Element) fluxV1.item(i); 
	           listFluxBpmn.add(element.getAttribute("name").replaceFirst(" ",""));
	        }  
	        
	        for (int i = 0; i < acteursV1.getLength(); i++) {
		           Element element = (Element) acteursV1.item(i);  
		           listActeursBpmn.add(element.getAttribute("name"));
		        }   
	        
	        // iterate les flux et acteurs en version 2.0
	        for (int i = 0; i < fluxV2.getLength(); i++) {
		           Element element = (Element) fluxV2.item(i);  
		           listFluxBpmn.add(element.getAttribute("name"));
		        }  
		        
		    for (int i = 0; i < acteursV2.getLength(); i++) {
			           Element element = (Element) acteursV2.item(i);   
			           listActeursBpmn.add(element.getAttribute("name"));
			           //System.out.println(element.getAttribute("name")) ;    //returns specific attribute 
			}  
	         
	    }
	    catch (Exception e) {
	        e.printStackTrace();
	    } 
	 }

public List<String> getListFluxBpmn() {
	return listFluxBpmn;
}

public void setListFluxBpmn(List<String> listFluxBpmn) {
	this.listFluxBpmn = listFluxBpmn;
}

public List<String> getListActeursBpmn() {
	return listActeursBpmn;
}

public void setListActeursBpmn(List<String> listActeursBpmn) {
	this.listActeursBpmn = listActeursBpmn;
} 

	}

