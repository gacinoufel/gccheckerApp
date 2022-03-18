package metier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparateurDemo { 
	 
	ArrayList<String> flMfc; 
	 ArrayList<String> actMfc; 
	 ArrayList<String> flBpmn; 
	 ArrayList<String> actBpmn;  
	 
	public ComparateurDemo() {
		super();
	}

	public boolean doMetier(String bpmn , String mfc,String actExt) { 
		
		//BPMN ---------------
		 BpmnParser bp = new BpmnParser() ; 
		 bp.parseBpmnMethode(bpmn); 
		 this.flBpmn=(ArrayList<String>) bp.getListFluxBpmn(); 
		 this.actBpmn=(ArrayList<String>) bp.getListActeursBpmn(); 
		 // MFC ------------ 
		 MfcParser mf = new MfcParser() ; 
		 mf.parseMfcMethode(mfc); 
		 this.flMfc=(ArrayList<String>) mf.getListFluxMfc(); 
		 this.actMfc=(ArrayList<String>) mf.getListActeursMfc(); 
		 return (flBpmn.isEmpty() && flMfc.isEmpty()) ;
	} 
	
	
	public ArrayList<String> getFlMfc() {
		return flMfc;
	}

	public ArrayList<String> getActMfc() {
		return actMfc;
	}

	public ArrayList<String> getFlBpmn() {
		return flBpmn;
	}

	public ArrayList<String> getActBpmn() {
		return actBpmn;
	}

	public boolean existDiff(List<String> l) { 
		return !(l.isEmpty());
	} 
	
	
	
}