/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author iigna
 */
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Inventario {
    private int idItem;
    private String nombre;
    private String descripcion;
    private int cantidadDisponible;
    private BigDecimal costoUnitario;
    private Timestamp fechaActualizacion;

    // Constructor
    public Inventario(int idItem, String nombre, String descripcion, int cantidadDisponible, BigDecimal costoUnitario, Timestamp fechaActualizacion) {
        this.idItem = idItem;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidadDisponible = cantidadDisponible;
        this.costoUnitario = costoUnitario;
        this.fechaActualizacion = fechaActualizacion;
    }

    // Getters y Setters
    public int getIdItem() { return idItem; }
    public void setIdItem(int idItem) { this.idItem = idItem; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public int getCantidadDisponible() { return cantidadDisponible; }
    public void setCantidadDisponible(int cantidadDisponible) { this.cantidadDisponible = cantidadDisponible; }
    public BigDecimal getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(BigDecimal costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public Timestamp getFechaActualizacion() { return fechaActualizacion; }
    public void setFechaActualizacion(Timestamp fechaActualizacion) { this.fechaActualizacion = fechaActualizacion; }
}

