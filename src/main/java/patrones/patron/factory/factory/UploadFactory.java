package patrones.patron.factory.factory;

import patrones.patron.factory.upload.BuilderUploadInterface;
import patrones.patron.factory.upload.impl.UploadFtp;
import patrones.patron.factory.upload.impl.UploadSftp;

public class UploadFactory {

	public static BuilderUploadInterface uploadFactory(String type) {
		if (type.equalsIgnoreCase("FTP")) {
			return new UploadFtp();
		} else if (type.equalsIgnoreCase("DFTP")) {
			return new UploadSftp();
		} else {
			return null;
		}
	}
}
