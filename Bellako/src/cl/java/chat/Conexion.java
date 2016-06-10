package cl.java.chat;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.*;

public class Conexion implements Runnable {
	private ServerSocket serv;
	private Socket clien;
	private Cliente cliente;

	@Override
	public void run() {
			try {
				serv=new ServerSocket(8090);
				while(true){
					clien=serv.accept();
					ObjectInputStream flujo = new ObjectInputStream(clien.getInputStream());
					cliente =(Cliente)flujo.readObject();
				}
				
			} catch (Exception e) {
				System.out.println("Error en cliente " + e.getMessage());
			}
	}

	/**
	 * @return the serv
	 */
	public ServerSocket getServ() {
		return serv;
	}

	/**
	 * @param serv
	 *            the serv to set
	 */
	public void setServ(ServerSocket serv) {
		this.serv = serv;
	}

	/**
	 * @return the clien
	 */
	public Socket getClien() {
		return clien;
	}

	/**
	 * @param clien
	 *            the clien to set
	 */
	public void setClien(Socket clien) {
		this.clien = clien;
	}

}
