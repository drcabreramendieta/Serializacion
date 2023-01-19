/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacenamientoobjetos;

import java.io.EOFException;
import java.io.IOException;

/**
 *
 * @author hola
 */
public class AlmacenamientoObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        Persona p = new Persona();
        p.setNombre("Pedro");
        p.setApellido("Perez");
        p.setTelefono("0000000000");
        p.setDireccion("UPS");
        
        PersonaOutput po = new PersonaOutput();
        po.abrirArchivo("personas.ser");
        po.escrituraPersona(p);
        po.escrituraPersona(p);
        po.escrituraPersona(p);
        po.escrituraPersona(p);
        po.cerrarArchivo();
        
        PersonaInput pi = new PersonaInput();
        pi.abrirArchivo("personas.ser");
        Persona pp;
        try{
            do{
                pp = pi.leerPersona();
                System.out.println(pp.getTelefono());
            }while(pp != null);
        }
        catch(EOFException eof){
        
        }
        pi.cerrarArchivo();
    }
    
}
