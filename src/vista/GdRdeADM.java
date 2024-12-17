/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Reparacion;
import modelo.ReparacionDAO;
import java.sql.Timestamp;
import java.math.BigDecimal;

/**
 *
 * @author iigna
 */
public class GdRdeADM extends javax.swing.JFrame {

    /**
     * Creates new form GdRdeADM
     */
    public GdRdeADM() {
        initComponents();
        // Llamar al método para cargar las reparaciones en la tabla
        cargarTablaReparaciones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTecnico = new javax.swing.JTextField();
        txtIdReparacion = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtDispositivo = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        cbEstado = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtFechaIngreso = new javax.swing.JTextField();
        txtFechaEntrega = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReparaciones = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de reparaciones");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel1.setText("ID REPARACIÓN");

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel2.setText("CLIENTE");

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel3.setText("TECNICO");

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel4.setText("DISPOSITIVO");

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel7.setText("DESCRIPCIÓN");

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel8.setText("COSTO ESTIMADO");

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel9.setText("ESTADO");

        txtTecnico.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N

        txtIdReparacion.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N

        txtCliente.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N

        txtDispositivo.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N

        txtCosto.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N

        cbEstado.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En Proceso", "Finalizada", " " }));

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel10.setText("FECHA ENTREGA(A-M-D/HR-MI-SE)");

        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel11.setText("FECHA INGRESO(A-M-D/HR-MI-SE)");

        txtDescripcion.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N

        txtFechaIngreso.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N

        txtFechaEntrega.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N

        btnEditar.setBackground(new java.awt.Color(51, 124, 241));
        btnEditar.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 0, 51));
        btnEliminar.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAñadir.setBackground(new java.awt.Color(51, 51, 51));
        btnAñadir.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        btnAñadir.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadir.setText("AÑADIR");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(0, 221, 40));
        btnActualizar.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTecnico)
                    .addComponent(txtIdReparacion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCliente)
                    .addComponent(txtDispositivo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCosto)
                    .addComponent(cbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFechaIngreso)
                    .addComponent(txtFechaEntrega, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAñadir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDispositivo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAñadir)
                    .addComponent(btnEditar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tablaReparaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID REPARACION", "CLIENTE", "TECNICO", "DISPOSITIVO", "DESCRIPCION", "ESTADO", "COSTO ESTIMADO", "FECHA INGRESO", "FECHA ENTREGA"
            }
        ));
        jScrollPane1.setViewportView(tablaReparaciones);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        // TODO add your handling code here:
        // Validación de campos
    if (txtCliente.getText().isEmpty() || txtTecnico.getText().isEmpty() || 
        txtDispositivo.getText().isEmpty() || txtDescripcion.getText().isEmpty() || 
        cbEstado.getSelectedItem() == null || txtCosto.getText().isEmpty() || 
        txtFechaIngreso.getText().isEmpty() || txtFechaEntrega.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        return;
    }

    // Crear una nueva reparación
    Reparacion reparacion = new Reparacion(
        0, // El ID se genera automáticamente en la base de datos
        Integer.parseInt(txtCliente.getText()), 
        Integer.parseInt(txtTecnico.getText()), 
        txtDispositivo.getText(), 
        txtDescripcion.getText(), 
        cbEstado.getSelectedItem().toString(), 
        new BigDecimal(txtCosto.getText()), 
        Timestamp.valueOf(txtFechaIngreso.getText()), 
        Timestamp.valueOf(txtFechaEntrega.getText())
    );

    // Agregar reparación al DAO
    ReparacionDAO reparacionDAO = new ReparacionDAO();
    reparacionDAO.agregarReparacion(reparacion);
    
    // Actualizar tabla
    cargarTablaReparaciones();
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        int row = tablaReparaciones.getSelectedRow();
    if (row != -1) {
        // Obtener el ID de la reparación seleccionada
        int idReparacion = (int) tablaReparaciones.getValueAt(row, 0);

        // Obtener reparación desde el DAO
        ReparacionDAO reparacionDAO = new ReparacionDAO();
        Reparacion reparacion = reparacionDAO.obtenerReparacionPorId(idReparacion);

        // Cargar los datos en los campos
        if (reparacion != null) {
    txtIdReparacion.setText(String.valueOf(reparacion.getIdReparacion()));
    txtCliente.setText(String.valueOf(reparacion.getIdCliente()));
    txtTecnico.setText(String.valueOf(reparacion.getIdTecnico()));
    txtDispositivo.setText(reparacion.getDispositivo());
    txtDescripcion.setText(reparacion.getDescripcion());
    cbEstado.setSelectedItem(reparacion.getEstado());
    txtCosto.setText(reparacion.getCostoEstimado().toString());
    txtFechaIngreso.setText(reparacion.getFechaIngreso().toString());
    
    // Verificar si la fecha de entrega es null antes de llamar a toString()
    if (reparacion.getFechaEntrega() != null) {
        txtFechaEntrega.setText(reparacion.getFechaEntrega().toString());
    } else {
        txtFechaEntrega.setText("");  // O un valor predeterminado como "No asignada"
    }
}
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para editar.");
    }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        // Validación de campos
    if (txtIdReparacion.getText().isEmpty() || txtCliente.getText().isEmpty() || 
        txtTecnico.getText().isEmpty() || txtDispositivo.getText().isEmpty() || 
        txtDescripcion.getText().isEmpty() || cbEstado.getSelectedItem() == null || 
        txtCosto.getText().isEmpty() || txtFechaIngreso.getText().isEmpty() || 
        txtFechaEntrega.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        return;
    }

    // Crear reparación con los nuevos datos
    Reparacion reparacion = new Reparacion(
        Integer.parseInt(txtIdReparacion.getText()), 
        Integer.parseInt(txtCliente.getText()), 
        Integer.parseInt(txtTecnico.getText()), 
        txtDispositivo.getText(), 
        txtDescripcion.getText(), 
        cbEstado.getSelectedItem().toString(), 
        new BigDecimal(txtCosto.getText()), 
        Timestamp.valueOf(txtFechaIngreso.getText()), 
        Timestamp.valueOf(txtFechaEntrega.getText())
    );

    // Actualizar reparación en el DAO
    ReparacionDAO reparacionDAO = new ReparacionDAO();
    reparacionDAO.actualizarReparacion(reparacion);
    
    // Actualizar tabla
    cargarTablaReparaciones();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int row = tablaReparaciones.getSelectedRow();
    if (row != -1) {
        // Obtener el ID de la reparación seleccionada
        int idReparacion = (int) tablaReparaciones.getValueAt(row, 0);

        // Eliminar reparación desde el DAO
        ReparacionDAO reparacionDAO = new ReparacionDAO();
        reparacionDAO.eliminarReparacion(idReparacion);
        
        // Actualizar tabla
        cargarTablaReparaciones();
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para eliminar.");
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cargarTablaReparaciones() {
    // Crear una lista de objetos Reparacion
    ReparacionDAO reparacionDAO = new ReparacionDAO();
    List<Reparacion> reparaciones = reparacionDAO.obtenerReparaciones();

    // Crear un modelo de tabla (DefaultTableModel) con los datos
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID REPARACION");
    modelo.addColumn("CLIENTE");
    modelo.addColumn("TECNICO");
    modelo.addColumn("DISPOSITIVO");
    modelo.addColumn("DESCRIPCION");
    modelo.addColumn("ESTADO");
    modelo.addColumn("COSTO ESTIMADO");
    modelo.addColumn("FECHA INGRESO");
    modelo.addColumn("FECHA ENTREGA");

    // Llenar el modelo con los datos de la lista de reparaciones
    for (Reparacion reparacion : reparaciones) {
        modelo.addRow(new Object[]{
            reparacion.getIdReparacion(),
            reparacion.getIdCliente(),
            reparacion.getIdTecnico(),
            reparacion.getDispositivo(),
            reparacion.getDescripcion(),
            reparacion.getEstado(),
            reparacion.getCostoEstimado(),
            reparacion.getFechaIngreso(),
            reparacion.getFechaEntrega()
        });
    }

    // Establecer el modelo en la tabla
    tablaReparaciones.setModel(modelo);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GdRdeADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GdRdeADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GdRdeADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GdRdeADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GdRdeADM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaReparaciones;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDispositivo;
    private javax.swing.JTextField txtFechaEntrega;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtIdReparacion;
    private javax.swing.JTextField txtTecnico;
    // End of variables declaration//GEN-END:variables
}