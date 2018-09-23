package libros;

public class Libros {
    
    //atributos
    private String id;
    private String nombre;
    private String tema;
    private String descripción;
    private int cantidadVendidos;
    private int cantidadDisponibles;
    private double precio;
    
    //Métodos de set y get 
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public int getCantidadVendidos() {
        return cantidadVendidos;
    }

    public void setCantidadVendidos(int cantidadVendidos) {
        this.cantidadVendidos = cantidadVendidos;
    }

    public int getCantidadDisponibles() {
        return cantidadDisponibles;
    }

    public void setCantidadDisponibles(int cantidadDisponibles) {
        this.cantidadDisponibles = cantidadDisponibles;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    //Métodos construtores 
    public Libros(){
    }
    
    public Libros(String id, String nombre, String tema, String descripción, int cantidadVendidos, int cantidadDisponibles, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.tema = tema;
        this.descripción = descripción;
        this.cantidadVendidos = cantidadVendidos;
        this.cantidadDisponibles = cantidadDisponibles;
        this.precio = precio;
    }
    
    // to string
    @Override
    public String toString() {
        return "Libros{" + "id=" + id + ", nombre=" + nombre + ", tema=" + tema + ", descripci\u00f3n=" + descripción + ", cantidadVendidos=" + cantidadVendidos + ", cantidadDisponibles=" + cantidadDisponibles + ", precio=" + precio + '}';
    }
    
    
}
