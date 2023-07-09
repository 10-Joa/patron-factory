package patrones.patron.factory.iconexion.impl;

import patrones.patron.factory.iconexion.ConexionInterface;

public class ConexionSql implements ConexionInterface{

	private String host;
	private String puerto;
	private String usuario;
	private String password;
	
	
	public ConexionSql() {
		super();
		this.host = "localhost";
		this.puerto = "2222";
		this.usuario = "SQL";
		this.password = "1233555";
	}

	@Override
	public void conectar() {
		System.out.println("Conexion establecida con SQL");
	}

	@Override
	public void desconectar() {
		System.out.println("Conexion cerrada de SQL");
	}

}
