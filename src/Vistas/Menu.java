package Vistas;

/*
 * @author Grupo 7
 */
public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMaterias = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jAlumnos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jInscripcion = new javax.swing.JMenuItem();
        jCargarNotas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jListarAlumnosXMat = new javax.swing.JMenuItem();
        jSalir = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );

        jMenu1.setText("Materias");

        jMaterias.setText("Formulario de Materias");
        jMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMateriasActionPerformed(evt);
            }
        });
        jMenu1.add(jMaterias);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Alumnos");

        jAlumnos.setText("Formulario de Alumnos");
        jAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlumnosActionPerformed(evt);
            }
        });
        jMenu2.add(jAlumnos);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administracion");

        jInscripcion.setText("Formulario de Inscripcion");
        jInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInscripcionActionPerformed(evt);
            }
        });
        jMenu3.add(jInscripcion);

        jCargarNotas.setText("Cargar Notas");
        jCargarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCargarNotasActionPerformed(evt);
            }
        });
        jMenu3.add(jCargarNotas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consulta");

        jListarAlumnosXMat.setText("Listar Alumnos por Materia");
        jListarAlumnosXMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListarAlumnosXMatActionPerformed(evt);
            }
        });
        jMenu4.add(jListarAlumnosXMat);

        jMenuBar1.add(jMenu4);

        jSalir.setText("Salir");

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jSalir.add(jMenuItem2);

        jMenuBar1.add(jSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInscripcionActionPerformed
        
        jEscritorio.removeAll();
        jEscritorio.repaint();
        ViewInscripcion viewIns = new ViewInscripcion();
        jEscritorio.add(viewIns);
        viewIns.setVisible(true);
        
    }//GEN-LAST:event_jInscripcionActionPerformed

    private void jCargarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCargarNotasActionPerformed
        
        jEscritorio.removeAll();
        jEscritorio.repaint();
        ViewCargarNotas viewNotas = new ViewCargarNotas();
        jEscritorio.add(viewNotas);
        viewNotas.setVisible(true);
        
    }//GEN-LAST:event_jCargarNotasActionPerformed

    private void jMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMateriasActionPerformed
        
        jEscritorio.removeAll();
        jEscritorio.repaint();
        ViewMaterias viewMat = new ViewMaterias();
        jEscritorio.add(viewMat);
        viewMat.setVisible(true);
        
    }//GEN-LAST:event_jMateriasActionPerformed

    private void jAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlumnosActionPerformed
        
        jEscritorio.removeAll();
        jEscritorio.repaint();
        ViewAlumnos viewAlum = new ViewAlumnos();
        jEscritorio.add(viewAlum);
        viewAlum.setVisible(true);
        
    }//GEN-LAST:event_jAlumnosActionPerformed

    private void jListarAlumnosXMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListarAlumnosXMatActionPerformed
        
        jEscritorio.removeAll();
        jEscritorio.repaint();
        ViewAlumnoPorMateria viewAlumXMat = new ViewAlumnoPorMateria();
        jEscritorio.add(viewAlumXMat);
        viewAlumXMat.setVisible(true);
        
    }//GEN-LAST:event_jListarAlumnosXMatActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAlumnos;
    private javax.swing.JMenuItem jCargarNotas;
    private javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JMenuItem jInscripcion;
    private javax.swing.JMenuItem jListarAlumnosXMat;
    private javax.swing.JMenuItem jMaterias;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jSalir;
    // End of variables declaration//GEN-END:variables
}
