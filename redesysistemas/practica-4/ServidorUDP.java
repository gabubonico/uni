package redes;

import java.net.*;
import java.io.*;

public class ServidorUDP {
	
	public static void main(String args[]) {
		int port = 12345;
		Socket socket = null;
		ServerSocket ss = null;
		
		try {
			ss = new ServerSocket(port);
		} catch (SocketException e) {
			System.out.println("Error creando el socket");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			socket = new Socket("localhost",port);
		} catch (SocketException e) {
			System.out.println("Error creando el socket");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedReader r = null;
		
		try {
			r = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch(IOException e) {
			System.out.println("error");
		}
		
		while (true) {
			
			try {
				socket = ss.accept();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
