package listaSimpleLibros; //importa la lista de libros
import libros.*; //importa la clase libros 

public class Nodo<Libros> {
    
    private Libros dato;
    private Nodo<Libros> siguiente;

    public Nodo(){
        siguiente=null;
     }
    public Nodo(Libros p){
        siguiente=null;
        dato = p;
    }  
    public Nodo(Libros t, Nodo<Libros> siguiente){
        this.siguiente=siguiente;
        dato = t;
    }     
    
    
   //Métodos de get y set 
    public Libros getDato() {
        return dato;
    } 
    public void setDato(Libros dato) {
        this.dato = dato;
    }
    public Nodo<Libros> getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo<Libros> siguiente) {
        this.siguiente = siguiente;
    }     
}