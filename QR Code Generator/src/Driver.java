import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class Driver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String info = "Chayan Sengupta - Channel name : One To N Teaching";
		ByteArrayOutputStream out = QRCode.from(info).to(ImageType.JPG).stream();
		
		File f = new File("MyChannelInfo.jpg");
		FileOutputStream fos = new FileOutputStream(f);
		fos.write(out.toByteArray());
		fos.flush();
		fos.close();
		
	}

}
