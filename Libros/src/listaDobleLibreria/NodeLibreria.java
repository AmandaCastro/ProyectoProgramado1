
package listaDobleLibreria; //Llama a la lista de librería 


public class NodeLibreria<Libreria> {
    private Libreria data;
    private NodeLibreria<Libreria> next;
    private NodeLibreria<Libreria> previous;

    
public NodeLibreria(Libreria data){
    this(data,null,null);
}
//Constructor cuando si hay nodos
public NodeLibreria (Libreria data, NodeLibreria<Libreria> next, NodeLibreria<Libreria> previous){
	this.data = data;
	this.next = null;
	this.previous = null;
}

//Métodos 
public Libreria getData() {
	return this.data;
}
public void setData ( Libreria data ){
	this.data = data;
}
public NodeLibreria<Libreria> getNext(){
	return this.next;
}
public void setNext( NodeLibreria<Libreria> next){
	this.next = next;
}
public NodeLibreria<Libreria> getPrevious() {
	return previous;
}
public void setPrevious( NodeLibreria<Libreria> previous ) {
	this.previous = previous;
}


}
    
    
        
    



	
    
    
        
    

