package uni.edu.ni.networking.programa2_socket;

import java.io.IOException;
import uni.edu.ni.networking.programa2_socket.backend.pojo.Servidor;

public class MainServidor {

    public static void main(String[] args) throws IOException{

        Servidor servidor = new Servidor(); //Se crea el servidor
        
        System.out.println("Iniciando servidor");
        servidor.startServer(); //Se inicia el servidor
    }
    
}
