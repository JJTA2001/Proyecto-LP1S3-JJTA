
package modelo;


public class Alumno {
    private int idalumno;
    private String codigo;
    private String nombre;
//CONSTRUCTOR VACIO
    public Alumno() {
    }

    //CONSTRUCTOR QUE RECIBE VALORES PARA INICIALIZAR
    public Alumno(int idalumno, String codigo, String nombre) {
        this.idalumno = idalumno;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    
    
    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
