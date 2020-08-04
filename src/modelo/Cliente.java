
package modelo;

public class Cliente {
    private int idcliente;
    private String nombre;
    private String apellido;
    private String dni;
    private String f_nacimiento;
    //constructores
    public Cliente() {
    }
    
    public Cliente(int idcliente, String nombre, String apellido, String dni, String f_nacimiento) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.f_nacimiento = f_nacimiento;
    }
    //Metodo accesores
    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }
    
    //Metodo accesores especiales(Con formato)
    public String getNombrecompleto(){
        return apellido.toUpperCase() + " , "+nombre;
    }
    


    
}
