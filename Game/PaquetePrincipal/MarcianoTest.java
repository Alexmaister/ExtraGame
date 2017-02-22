package Test;
import Clases.*;
/**
 * @author Ale
 *
 */
public class MarcianoTest {
	
	public static void main(String[]args){
		Marciano m=new Marciano();
		Marciano mcopia=new Marciano(m);
		Arma a=new Arma();
		Marciano ma=new Marciano(100,"Soldado","Pluton",a);
		
		System.out.println(m.toString());
		System.out.println(mcopia.toString());
		System.out.println(ma.toString());
		m.modificarPoder(10);
		System.out.println(m.getPoder());
		System.out.println(m.clone().toString());
		System.out.println(m.equals(ma));
		System.out.println(m.compareTo(ma));
	}
}
