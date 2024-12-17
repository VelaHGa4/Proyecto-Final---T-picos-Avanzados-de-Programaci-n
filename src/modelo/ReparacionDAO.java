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

public class ReparacionDAO {
    
    // Crear una nueva reparación
    public void agregarReparacion(Reparacion reparacion) {
        String sql = "INSERT INTO reparacion (id_cliente, id_tecnico, dispositivo, descripcion, estado, costo_estimado) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, reparacion.getIdCliente());
            stmt.setInt(2, reparacion.getIdTecnico());
            stmt.setString(3, reparacion.getDispositivo());
            stmt.setString(4, reparacion.getDescripcion());
            stmt.setString(5, reparacion.getEstado());
            stmt.setBigDecimal(6, reparacion.getCostoEstimado());
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al agregar reparación: " + e.getMessage());
        }
    }

    // Obtener todas las reparaciones
    public List<Reparacion> obtenerReparaciones() {
        List<Reparacion> reparaciones = new ArrayList<>();
        String sql = "SELECT * FROM reparacion";
        
        try (Connection conn = ConexionDB.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Reparacion reparacion = new Reparacion(
                        rs.getInt("id_reparacion"),
                        rs.getInt("id_cliente"),
                        rs.getInt("id_tecnico"),
                        rs.getString("dispositivo"),
                        rs.getString("descripcion"),
                        rs.getString("estado"),
                        rs.getBigDecimal("costo_estimado"),
                        rs.getTimestamp("fecha_ingreso"),
                        rs.getTimestamp("fecha_entrega")
                );
                reparaciones.add(reparacion);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener reparaciones: " + e.getMessage());
        }
        
        return reparaciones;
    }

    // Actualizar una reparación
    public void actualizarReparacion(Reparacion reparacion) {
        String sql = "UPDATE reparacion SET id_cliente = ?, id_tecnico = ?, dispositivo = ?, descripcion = ?, estado = ?, costo_estimado = ?, fecha_entrega = ? WHERE id_reparacion = ?";
        
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, reparacion.getIdCliente());
            stmt.setInt(2, reparacion.getIdTecnico());
            stmt.setString(3, reparacion.getDispositivo());
            stmt.setString(4, reparacion.getDescripcion());
            stmt.setString(5, reparacion.getEstado());
            stmt.setBigDecimal(6, reparacion.getCostoEstimado());
            stmt.setTimestamp(7, reparacion.getFechaEntrega());
            stmt.setInt(8, reparacion.getIdReparacion());
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al actualizar reparación: " + e.getMessage());
        }
    }

    // Eliminar una reparación
    public void eliminarReparacion(int id) {
        String sql = "DELETE FROM reparacion WHERE id_reparacion = ?";
        
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al eliminar reparación: " + e.getMessage());
        }
    }
    
    public Reparacion obtenerReparacionPorId(int idReparacion) {
    Reparacion reparacion = null;
    String query = "SELECT * FROM reparacion WHERE id_reparacion = ?";  // Cambiar reparaciones a reparacion
    
    try (Connection conn = ConexionDB.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {
         
        stmt.setInt(1, idReparacion);  // Establecer el parámetro en la consulta
        
        ResultSet rs = stmt.executeQuery();
        
        if (rs.next()) {
            // Crear un objeto Reparacion a partir de los datos obtenidos
            reparacion = new Reparacion(
                rs.getInt("id_reparacion"),
                rs.getInt("id_cliente"),
                rs.getInt("id_tecnico"),
                rs.getString("dispositivo"),
                rs.getString("descripcion"),
                rs.getString("estado"),
                rs.getBigDecimal("costo_estimado"),
                rs.getTimestamp("fecha_ingreso"),
                rs.getTimestamp("fecha_entrega")
            );
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return reparacion;
}
}

