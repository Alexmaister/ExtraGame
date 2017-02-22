package Clases;
import Excepciones.ArmaException;
import Interfaces.Arma;
/**
 * @author Ale
 *
 */

/*Estudio:
 * 
 * propiedades basicas :
 * tipo:Consultable y modificable
 * nombre:Consultable y modificable
 * peso:COnsultable y modificable
 * municion:Consultable y modificable
 * accesorio:Consultable y modificable
 *
 */

/*INTERFAZ:
 * 
 * int getTipo()
 * void setTipo(int t)
 * String getNombre()
 * void setNombre(String n)
 * double getPeso()
 * void setPeso(double p)
 * float getMunicion()
 * void setMunicion(float m)
 * int getAccesorio()
 * void setAccesorio(int a)
 * */
public class ArmaImpl implements Arma,Cloneable,Comparable<ArmaImpl>{
	
	private int tipo;
	private String nombre;
	private double peso;
	private float municion;
	private int accesorio;
	
	//constructor por defecto
	public ArmaImpl(){
		
		this.tipo=0;
		this.nombre="P200";
		this.peso=0.545;
		this.municion=8;
		this.accesorio=0;
	}
	//constructor por parametros
	public ArmaImpl(int t, String n , double p, float m, int a){
		
		
		this.tipo=t;
		this.nombre=n;
		this.peso=p;
		this.municion=m;
		this.accesorio=a;
		
	}
	//constructor de copia
	public ArmaImpl(ArmaImpl a){
		this.tipo=a.getTipo();
		this.nombre=a.getNombre();
		this.peso=a.getPeso();
		this.municion=a.getMunicion();
		this.accesorio=a.getAccesorio();
	}
	//metodos consultores
	public int getTipo(){
		return this.tipo;
	}
	public String getNombre(){
		return this.nombre;
	}
	public double getPeso(){
		return this.peso;
	}
	public float getMunicion(){
		return this.municion;
	}
	public int getAccesorio(){
		return this.accesorio;
	}
	//metodos modificadores
	public void setTipo(int t){
		this.tipo=t;
	}
	public void setNombre(String n){
		this.nombre=n;
	}
	public void setPeso(double p)throws ArmaException{
		if(p<0.0)
			throw new ArmaException("El arma tiene que tener un peso real");
		else this.peso=p;
	}
	public void setMunicion(float m){
		this.municion=m;
	}
	public void setAccesorio(int a){
		this.accesorio=a;
	}

	@Override
	public ArmaImpl clone(){
		ArmaImpl clon=null;
		
		try{
			clon=(ArmaImpl)super.clone();
		}catch (CloneNotSupportedException exc){
			System.out.print(exc);
		}
		return clon;
	}
	@Override
	public int compareTo(ArmaImpl a){
		int comparacion;
		if(this.municion==a.getMunicion())
			comparacion=0;
		else if(this.municion>a.getMunicion())
			comparacion=1;
		else
			comparacion=-1;
		return comparacion; 
	}
	
	@Override
	public boolean equals(Object obj){
		boolean resultado;
		if (obj !=null && obj instanceof ArmaImpl)
			resultado=true;
		else resultado=false;
		return resultado;
	}
	@Override 
	public String toString(){
		return this.tipo+","+this.nombre+","+this.peso+","+this.municion+","+this.accesorio;
	}
	@Override
	public int hashCode(){
		return this.getTipo()/this.nombre.hashCode()+(1/3)*1/this.accesorio;
	}
	
		
	
}
