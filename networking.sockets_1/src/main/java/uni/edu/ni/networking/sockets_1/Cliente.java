package uni.edu.ni.networking.sockets_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {

    public static void main(String[] args) {

        final String HOST = "192.168.0.12";
        final int PUERTO = 5001;
        DataInputStream in;
        DataOutputStream out;
        
        try {
            
            Socket sc = new Socket(HOST, PUERTO);
            
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            
            out.writeUTF("¡Hola mundo desde el cliente!");
            
            String mensaje = in.readUTF();
            System.out.println(mensaje);
            
            sc.close();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
