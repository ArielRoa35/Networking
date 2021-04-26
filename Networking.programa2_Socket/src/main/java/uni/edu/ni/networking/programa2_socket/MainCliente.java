package uni.edu.ni.networking.programa2_socket;

import java.io.IOException;
import uni.edu.ni.networking.programa2_socket.backend.pojo.Cliente;

public class MainCliente {

    public static void main(String[] args) throws IOException {
        
        Cliente cliente = new Cliente(); //Se crea el cliente
        
        System.out.println("Iniciando cliente");
        cliente.startCliente(); //Se inicia el cliente
    }
    
}
