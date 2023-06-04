package Vistas;

import com.jtattoo.plaf.noire.NoireLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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

        jEscritorio.setBackground(new java.awt.Color(45, 53, 59));

        jLabel1.setText("Trabajo Practico Proyecto Transversal: Universidad.");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UNIVERSIDAD_EDIT-removebg-preview.png"))); // NOI18N

        jLabel3.setText("Grupo 7");

        jLabel4.setText("Integrantes:");

        jLabel5.setText("Melian, Gabriel.");

        jLabel6.setText("Moll Montiveros,Jesica.");

        jLabel7.setText("Mercau Yañez, Lucas.");

        jLabel8.setText("Mansilla, Dario Gustavo.");

        jEscritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEscritorioLayout.createSequentialGroup()
                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEscritorioLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addGroup(jEscritorioLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEscritorioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEscritorioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEscritorioLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(280, 280, 280))))
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEscritorioLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(66, Short.MAX_VALUE))
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new NoireLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAlumnos;
    private javax.swing.JMenuItem jCargarNotas;
    private javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JMenuItem jInscripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
