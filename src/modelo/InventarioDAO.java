/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author iigna
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InventarioDAO {
    
    // Crear un nuevo item en inventario
    public void agregarItem(Inventario item) {
        String sql = "INSERT INTO inventario (nombre, descripcion, cantidad_disponible, costo_unitario) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, item.getNombre());
            stmt.setString(2, item.getDescripcion());
            stmt.setInt(3, item.getCantidadDisponible());
            stmt.setBigDecimal(4, item.getCostoUnitario());
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al agregar item: " + e.getMessage());
        }
    }

    // Obtener todos los items en inventario
    public List<Inventario> obtenerItems() {
        List<Inventario> items = new ArrayList<>();
        String sql = "SELECT * FROM inventario";
        
        try (Connection conn = ConexionDB.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Inventario item = new Inventario(
                        rs.getInt("id_item"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getInt("cantidad_disponible"),
                        rs.getBigDecimal("costo_unitario"),
                        rs.getTimestamp("fecha_actualizacion")
                );
                items.add(item);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener items: " + e.getMessage());
        }
        
        return items;
    }

    // Actualizar un item en inventario
    public void actualizarItem(Inventario item) {
        String sql = "UPDATE inventario SET nombre = ?, descripcion = ?, cantidad_disponible = ?, costo_unitario = ? WHERE id_item = ?";
        
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, item.getNombre());
            stmt.setString(2, item.getDescripcion());
            stmt.setInt(3, item.getCantidadDisponible());
            stmt.setBigDecimal(4, item.getCostoUnitario());
            stmt.setInt(5, item.getIdItem());
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al actualizar item: " + e.getMessage());
        }
    }

    // Eliminar un item del inventario
    public void eliminarItem(int id) {
        String sql = "DELETE FROM inventario WHERE id_item = ?";
        
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al eliminar item: " + e.getMessage());
        }
    }
    
    public Inventario obtenerItemPorId(int idItem) {
        Inventario item = null;
        String query = "SELECT * FROM inventario WHERE id_item = ?";
        
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
             
            stmt.setInt(1, idItem);  // Establecer el parámetro en la consulta
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                // Crear un objeto Inventario a partir de los datos obtenidos
                item = new Inventario(
                    rs.getInt("id_item"),
                    rs.getString("nombre"),
                    rs.getString("descripcion"),
                    rs.getInt("cantidad_disponible"),
                    rs.getBigDecimal("costo_unitario"),
                    rs.getTimestamp("fecha_actualizacion")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return item;
    }
}

