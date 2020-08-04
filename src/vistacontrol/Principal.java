/*Constructor.
- Es un método
- Tiene el mismo nombre de la clase
- Sirve para inicializar valores de un objeto
- Se ejecuta al crear un objeto.
- Sobrecarga de constructores: Cuando tengo varios constructores en un misma clase, pero con diferentes parámetros.
- Cuando no se define, se crea un constructor vacío por defecto.*/
package vistacontrol;

import modelo.Alumno;

public class Principal {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        Alumno alumno1 = new Alumno(2,"1823110215","cristian gamboa condori");
      //CLASE OBJETO      CONSTRUCTOR
        
        alumno.setIdalumno(1);
        alumno.setCodigo("1823110074");
        alumno.setNombre("Joseph Jeremy");
        System.out.println("Objeto: Alumno");
        System.out.println("ID: "+alumno.getIdalumno());
        System.out.println("Codigo: "+alumno.getCodigo());
        System.out.println("Nombre: "+alumno.getNombre());
        
        System.out.println("Objeto: Alumno1");
        System.out.println("ID: "+alumno1.getIdalumno());
        System.out.println("Codigo: "+alumno1.getCodigo());
        System.out.println("Nombre: "+alumno1.getNombre());
    }
}
