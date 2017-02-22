package Utilidad;
import Clases.*;
import Excepciones.MarcianoException;

import java.util.*;
/**
 * @author Ale
 *
 */
//clase con los metodos de utilidad para la CLase Marciano
public class UtilMarciano {

	/*
	  cabecera:void disparoRecibido(Marciano m1,Marciano m2)
	  descripcion:procedimiento que modificara la vida del primer marciano segun el disparo del segundo Marciano
	  entradas:dos Marcianos
	  salidas:ninguna
	  entrada/salidas:el primer Marciano
	  precondiciones:ninguna
	  postcondiciones:se devuelve el primer Marciano por referencia con la vida modificada
	 */
	public static void disparoRecibido(Marciano m1,Marciano m2){
		
		Random maximo=new Random();
		try {
			m1.setVida((int)((maximo.nextInt(1)==0)?Math.round(m2.disparar()):Math.floor(m2.disparar())));
		} catch (MarcianoException e) {
			System.out.println(e);
		}
	}
}
