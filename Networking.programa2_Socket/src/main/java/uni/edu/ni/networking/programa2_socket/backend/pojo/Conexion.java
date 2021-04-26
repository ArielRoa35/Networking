package uni.edu.ni.networking.programa2_socket.backend.pojo;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Conexion {
    
    private final int PUERTO = 1234; //puerto de la conexión
    private final String HOST = "localHost"; // Host para la conexión
    protected String mensajeServidor; //Mensajes entrantes (recibidos) en el servidor
    protected ServerSocket ss; //Socket del servidor
    protected Socket cs; //Socket del cliente
    protected DataOutputStream salidaServidor, salidaCliente; //Flujo de datos de salida
    
    public Conexion(String tipo) throws IOException {
        
        if(tipo.equalsIgnoreCase("servidor")){
            
            ss = new ServerSocket(PUERTO); //Se crea el Socket para el servidor en puerto 1234
            cs = new Socket(); //Socket para el cliente
        }else{
            
            cs = new Socket(HOST, PUERTO); //Socket para el cliente en LocalHost en puerto 1234
        }
    }
}
