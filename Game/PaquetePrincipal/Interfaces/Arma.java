package Interfaces;
import Excepciones.ArmaException;
public interface Arma {

	 int getTipo();
	 void setTipo(int t);
	 String getNombre();
	 void setNombre(String n);
	 double getPeso();
	 void setPeso(double p)throws ArmaException;
	 float getMunicion();
	 void setMunicion(float m);
	 int getAccesorio();
	 void setAccesorio(int a);
}
