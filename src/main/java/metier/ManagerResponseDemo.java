package metier;

import java.util.ArrayList;
import java.util.List;

public class ManagerResponseDemo { 
	ComparateurDemo comp= new ComparateurDemo() ;
	boolean resBool ;
	String resFinale ;
	public ManagerResponseDemo() {
		super();
	} 
	
	public String showReponse(String bpmn , String mfc,String actExt) { 
		resBool=comp.doMetier(bpmn,mfc,actExt) ; 
		if(!resBool) { 
		 return showReponseValide() ;	
		} 
		else { 
			return showReponseNothing() ;
		}
		
	}
	
	public String showReponseValide() { 
	
			resFinale="<table style=\"border-collapse:collapse;border-color:#9ABAD9;border-spacing:0\" class=\"tg\"><thead><tr><th style=\"background-color:#409cff;border-color:#000000;border-style:solid;border-width:1px;color:#fff;font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;text-align:center;vertical-align:top;word-break:normal\">/</th><th style=\"background-color:#409cff;border-color:#000000;border-style:solid;border-width:1px;color:#fff;font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;text-align:center;vertical-align:top;word-break:normal\"><span style=\"font-weight:bold\">BPMN</span></th><th style=\"background-color:#409cff;border-color:#000000;border-style:solid;border-width:1px;color:#fff;font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;text-align:center;vertical-align:top;word-break:normal\"><span style=\"font-weight:bold\">MFC</span></th></tr></thead><tbody><tr><td style=\"background-color:#D2E4FC;border-color:#000000;border-style:solid;border-width:1px;color:#444;font-family:Arial, sans-serif;font-size:14px;font-weight:bold;overflow:hidden;padding:10px 5px;text-align:center;vertical-align:top;word-break:normal\">Flux</td><td style=\"background-color:#D2E4FC;border-color:#000000;border-style:solid;border-width:1px;color:#444;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:center;vertical-align:top;word-break:normal\">"
			+comp.getFlBpmn()+"</td><td style=\"background-color:#D2E4FC;border-color:#000000;border-style:solid;border-width:1px;color:#444;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:center;vertical-align:top;word-break:normal\"><span style=\"font-weight:400;font-style:normal\">"+comp.getFlMfc()+"</span></td></tr><tr><td style=\"background-color:#EBF5FF;border-color:#000000;border-style:solid;border-width:1px;color:#444;font-family:Arial, sans-serif;font-size:14px;font-weight:bold;overflow:hidden;padding:10px 5px;text-align:center;vertical-align:top;word-break:normal\">Acteurs</td><td style=\"background-color:#EBF5FF;border-color:#000000;border-style:solid;border-width:1px;color:#444;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:center;vertical-align:top;word-break:normal\"><span style=\"font-weight:400;font-style:normal\">"+comp.getActBpmn()+"</span></td><td style=\"background-color:#EBF5FF;border-color:#000000;border-style:solid;border-width:1px;color:#444;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:center;vertical-align:top;word-break:normal\"><span style=\"font-weight:400;font-style:normal\">"+comp.getActMfc()+"</span></td></tr><tr><td style=\"background-color:#D2E4FC;border-color:#9ABAD9;border-style:solid;border-width:1px;color:#444;font-family:Arial, sans-serif;font-size:14px;font-weight:bold;overflow:hidden;padding:10px 5px;text-align:center;vertical-align:top;word-break:normal\">Nombres Flux</td><td style=\"background-color:#D2E4FC;border-color:#9ABAD9;border-style:solid;border-width:1px;color:#444;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:center;vertical-align:top;word-break:normal\"><span style=\"font-weight:400;font-style:normal\">"+comp.getFlBpmn().size()+"</span></td><td style=\"background-color:#D2E4FC;border-color:#9ABAD9;border-style:solid;border-width:1px;color:#444;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:center;vertical-align:top;word-break:normal\"><span style=\"font-weight:400;font-style:normal\">"+comp.getFlMfc().size()+"</span></td></tr><tr><td style=\"background-color:#EBF5FF;border-color:#9ABAD9;border-style:solid;border-width:1px;color:#444;font-family:Arial, sans-serif;font-size:14px;font-weight:bold;overflow:hidden;padding:10px 5px;text-align:center;vertical-align:top;word-break:normal\">Nombres D'acteurs</td><td style=\"background-color:#EBF5FF;border-color:#9ABAD9;border-style:solid;border-width:1px;color:#444;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:center;vertical-align:top;word-break:normal\"><span style=\"font-weight:400;font-style:normal\">"+comp.getActBpmn().size()+"</span></td><td style=\"background-color:#EBF5FF;border-color:#9ABAD9;border-style:solid;border-width:1px;color:#444;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:center;vertical-align:top;word-break:normal\"><span style=\"font-weight:400;font-style:normal\">"
			+comp.getActMfc().size()+"</span></td></tr></tbody></table>\n"
					+ "<br><h3>Inscrivez-vous sur notre site afin de bénificier d'une version Pro complete</h3>" ;
		return resFinale;
	} 
	
	
	
	
	public String showReponseNothing() { 
		
		resFinale= "<h3 style=\"color: red;\"> Nous n'avons trouvés aucun flux ni d'acteurs " 
				+"cela semble que nous n'avons pas bien recu vos fichiers <br>" 
				+ "Merci de ré-essayer une autre fois et de bien vérifier vos saisies! </h3>";
	
	return resFinale;
} 
	
	
}