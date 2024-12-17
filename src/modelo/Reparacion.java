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

public class Reparacion {
    private int idReparacion;
    private int idCliente;
    private int idTecnico;
    private String dispositivo;
    private String descripcion;
    private String estado;
    private BigDecimal costoEstimado;
    private Timestamp fechaIngreso;
    private Timestamp fechaEntrega;

    // Constructor
    public Reparacion(int idReparacion, int idCliente, int idTecnico, String dispositivo, String descripcion, String estado, BigDecimal costoEstimado, Timestamp fechaIngreso, Timestamp fechaEntrega) {
        this.idReparacion = idReparacion;
        this.idCliente = idCliente;
        this.idTecnico = idTecnico;
        this.dispositivo = dispositivo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.costoEstimado = costoEstimado;
        this.fechaIngreso = fechaIngreso;
        this.fechaEntrega = fechaEntrega;
    }

    // Getters y Setters
    public int getIdReparacion() { return idReparacion; }
    public void setIdReparacion(int idReparacion) { this.idReparacion = idReparacion; }
    public int getIdCliente() { return idCliente; }
    public void setIdCliente(int idCliente) { this.idCliente = idCliente; }
    public int getIdTecnico() { return idTecnico; }
    public void setIdTecnico(int idTecnico) { this.idTecnico = idTecnico; }
    public String getDispositivo() { return dispositivo; }
    public void setDispositivo(String dispositivo) { this.dispositivo = dispositivo; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public BigDecimal getCostoEstimado() {
        return costoEstimado;
    }

    public void setCostoEstimado(BigDecimal costoEstimado) {
        this.costoEstimado = costoEstimado;
    }
    public Timestamp getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(Timestamp fechaIngreso) { this.fechaIngreso = fechaIngreso; }
    public Timestamp getFechaEntrega() { return fechaEntrega; }
    public void setFechaEntrega(Timestamp fechaEntrega) { this.fechaEntrega = fechaEntrega; }
}

