package patrones.patron.factory;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import patrones.patron.factory.factory.ConexionFactory;
import patrones.patron.factory.factory.UploadFactory;
import patrones.patron.factory.iconexion.ConexionInterface;
import patrones.patron.factory.upload.BuilderUploadInterface;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	public void conexion() {
		ConexionInterface conexion =  ConexionFactory.getConection("sql"); 
		conexion.conectar();
		conexion.desconectar();
		
		BuilderUploadInterface upload = UploadFactory.uploadFactory("FTP");
		upload.upload();
		upload.close();
	}
}
