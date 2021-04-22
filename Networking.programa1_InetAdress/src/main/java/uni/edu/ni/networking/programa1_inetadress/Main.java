package uni.edu.ni.networking.programa1_inetadress;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static void main(String[] args) {
        
        try {
            System.out.println("-> Dirección IP de una URL, por nombre");
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println(address);
            
            System.out.println("-> Nombre a partir de la dirección");
            int temp = address.toString().indexOf('/');
            address = InetAddress.getByName(address.toString().substring(temp + 1));
            System.out.println(address);
            
            System.out.println("-> Dirección IP actual del LocalHost");
            address = InetAddress.getLocalHost();
            System.out.println(address);
            
            System.out.println("Nombre del LocalHost a partir de la dirección");
            temp = address.toString().indexOf('/');
            address = InetAddress.getByName(address.toString().substring(temp + 1));
            System.out.println(address);
            
            System.out.println("-> Nombre actual del LocalHost");
            System.out.println(address.getHostName());
            System.out.println(address.getCanonicalHostName());
            
            System.out.println("Dirección IP actual del LocalHost");
            
            //Toma la direcció IP con un array de bytes.
            byte[] bytes = address.getAddress();
            //Convierte los bytes de la dirección IP a valores
            //sin signo y los presenta separados por espacios.
            for (int i = 0; i < bytes.length; i++) {
                int uBytes = bytes[i] < 0 ? bytes[i] + 256 : bytes[i];
                System.out.println(uBytes + " ");
            }
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
