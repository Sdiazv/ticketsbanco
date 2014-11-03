/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colas;

/**
 *
 * @author Stephanie
 */
public class Lista {
    private NodoLista primerNodo;
    private NodoLista ultimoNodo;
    private String nombre;

    public Lista() {
        this("lista");
    }

    public Lista(String nombreLista) {
        nombre = nombreLista;
        primerNodo = ultimoNodo = null;

    }
    // determina si la lista esta vacia
    public boolean estaVacia() {
        return primerNodo == null;//devuelve True si la lista esta vacia
    }

    public void insertarAlFrente(Object elementoInsertar) {
        if (estaVacia()) {
            primerNodo = ultimoNodo = new NodoLista(elementoInsertar);
        } else {
            primerNodo = new NodoLista(elementoInsertar, primerNodo);
        }

    }

    public void insertarAlFinal(Object elementoInsertar) {
        if (estaVacia()) {
            primerNodo = ultimoNodo = new NodoLista(elementoInsertar);
        } else {
            ultimoNodo = ultimoNodo.siguienteNodo = new NodoLista(elementoInsertar);
        }

    }

    public Object eliminarDelFrente() {
        if (estaVacia()) {
            throw new ExcepcionListaVacia(nombre);
        }
        Object elementoEliminado = primerNodo.datos;
        
        if(primerNodo==ultimoNodo)
            primerNodo =ultimoNodo =null;
        else
            primerNodo= primerNodo.siguienteNodo;
        return elementoEliminado;

    }
    public Object eliminarDelFinal(){
        if (estaVacia())
            throw new ExcepcionListaVacia (nombre);
        
        Object elementoEliminado = ultimoNodo.datos;
        
        if (primerNodo == ultimoNodo)
            primerNodo = ultimoNodo=null;
        else{
            NodoLista actual = primerNodo;
            
            // itera mientras el nodo actual no haga referencia a ultimoNodo
            while (actual.siguienteNodo !=ultimoNodo)
                actual = actual.siguienteNodo;
            
            ultimoNodo =actual;//actual el nuevo ultimoNodo
            actual.siguienteNodo=null;
         
        }
        return elementoEliminado;
    }
    public void imprimir(){
        if (estaVacia()){
            System.out.printf( "%vacia\n ", nombre);
            return;
        }
        System.out.printf ("La %s es: " , nombre);
        NodoLista actual =primerNodo;
        
        // mientras no este al final de la lista imprime los datos del nodo actual
        while (actual != null){
            System.out.printf( "%s ", actual.datos.toString());
            actual = actual.siguienteNodo;
            
        }
        System.out.println("\n");
        
    }
}
