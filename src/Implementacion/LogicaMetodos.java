package Implementacion;

import java.util.HashMap;

import Dominio.Llantas;
import Interface.Metodos;

public class LogicaMetodos implements Metodos {
	private HashMap<Long, Llantas> hashmap = new HashMap<Long, Llantas>();
	
	@Override
	public void guardar(Llantas llanta) {
		// TODO Auto-generated method stub
		hashmap.put(llanta.getCodigoDeBarra(), llanta);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hashmap+"\n");
	}

	@Override
	public Llantas biuscar(long codigBarra) {
		// TODO Auto-generated method stub
		return hashmap.get(codigBarra);
	}

	@Override
	public void editar(Llantas llanta) {
		// TODO Auto-generated method stub
		hashmap.put(llanta.getCodigoDeBarra(), llanta);
	}

	@Override
	public void eliminar(long codigoBarra) {
		// TODO Auto-generated method stub
		hashmap.remove(codigoBarra);
	}

}
