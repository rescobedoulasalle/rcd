import java.net.*;
import java.io.*;

public class Ejemplo1Emisor {

	public static void main (String[] args) {
		if ( args.length != 3)
			System.out.println ("Este programa requiere sólo 3 argumentos en línea de mandato");
		else{
		
			try{	
				InetAddress maRe = InetAddress.getByName(args[0]);
				int puRe = Integer.parseInt(args[1]);
				String mensaje = args[2];
			
				DatagramSocket miSocket = new DatagramSocket();
				byte[] almacen = mensaje.getBytes();
				DatagramPacket datagrama = new DatagramPacket(almacen, almacen.length, maRe, puRe);

				miSocket.send(datagrama);
				miSocket.close();
			}catch (Exception ex){
				ex.printStackTrace();
			}

		}
	}

}
