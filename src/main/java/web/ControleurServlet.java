package web ; 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException ;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part ;

import metier.ManagerResponse ;
import metier.ManagerResponseDemo; 

@MultipartConfig 
@WebServlet(name="cs" ,urlPatterns = {"/controleur", "*.php"}) 

public class ControleurServlet extends HttpServlet { 
	
	private static final long serialVersionUID = 1L;
	private ManagerResponseDemo metier ; 

	@Override 
	public void init() throws ServletException { 
		metier=new ManagerResponseDemo() ; 
	}  
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException { 
		
		request.setAttribute("mod", new Modeler()); 
		request.getRequestDispatcher("VueRequest.jsp").forward(request,response) ; 
		
	} 
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException { 
		String bpmn=getValueOfPart(request.getPart("bpmnFile")) ; 
		String mfc =getValueOfPart(request.getPart("mfcFile")) ;
		String actExt =request.getParameter("actExt") ;   
		String objTac =request.getParameter("objTac") ;  
		String objStr =request.getParameter("objStr") ; 
		
		Modeler model=new Modeler() ;  
		model.setBpmn(bpmn); 
		model.setMfc(mfc); 
		model.setActExt(request.getParameter("actExt")) ;  
		model.setObjTac(objTac) ; 
		model.setObjStr(objStr) ; 
		request.setAttribute("mod", model);
		String res=metier.showReponse(bpmn,mfc,actExt); 
		// put the response of analyse in the Modele
		model.setAnalyseResultat(res); 
		// forward the result on the VueResult
		request.getRequestDispatcher("VueResult.jsp").forward(request,response) ; 

	} 
	
	private static String getValueOfPart(Part part) throws IOException {
		  BufferedReader reader = new BufferedReader(new InputStreamReader(part.getInputStream(), "UTF-8"));
		  StringBuilder value = new StringBuilder();
		  char[] buffer = new char[1024];
		  for (int length = 0; (length = reader.read(buffer)) > 0;) {
		    value.append(buffer, 0, length);
		  } 
		  return value.toString();
		}
	
}