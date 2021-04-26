package uni.edu.ni.networking.programa2_socket.backend.pojo;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Servidor extends Conexion{ //Se hereda de conexión para hacer uso de los sockets y demás
    
    public Servidor() throws IOException {
        super("servidor");
    } //Se usa el constructor para servidor de conexión
    
    public void startServer(){ //Métedo para iniciar el servidor
        
        try{
            
            System.out.println("Esperando..."); //Esperando conexión
            
            cs = ss.accept(); //Accept comienza el socket y espera un conexión desde un cliente
            
            System.out.println("Cliente en linea");
            
            //Se obtiene el flujo de salida del cliente para enviarle mensaje
            salidaCliente = new DataOutputStream(cs.getOutputStream());
            
            //Se le envia un mensaje al cliente usando su flujo de salida
            salidaCliente.writeUTF("Petición recibida y aceptada");
            
            //Se obtiene el flujo entrante desde el cliente
            BufferedReader entrada = new BufferedReader(new InputStreamReader(cs.getInputStream()));
            
            while((mensajeServidor = entrada.readLine()) != null){ //Mientras haya mensajes desde el cliente
                //Se muestra por pantalla el mensaje recibido
                System.out.println(mensajeServidor);
            }
            
            System.out.println("Fin de la conxión");
            
            ss.close(); //Se finaliza la conexión con el cliente
            
        }catch(IOException ex){
            
            System.out.println(ex.getMessage());
        }
    }
}
