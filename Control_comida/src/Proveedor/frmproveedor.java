/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proveedor;

import ControlC.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Angel Nodarse
 */
public class frmproveedor extends javax.swing.JFrame {

    /**
     * Creates new form frmbuscarProveedor
     */
    public frmproveedor() {
        initComponents();
        inicializar();
    }
    /*
    int a= set.tex1
    Clase prove =a
    jt.se.prove.getSerial
    */

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
        txtnombre = new javax.swing.JTextField();
        txtregistro = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        btninsertar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        txttipo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        jLabel1.setText("Razon Social ");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        jLabel2.setText("Registro");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        jLabel3.setText("Telefono");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        jLabel4.setText("Correo");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        jLabel5.setText("Tipo de producto");

        txtnombre.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        txtnombre.setText("jTextField1");
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        txtregistro.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        txtregistro.setText("jTextField2");
        txtregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtregistroActionPerformed(evt);
            }
        });

        txttelefono.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        txttelefono.setText("jTextField3");
        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });

        txtcorreo.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        txtcorreo.setText("jTextField4");
        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });

        btninsertar.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        btninsertar.setText("Insertar");
        btninsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertarActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
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

        btnactualizar.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btneliminar.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        txttipo.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        txttipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Almuerzo", "Refrigerio" }));
        txttipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttipoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(txtregistro))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 119, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btninsertar)
                .addGap(43, 43, 43)
                .addComponent(btnactualizar)
                .addGap(51, 51, 51)
                .addComponent(btneliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtregistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninsertar)
                    .addComponent(btnactualizar)
                    .addComponent(btneliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtregistroActionPerformed
        // TODO add your handling code here:
        txtnombre.setEnabled(true);
        txtregistro.transferFocus();
    }//GEN-LAST:event_txtregistroActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
        txttelefono.setEnabled(true);
        txtnombre.transferFocus();
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
        txtcorreo.setEnabled(true);
        txttelefono.transferFocus();
        
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
        txttipo.setEnabled(true);
        
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void txttipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipoActionPerformed
        // TODO add your handling code here:
        btninsertar.setEnabled(true);
        btnactualizar.setEnabled(true);
        btneliminar.setEnabled(true);
    }//GEN-LAST:event_txttipoActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        //Actualizar
        Conexion cc=new Conexion();
        Connection cn=cc.conex();
        String nom,re,tel,co,ti,sql="";
        re=txtregistro.getText();
        nom=txtnombre.getText();
        tel=txttelefono.getText();
        co=txtcorreo.getText();
        ti=(String) txttipo.getSelectedItem();
        sql="update tblproveedor SET "
                +"Razon= '"+nom+"',"
                +"Telefono= '"+tel+"',"
                +"Correo= '"+co+"',"
                +"Producto= '"+ti+"'"
                 +"WHERE Registro= '"+re+"'";
        try{
           PreparedStatement pst=cn.prepareStatement(sql); 
           int registro=pst.executeUpdate();
            if (registro>0) {
                JOptionPane.showMessageDialog(null,"Datos del proveedor actualizados exitosamente");
                limpiar();
                
            }else{
                JOptionPane.showMessageDialog(null,"Proveedor no encontrado. Recuerde introducir el mismo numero de Registro de la empresa");
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
      
       txtregistro.setEnabled(true);
       bloquear();
       
       
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btninsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertarActionPerformed
        // TODO add your handling code here:
        //insertar
        Conexion cc=new Conexion();
        Connection cn=cc.conex();
        String nom,re,tel,co,ti,sql="";
        nom=txtnombre.getText();
        re=txtregistro.getText();
        tel=txttelefono.getText();
        co=txtcorreo.getText();
        ti=(String) txttipo.getSelectedItem();
        sql="insert into tblproveedor (Razon,Registro,Telefono,Correo,Producto) values(?,?,?,?,?)";
        try{
            PreparedStatement pst=cn.prepareStatement(sql);
            pst.setString(1,nom);
            pst.setString(2,re);
            pst.setString(3,tel);
            pst.setString(4,co);
            pst.setString(5,ti);
            int registro=pst.executeUpdate();
            if (registro>0) {
                JOptionPane.showMessageDialog(null,"Proveedor registrado exitosamente");
                limpiar();  
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Registro fallido");
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

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        //eliminar
        Conexion cc=new Conexion();
        Connection cn=cc.conex();
        String re,sql="";
        re=txtregistro.getText();
        sql="delete from tblproveedor where "
                +"Registro= '"+re+"'";
        try{
            PreparedStatement pst=cn.prepareStatement(sql);
            int registro=pst.executeUpdate();
            if (registro>0) {
                JOptionPane.showMessageDialog(null,"Datos del proveedor eliminados exitosamente");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Proveedor no encontrado. Recuerde introducir el mismo numero de Registro de la empresa");
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //volver
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmproveedor().setVisible(true);        
                
               
                
            }
        });
    }
    
     void limpiar(){
        txtnombre.setText("");
        txtregistro.setText("");
        txttelefono.setText("");
        txtcorreo.setText("");
     }
     
     void bloquear(){
        txtnombre.setEnabled(false);
        txttelefono.setEnabled(false);
        txtcorreo.setEnabled(false);
        btninsertar.setEnabled(false);
        btneliminar.setEnabled(false);
        btnactualizar.setEnabled(false);
        txttipo.setEnabled(false);
        txtregistro.setEnabled(true);
     }
    /**
	 * This method initializes groupdefaultTableModel	
	 * 	
	 * @return javax.swing.table.DefaultTableModel	
	 */
    
    private void inicializar()
    {
        jTable1.setModel(getProveedorDefaultTableModel());
        limpiar();
        bloquear();
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
                                @Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
                                        
					btnactualizar.setEnabled(true);
                                        btneliminar.setEnabled(true);
                                        txtnombre.setEnabled(true);
                                        txttelefono.setEnabled(true);
                                        txtcorreo.setEnabled(true);
                                        txttipo.setEnabled(true);
                                        
                                        
					ResultSet resultProveedor = null;
					idFromRowSelected = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),0));
                                        
					
					try {
						resultProveedor = EncontrarProveedor(idFromRowSelected);   
                                             
                                                txtregistro.setEnabled(false);
                                                txtregistro.setText(String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),0)));
                                       
						txtnombre.setText(resultProveedor.getString(1));
						txttelefono.setText(String.valueOf(resultProveedor.getInt(2)));
						txtcorreo.setText(resultProveedor.getString(3));                                                
						txttipo.getModel().setSelectedItem(resultProveedor.getString(4));
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                                        btninsertar.setEnabled(false);
				
				}
			});
    }
	private DefaultTableModel getProveedorDefaultTableModel() {
		if (proveedorTableModel == null) {
			proveedorTableModel = new DefaultTableModel(new Object[]{"Registro","Razon Social","Telefono","Correo","Tipo de Producto"},0);
			try {
				llenartabla();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return proveedorTableModel;
	}
        private void llenartabla() throws SQLException{
		
		ResultSet resultado = fillProveedores();
		
		do{			
			this.getProveedorDefaultTableModel().addRow(new Object []{resultado.getInt(1),resultado.getString(2), resultado.getInt(3), resultado.getString(4), resultado.getString(5)});
			}
		while (resultado.next());
        }
                
         public ResultSet fillProveedores() throws SQLException{
             
             Conexion cc=new Conexion();
             Connection cn=cc.conex();
             String sql="SELECT Registro,Razon,Telefono,Correo,Producto FROM control_comida.tblproveedor;";
             PreparedStatement pst=cn.prepareStatement(sql);
             ResultSet resultado = pst.executeQuery();	
		
		resultado.first();
		
		return resultado;
	
	}
         public ResultSet EncontrarProveedor(String idRegistro) throws SQLException{
		
		String sql = "SELECT Razon,Telefono,Correo,Producto FROM tblproveedor WHERE tblproveedor.Registro = ?;";
		
                Conexion cc=new Conexion();
                Connection cn=cc.conex();
		PreparedStatement pst=cn.prepareStatement(sql);
		
		pst.setString(1,idRegistro);
		
		pst.execute();
		
		ResultSet result = pst.getResultSet();
		
		result.next();
		
		return result;
	}
         
        
    
        
        DefaultTableModel proveedorTableModel;
        private String idFromRowSelected = "";
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btninsertar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtregistro;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JComboBox<String> txttipo;
    // End of variables declaration//GEN-END:variables
}
