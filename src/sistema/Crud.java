package sistema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Crud extends javax.swing.JFrame {

    ButtonGroup btnGr;

    public Crud() {
        initComponents();
        btnGr = new ButtonGroup();
        btnGr.add(RbMasculino);
        btnGr.add(RbFemenino);
        CargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblRegistros = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtApellidoP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtApellidoM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        RbMasculino = new javax.swing.JRadioButton();
        RbFemenino = new javax.swing.JRadioButton();
        BtnGuardar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        TxtTalla = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/return_64px.png"))); // NOI18N
        BtnRegresar.setContentAreaFilled(false);
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 110, 80));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Registro Medidas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

        TblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id_Persona", "Nombre", "ApellidoP", "ApellidoM", "Talla", "Sexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblRegistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblRegistros);
        if (TblRegistros.getColumnModel().getColumnCount() > 0) {
            TblRegistros.getColumnModel().getColumn(0).setResizable(false);
            TblRegistros.getColumnModel().getColumn(1).setResizable(false);
            TblRegistros.getColumnModel().getColumn(2).setResizable(false);
            TblRegistros.getColumnModel().getColumn(3).setResizable(false);
            TblRegistros.getColumnModel().getColumn(4).setResizable(false);
            TblRegistros.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 430, 380));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Nombre :");

        TxtNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Apellido P. :");

        TxtApellidoP.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Apellido M. :");

        TxtApellidoM.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Talla :");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Sexo");

        RbMasculino.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        RbMasculino.setText("M");
        RbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbMasculinoActionPerformed(evt);
            }
        });

        RbFemenino.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        RbFemenino.setText("F");

        BtnGuardar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnEditar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BtnEditar.setText("Editar");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnEliminar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnLimpiar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(RbMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RbFemenino))
                            .addComponent(TxtNombre)
                            .addComponent(TxtApellidoP)
                            .addComponent(TxtApellidoM)
                            .addComponent(TxtTalla, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnLimpiar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RbMasculino)
                        .addComponent(RbFemenino)))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardar)
                    .addComponent(BtnEditar)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnLimpiar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 350, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        Inicio irI = new Inicio();
        irI.setVisible(true);
        hide();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed

    }//GEN-LAST:event_TxtNombreActionPerformed

    private void RbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbMasculinoActionPerformed

    }//GEN-LAST:event_RbMasculinoActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        String Nombre = TxtNombre.getText();
        String ApellidoP = TxtApellidoP.getText();
        String ApellidoM = TxtApellidoM.getText();
        int Talla = Integer.parseInt(TxtTalla.getText());
        String Sexo;
        if (RbMasculino.isSelected() == true) {
            Sexo = "M";
        } else if (RbFemenino.isSelected() == true) {
            Sexo = "F";
        } else {
            Sexo = "M";
        }
        try {
            Connection con = Conexion_Crud.getConexion();

            PreparedStatement ps = con.prepareStatement("INSERT INTO Registro(Nombre, ApellidoP, ApellidoM, Talla, Sexo, Activo) VALUES(?,?,?,?,?,?) ");
            ps.setString(1, Nombre);
            ps.setString(2, ApellidoP);
            ps.setString(3, ApellidoM);
            ps.setInt(4, Talla);
            ps.setString(5, Sexo);
            ps.setInt(6, 1);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            Limpiar();
            CargarTabla();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e.toString());

        }

    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void TblRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblRegistrosMouseClicked
        try {
            int fila = TblRegistros.getSelectedRow();
            int id = Integer.parseInt(TblRegistros.getValueAt(fila, 0).toString());
            int idt = Integer.parseInt(TblRegistros.getValueAt(fila, 4).toString());
            PreparedStatement ps;
            ResultSet rs;

            Connection con = Conexion_Crud.getConexion();
            ps = con.prepareStatement("SELECT Id_Persona, Nombre, ApellidoP, ApellidoM, Talla, Sexo FROM Registro WHERE Id_Persona=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                TxtNombre.setText(rs.getString("Nombre"));
                TxtApellidoP.setText(rs.getString("ApellidoP"));
                TxtApellidoM.setText(rs.getString("ApellidoM"));
                TxtTalla.setText(String.valueOf(idt));
                if (rs.getString("Sexo").equals("M")){
                    RbMasculino.setSelected(true);
                }else if(rs.getString("Sexo").equals("F")){
                    RbFemenino.setSelected(true);
                    
                }
                
            }

        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_TblRegistrosMouseClicked

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        int fila = TblRegistros.getSelectedRow();
        int id = Integer.parseInt(TblRegistros.getValueAt(fila, 0).toString());
        String Nombre = TxtNombre.getText();
        String ApellidoP = TxtApellidoP.getText();
        String ApellidoM = TxtApellidoM.getText();
        int Talla = Integer.parseInt(TxtTalla.getText());
        String Sexo;
        if (RbMasculino.isSelected() == true) {
            Sexo = "M";
        } else if (RbFemenino.isSelected() == true) {
            Sexo = "F";
        } else {
            Sexo = "M";
        }
        try {
            Connection con = Conexion_Crud.getConexion();

            PreparedStatement ps = con.prepareStatement("UPDATE Registro SET Nombre=?, ApellidoP=?, ApellidoM=?, Talla=?, Sexo=? WHERE Id_Persona=?");
            ps.setString(1, Nombre);
            ps.setString(2, ApellidoP);
            ps.setString(3, ApellidoM);
            ps.setInt(4, Talla);
            ps.setString(5, Sexo);
            ps.setInt(6, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Modificado");
            Limpiar();
            CargarTabla();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e.toString());

        }
        
        
        
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
       int fila = TblRegistros.getSelectedRow();
        int id = Integer.parseInt(TblRegistros.getValueAt(fila, 0).toString());
        
        try {
            Connection con = Conexion_Crud.getConexion();

            PreparedStatement ps = con.prepareStatement("DELETE FROM Registro WHERE Id_Persona=?");
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
            Limpiar();
            CargarTabla();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
       Limpiar();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void Limpiar() {
        TxtNombre.setText("");
        TxtApellidoP.setText("");
        TxtApellidoM.setText("");
        TxtTalla.setText("");
        btnGr.clearSelection();
    }

    private void CargarTabla() {

        DefaultTableModel ModeloTabla = (DefaultTableModel) TblRegistros.getModel();
        ModeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {

            Connection con = Conexion_Crud.getConexion();

            ps = con.prepareStatement("SELECT Id_Persona, Nombre, ApellidoP, ApellidoM, Talla, Sexo FROM Registro");
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[columnas];

                for (int indice = 0; indice < columnas; indice++) {
                    fila[indice] = rs.getObject(indice + 1);

                }

                ModeloTabla.addRow(fila);

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e.toString());

        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JRadioButton RbFemenino;
    private javax.swing.JRadioButton RbMasculino;
    private javax.swing.JTable TblRegistros;
    private javax.swing.JTextField TxtApellidoM;
    private javax.swing.JTextField TxtApellidoP;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTalla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
