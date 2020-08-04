package vistacontrol;
import java.util.ArrayList;
import modelo.Cliente;
import utils.Leer;
/*MENU PRINICIPAL
1.Agregar clientes
2.Eliminar clientes
3.Editar clientes
4.Listar clientes
5.Salie
*/

public class Index {
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private static int idcliente = -1;
    public static void agregarclientes(){
        String nombre;
        String apellidos;
        String dni;
        String f_nacimiento;
        
        System.out.println("Agregar Cliente");
        System.out.print("Nombre: ");
        nombre = Leer.cadena();
        System.out.print("Apellidos: ");
        apellidos = Leer.cadena();
        do {
            System.out.print("DNI: ");
            dni = Leer.cadena();
        } while (dniValido(dni)==false || esNumero(dni)== false || dniUnico(dni)== false);
        
        System.out.print("Fecha de Nacimiento: ");
        f_nacimiento = Leer.cadena();
        idcliente ++;
        Cliente cliente = new Cliente(idcliente,nombre,apellidos,dni,f_nacimiento);
        clientes.add(cliente);
        System.out.println("Resultado: se agrego un cliente con exito..,");
    }
    public static boolean dniValido(String dni){
        boolean resultado;
        if (dni.length()==8){
            resultado = true;
        }else{
            error(2);
            resultado = false;
        }
        return resultado;
    }
    public static boolean dniUnico(String dni){
        boolean resultado = true;
        for (Cliente cliente : clientes) {
            if (cliente.getDni().equals(dni)) { 
                error(4);
                resultado = false;
                break;
            }            
        }
        return resultado;
    }
    public static void eliminarclientes(){
        int elemento;
        listarclientes();
        System.out.println("Ingrese la posicion del cliente que se quiere eliminar: ");
        elemento = Leer.entero();
        elemento --;
        clientes.remove(elemento);
    }
    public static void editarclientes(){
        int elemento;
        listarclientes();
        System.out.println("Ingrese la posicion del cliente que se quiere editar: ");
        elemento = Leer.entero();
        elemento --;
        System.out.println("Resultado: "+clientes.get(elemento).getNombrecompleto());
        System.out.println("Nuevos nombres: ");
        clientes.get(elemento).setNombre(Leer.cadena());
        System.out.println("Nuevos apellidos");
        clientes.get(elemento).setApellido(Leer.cadena());
        String dni;
        do {
            System.out.print("Nuevo DNI: ");
            dni = Leer.cadena();
        } while (dniValido(dni)==false || esNumero(dni)== false || dniUnico(dni)== false);        
        clientes.get(elemento).setDni(dni);
        System.out.println("Nueva fecha de nacimiento: ");
        clientes.get(elemento).setF_nacimiento(Leer.cadena());       
    }
    public static void listarclientes(){
        System.out.println("Listar Clientes");
        System.out.println("N°\tDNI\tF.nacimiento\tApeliido y Nombre");
        int num =0;
        for (Cliente cliente : clientes) {
            num++;
            System.out.println(num+"\t"+cliente.getDni()+"\t"+cliente.getF_nacimiento()+"\t"+cliente.getNombrecompleto());
        }
    }
    public static void salir(){
        System.out.println("Gracias por visitarnos.");
    }
    public static void error(int tipo){
        switch(tipo){
            case 1:
                System.out.println("Opcion incorrecta");
                break;
            case 2:
                System.out.println("DNI debe ser de 8 digitos");
            case 3:
                System.out.println("DNI debe estar compuesto por digitos");
            case 4:
                System.out.println("DNI repetido pertenece a otra persona");
            default:
                System.out.println("Error");
                break;
        }
    }
    public static boolean esNumero(String cadena){
        boolean resultado;
        try {
            Double.parseDouble(cadena);
            resultado = true;
        } catch (NumberFormatException nfe) {
            error(3);
            resultado = false;        
        }
        return resultado;
    }
    public static void menu(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("1.agregar clientes");
        System.out.println("2.eliminar clientes");
        System.out.println("3.editar clientes");
        System.out.println("4.listar clientes");
        System.out.println("5.salir");
        System.out.println("Elija una opcion: ");
    }
    public static void inicio(){
        int opcion;
        do {
            menu();
            opcion = Leer.entero();
            switch(opcion){
                case 1:
                    agregarclientes();
                    break;
                case 2:
                    eliminarclientes();
                    break;
                case 3:
                    editarclientes();
                    break;
                case 4:
                    listarclientes();
                    break;
                case 5:
                    salir();
                    break;
                default:
                    error(1);
            }
            
        } while (opcion != 5);
        
    }
    public static void main(String[] args) {
        inicio();
    }
}
