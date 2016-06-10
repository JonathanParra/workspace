package cl.curso.java.login_app;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;

public class ServicioWebCam {
	
	
	private ServicioWebCam(){
		
	}
	
	public static void sacarFoto(){
		Webcam webcam = Webcam.getDefault();
    	webcam.setViewSize(WebcamResolution.VGA.getSize());
    	//webcam.setViewSize(new Dimension(1024,780));
    	webcam.open();
    	try {
			ImageIO.write(webcam.getImage(),"PNG",new File("c:/Users/usuario/Desktop/"+new Date().getTime()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
