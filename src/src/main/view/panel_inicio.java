/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package src.main.view;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import src.main.model.RegistroDAO;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import src.main.model.Conexion;
import static src.main.view.NewJFrame.panel_centro;
import src.main.view.panel_ver;


/**
 *
 * @author lococ
 */
public class panel_inicio extends javax.swing.JPanel {
    String tipo=null, fecha;

    private JPanel panelInicio;

    private DefaultTableModel modelo;
    private RegistroDAO registroDAO;
    private Conexion conecction;
    /**
     * Creates new form panel_inicio
     */
    public panel_inicio() {
        initComponents();
        
        
        panel_EntradaSalidaProducts.setVisible(false);
        registroDAO = new RegistroDAO();

        // Crear el modelo para la tabla
        String[] columnas = {"id_producto", "nombre", "descripcion", "tipo_movimiento", "fecha", "cantidad"};
        modelo = new DefaultTableModel(columnas, 0);
        tb_consultas.setModel(modelo);
        //llenar tabla
        modelo.setRowCount(0); // Limpiar filas existentes antes de llenar la tabla
        registroDAO.llenarTablaConsulta(modelo); 
     
    }
    private void Showpanel(JPanel p){
       
        p.setSize(723, 580);
        p.setLocation(0,0);
         
        
        panel_centro.removeAll();
        panel_centro.add(p);
        panel_centro.repaint();
        panel_centro.validate();
        
    }
       public void ObtenerFechaActual() {
        // Obtener la fecha actual
        Date fechaActual = new Date();

        // Definir el formato deseado para la fecha
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        // Formatear la fecha actual según el formato deseado
        String fechaFormateada = formatoFecha.format(fechaActual);

        // Imprimir la fecha actual formateada
       
        fecha=fechaFormateada;
}
  
    public void ObtenerId(){
          
      // Obtener el índice de la fila y columna seleccionadas en la tabla
        int filaSeleccionada = tb_consultas.getSelectedRow();
    

        // Verificar si se ha seleccionado una celda válida
        if (filaSeleccionada != -1 ) {
            // Obtener el modelo de tabla
            DefaultTableModel modeloTabla = (DefaultTableModel) tb_consultas.getModel();

            // Obtener el valor de la celda seleccionada
            Object id = modeloTabla.getValueAt(filaSeleccionada, 0);
            Object nombre = modeloTabla.getValueAt(filaSeleccionada, 1);

            // Verificar si el valor de la celda no es nulo
            if (id != null) {
                // Hacer algo con el valor de la celda
                lb_id.setText("ID: " +id);
               
                lb_nombre.setText("Nombre: " + nombre);
            } else {
                System.out.println("La celda seleccionada está vacía");
            }
        }
         
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuTabla = new javax.swing.JPopupMenu();
        Entrada = new javax.swing.JMenuItem();
        Salida = new javax.swing.JMenuItem();
        Ver = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel();
        txt_id_producto_consultar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        panel_EntradaSalidaProducts = new javax.swing.JPanel();
        txt_cantidadEdit = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_nuevaDescripcion = new javax.swing.JTextField();
        lb_nombre = new javax.swing.JLabel();
        lb_id = new javax.swing.JLabel();
        btn_aceptarEdit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_consultas = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();

        Entrada.setText("Entrada");
        Entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaActionPerformed(evt);
            }
        });
        MenuTabla.add(Entrada);

        Salida.setText("Salida");
        Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaActionPerformed(evt);
            }
        });
        MenuTabla.add(Salida);

        Ver.setText("Ver");
        Ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerActionPerformed(evt);
            }
        });
        MenuTabla.add(Ver);

        setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txt_id_producto_consultar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Codigo/Nombre Del Producto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Sheard32.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.setBorder(null);
        btn_buscar.setBorderPainted(false);
        btn_buscar.setContentAreaFilled(false);
        btn_buscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search48}.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        panel_EntradaSalidaProducts.setBackground(new java.awt.Color(255, 255, 255));

        txt_cantidadEdit.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Agregar Cantidad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Entrada Producto");

        txt_nuevaDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Descripcion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        lb_nombre.setText("Nombre: xxxxxxxxxxxx");

        lb_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_id.setText("ID: 015518+64656846468");

        btn_aceptarEdit.setText("Aceptar");
        btn_aceptarEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_EntradaSalidaProductsLayout = new javax.swing.GroupLayout(panel_EntradaSalidaProducts);
        panel_EntradaSalidaProducts.setLayout(panel_EntradaSalidaProductsLayout);
        panel_EntradaSalidaProductsLayout.setHorizontalGroup(
            panel_EntradaSalidaProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EntradaSalidaProductsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panel_EntradaSalidaProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(panel_EntradaSalidaProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_EntradaSalidaProductsLayout.createSequentialGroup()
                        .addComponent(txt_cantidadEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_aceptarEdit)
                        .addGap(110, 110, 110))
                    .addGroup(panel_EntradaSalidaProductsLayout.createSequentialGroup()
                        .addComponent(txt_nuevaDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_EntradaSalidaProductsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
        );
        panel_EntradaSalidaProductsLayout.setVerticalGroup(
            panel_EntradaSalidaProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_EntradaSalidaProductsLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(panel_EntradaSalidaProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_EntradaSalidaProductsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_EntradaSalidaProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_EntradaSalidaProductsLayout.createSequentialGroup()
                                .addComponent(txt_nuevaDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel_EntradaSalidaProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_cantidadEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_EntradaSalidaProductsLayout.createSequentialGroup()
                                        .addComponent(btn_aceptarEdit)
                                        .addContainerGap())))
                            .addGroup(panel_EntradaSalidaProductsLayout.createSequentialGroup()
                                .addComponent(lb_id)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panel_EntradaSalidaProductsLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lb_nombre)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_id_producto_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(panel_EntradaSalidaProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_id_producto_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel_EntradaSalidaProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());

        tb_consultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_consultas.setComponentPopupMenu(MenuTabla);
        jScrollPane2.setViewportView(tb_consultas);

        jPanel2.add(jScrollPane2, java.awt.BorderLayout.PAGE_START);

        add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel4.setPreferredSize(new java.awt.Dimension(25, 447));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );

        add(jPanel4, java.awt.BorderLayout.WEST);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        modelo.setRowCount(0);
        registroDAO.ConsultarpoID(modelo, txt_id_producto_consultar.getText());
     
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void EntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaActionPerformed
        ObtenerId();
        tipo="E";
        panel_EntradaSalidaProducts.setVisible(true);
    }//GEN-LAST:event_EntradaActionPerformed

    private void btn_aceptarEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarEditActionPerformed
        //Modificar Descripcion de Tb_Productos
        String labelText = lb_id.getText(); // Obtener el texto del Label
        String codigo = labelText.substring(labelText.indexOf(":") + 2); // Obtener el código
        
        try {
            registroDAO.actualizarDescripcionProducto(codigo, txt_nuevaDescripcion.getText());
        } catch (SQLException ex) {
            Logger.getLogger(panel_inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Agregar Nuevo Movimiento
        ObtenerFechaActual();
        registroDAO.realizarRegistroMovimiento(codigo, tipo, fecha, Integer.valueOf(txt_cantidadEdit.getText()));
        
        modelo.setRowCount(0); // Limpiar filas existentes antes de llenar la tabla
        registroDAO.llenarTablaConsulta(modelo);
//        conecction.closeConnection();
        txt_cantidadEdit.setText("");
        txt_nuevaDescripcion.setText(tipo);
        panel_EntradaSalidaProducts.setVisible(false);
    }//GEN-LAST:event_btn_aceptarEditActionPerformed

    private void SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaActionPerformed
         ObtenerId();
        tipo="S";
        panel_EntradaSalidaProducts.setVisible(true);
        
    }//GEN-LAST:event_SalidaActionPerformed

    private void VerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerActionPerformed
        ObtenerId();//obtengo el id de la tabla y lo guardo en un lb
        String labelText = lb_id.getText(); // Obtener el texto del Label
        String ID = labelText.substring(labelText.indexOf(":") + 2);
        panel_ver p=new panel_ver();
        Showpanel(p);
        //llamando metodos para hacer la consultas
        registroDAO.VerEntradas(ID);
        registroDAO.VerSalidas(ID);
        registroDAO.VerStock(ID);
        
    
    }//GEN-LAST:event_VerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Entrada;
    private javax.swing.JPopupMenu MenuTabla;
    private javax.swing.JMenuItem Salida;
    private javax.swing.JMenuItem Ver;
    private javax.swing.JButton btn_aceptarEdit;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_id;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JPanel panel_EntradaSalidaProducts;
    public static javax.swing.JTable tb_consultas;
    private javax.swing.JTextField txt_cantidadEdit;
    private javax.swing.JTextField txt_id_producto_consultar;
    private javax.swing.JTextField txt_nuevaDescripcion;
    // End of variables declaration//GEN-END:variables
}