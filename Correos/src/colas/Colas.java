
package colas;

/**
 *
 * @author Stephanie
 */

public class Colas {

    private Lista listaCola;

    public Colas() {
        listaCola = new Lista("Lista Cola");
    }
    
    public void encolar(Object dato){
        listaCola.insertarAlFinal(dato);
    }
    
    public Object desencolar() throws ExcepcionListaVacia{
        return listaCola.eliminarDelFrente();
    }
    
    public boolean estaVacia(){
        return listaCola.estaVacia();
    }
    
    public void imprimirCola(){
        listaCola.imprimir();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Creadorcolas crear = new Creadorcolas();
        crear.agregarCliente("Juan");
        crear.agregarCliente("Pedro");
        crear.agregarCliente("Maria");
        
        crear.mostrarCola();
        
        while (crear.hayClientes()){
            Cliente obtenerClienteAtender = crear.obtenerClienteAtender();
            System.out.println("Se debe atender al cliente: ");
            String nombre = obtenerClienteAtender.getNombre();
            System.out.println(nombre);
        }
    }
    
    
}
