package metier;

public class testBpmnParser { 
	public static void main(String[] args) { 
		Comparateur metier=new Comparateur(); 
		boolean m=metier.doMetier("aa", "bb", "cc") ; 
		System.out.println(m);
	}
}