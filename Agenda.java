package Negocio.Modelo;
import Negocio.Control.Persona;
import java.util.Vector;
import javax.swing.JOptionPane;
public class Agenda {
    private Object agenda;
    public Agenda(Object agenda){
        this.agenda=agenda;
    }
    public Agenda(){   
    }   
    Vector vector=new Vector();
    Persona persona=new Persona();
    public void GuardarPersona(Persona persona){ 
        if(vector.add(persona)){
            
            JOptionPane.showMessageDialog(null, "Se ha agregado correctamente"
                    + " la persona");  
        }
    } 
    public String MostrarAgenda(){
        String Linea="",Linea2;  
            for(int x=0; x<vector.size();x++){
                persona=(Persona)vector.get(x);
                Linea2=persona.Nombre+" - "+persona.Apellidos+" - "
                        +persona.Cedula+" - "+persona.Telefono;             
            Linea=Linea+Linea2+"\n";    
            } return Linea;}}
