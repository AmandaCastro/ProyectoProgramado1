
package interfaz;
import listaSimpleLibros.ListaEnlazada;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import libros.*;
import interfaz.VentanaLibreria.*;
import java.util.HashSet;
import java.util.Set;
import listaDobleLibreria.ListaLibreria;
import listaDobleLibreria.NodeLibreria.*;

import libreria.*;

        




public class ventanaLibros extends javax.swing.JFrame {

    //crea los objetos de la nueva lista 
    ListaEnlazada<Libros> lista1=new ListaEnlazada();
    Libros data=new Libros();
   // ListaLibreria listaLibreria_1 = new ListaLibreria();
    
    public ventanaLibros() {
        initComponents();
        jList1.setModel(modeloLista);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Ventana de control de Libros");
        
        

        
        //persistencia de datos
        //atributos
        
        String id = "aq21";
        String nombre = "Tokio Blues";
        String tema = "Música";
        String descripción = "Tokio Blues, Norwegian Wood es una novela del autor japonés Haruki Murakami del año 1987. "
                + "La novela es una historia nostálgica que trata los temas de la pérdida y la sexualidad.";
        int cantidadVendidos = 150;
        int cantidadDisponibles = 75;
        double precio = 9800.00;
        
        //se asiganan las variables del objeto
        data.setId(id);
        data.setNombre(nombre);
        data.setTema(tema);
        data.setDescripción(descripción);
        data.setCantidadVendidos(cantidadVendidos);
        data.setCantidadDisponibles(cantidadDisponibles);
        data.setPrecio(precio);
        
       
        //lista1.crearAgencia(nombre, cedulaJuridica, cantidad);
        //lista1.Agregar(data);
        lista1.insertarPrimero(data);
        modeloLista.addElement(data);
    }
    
    //creamos la jlist
    DefaultListModel modeloLista = new DefaultListModel();  

    //crea  libro
    public void crear(){
        //se crea el objeto y se le asignan las variables para que obtenga los datos que ingresa el usuario
        Libros data = new Libros();
        //atributos
        String id = jTextID.getText();
        String nombre = jTextNombre.getText();
        String tema = jTextTema.getText();
        String descripción = jTextDescripcion.getText();
        int cantidadVendidos = Integer.parseInt(jTextCVendidos.getText());
        int cantidadDisponibles = Integer.parseInt(jTextCDisponibles.getText());
        double precio = Double.parseDouble(jTextPrecio.getText());
        
        
        
        //se asiganan las variables del objeto
        data.setId(id);
        data.setNombre(nombre);
        data.setTema(tema);
        data.setDescripción(descripción);
        data.setCantidadVendidos(cantidadVendidos);
        data.setCantidadDisponibles(cantidadDisponibles);
        data.setPrecio(precio);
        
        //lista1.crearAgencia(nombre, cedulaJuridica, cantidad);
        //lista1.Agregar(data);
        lista1.insertarPrimero(data);
        modeloLista.addElement(data);
        JOptionPane.showMessageDialog(rootPane, "El registro del libro ha sido creado correctamente"); 
        
    }
    
    
    
//muestra los datos del libro en consola
    public void mostrar(){
        //lista1.mostrar();
        lista1.show();
    }
               
    //eliminar de la lista
    
    public void eliminar(){
        int pos = Integer.parseInt(jTextPosicion.getText());
        lista1.borraPosicion(pos);
        modeloLista.remove(pos);
        JOptionPane.showMessageDialog(rootPane, "El registro del libro ha sido eliminado correctamente");
        
    }
    
    public void agregar_a_Libreria(){
        //VentanaLibreria ventana = new VentanaLibreria();
        Libros libro = new Libros();
        int pos = Integer.parseInt(jLibro_a_agregar.getText());
         lista1.devolverDato(pos);//Agarra el dato tipo Libro
         //lista1.devolverDato(pos);//Libro es igual al libro seleccionado
         /*
         CODIGO PARA LA BUSQUEDAD
         
         libro.setId(lista1.devolverDato(pos).getId());
         libro.setNombre(lista1.devolverDato(pos).getNombre());
         libro.setTema(lista1.devolverDato(pos).getTema());
         libro.setDescripción(lista1.devolverDato(pos).getDescripción());
         libro.setCantidadDisponibles(lista1.devolverDato(pos).getCantidadDisponibles());
         libro.setCantidadVendidos(lista1.devolverDato(pos).getCantidadVendidos());
         libro.setPrecio(lista1.devolverDato(pos).getPrecio());
         */
         
         System.out.println(lista1.devolverDato(pos).getDescripción());//IMPRIMIENDO LIBRO
         
         System.out.println( lista1.devolverDato(pos));

       VentanaLibreria Vlibreria = new VentanaLibreria();
      Vlibreria.setVisible(true);
      
      Vlibreria.dato.setLibro(lista1.devolverDato(pos));     
      Vlibreria.listalibros.insertarPrimero(lista1.devolverDato(pos));//se añade a listalibro   
    }
    
    
    public void modificarLibro(){
        
        int pos = Integer.parseInt(jModificar.getText());
        
        
        Libros libroN = new Libros();
        String id = jTextID.getText();
        String nombre = jTextNombre.getText();
        String tema = jTextTema.getText();
        String descripción = jTextDescripcion.getText();
        int cantidadVendidos = Integer.parseInt(jTextCVendidos.getText());
        int cantidadDisponibles = Integer.parseInt(jTextCDisponibles.getText());
        double precio = Double.parseDouble(jTextPrecio.getText());
        
        libroN.setId(id);
        libroN.setNombre(nombre);
        libroN.setTema(tema);
        libroN.setDescripción(descripción);
        libroN.setCantidadVendidos(cantidadVendidos);
        libroN.setCantidadDisponibles(cantidadDisponibles);
        libroN.setPrecio(precio);
        
        lista1.modificarDato(pos, libroN);
        //se asiganan las variables del objeto
//        lista1.modificarDato(pos,libroN.setNombre());
//        lista1.devolverDato(pos).setNombre(nombre);
//        lista1.devolverDato(pos).setTema(tema);
//        lista1.devolverDato(pos).setDescripción(descripción);
//         lista1.devolverDato(pos).setCantidadVendidos(cantidadVendidos); 
//         lista1.devolverDato(pos).setCantidadDisponibles(cantidadDisponibles);
//         lista1.devolverDato(pos).setPrecio(precio);
         
         //lista1.modificarDato(pos, libroN);
         
        modeloLista.remove(pos);
         modeloLista.addElement(libroN);
         System.out.println(libroN);
         
    }
    
    public void buscarNombre(){
        String nomb  = jTextoBusquedad.getText();
        
        for(int cont = 0; cont!=lista1.largoLista(); cont++){
                lista1.devolverDato(cont).getNombre();
            if(lista1.devolverDato(cont).getNombre() .equals(nomb)){
                System.out.print(lista1.devolverDato(cont).getDescripción());     
                jLabelIdR.setText("Id: "+lista1.devolverDato(cont).getId());
                jLabelNoombreR.setText("Nombre: "+lista1.devolverDato(cont).getNombre());
                jLabelTemaR.setText("Tema: "+lista1.devolverDato(cont).getTema());
                jLabelDscripciónR.setText("Descripción: "+lista1.devolverDato(cont).getDescripción());
                jLabelCVR.setText("Cantidad: "+lista1.devolverDato(cont).getCantidadVendidos());
                jLabelCDR.setText("Cantidad: "+lista1.devolverDato(cont).getCantidadDisponibles());
                jLabelPrecioR.setText("Cantidad: "+lista1.devolverDato(cont).getPrecio());
                break;
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "No se encuentra el libro solicitado"); 
                
                
            }
        
    }
        
        
        
    }
    
    public void buscar(){
        int i = jComboBuscar.getSelectedIndex();//Agarra el indice del combo box
        String palabra  = jTextoBusquedad.getText();
        
        if (i==0){//Caso cuando sea uno busca el nombre
           
        
        for(int cont = 0; cont!=lista1.largoLista(); cont++){
               // lista1.devolverDato(cont).getNombre();
            if(lista1.devolverDato(cont).getNombre() .equals(palabra)){
                
                //System.out.print(lista1.devolverDato(cont).getDescripción());     
                jLabelIdR.setText("Id: "+lista1.devolverDato(cont).getId());
                jLabelNoombreR.setText("Nombre: "+lista1.devolverDato(cont).getNombre());
                jLabelTemaR.setText("Tema: "+lista1.devolverDato(cont).getTema());
                jLabelDscripciónR.setText("Descripción: "+lista1.devolverDato(cont).getDescripción());
                jLabelCVR.setText("Cantidad: "+lista1.devolverDato(cont).getCantidadVendidos());
                jLabelCDR.setText("Cantidad: "+lista1.devolverDato(cont).getCantidadDisponibles());
                jLabelPrecioR.setText("Cantidad: "+lista1.devolverDato(cont).getPrecio());
                
                break;
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "No se encuentra el libro solicitado");          
        }
    }
        }
        
        if (i==1){
            for(int cont = 0; cont!=lista1.largoLista(); cont++){
                
                if(lista1.devolverDato(cont).getTema() .equals(palabra)){
                     jLabelIdR.setText("Id: "+lista1.devolverDato(cont).getId());
                     jLabelNoombreR.setText("Nombre: "+lista1.devolverDato(cont).getNombre());
                     jLabelTemaR.setText("Tema: "+lista1.devolverDato(cont).getTema());
                     jLabelDscripciónR.setText("Descripción: "+lista1.devolverDato(cont).getDescripción());
                     jLabelCVR.setText("Cantidad: "+lista1.devolverDato(cont).getCantidadVendidos());
                     jLabelCDR.setText("Cantidad: "+lista1.devolverDato(cont).getCantidadDisponibles());
                     jLabelPrecioR.setText("Cantidad: "+lista1.devolverDato(cont).getPrecio());
                     
                     break;
                    
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "No se encuentra el libro solicitado"); 
                }
                
                
            }
        }
        if(i==2){
            for(int cont = 0; cont!=lista1.largoLista(); cont++){
                if(lista1.devolverDato(cont).getId() .equals(palabra)){
                     
                    jLabelIdR.setText("Id: "+lista1.devolverDato(cont).getId());
                     jLabelNoombreR.setText("Nombre: "+lista1.devolverDato(cont).getNombre());
                     jLabelTemaR.setText("Tema: "+lista1.devolverDato(cont).getTema());
                     jLabelDscripciónR.setText("Descripción: "+lista1.devolverDato(cont).getDescripción());
                     jLabelCVR.setText("Cantidad: "+lista1.devolverDato(cont).getCantidadVendidos());
                     jLabelCDR.setText("Cantidad: "+lista1.devolverDato(cont).getCantidadDisponibles());
                     jLabelPrecioR.setText("Cantidad: "+lista1.devolverDato(cont).getPrecio());
                     
                     break;               
            }
                else{
                    JOptionPane.showMessageDialog(rootPane, "No se encuentra el libro solicitado"); 

                    
                }
            
            
        }
        
        
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextTema = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextDescripcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextCVendidos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextCDisponibles = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextPrecio = new javax.swing.JTextField();
        jButtonAgregarLibro = new javax.swing.JButton();
        jButtonMostrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jLabelIdR = new javax.swing.JLabel();
        jLabelNoombreR = new javax.swing.JLabel();
        jLabelTemaR = new javax.swing.JLabel();
        jLabelDscripciónR = new javax.swing.JLabel();
        jLabelCVR = new javax.swing.JLabel();
        jLabelCDR = new javax.swing.JLabel();
        jLabelPrecioR = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextPosicion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jAgregarAlibreria = new javax.swing.JButton();
        jLibro_a_agregar = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jModificar = new javax.swing.JTextField();
        jTextoBusquedad = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jBotonBuscar = new javax.swing.JButton();
        jComboBuscar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Gestión de libros");

        jLabel2.setText("Id");

        jTextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre");

        jLabel4.setText("Tema");

        jLabel5.setText("Descripción");

        jLabel6.setText("Cantidad vendidos");

        jLabel7.setText("Cantidad disponibles");

        jLabel8.setText("Precio");

        jButtonAgregarLibro.setBackground(new java.awt.Color(255, 153, 0));
        jButtonAgregarLibro.setText("Agregar a al registro de libros");
        jButtonAgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarLibroActionPerformed(evt);
            }
        });

        jButtonMostrar.setText("Mostrar lista en consola");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Lista de libros registrados");

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Resultado del libro");

        jLabelIdR.setText("Id");

        jLabelNoombreR.setText("Nombre");

        jLabelTemaR.setText("Tema");

        jLabelDscripciónR.setText("Descripción");

        jLabelCVR.setText("Cantidad de vendidos");

        jLabelCDR.setText("Cantidad de disponibles");

        jLabelPrecioR.setText("Precio");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Eliminar libro");

        jLabel12.setText("Nota: para eliminar el libro ingrese la poscicón en la que se encuntra en la lista");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Volver a la pantalla principal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jAgregarAlibreria.setText("Agregar a Libreria");
        jAgregarAlibreria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarAlibreriaActionPerformed(evt);
            }
        });

        jLibro_a_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLibro_a_agregarActionPerformed(evt);
            }
        });

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });

        jTextoBusquedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextoBusquedadActionPerformed(evt);
            }
        });

        jLabel13.setText("Buscar:");

        jBotonBuscar.setText("Buscar");
        jBotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonBuscarActionPerformed(evt);
            }
        });

        jComboBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nonbre", "Tema", "id" }));
        jComboBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCVR, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(279, 279, 279)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextoBusquedad, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBotonBuscar)))
                            .addComponent(jLabelCDR, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonMostrar)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabelTemaR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                            .addComponent(jLabelIdR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelNoombreR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabelDscripciónR, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel13)
                                                    .addComponent(jLibro_a_agregar))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(39, 39, 39)
                                                        .addComponent(jAgregarAlibreria))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jComboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(103, 103, 103))))))
                                    .addGap(63, 63, 63))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5))
                                            .addGap(32, 32, 32)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextTema, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                                .addComponent(jTextNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextID, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextDescripcion)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton3)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                                .addComponent(jTextCDisponibles)
                                                .addComponent(jTextCVendidos, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jModificar)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jButtonAgregarLibro)))))
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelPrecioR, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextCVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextCDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAgregarLibro)
                            .addComponent(jButtonMostrar)
                            .addComponent(jButton3)
                            .addComponent(jModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel11))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabelIdR))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoombreR)
                    .addComponent(jTextPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTemaR)
                    .addComponent(jAgregarAlibreria)
                    .addComponent(jLibro_a_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelDscripciónR)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabelCVR)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCDR))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextoBusquedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jComboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBotonBuscar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecioR)
                    .addComponent(jButton2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
    
    
    //botón de crear libro nuevo
    private void jButtonAgregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarLibroActionPerformed
        crear();
    }//GEN-LAST:event_jButtonAgregarLibroActionPerformed
    
    //botón de mostrar
    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
        mostrar();
    }//GEN-LAST:event_jButtonMostrarActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged

        //se muestran los valores de los libros asignadas en la jlist
        int index= jList1.getSelectedIndex();
        Libros info = (Libros)modeloLista.getElementAt(index);
        
        jLabelIdR.setText("Id: "+info.getId());
        jLabelNoombreR.setText("Nombre: "+info.getNombre());
        jLabelTemaR.setText("Tema: "+info.getTema());
        jLabelDscripciónR.setText("Descripción: "+info.getDescripción());
        jLabelCVR.setText("Cantidad: "+info.getCantidadVendidos());
        jLabelCDR.setText("Cantidad: "+info.getCantidadDisponibles());
        jLabelPrecioR.setText("Cantidad: "+info.getPrecio());

    }//GEN-LAST:event_jList1ValueChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ventanaPrincipal v = new ventanaPrincipal();
        v.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        eliminar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDActionPerformed

    private void jAgregarAlibreriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarAlibreriaActionPerformed
        // TODO add your handling code here:
        agregar_a_Libreria();
    }//GEN-LAST:event_jAgregarAlibreriaActionPerformed

    private void jLibro_a_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLibro_a_agregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLibro_a_agregarActionPerformed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jModificarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        modificarLibro();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextoBusquedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextoBusquedadActionPerformed
       
    }//GEN-LAST:event_jTextoBusquedadActionPerformed

    private void jBotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonBuscarActionPerformed

         buscar();
    }//GEN-LAST:event_jBotonBuscarActionPerformed

    private void jComboBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBuscarActionPerformed
      
    }//GEN-LAST:event_jComboBuscarActionPerformed

    
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ventanaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ventanaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ventanaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ventanaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ventanaLibros().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAgregarAlibreria;
    private javax.swing.JButton jBotonBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAgregarLibro;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JComboBox<String> jComboBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCDR;
    private javax.swing.JLabel jLabelCVR;
    private javax.swing.JLabel jLabelDscripciónR;
    private javax.swing.JLabel jLabelIdR;
    private javax.swing.JLabel jLabelNoombreR;
    private javax.swing.JLabel jLabelPrecioR;
    private javax.swing.JLabel jLabelTemaR;
    private javax.swing.JTextField jLibro_a_agregar;
    private javax.swing.JList<String> jList1;
    private javax.swing.JTextField jModificar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextCDisponibles;
    private javax.swing.JTextField jTextCVendidos;
    private javax.swing.JTextField jTextDescripcion;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPosicion;
    private javax.swing.JTextField jTextPrecio;
    private javax.swing.JTextField jTextTema;
    private javax.swing.JTextField jTextoBusquedad;
    // End of variables declaration//GEN-END:variables
}
