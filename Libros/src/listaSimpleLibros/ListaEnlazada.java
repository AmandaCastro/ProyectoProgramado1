
package listaSimpleLibros;

public class ListaEnlazada<Libros>{
    private Nodo<Libros> head;
    
    public Nodo<Libros> getHead() {
	return head;
    }
    
    public void setHead(Nodo<Libros> head) {
	this.head = head;
    }

	

    public ListaEnlazada(){
        listaVacia();
    }

    private void listaVacia(){
        head = null;
    }
    
    
    public boolean esVacia(){
        return head == null;
    }

    public void insertarPrimero(Libros t){
        Nodo<Libros> nuevo = new Nodo<>(t);
 
        if (!esVacia()){
            nuevo.setSiguiente(head);
        }
        head=nuevo;
         
    }
    
    public Nodo<Libros> devolverUltimo(){
        Nodo<Libros> elemen = null;
        Nodo<Libros> aux;
        if (!esVacia()){
            aux = head;
            
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            elemen = aux;
        }
        return elemen;
    }
//Inserta al final de la lista 
    public void insertarUltimo(Libros t){
 
        Nodo<Libros> nuevo = new Nodo<>(t);
        Nodo<Libros> aux;
 
        if (esVacia()) {
            insertarPrimero(t);
        }else {
            aux = head;

            while(aux.getSiguiente() != null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

//Devuelve el largo de la lista 
    public int largoLista(){
        Nodo<Libros> aux;
        int numElementos=0;
        aux = head;
        while(aux != null){
            numElementos++;
            aux = aux.getSiguiente();
        }
        return numElementos;
 
    }

    public Libros devolverDato(int pos){
        Nodo<Libros> aux=head;
        int cont=0;
        Libros dato=null;
        if(pos<0 || pos>=largoLista()){
            System.out.println("La posicion insertada no es correcta");
        }else{
            while(aux!=null){
                if (pos == cont){
                    dato=aux.getDato();
                }
                aux=aux.getSiguiente();
                cont++; 
            }
        }
        return dato;         
    }
    //Devuelve de acuerdo a la pocisión del dato.
    public Nodo<Libros> devolverNodo(int pos){
        Nodo<Libros> aux=head;
        int cont=0;
         
        if(pos<0 || pos>=largoLista()){
            System.out.println("La posicion insertada no es correcta");
        }else{
            while(aux!=null){
                if (pos == cont){
                    return aux; 
                }
                aux=aux.getSiguiente();
                cont++;
                 
            }
        }
         
        return aux;
         
    }
    //Permite ingresar un elemento a la lista 
    public void introducirDato(int pos, Libros dato){
        Nodo<Libros> aux=head;
        Nodo<Libros> auxDato=null;
        Nodo<Libros> anterior=head;
         
        int contador=0;
         
        if(pos<0 || pos>largoLista()){
            System.out.println("La posicion insertada no es correcta");
        }else{
             
            if(pos==0){
                insertarPrimero(dato);
            }else if(pos==largoLista()){
                insertarUltimo(dato);
            }else{
                while(aux!=null){
                    if (pos == contador){
                        
                        auxDato=new Nodo<>(dato, aux);
                        
                        anterior.setSiguiente(auxDato);
                    }

                    anterior=aux;
                     
                    contador++;
                    aux=aux.getSiguiente();
                }
            }
        }
         
    }
     //Método para modificar la lista 
    public void modificarDato(int pos, Libros dato){
        Nodo<Libros> aux=head;
        int cont=0;
         
        if(pos<0 || pos>=largoLista()){
            System.out.println("La posicion insertada no es correcta");
        }else{
  
            while(aux!=null){
                if (pos == cont){
                    
                    aux.setDato(dato); 
                }
                cont++;
                aux=aux.getSiguiente();
            }
        }
         
    }
    //Borra un elemento de la lista por medio de la pocisión 
    public void borraPosicion(int pos){
 
        Nodo<Libros> aux=head;
        Nodo<Libros> anterior=null;
        int contador=0;
 
        if(pos<0 || pos>=largoLista()){
            System.out.println("La posicion insertada no es correcta");
        }else{
            while(aux!=null){
                if (pos == contador){
                    if (anterior==null){
                        head = head.getSiguiente();
                    }else {
                        anterior.setSiguiente(aux.getSiguiente());
                    }
                    aux=null;
                }else{
                    anterior=aux;
                    aux=aux.getSiguiente();
                    contador++;
                }
            }
        }
    }
    //Me permite mostrar la lista 
    public String mostrarLista(){

        String contenido="";
        Nodo<Libros> aux=head;

        while(aux!=null){
            contenido+="["+aux.getDato()+"]";
            aux=aux.getSiguiente();
        }

        return contenido;
    }
    //Permite visualizar la lista
    public void show(){
        System.out.print("Inicio>");
        if (!esVacia()) {
            Nodo<Libros> current = head;

            do{
                System.out.print("-["+current.getDato()+"]");
                current = current.getSiguiente();
            }while(current != null);

            System.out.println("-null");
        }
    }


}
