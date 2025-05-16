package Interface;

import Dominio.Llantas;

public interface Metodos {
	
	//CRUD BASIC
	
	public void guardar(Llantas llanta);
	
	public void mostrar();
	
	public Llantas biuscar(long codigBarra);
	
	public void editar(Llantas llanta);
	
	public void eliminar(long codigoBarra);
	
	
}
