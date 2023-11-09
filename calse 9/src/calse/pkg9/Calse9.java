package calse.pkg9;
import javax.swing.JOptionPane;
public class Calse9 {
    public static void main(String[] args) {
        
        Persona arrPersona[] = new Persona[1];
        
        for (int x = 0; x < arrPersona.length; x++) {
            JOptionPane.showMessageDialog(null, "Se soplicitan los datos del estufiante" + x);
            String y ="";
            int cedula = 0;
            y = JOptionPane.showInputDialog( "Ingrese la cedula"); 
            cedula = (int) Double.parseDouble(y);
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
            String appellido1 = JOptionPane.showInputDialog(null, "Ingrese el primer apellido");
            String appellido2 = JOptionPane.showInputDialog(null, "Ingrese el segundo apellido");
            arrPersona[x]=new Persona(nombre, appellido1, appellido2, cedula); 
        }
        for (int i = 0; i < arrPersona.length; i++) {
            JOptionPane.showConfirmDialog(null, arrPersona[i].getCedula()+ "\n" + arrPersona[i].getNombre() + "\n"  + 
             arrPersona[i].getApellido1() + "\n"  +  arrPersona[i].getApellido2());
            
    }
    
}
}
