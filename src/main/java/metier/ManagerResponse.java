package metier;

import java.util.*;

public class ManagerResponse { 
	Comparateur comp= new Comparateur() ;
	String resValide= "<b style=\"color: green; \">Analyse coherente <img src=\"https://www.gccheker.fr/img/check.png\" width=\"15\"height=\"15\"  > </b> " ; 
	String resInvalide= "<b style=\"color: red; \">Analyse non coherente <img src=\"https://www.gccheker.fr/img/uncheck.png\" width=\"15\"height=\"15\" /></b>" ; 
	Map<Integer,Object> mapHtml=new HashMap<>(); 
	boolean resBool ;
	String resFinale ; 
	
	
	public ManagerResponse() {
		super();
	} 
	
	public String showReponse(String bpmn , String mfc,String actExt) { 
		resBool=comp.doMetier(bpmn,mfc,actExt) ; 
		if(resBool && comp.getFlBpmn().isEmpty() && comp.getFlMfc().isEmpty()) { 
		 return showReponseNothing() ;	
		} 
		else { 
			if(comp.getCpErTotal()>0) { 
				createMapHtml(); 
				mapHtml.replace(1, resInvalide) ;
				return fillTableHtml();
			} 
			else { 
				createMapHtml();
				mapHtml.replace(1, resValide) ;
				return fillTableHtml();
			}
		}
	}
	

	
	
	
	
	public String showReponseNothing() { 
		
		resFinale= "<h3 style=\"color: red;\"> Nous n'avons trouvés aucun flux ni d'acteurs " 
				+"cela semble que nous n'avons pas bien recu vos fichiers <br>" 
				+ "Merci de ré-essayer une autre fois et de bien vérifier vos saisies! </h3>";
	
	return resFinale;
} 
	
	public String fillTableHtml() { 
		String tableFilledHtml= " <table class=\"tg\"> "
				+ "        <thead> "
				+ "          <tr> "
				+ "            <th class=\"tg-td0v\" colspan=\"2\"><span style=\"color:#000\">Resultat generale de l'analyse: "+mapHtml.get(1)+"</span></th> "
				+ "          </tr> "
				+ "        </thead> "
				+ "        <tbody> "
				+ "          <tr> "
				+ "            <td class=\"tg-hafo\">Erreurs</td> "
				+ "            <td class=\"tg-fcno\">Nombre d'erreurs</td> "
				+ "          </tr> "
				+ "          <tr> "
				+ "            <td class=\"tg-0pky\"><span style=\"font-weight:400;font-style:normal\">erreur dans les flux</span></td> "
				+ "            <td class=\"tg-0pky\">"+ comp.getCpErFlux() +"</td> "
				+ "          </tr> "
				+ "          <tr> "
				+ "            <td class=\"tg-0pky\">les acteurs parsé de BPMN et MFC</td> "
				+ "            <td class=\"tg-0pky\">"+mapHtml.get(3) +"</td> "
				+ "          </tr> "
				+ "          <tr> "
				+ "            <td class=\"tg-0pky\"><span style=\"font-weight:400;font-style:normal\">les acteurs saisi avec ceux de BPMN</span></td> "
				+ "            <td class=\"tg-0pky\">"+mapHtml.get(4)+"</td> "
				+ "          </tr> "
				+ "          <tr>"
				+ "            <td class=\"tg-0pky\">les acteurs saisi avec ceux de MFC</td> "
				+ "            <td class=\"tg-0pky\">"+mapHtml.get(5)+"</td> "
				+ "          </tr>"
				+ "          <tr> "
				+ "            <td class=\"tg-vswx\" colspan=\"2\">En détails les points a corrigés</td> "
				+ "          </tr> "
				+ "          <tr> "
				+ "            <td class=\"tg-0pky\"><span style=\"font-weight:400;font-style:normal\">vos flux incoherents sont :</span></td> "
				+ "            <td class=\"tg-0pky\">"+ mapHtml.get(6)  +"</td> "
				+ "          </tr> "
				+ "          <tr> "
				+ "            <td class=\"tg-0pky\"><span style=\"font-weight:400;font-style:normal\">vos acteurs incoherent entre acteurs saisi et BPMN sont</span></td> "
				+ "            <td class=\"tg-0pky\">"+ mapHtml.get(7) +"</td> "
				+ "          </tr> "
				+ "          <tr> "
				+ "            <td class=\"tg-0pky\"><span style=\"font-weight:400;font-style:normal\">vos acteurs incoherent entre les acteurs saisi et MFC sont :</span></td> "
				+ "            <td class=\"tg-0pky\">"+ mapHtml.get(8) +"</td> "
				+ "          </tr> "
				+ "          <tr> "
				+ "            <td class=\"tg-fpwh\" colspan=\"2\"><span style=\"font-style:normal\">l'ensemble des points estimés cohérents :</span></td> "
				+ "          </tr> "
				+ "          <tr> "
				+ "            <td class=\"tg-0pky\"><span style=\"font-weight:400;font-style:normal\">les flux coherents sont :</span></td> "
				+ "            <td class=\"tg-0pky\">"+ mapHtml.get(9) +"</td> "
				+ "          </tr> "
				+ "          <tr> "
				+ "            <td class=\"tg-0pky\">les acteurs coherents entre BPMN et MFC sont :</td> "
				+ "            <td class=\"tg-0pky\">"+ mapHtml.get(10) +"</td> "
				+ "          </tr> "
				+ "          <tr> "
				+ "            <td class=\"tg-0pky\"><span style=\"font-weight:400;font-style:normal\">les acteurs coherents entre les acteurs saisi et ceux qui sont dans votre BPMN sont :</span></td> "
				+ "            <td class=\"tg-0pky\">"+ mapHtml.get(11) +"</td> "
				+ "          </tr> "
				+ "          <tr> "
				+ "            <td class=\"tg-0pky\"><span style=\"font-weight:400;font-style:normal\">les acteurs coherents entre les acteurs saisi et ceux qui sont dans votre MFC sont :</span></td> "
				+ "            <td class=\"tg-0pky\">"+ mapHtml.get(12) +"</td> "
				+ "          </tr> "
				+ "          <tr> "
				+ "            <td class=\"tg-0pky\"><span style=\"font-weight:400;font-style:normal\">le nombre d'acteurs correctes entre Acteurs saisi et les acteurs qui sont dans BPMN</span></td> "
				+ "            <td class=\"tg-0pky\">"+ mapHtml.get(13) +"</td> "
				+ "          </tr> "
				+ "          <tr> "
				+ "            <td class=\"tg-0pky\"><span style=\"font-weight:400;font-style:normal\">le nombre d'acteurs correctes entre Acteurs saisi et les acteurs qui sont dans MFC</span></td> "
				+ "            <td class=\"tg-0pky\">"+ mapHtml.get(14) +"</td> "
				+ "          </tr> "
				+ "          <tr> "
				+ "            <td class=\"tg-40tf\"><span style=\"font-weight:bold;color:red;\">Nombre d'erreurs total détectés: </span>"+ mapHtml.get(15)+ " <span style=\"font-weight:bold;color:green;\">Nombre de points corrects:</span>" +mapHtml.get(16)+ "</td> "
				+ "            <td class=\"tg-0pky\">Note(/20) :  " +mapHtml.get(17)+"</td> "
				+ "          </tr> " 
				+"<tr> "
				+ "            <th class=\"tg-td0v\" colspan=\"2\"><span style=\"color:#000\">Vérifiez bien ces éléments: "+comp.getDiffOfAll()+"</span></th> "
				+ "          </tr> "
				+ "        </tbody> "
				+ "        </table>";
				
		return tableFilledHtml;
	}
	
	public void createMapHtml() { 
		this.mapHtml.put(1, ""); 
		this.mapHtml.put(2,comp.getCpErFlux()); 
		this.mapHtml.put(3, comp.getCpErActBpmnWithMfc()); 
		this.mapHtml.put(4, comp.getCpErActWithBpmn()); 
		this.mapHtml.put(5, comp.getCpErActWithMfc()); 
		this.mapHtml.put(6, comp.getDiffFlux().toString()); 
		this.mapHtml.put(7, comp.getDiffActWithBpmn().toString()); 
		this.mapHtml.put(8, comp.getDiffActBpmnWithMfc().toString()); 
		this.mapHtml.put(9, comp.getCorrectFlux()); 
		this.mapHtml.put(10, comp.getCorrectActBpmnWithMfc()); 
		this.mapHtml.put(11, comp.getCorrectActWithBpmn()); 
		this.mapHtml.put(12, comp.getCorrectActWithMfc()); 
		this.mapHtml.put(13, comp.getCpCorrectActWithBpmn()); 
		this.mapHtml.put(14, comp.getCpCorrectActMfc()); 
		this.mapHtml.put(15, comp.getCpErTotal()); 
		this.mapHtml.put(16, comp.getNbPointsCorrect()); 
		this.mapHtml.put(17, comp.getLaMoyenne()); 
	} 
	

	
}