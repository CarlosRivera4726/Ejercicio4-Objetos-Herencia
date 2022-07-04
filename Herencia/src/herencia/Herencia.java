/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author Carlos
 */
public class Herencia {

    /*
        Crea una clase Persona con las siguientes variables:

        La edad

        El nombre

        El teléfono

        Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

        Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

        Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente = new Cliente();
        cliente.setNombre("Carlos");
        cliente.setEdad(20);
        cliente.setTelefono(1234);
        cliente.setCredito("123456789");
        
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Felipe");
        trabajador.setEdad(22);
        trabajador.setTelefono(12334);
        trabajador.setSalario("158875445");
        
        System.out.println(cliente);
        System.out.println(trabajador);
    }
    
}
