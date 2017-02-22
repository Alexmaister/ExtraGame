/**
 * 
 */
package Test;

import Clases.Arma;
import Excepciones.ArmaException;
/**
 * @author Ale
 *
 */
public class TestArma {
	
	public static void main(String[]args){
		
		Arma a=new Arma();
		Arma a1=new Arma(3,"MP900",1.75,25,3);
		Arma copiaA=new Arma(a);
		System.out.println(a);
		System.out.println(a1);
		System.out.println(copiaA);
		System.out.println(a.compareTo(a1));
		copiaA=a1.clone();
		System.out.println(a.equals(copiaA));
		try{
			a1.setPeso(-4);
		}catch(ArmaException aException){
		System.out.println(aException);
		}
		System.out.println(a1.getPeso());
	}

}
