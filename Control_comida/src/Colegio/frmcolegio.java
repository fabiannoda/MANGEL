/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colegio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import ControlC.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Angel Nodarse
 */
public class frmcolegio extends javax.swing.JFrame {

    /**
     * Creates new form frmcolegio
     */
    public frmcolegio() {
        initComponents();
        inicializar();
        limpiar();
        bloquear();
    }
    
    void limpiar(){
        txtcodigo.setText("");
        txtnombre.setText("");
        txttelefono.setText("");
        txtdireccion.setText("");
    }
    
    void bloquear(){
        txtcalendario.setEnabled(false);
        txtnombre.setEnabled(false);
        txttelefono.setEnabled(false);
        txtdireccion.setEnabled(false);
        txtjornada.setEnabled(false);
        btninsertar.setEnabled(false);
        btnactualizar.setEnabled(false);
        btneliminar.setEnabled(false);
        txtcodigo.setEnabled(true);
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcalendario = new javax.swing.JComboBox<>();
        txtjornada = new javax.swing.JComboBox<>();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btninsertar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        jLabel1.setText("Codigo");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        jLabel2.setText("Calendario");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        jLabel4.setText("Telefono");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        jLabel6.setText("Jornada");

        txtcalendario.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        txtcalendario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B" }));
        txtcalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcalendarioActionPerformed(evt);
            }
        });

        txtjornada.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        txtjornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Completa", "Media" }));
        txtjornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjornadaActionPerformed(evt);
            }
        });

        txtcodigo.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        txtcodigo.setText("jTextField1");
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        txtnombre.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        txtnombre.setText("jTextField2");
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        txttelefono.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        txttelefono.setText("jTextField3");
        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });

        txtdireccion.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        txtdireccion.setText("jTextField4");
        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        jLabel7.setText("Direccion");

        btninsertar.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        btninsertar.setText("Insertar");
        btninsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertarActionPerformed(evt);
            }
        });

        btnactualizar.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btneliminar.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnvolver.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        btnvolver.setText("Volver");
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtcalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtjornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btninsertar)
                                .addGap(96, 96, 96)
                                .addComponent(btnactualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btneliminar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnvolver))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtcalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtjornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel5)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninsertar)
                    .addComponent(btnactualizar)
                    .addComponent(btneliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnvolver))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
        txtcalendario.setEnabled(true);
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtcalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcalendarioActionPerformed
        // TODO add your handling code here:
        txtnombre.setEnabled(true);
        txtcalendario.transferFocus();
    }//GEN-LAST:event_txtcalendarioActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
        txttelefono.setEnabled(true);
        txtnombre.transferFocus();
        
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
        txtdireccion.setEnabled(true);
        txttelefono.transferFocus();
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
        txtjornada.setEnabled(true);
        
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txtjornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjornadaActionPerformed
        // TODO add your handling code here:
        btninsertar.setEnabled(true);
        btnactualizar.setEnabled(true);
    }//GEN-LAST:event_txtjornadaActionPerformed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnvolverActionPerformed

    private void btninsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertarActionPerformed
        // TODO add your handling code here:
        //insertar
        Conexion cc=new Conexion();
        Connection cn=cc.conex();
        String cod,ca,no,tel,di,jo,sql="";
        cod=txtcodigo.getText();
        ca=(String)txtcalendario.getSelectedItem();
        no=txtnombre.getText();
        tel=txttelefono.getText();
        di=txtdireccion.getText();
        jo=(String)txtjornada.getSelectedItem();
        sql="insert into tblcolegio (Codigo,Calendario,Nombre,Telefono,Direccion,Jornada) values (?,?,?,?,?,?)";
        try{
            PreparedStatement pst=cn.prepareStatement(sql);
            pst.setString(1,cod);
            pst.setString(2,ca);
            pst.setString(3,no);
            pst.setString(4,tel);
            pst.setString(5,di);
            pst.setString(6,jo);
            int registro=pst.executeUpdate();
            if (registro>0) {
                JOptionPane.showMessageDialog(null,"Colegio registrado exitosamente");
                limpiar(); 
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Registro fallido "+e.getMessage());
        }
        
        try {
            DefaultTableModel modelo=(DefaultTableModel) jTable1.getModel();
            int filas=jTable1.getRowCount();
            for (int i = 0;filas>i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    
        try {
            llenartabla();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        bloquear();
        
    }//GEN-LAST:event_btninsertarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        //Actualizar
        Conexion cc=new Conexion();
        Connection cn=cc.conex();
         String cod,ca,no,tel,di,jo,sql="";
        cod=txtcodigo.getText();
        ca=(String)txtcalendario.getSelectedItem();
        no=txtnombre.getText();
        tel=txttelefono.getText();
        di=txtdireccion.getText();
        jo=(String)txtjornada.getSelectedItem();
        sql="update tblcolegio SET "
                +"Calendario= '"+ca+"',"
                +"Nombre= '"+no+"',"
                +"Telefono= '"+tel+"',"
                +"Direccion= '"+di+"',"
                +"Jornada= '"+jo+"'"
                +"WHERE Codigo= '"+cod+"'";
        try{
            PreparedStatement pst=cn.prepareStatement(sql);
            int registro=pst.executeUpdate();
            if (registro>0) {
                JOptionPane.showMessageDialog(null,"Datos del colegio actualizados exitosamente");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Colegio no encontrado. Recuerde introducir el mismo codigo del colegio");
                limpiar();
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Actualización fallida "+e.getMessage());
        }
        
        try {
            DefaultTableModel modelo=(DefaultTableModel) jTable1.getModel();
            int filas=jTable1.getRowCount();
            for (int i = 0;filas>i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
       
        try {
            llenartabla();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
      
       txtcodigo.setEnabled(true);
       bloquear();
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        //Eliminar
         Conexion cc=new Conexion();
        Connection cn=cc.conex();
        String cod,sql="";
        cod=txtcodigo.getText();
        sql="delete from tblcolegio where "
                +"Codigo= '"+cod+"'";
        try{
            PreparedStatement pst=cn.prepareStatement(sql);
            int registro=pst.executeUpdate();
            if (registro>0) {
                JOptionPane.showMessageDialog(null,"Datos del colegio eliminados exitosamente");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Colegio no encontrado. Recuerde introducir correctamente el codigo del colegio");
            }
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Eliminación fallida "+e.getMessage());
        }  
        
        try {
            DefaultTableModel modelo=(DefaultTableModel) jTable1.getModel();
            int filas=jTable1.getRowCount();
            for (int i = 0;filas>i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    
        try {
            llenartabla();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        bloquear();
    }//GEN-LAST:event_btneliminarActionPerformed

    
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
            java.util.logging.Logger.getLogger(frmcolegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmcolegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmcolegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmcolegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmcolegio().setVisible(true);
            }
        });
    }
    
     private void inicializar()
    {
        jTable1.setModel(getColegioDefaultTableModel());
        limpiar();
        bloquear();
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
                                @Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
                                        
					btnactualizar.setEnabled(true);
                                        btneliminar.setEnabled(true);
                                        txtnombre.setEnabled(true);
                                        txttelefono.setEnabled(true);
                                        txtcalendario.setEnabled(true);
                                        txtdireccion.setEnabled(true);
                                        txtjornada.setEnabled(true);
                                    
					ResultSet Colegio = null;
					idFromRowSelected = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),0));
                                        
					
					try {
						Colegio = EncontrarColegio(idFromRowSelected);   
                                             
                                                txtcodigo.setEnabled(false);
                                                txtcodigo.setText(String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),0)));
                                       
						txtcalendario.getModel().setSelectedItem(Colegio.getString(1));
						txtnombre.setText(Colegio.getString(2));
						txttelefono.setText(String.valueOf(Colegio.getInt(3)));                                                
						txtdireccion.setText(Colegio.getString(4));
                                                txtjornada.getModel().setSelectedItem(Colegio.getString(5));
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                                        btninsertar.setEnabled(false);
				
				}
			});
    }
	private DefaultTableModel getColegioDefaultTableModel() {
		if (ColegioTableModel == null) {
			ColegioTableModel = new DefaultTableModel(new Object[]{"Codigo","Calendario","Nombre","Telefono","Direccion","Jornada"},0);
			try {
				llenartabla();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return ColegioTableModel;
	}
        private void llenartabla() throws SQLException{
		
		ResultSet resultado = fillColegio();
		
		do{			
			this.getColegioDefaultTableModel().addRow(new Object []{resultado.getInt(1),resultado.getString(2), resultado.getString(3), resultado.getInt(4), resultado.getString(5),resultado.getString(6)});
			}
		while (resultado.next());
        }
                
         public ResultSet fillColegio() throws SQLException{
             
             Conexion cc=new Conexion();
             Connection cn=cc.conex();
             String sql="SELECT Codigo,Calendario,Nombre,Telefono,Direccion,Jornada FROM control_comida.tblcolegio;";
             PreparedStatement pst=cn.prepareStatement(sql);
             ResultSet resultado = pst.executeQuery();	
		
		resultado.first();
		
		return resultado;
	
	}
         public ResultSet EncontrarColegio(String idRegistro) throws SQLException{
		
		String sql = "SELECT Calendario,Nombre,Telefono,Direccion,Jornada FROM tblcolegio WHERE tblcolegio.Codigo = ?;";
		
                Conexion cc=new Conexion();
                Connection cn=cc.conex();
		PreparedStatement pst=cn.prepareStatement(sql);
		
		pst.setString(1,idRegistro);
		
		pst.execute();
		
		ResultSet result = pst.getResultSet();
		
		result.next();
		
		return result;
	}
         
        
    
        
        DefaultTableModel ColegioTableModel;
        private String idFromRowSelected = "";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btninsertar;
    private javax.swing.JButton btnvolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> txtcalendario;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JComboBox<String> txtjornada;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
