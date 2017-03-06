package Clases;
import Excepciones.*;

/**
 * @author Ale
 *
 */

/*Estudio:
 * propiedades basicas:
 * 	Vida:Consultable y modificable
 * 	Tipo:Consultable y modificable
 * 	Planeta:Consultable y modificable
 * 	Arma:Consultable y modificable
 * 	Poder:Consultable y modificable
 * 	Ataque:Consultable y modificable 
 * 	Defensa:Consultable y modificable
 * 	Nivel :Consultable y modificable
 */

/*Interfaz
 * int getVida()
 * void setVida(int v)
 * String getTipo()
 * void setTipo(String t)
 * String getPlaneta()
 * void setPlaneta(String p)
 * Arma getArma()
 * void setArma(Arma a)
 * void setPoder()
 * int getAtaque()
 * void setAtaque(int a)
 * int getDefensa()
 * void setDefensa(int d)
 * int getNIvel()
 * void setNivel(int n)
 * 
 * void disparar(Marciano m)
 */
public class Marciano implements Cloneable,Comparable<Marciano>{
	
	private int vida;
	private String tipo;
	private String planeta;
	private ArmaImpl arma;
	private double poder;
	private double ataque;
	private double defensa;
	private Armadura armadura;
	public Marciano(){
		this.vida=100;
		this.tipo="Soldado";
		this.planeta="Venus";
		this.arma=new ArmaImpl();	
	}

	public Marciano(int v,String t, String p, ArmaImpl a){
		
		this.vida=v;
		this.tipo=t;
		this.planeta=p;
		this.arma=a;
		
	}
	public Marciano(Marciano m){
		this.vida=m.getVida();
		this.tipo=m.getTipo();
		this.planeta=m.getPlaneta();
		this.arma=m.getArma();
		
	}
	
	public int getVida(){
		return this.vida;
	}
	public String getTipo(){
		return this.tipo;
	}
	public String getPlaneta(){
		return this.planeta;
	}
	public ArmaImpl getArma(){
		return this.arma;
	}
	public double getPoder(){
		return this.poder;
	}
	public double getAtaque(){
		return this.ataque;
	}
	public double getDefensa(){
		return this.defensa;
	}
	
	
	public void setVida(int v)throws MarcianoException{
		if(v<0)
			throw new MarcianoException("La vida no puede ser menos que cero");
		else
		this.vida=v;
	}
	public void setTipo(String t){
		this.tipo=t;
	}
	public void setPlaneta(String p){
		this.planeta=p;
	}
	public void setArma(ArmaImpl a){

			
			this.arma.setNombre(a.getNombre());
			this.arma.setTipo(a.getTipo());
			try{
			this.arma.setPeso(a.getPeso());
			}catch(ArmaException aExcption){
				System.out.println(aExcption);
			}
			this.arma.setMunicion(a.getMunicion());
			this.arma.setAccesorio(a.getAccesorio());
			
		}

	public void setPoder(double p){
		this.poder=p;
	}
	
	public void setAtaque(double a){
		this.ataque=a;
	}
	public void setDefensa(double d){
		this.defensa=d;
	}
	//////////////////////////////////////////////////////////////////////////////////
	/*
	  cabecera: public void restarVida(int v)
	  descripcion: metodo que restara un numero entero a la vida de un marciano
	  entradas:un entero
	  salidas:ninguna
	  precondiciones:ninguna
	  postcondiciones: el objeto marciano tendra la vida menos el entero de entrada
	 
	public void restarVida(int v)throws MarcianoException{
		if(v<1)
			throw new MarcianoException("No se puede decremetar esa cantidad");
		else this.vida-=v;
	}*/
	///////////////////////////////////////////////////////////////////////////////
	
	/*
	  cabecera:public void modificarPoder(double)
	  descripcion:procedimiento que amentara el poder al marciano segun un parametro entero
	  entradas:un real
	  salidas:ninguna
	  precondiciones:ninguna
	  postcondiciones:el poder del marciano se modificara segun el numero introducido

	public void modificarPoder(double apw){
		
		this.poder+=apw;
	}*/
	////////////////////////////////////////////////////////////////////////////////
	
	
	/*
	 * cabecera:public void dispara(Marciano m)
	 * descripcion: procedimiento que modificara los datos del Marciano que se envia por parametros
	 * entradas:-
	 * salidas:-
	 * entradas/salidas:un objeto de la clase marciano
	 * precondiciones:ninguna
	 * postcondiciones:ninguna
	 * */
	public void disparar(Marciano m){
		
		try {
			m.setVida(0);
		} catch (MarcianoException mE) {
			
			System.out.println("Error vida menor que cero");
		}
		
		
	}
	
	@Override
	public Marciano clone(){
		Marciano clon=null;
		try{
			clon=(Marciano)super.clone();
		}catch(CloneNotSupportedException exc){
			System.out.print("El objeto no se pudo clonar");
		}
		return clon;
	}
	@Override
	/*cabecera: int compareTo(Marciano m)
	 * descripcion:funcion que comprara dos marcianos por su poder
	 * entradas: un Marciano
	 * salidas: un entero
	 * precondiciones:ninguna
	 * postcondiciones:el resultado sera -1 de ser menos , 1 de ser mayor y 0 si ambos son iguales
	 * */
	public int compareTo(Marciano m){
		int resultado;
			if(this.poder>m.getPoder())
				resultado=1;
			else if(this.poder==m.getPoder())
				resultado=0;
			else resultado=-1;
		return resultado;
	}
	public String toString(){
		return this.vida+","+this.tipo+","+this.planeta+","+this.arma.toString()+","+this.poder;
	}
	@Override
	public boolean equals(Object obj){
		boolean resultado;
		if(obj !=null && obj instanceof Marciano)
			resultado=true;else resultado=false;
		return resultado;
	}
	@Override
	public int hashCode(){
		return (this.vida+(3/4)*(int)this.poder)-(1/2*this.tipo.hashCode()/this.planeta.hashCode())/this.arma.hashCode();
	}
}
	