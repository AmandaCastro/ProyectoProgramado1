/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaDobleLibreria;

/**
 *
 * @author Dell
 * @param <Libreria>
 */ 
public class ListaLibreria<Libreria> {
	
private NodeLibreria<Libreria> head;
    private int size;
    
public ListaLibreria(){
    listaVacia();
}

private void listaVacia(){
        head = null;
    }
	
public NodeLibreria<Libreria> getHead(){
    return this.head;
}   

public boolean esVacia(){
    return head == null;
}
//Método de agregar a la lista al inicio
public void agregarAInicio(Libreria data)
{
    if (this.head == null){
        NodeLibreria<Libreria> nuevo = new NodeLibreria<Libreria>(data);
        this.head = nuevo;
}
    else {
        NodeLibreria<Libreria> current = new NodeLibreria<Libreria>(data);
        current.setNext(head);
        head.setPrevious(current);
        head = current;
        this.size++;
}
    }
//Método de agregar a la lista al final       
public void agregarAlFinal(Libreria data)
{
    NodeLibreria<Libreria> ultimo = new NodeLibreria<Libreria>(data);
    this.size++;
    NodeLibreria<Libreria> current = this.head;
    if (head == null)
        head = ultimo;
    else{
        while (current.getNext() != null)
            current = current.getNext();
            current.setNext( ultimo );
            ultimo.setPrevious(current);
}

}
//Método para insertar a la lista	
public void insertar( Libreria data, int pos ){
    NodeLibreria<Libreria> nuevo = new NodeLibreria<Libreria>( data );
    NodeLibreria<Libreria> current = head;
    int contador = 1;
    while (contador != pos){
        current = current.getNext();
        contador++;
}
    nuevo.setPrevious(current);
    nuevo.setNext(current.getNext());
    current.setNext(nuevo);
    current.setPrevious(nuevo);
    this.size++;
}
//Método para eliminar el primer elemento de la lista 	
public void eliminarPrimero(){
    NodeLibreria<Libreria> current = head;
    current = current.getNext();
    head = current;
    head.setPrevious(null);
    size--;
}
//Método para eliminar el último de la lista	
public void eliminarUltimo(){
    NodeLibreria<Libreria> current = head;
    while( current.getNext() != null ){
        current = current.getNext();
}
    current.getPrevious().setNext(null);
    size--;
}
//Permie eliminar un elemento por medio de la pocisión.	
public void eliminarPos(int pos){
    NodeLibreria    <Libreria> current = head;
    int contador = 0;
    while (contador != pos){
        current = current.getNext();
        contador++;
}
        NodeLibreria<Libreria> aux = current;
        current.getNext().setPrevious(aux.getPrevious());
        current.getPrevious().setNext(aux.getNext());
        this.size++;
}

//Método para buscar un elemento de la lista. 
public boolean buscarElemento(Libreria data){
    NodeLibreria<Libreria> current = head;
    while (current.getNext() != null){
    if (current.getData() == data){
        return true;
    }
    else{
        current = current.getNext();
}
    }return false;
}
	
//Muestra la lista 
public void mostrarListaD(){
    System.out.print("Inicio>");
    if (!esVacia()) {
        NodeLibreria<Libreria> current = head;
        do{
        System.out.print("->"+current.getData()+"<");
	current = current.getNext();   
        }
        while(current != null);
            System.out.println("-null");
	}
}

//Obtiene el largo de la lista 
    public int getLargo() {
        return size;
    }
//Obtiene el tamaño de la lista 
    public void setSize(int size) {
        this.size = size;
    }
//Muestra la lista         
public void show(){
        System.out.print("Inicio>");
        if (!esVacia()) {
            NodeLibreria<Libreria> current = head;

            do{
                System.out.print("-["+current.getData()+"]");
                current = current.getNext();
            }while(current != null);

            System.out.println("-null");
        }
    }	

}
