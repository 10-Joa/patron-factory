package patrones.patron.factory.upload.impl;

import patrones.patron.factory.upload.BuilderUploadInterface;

public class UploadSftp implements BuilderUploadInterface {

	@Override
	public void upload() {
		System.out.println("El archivo se subio con exito por SFTP");
		
	}

	@Override
	public void close() {
		System.out.println("close");
		
	}
}
