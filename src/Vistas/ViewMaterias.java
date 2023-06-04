/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelo.*;
import Control.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class ViewMaterias extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewMaterias
     */
    public ViewMaterias() {
        initComponents();
      
    }

    public void limpiar() {
        jTID.setText("");
        jTNombre.setText("");
        jTAnio.setText("");
        cBEstado.setSelected(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTID = new javax.swing.JTextField();
        bTNBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTAnio = new javax.swing.JTextField();
        cBEstado = new javax.swing.JCheckBox();
        bTNGuardar = new javax.swing.JButton();
        bTNSalir = new javax.swing.JButton();
        bTNDesahabilitar = new javax.swing.JButton();
        bTNActualizar = new javax.swing.JButton();
        jBTNLimpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(45, 53, 59));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Materias");
        jLabel1.setMaximumSize(new java.awt.Dimension(68, 24));
        jLabel1.setMinimumSize(new java.awt.Dimension(68, 24));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Id:");

        bTNBuscar.setText("Buscar");
        bTNBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTNBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Año:");

        cBEstado.setText("Estado");

        bTNGuardar.setText("Guardar");
        bTNGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTNGuardarActionPerformed(evt);
            }
        });

        bTNSalir.setText("Salir");
        bTNSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTNSalirActionPerformed(evt);
            }
        });

        bTNDesahabilitar.setText("Deshabilitar");
        bTNDesahabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTNDesahabilitarActionPerformed(evt);
            }
        });

        bTNActualizar.setText("Actualizar");
        bTNActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTNActualizarActionPerformed(evt);
            }
        });

        jBTNLimpiar.setText("Limpiar");
        jBTNLimpiar.setMaximumSize(new java.awt.Dimension(56, 32));
        jBTNLimpiar.setMinimumSize(new java.awt.Dimension(56, 32));
        jBTNLimpiar.setPreferredSize(new java.awt.Dimension(56, 32));
        jBTNLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bTNGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bTNActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bTNDesahabilitar)))
                        .addContainerGap(153, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bTNSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bTNBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBTNLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cBEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bTNBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTNLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTNGuardar)
                    .addComponent(bTNActualizar)
                    .addComponent(bTNDesahabilitar)
                    .addComponent(bTNSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTNGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTNGuardarActionPerformed

        String nombre = jTNombre.getText();
        int anio = Integer.parseInt(jTAnio.getText());
        int estado;

        if (cBEstado.isSelected()) {
            estado = 1;
        } else {
            estado = 0;
        }

        Materia materia = new Materia(nombre, anio, estado);

        MateriaData md = new MateriaData();

        md.guardarMateria(materia);

        limpiar();

    }//GEN-LAST:event_bTNGuardarActionPerformed

    private void bTNSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTNSalirActionPerformed
        dispose();
    }//GEN-LAST:event_bTNSalirActionPerformed

    private void bTNActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTNActualizarActionPerformed

        int idMateria = Integer.parseInt(jTID.getText());
        String nombre = jTNombre.getText();
        int anio = Integer.parseInt(jTAnio.getText());
        int estado;

        if (cBEstado.isSelected()) {
            estado = 1;
        } else {
            estado = 0;
        }

        Materia materia = new Materia(idMateria, nombre, anio, estado);

        MateriaData md = new MateriaData();

        md.actualizarMateria(materia);

    }//GEN-LAST:event_bTNActualizarActionPerformed

    private void bTNDesahabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTNDesahabilitarActionPerformed

        int idMateria = Integer.parseInt(jTID.getText());

        MateriaData md = new MateriaData();

        md.desactivar(idMateria);
        cBEstado.setSelected(false);
    }//GEN-LAST:event_bTNDesahabilitarActionPerformed

    private void bTNBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTNBuscarActionPerformed

        try {
            int idMateria = Integer.parseInt(jTID.getText());

            MateriaData md = new MateriaData();

            Materia materia = new Materia();
            materia = md.buscarMateria(idMateria);
            
            if (materia != null) {
                jTNombre.setText(materia.getNombre());
                jTAnio.setText(materia.getAnio() + "");
                if (materia.getEstado() == 1) {
                    cBEstado.setSelected(true);
                } else {
                    cBEstado.setSelected(false);
                }
            }
            else {
                jTID.requestFocus();//Vuelve a marcar el casillero.
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID Materia invalido.");
            jTID.requestFocus();
        }

    }//GEN-LAST:event_bTNBuscarActionPerformed

    private void jBTNLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jBTNLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bTNActualizar;
    private javax.swing.JButton bTNBuscar;
    private javax.swing.JButton bTNDesahabilitar;
    private javax.swing.JButton bTNGuardar;
    private javax.swing.JButton bTNSalir;
    private javax.swing.JCheckBox cBEstado;
    private javax.swing.JButton jBTNLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTAnio;
    private javax.swing.JTextField jTID;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables

    
}
