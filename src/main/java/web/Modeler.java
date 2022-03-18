package web;

public class Modeler { 
	private String bpmn; 
	private String mfc; 
	private String actExt; 
	private String objTac ; 
	private String objStr ; 
	
	public String getObjTac() {
		return objTac;
	}
	public void setObjTac(String objInt) {
		this.objTac = objInt;
	}
	public String getObjExt() {
		return objStr;
	}
	public void setObjStr(String objExt) {
		this.objStr = objExt;
	}

	private String analyseResultat ; 
	
	
	public String getBpmn() {
		return bpmn;
	}
	public void setBpmn(String bpmn) {
		this.bpmn = bpmn;
	}
	public String getMfc() {
		return mfc;
	}
	public void setMfc(String mfc) {
		this.mfc = mfc;
	}
	public String getActExt() {
		return actExt;
	}
	public void setActExt(String actExt) {
		this.actExt = actExt;
	}
	public String getAnalyseResultat() {
		return analyseResultat;
	}
	public void setAnalyseResultat(String analyseResultat) {
		this.analyseResultat = analyseResultat;
	}
	public Modeler(String bpmn, String mfc, String actExt,String objInt, String objExt, String analyseResultat) {
		super();
		this.bpmn = bpmn;
		this.mfc = mfc;
		this.actExt = actExt; 
		this.objTac = objInt; 
		this.objStr = objExt;
		this.analyseResultat = analyseResultat;
	}
	public Modeler() {
		super();
		
	} 
	
	public void deleteAll() { 
		this.bpmn=null; 
		this.mfc=null;
		this.actExt=null; 
		this.analyseResultat=null ; 
	}
	
	
}