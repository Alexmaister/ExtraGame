/**
 * 
 */
package Clases;

/**
 * @author aortiz
 *
 */

/*INTERFAZ:
 * 
 * String getTipo()
 * setTipo(String t)
 * int getProteccion()
 * setProteccion(int p)
 * String getCategoria()
 * setCategoria(String c)
 * double getPeso()
 * setPeso(double p)
 * */
public class Armadura implements Cloneable,Comparable<Armadura>{

	private String tipo;
	private int proteccion;
	private String categoria;
	private double peso;
	
	Armadura(){
		
		this.tipo="Pechera";
		this.proteccion=50;
		this.categoria="Soldado";
		this.peso=3.2;
	}
	
	
	Armadura(String t, int p, String c, double w){
		
		this.tipo=t;
		this.proteccion=p;
		this.categoria=c;
		this.peso=w;
		
	}
	
	Armadura(Armadura a){
		
		this.tipo=a.getTipo();
		this.proteccion=a.getProteccion();
		this.categoria=a.getCategoria();
		this.peso=a.getPeso();
	}
	
	public String getTipo(){
		return this.tipo;
	}
	public int getProteccion(){
		return this.proteccion;
	}
	public String getCategoria(){
		return this.categoria;
	}
	public double getPeso(){
		return this.peso;
	}
	
	public void setTipo(String t){
		this.tipo=t;
	}
	public void setProteccion(int p){
		this.proteccion=p;
	}
	public void setCategoria(String c){
		this.categoria=c;
	}
	public void setPeso(Double p){
		this.peso=p;
	}
	
	@Override 
	public int compareTo(Armadura){
		int resultado;
			if(ti)
		return resultado;
	}
}
