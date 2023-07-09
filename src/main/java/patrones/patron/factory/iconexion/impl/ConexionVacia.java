package patrones.patron.factory.iconexion.impl;

import patrones.patron.factory.iconexion.ConexionInterface;

public class ConexionVacia implements ConexionInterface {

	@Override
	public void conectar() {
		System.out.println("No se especifico la conexion a una BD");
	}

	@Override
	public void desconectar() {
		System.out.println("No se especifico la conexion a una BD");
	}

}
