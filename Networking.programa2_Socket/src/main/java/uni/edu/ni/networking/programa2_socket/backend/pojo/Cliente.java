package uni.edu.ni.networking.programa2_socket.backend.pojo;

import java.io.DataOutputStream;
import java.io.IOException;

public class Cliente extends Conexion{
    
    public Cliente() throws IOException {
        
        super("cliente");
    } //Se usa el constructor para el cliente de Conexión 
    
    public void startCliente(){ //Método para iniciar el cliente 
        
        try{
            //Flujo de datos hacia el servidor
            salidaServidor = new DataOutputStream(cs.getOutputStream());
            
            //Se envian 2 mensajes
            for (int i = 0; i < 2; i++) {
                //Se escribe en el servidor usando su flujo de datos
                salidaServidor.writeUTF("Este es el mensaje nuevo" + (i + 1));
            }
            
            cs.close(); //Fin de la conexión
            
        } catch(IOException ex){
            
            System.out.println(ex.getMessage());
        }
    }
}
