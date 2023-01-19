/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacenamientoobjetos;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
/**
 *
 * @author hola
 */
public class PersonaInput {
    private FileInputStream fis;
    private ObjectInputStream ois;
    
    public void abrirArchivo(String path) throws FileNotFoundException, IOException{
        fis = new FileInputStream(path);
        ois = new ObjectInputStream(fis);
    }
    
    public void cerrarArchivo() throws IOException{
        if(ois != null){
            ois.close();
        }
    }
    
    public Persona leerPersona() throws IOException, ClassNotFoundException{
        Persona p = null;
        if(ois != null){
            p = (Persona)ois.readObject();
            
        }
        return p;
    }
}
