package metier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Comparateur { 
	 
	List<String> listActOfBpmnMfc = new ArrayList <> () ; 
	List<String> diffOfAll= new ArrayList <> () ; 
	List<String> diffFlux = new ArrayList <> () ; 
	List<String> correctFlux = new ArrayList <> (); 
	List<String> diffActBpmnWithMfc= new ArrayList <> () ;
	List<String> correctActBpmnWithMfc = new ArrayList <> (); 
	List<String> lActeurs = new ArrayList<> () ; 
	List<String> flMfc= new ArrayList<> () ; 
	List<String> flBpmn=new ArrayList<> () ; 
	private List<String> diffActWithBpmn= new ArrayList <> () ; 
	private ArrayList<String> correctActWithBpmn = new ArrayList <> () ; 
	private List<String> diffActWithMfc = new ArrayList <> () ; 
	private ArrayList<String> correctActWithMfc;
	private int cpErTotal=0 ;
	private int cpErFlux=0; 
	private int cpErActBpmnWithMfc=0;  
	private int cpCorrectFl=0 ; 
	private int cpCorrectActBpmnWithMfc=0 ;
	private int cpCorrectActMfc; 
	private int cpCorrectActWithBpmn ; 
	private int cpErActWithBpmn ;
	private int cpCorrectActWithMfc;
	private int cpErActWithMfc; 
	boolean boolActIsInput=false; 
	private int nbPointsCorrect;
	private int laMoyenne=0;

	public Comparateur() {
		super();
	}

	public boolean doMetier(String bpmn , String mfc,String actExt) { 
		
		//BPMN ---------------
		 BpmnParser bp = new BpmnParser() ; 
		 bp.parseBpmnMethode(bpmn); 
		 this.flBpmn=bp.getListFluxBpmn(); 
		 ArrayList<String> actBpmn=(ArrayList<String>) bp.getListActeursBpmn(); 
		 // MFC ------------ 
		 MfcParser mf = new MfcParser() ; 
		 mf.parseMfcMethode(mfc); 
		 this.flMfc=(ArrayList<String>) mf.getListFluxMfc(); 
		 ArrayList<String> actMfc=(ArrayList<String>) mf.getListActeursMfc(); 
		 
		return diffAll(flMfc,flBpmn,actBpmn,actMfc,actExt).isEmpty(); 
	} 
	
	
	public boolean existDiff(List<String> l) { 
		return !(l.isEmpty());
	} 
	
	
	public List<String> diffAll(List<String> l1, List<String> l2, List<String> l3, List<String> l4,String acteurs) { 
		this.diffOfAll.clear();
		//For Flux Of BPMN vs MFC
		this.diffFlux= diff2List(l1,l2) ; 
		this.correctFlux= sameArrayList(l1,l2) ; 
		cpCorrectFl=correctFlux.size() ; 
		cpErFlux = diffFlux.size() ; 
		this.diffOfAll.addAll(diffFlux) ; 
		//For acteurs of BPMN vs MFC
		this.diffActBpmnWithMfc= diff2List(l3,l4) ; 
		this.correctActBpmnWithMfc= sameArrayList(l3,l4) ;  
		cpCorrectActBpmnWithMfc=correctActBpmnWithMfc.size() ; 
		cpErActBpmnWithMfc=diffActBpmnWithMfc.size() ; 
		this.diffOfAll.addAll(diffActBpmnWithMfc) ;  
		// For Acteurs vs BPMN VS MFC
		diffActWithBpmnAndMfc(acteurs,l3,l4) ;
		if(! (diffActWithBpmn.isEmpty())) { 
			this.diffOfAll.addAll(this.diffActWithBpmn) ;
			this.diffOfAll.addAll(this.diffActWithMfc) ; 
		}
		
		// Compteur Erreur 
		cpErTotal=cpErFlux+cpErActBpmnWithMfc+cpErActWithMfc+cpErActWithBpmn ; 
		return  this.diffOfAll ;
	} 
	
	public List<String> diff2List(List<String> l, List<String> l2) {  
		List<String> diff = new ArrayList<> ()  ; 
		for (String f : l) { 
			if (!(l2.contains(f))) { 
				diff.add(f) ;  
			} 
		}
		for (String f2 : l2) { 
			if (!(l.contains(f2))) { 
				diff.add(f2) ;  
			} 
		} 
		return diff;
	} 
	
	public ArrayList<String> sameArrayList(List<String> l1, List<String> l2){
        ArrayList<String> res = new ArrayList<String>();
        for (String s1 : l1){
            for (String s2 : l2){
                if (s1.equals(s2)){
                    res.add(s1);
                    if(!(res.contains(s1))){
                        res.add(s1);
                    }
                    if(!(res.contains(s2))){
                        res.add(s2);
                    }
                }
            }
        } 
        return res;
    } 
	
	
	public void diffActWithBpmnAndMfc(String act,List<String> actBpmn,List<String> actMfc) { 
		if(act.length()>1) {
			boolActIsInput=true;
			//String acteurs to List
	        lActeurs = new ArrayList<String>(Arrays.asList(act.split(",")));  
	        //For acteurs vs BPMN
	        this.diffActWithBpmn= diff2List(lActeurs,actBpmn);
			this.correctActWithBpmn= sameArrayList(lActeurs,actBpmn);
			this.cpCorrectActWithBpmn = correctActWithBpmn.size() ; 
			this.cpErActWithBpmn = diffActWithBpmn.size() ;  
			//For acteurs vs MFC
			this.diffActWithMfc= diff2List(lActeurs,actMfc);
			this.correctActWithMfc= sameArrayList(lActeurs,actMfc);
			this.cpCorrectActWithMfc = correctActWithMfc.size() ; 
			this.cpErActWithMfc = diffActWithMfc.size() ; 
		}
        
	}
	public int getCpErTotal() {
		return cpErTotal;
	}

	public int getCpErFlux() {
		return cpErFlux;
	}

	public int getCpErActBpmnWithMfc() {
		return cpErActBpmnWithMfc;
	}

	public int getCpCorrectFl() {
		return cpCorrectFl;
	}

	public int getCpCorrectAct() {
		return cpCorrectActBpmnWithMfc;
	}

	public List<String> getDiffOfAll() {
		return diffOfAll;
	}

	public List<String> getDiffFlux() {
		return diffFlux;
	}

	public List<String> getCorrectFlux() {
		return correctFlux;
	}

	public List<String> getDiffActBpmnWithMfc() {
		return diffActBpmnWithMfc;
	}

	public List<String> getCorrectActBpmnWithMfc() {
		return correctActBpmnWithMfc;
	}

	public void setCpErTotal(int cpErTotal) {
		this.cpErTotal = cpErTotal;
	}

	public void setCpErFlux(int cpErFlux) {
		this.cpErFlux = cpErFlux;
	}

	public void setCpErActBpmnWithMfc(int cpErAct) {
		this.cpErActBpmnWithMfc = cpErAct;
	}

	public void setCpCorrectFl(int cpCorrectFl) {
		this.cpCorrectFl = cpCorrectFl;
	}

	public void setCpCorrectActBpmnWithMfc(int cpCorrectAct) {
		this.cpCorrectActBpmnWithMfc = cpCorrectAct;
	}

	public void setDiffOfAll(List<String> diffOfAll) {
		this.diffOfAll = diffOfAll;
	}

	public void setDiffFlux(List<String> diffFlux) {
		this.diffFlux = diffFlux;
	}

	public void setCorrectFlux(List<String> correctFlux) {
		this.correctFlux = correctFlux;
	}

	public void setDiffActBpmnWithMfc(List<String> diffActBpmnWithMfc) {
		this.diffActBpmnWithMfc = diffActBpmnWithMfc;
	}

	public void setCorrectActBpmnWithMfc(List<String> correctAct) {
		this.correctActBpmnWithMfc = correctAct;
	}
	
	public boolean getActIsInput() { 
		return this.boolActIsInput ; 
	} 
	
	public int getCpErActWithBpmn() { 
		return this.cpErActWithBpmn;
	} 
	
	public int getCpErActWithMfc() { 
		return this.cpErActWithMfc;
	} 
	
	public List<String> getDiffActWithBpmn() { 
		return this.diffActWithBpmn ; 
	} 
	public List<String> getDiffActWithMfc() { 
		return this.diffActWithMfc ; 
	} 
	
	public List<String> getCorrectActWithBpmn() { 
		return this.correctActWithBpmn;
	} 
	public List<String> getCorrectActWithMfc() { 
		return this.correctActWithMfc;
	} 
	
	public int getCpCorrectActMfc() { 
		return this.cpCorrectActMfc;
	} 
	
	public int getCpCorrectActWithBpmn() { 
		return this.cpCorrectActWithBpmn;
	} 
	
	public double getLaMoyenne() { 
		if(cpErTotal==0) { 
			laMoyenne=20;
		} 
		else { 
			this.nbPointsCorrect=cpCorrectActWithMfc+cpCorrectFl+cpCorrectActBpmnWithMfc+cpCorrectActMfc+cpCorrectActWithBpmn+cpCorrectActWithBpmn ;
			int nbDePoint=nbPointsCorrect+cpErTotal;
			int noteForOneQuestion=20/nbDePoint ;
			laMoyenne=nbPointsCorrect*noteForOneQuestion;
		}
		if(laMoyenne<0) { 
			laMoyenne=0 ;
		}
		return this.laMoyenne;
	}

	public int getNbPointsCorrect() {
		return nbPointsCorrect;
	} 
	
	public List<String> getFlBpmn() { 
		return this.flBpmn;
	} 
	
	public List<String> getFlMfc() { 
		return this.flMfc;
	} 
}