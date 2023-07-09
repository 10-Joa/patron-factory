package patrones.patron.factory.factory;

import patrones.patron.factory.iconexion.ConexionInterface;
import patrones.patron.factory.iconexion.impl.ConexionMySql;
import patrones.patron.factory.iconexion.impl.ConexionSql;
import patrones.patron.factory.iconexion.impl.ConexionVacia;

public class ConexionFactory {

	public static ConexionInterface getConection(String base) {

		if (base == null) {
			return new ConexionVacia();
		}

		if (base.equalsIgnoreCase("sql")) {
			return new ConexionSql();
		} else if (base.equalsIgnoreCase("mysql")) {
			return new ConexionMySql();
		} else {
			return new ConexionVacia();
		}
	}

}
