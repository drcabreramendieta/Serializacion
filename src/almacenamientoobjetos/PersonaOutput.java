/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacenamientoobjetos;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author hola
 */
public class PersonaOutput {
    private FileOutputStream file;
    private ObjectOutputStream objeto;
    
    public void abrirArchivo(String path) throws FileNotFoundException, IOException{
        file = new FileOutputStream(path);
        objeto = new ObjectOutputStream(file);
    }
    
    public void cerrarArchivo() throws IOException{
        if(objeto != null){
            objeto.close();
        }
    }
    
    public void escrituraPersona(Persona p) throws IOException{
        if(objeto != null){
            objeto.writeObject(p);
        }
    }
}
