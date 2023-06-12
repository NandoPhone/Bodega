/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.main.model;


/**
 *
 * @author lococ
 */
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import src.main.view.panel_inicio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import src.main.view.panel_ver;




public class RegistroDAO {
     panel_ver panelVer = new panel_ver();

    public RegistroDAO() {
    
    }

    /**
     *
     * @return
     */
    public void VerStock(String id) {
    Conexion conexion = new Conexion();
    String consulta = "SELECT p.id_producto, p.nombre, p.descripcion, " +
                      "COALESCE((SELECT SUM(CASE WHEN tipo_movimiento = 'E' THEN cantidad ELSE 0 END) " +
                      "FROM movimientos WHERE id_producto = ?), 0) - " +
                      "COALESCE((SELECT SUM(CASE WHEN tipo_movimiento = 'S' THEN cantidad ELSE 0 END) " +
                      "FROM movimientos WHERE id_producto = ?), 0) AS total_disponible, " +
                      "(SELECT fecha FROM movimientos WHERE id_producto = ? " +
                      "ORDER BY fecha DESC LIMIT 1) AS ultima_fecha " +
                      "FROM productos p " +
                      "WHERE p.id_producto = ?";

    try (PreparedStatement statement = conexion.getConnection().prepareStatement(consulta)) {
        statement.setString(1, id);
        statement.setString(2, id);
        statement.setString(3, id);
        statement.setString(4, id);
        ResultSet rs = statement.executeQuery();

        if (rs.next()) {
            String idProducto = rs.getString("id_producto");
            String nombre = rs.getString("nombre");
            String descripcion = rs.getString("descripcion");
            int totalDisponible = rs.getInt("total_disponible");
            String ultimaFecha = rs.getString("ultima_fecha");

            // Agregar los valores a tus labels
          
            panelVer.lb_id_info.setText("ID: "+idProducto);
            panelVer.lb_nombre_info.setText("Nombre: " +nombre);
            panelVer.lb_descipcion_info.setText("Descripción: "+descripcion);
            panelVer.lb_Stock.setText(String.valueOf(totalDisponible));
            panelVer.lb_fecha_info.setText("Fecha: "+ultimaFecha);
         Object[] fila = {totalDisponible};
            System.out.println("Fila Stock: " + Arrays.toString(fila));
        }

        rs.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    public void VerEntradas(String id) {
    
        Conexion conexion = new Conexion();
    String consulta = "SELECT COALESCE(SUM(cantidad), 0) AS total_entradas " +
                      "FROM movimientos " +
                      "WHERE id_producto = ? AND tipo_movimiento = 'E'";
                      
    // Crear la instancia de panel_ver fuera del bucle
 
    try (PreparedStatement statement = conexion.getConnection().prepareStatement(consulta)) {
        statement.setString(1, id);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            String entradas = rs.getString("total_entradas");
            
            // Actualizar el texto en el lb_Entradas de la instancia existente
            panelVer.lb_Entradas.setText(entradas);
           
            Object[] fila = {entradas};
            System.out.println("Fila Entrada: " + Arrays.toString(fila));
        }

        rs.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        public void VerSalidas(String id) {
    
        Conexion conexion = new Conexion();
        String consulta = "SELECT COALESCE(SUM(cantidad), 0) AS total_salidas " +
                  "FROM movimientos " +
                  "WHERE id_producto = ? AND tipo_movimiento = 'S'";

                      
    // Crear la instancia de panel_ver fuera del bucle
 
    try (PreparedStatement statement = conexion.getConnection().prepareStatement(consulta)) {
        statement.setString(1, id);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            String salidas = rs.getString("total_salidas");
            
            // Actualizar el texto en el lb_Entradas de la instancia existente
            panelVer.lb_Salidas.setText(salidas);
           
            Object[] fila = {salidas};
            System.out.println("Fila Saida: " + Arrays.toString(fila));
        }

        rs.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


    public void ConsultarpoID(DefaultTableModel modelo, String id) {
    Conexion conexion = new Conexion();
    String consulta = "SELECT productos.id_producto, productos.nombre, productos.descripcion, movimientos.tipo_movimiento, movimientos.fecha, movimientos.cantidad " +
            "FROM productos " +
            "JOIN movimientos ON productos.id_producto = movimientos.id_producto " +
            "WHERE productos.id_producto = ?";

    try (PreparedStatement statement = conexion.getConnection().prepareStatement(consulta)) {
        statement.setString(1, id);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            String idProducto = rs.getString("id_producto");
            String nombre = rs.getString("nombre");
            String descripcion = rs.getString("descripcion");
            String tipoMovimiento = rs.getString("tipo_movimiento");
            String fecha = rs.getString("fecha");
            int cantidad = rs.getInt("cantidad");
           
            Object[] fila = {idProducto, nombre, descripcion, tipoMovimiento, fecha, cantidad};
            System.out.println("Fila obtenida: " + Arrays.toString(fila));
            modelo.addRow(fila);
        }

        rs.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "No Existe el Registro: ");
        e.printStackTrace();
    }
}

     public void actualizarDescripcionProducto(String idProducto, String nuevaDescripcion) throws SQLException {
     Conexion conexion = new Conexion();
        String sql = "UPDATE productos SET descripcion = ? WHERE id_producto = ?";
        try (PreparedStatement statement = conexion.getConnection().prepareStatement(sql)) {
            statement.setString(1, nuevaDescripcion);
            statement.setString(2, idProducto);
            statement.executeUpdate();
           }
}

    
   public void llenarTablaConsulta(DefaultTableModel modelo) {
        Conexion conexion=new Conexion();
        try (Connection conn = conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
             "SELECT productos.id_producto, productos.nombre, productos.descripcion, movimientos.tipo_movimiento, movimientos.fecha, movimientos.cantidad FROM productos JOIN movimientos ON productos.id_producto = movimientos.id_producto")) {

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String idProducto = rs.getString("id_producto");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                String tipoMovimiento = rs.getString("tipo_movimiento");
                String fecha = rs.getString("fecha");
                int cantidad = rs.getInt("cantidad");

                Object[] fila = {idProducto, nombre, descripcion, tipoMovimiento, fecha, cantidad};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   

    
    public static void mostrarMensajeAutoCierre(String mensaje, int tiempoCierre) {
        JOptionPane pane = new JOptionPane(mensaje, JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
        final JOptionPane optionPane = new JOptionPane(mensaje, JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);

        Timer timer = new Timer(tiempoCierre, e -> {
            optionPane.setValue(JOptionPane.CLOSED_OPTION); // Simula el cierre del mensaje
        });
        timer.setRepeats(false); // Evita que se repita el cierre en caso de mostrar varios mensajes seguidos
        timer.start();

        optionPane.createDialog(null, "Mensaje").setVisible(true);
    }

    public void realizarRegistroProducto(String id_producto, String nombre, String descripcion) {
        Conexion conexion=new Conexion();
        try (Connection conn = conexion.getConnection();
             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO productos (id_producto, nombre, descripcion) VALUES (?, ?, ?)")) {
            pstmt.setString(1, id_producto);
            pstmt.setString(2, nombre);
            pstmt.setString(3, descripcion);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al realizar el registro en la tabla 'productos': " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar: "+e);
        }
    }

    public void realizarRegistroMovimiento(String id_producto, String tipo, String fecha, int cantidad) {
        Conexion conexion=new Conexion();
        try (Connection con = conexion.getConnection();
             PreparedStatement pstmt = con.prepareStatement("INSERT INTO movimientos (id_producto, tipo_movimiento, fecha, cantidad) VALUES (?, ?, ?, ?)")) {
            pstmt.setString(1, id_producto);
            pstmt.setString(2, tipo);
            pstmt.setString(3, fecha);
            pstmt.setInt(4, cantidad);
            pstmt.executeUpdate();
            conexion.closeConnection();
            mostrarMensajeAutoCierre("Guardado", 1000);
     
        } catch (SQLException e) {
            System.out.println("Error al realizar el registro en la tabla 'movimientos': " + e.getMessage());
        }
    }
}










