/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;
import libros.*; //importa clase libros 
import listaSimpleLibros.ListaEnlazada; //importa la lista libros 

public class Libreria {
    //Atributos de la clase
    private String nombre;
    private String pais;
    private int telefono;
    private String ubicacion;
    private  Libros libro; 
    private ListaEnlazada<Libros> Libros;
    
    //Constructores 
    public Libreria(){
        
    }

    public ListaEnlazada<Libros> getListaLibros() {
        return Libros;
    }

    @Override
    public String toString() {
        return "Libreria{" + "nombre=" + nombre + ", pais=" + pais + ", telefono=" + telefono + ", ubicacion=" + ubicacion + ", Libros=" + Libros.mostrarLista()+ '}';
    }
    //Asignación de la lista de libros
    public void setListaLibros(ListaEnlazada<Libros> listaLibros) {
        this.Libros = listaLibros;
    }

    public Libreria(String nombre, String pais, int telefono, String ubicacion) {
        this.nombre = nombre;
        this.pais = pais;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
      
    }
    //Métodos de get y set 
    public Libros getLibro() {
        return libro;
    }

    public void setLibro(Libros libro) {
        this.libro = libro;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

}
