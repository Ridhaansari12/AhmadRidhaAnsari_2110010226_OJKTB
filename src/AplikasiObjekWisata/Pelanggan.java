
package AplikasiObjekWisata;

import Connection.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pelanggan extends javax.swing.JFrame {

    /**
     * Creates new form Pelanggan
     */
    public Pelanggan() {
        initComponents();
        tampilan();
        clear();}
  
    public final Connection conn = new Koneksi().getConnection();
    Statement st;
    ResultSet rs;
    PreparedStatement pst;
    DefaultTableModel tabMode;

    
        public void tampilan(){
        Object [] baris = {"id_pelanggan", "nama", "alamat","telpon","email"};
        tabMode = new DefaultTableModel(null, baris);
       Tblpelanggan.setModel(tabMode);
        try {
                String sql = "SELECT * FROM pelanggan";
                st = conn.createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()){
                        String id = rs.getString("id_pelanggan");
                        String n = rs.getString("nama");
                        String a = rs.getString("alamat");
                        String t = rs.getString("telpon");
                        String e = rs.getString("email");

                        Object [] data = {id,n,a,t,e};
                        tabMode.addRow(data);
                }
        } catch (Exception e){
                System.out.println(e.toString());
        }
    }
        
          
    public void clear(){
        Idpelanggan.setText(null);
        Namapelanggan.setText(null);
        Alamat.setText(null);
        Telpon.setText(null);
        Email.setText(null);
    
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Idpelanggan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Namapelanggan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Alamat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Telpon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Btnsimpan = new javax.swing.JButton();
        Btnedit = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tblpelanggan = new javax.swing.JTable();
        Bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("PELANGGAN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("ID PELANGGAN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 74, -1, 20));
        jPanel1.add(Idpelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 230, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("ID PELANGGAN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 74, -1, 20));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 170, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("NAMA  PELANGGAN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 20));
        jPanel1.add(Namapelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 230, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("ALAMAT ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 20));
        jPanel1.add(Alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 230, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("TELPON");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 20));
        jPanel1.add(Telpon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 230, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("EMAIL");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 20));
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 230, 30));

        Btnsimpan.setText("SIMPAN");
        Btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsimpanActionPerformed(evt);
            }
        });
        jPanel1.add(Btnsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        Btnedit.setText("EDIT");
        Btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtneditActionPerformed(evt);
            }
        });
        jPanel1.add(Btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        jButton3.setText("HAPUS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        jButton4.setText("KELUAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        Tblpelanggan.setModel(new javax.swing.table.DefaultTableModel(
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
        Tblpelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblpelangganMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tblpelanggan);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 410, 160));

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Bgg.jpg"))); // NOI18N
        jPanel1.add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsimpanActionPerformed
                 if (Idpelanggan.getText().equals("") || 
                     Namapelanggan.getText().equals("") ||  
                     Alamat.getText().equals("") || 
                     Telpon.getText().equals("") ||
                     Email.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Field Tidak Boleh Kosong");
        } else {
            try {
               int s;
               String sql = "INSERT INTO pelanggan VALUES ('"+Idpelanggan.getText()+"',"
                       + " '"+Namapelanggan.getText()+"',"
                       + " '"+Alamat.getText()+"',"
                       + " '"+Telpon.getText()+"',"
                       + " '"+Email.getText()+"')";
               st = conn.createStatement();
               s = st.executeUpdate(sql);
               if (s == 1){
                   JOptionPane.showMessageDialog(null, "Sukses");
                   clear();
                   tampilan();
               }
           } catch (Exception e){
                   System.out.println(e.toString());
           } 
       }
    }//GEN-LAST:event_BtnsimpanActionPerformed

    private void BtneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtneditActionPerformed
    int c = JOptionPane.showConfirmDialog(null, "Ingin Mengubah Data?","Informasi", JOptionPane.YES_NO_OPTION);
        if (c == JOptionPane.YES_OPTION){
            if (Idpelanggan.getText().equals("") || 
                    Namapelanggan.getText().equals("") ||  
                    Alamat.getText().equals("") || 
                    Telpon.getText().equals("") || 
                    Email.getText().equals("")  ){
                JOptionPane.showMessageDialog(null, "Field Tidak Boleh Kosong");
            } else {
                try {
                    int s;
                    String sql = "UPDATE pelanggan SET nama = '"
                            +Namapelanggan.getText()+"',"
                            + "alamat = '"+Alamat.getText()+"', "
                            + "telpon = '"+Telpon.getText()+"', "
                            + "email = '"+Email.getText()
                            +"' WHERE id_pelanggan = '"
                            +Idpelanggan.getText()+"' ";
                    st = conn.createStatement();
                    s = st.executeUpdate(sql);
                    if (s == 1){
                        JOptionPane.showMessageDialog(null, "Sukses");
                        clear();
                        tampilan();
                    }
                } catch (Exception e){
                        System.out.println(e.toString());
                } 
            }
        }
    }//GEN-LAST:event_BtneditActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int c = JOptionPane.showConfirmDialog(null, "Ingin Menghapus Data?","Informasi", JOptionPane.YES_NO_OPTION);
        if (c == JOptionPane.YES_OPTION){
            try {
                int s;
                String sql = "DELETE FROM pelanggan WHERE Id_pelanggan = '"+Idpelanggan.getText()+"' ";
                st = conn.createStatement();
                s = st.executeUpdate(sql);
                if (s == 1){
                    JOptionPane.showMessageDialog(null, "Sukses");
                    clear();
                    tampilan();
                }
            } catch (Exception e){
                    System.out.println(e.toString());
            } 
        }  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new MenuUtama().setVisible(true);
         dispose(); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TblpelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblpelangganMouseClicked
             int baris = Tblpelanggan.getSelectedRow();
	Idpelanggan.setText(Tblpelanggan.getValueAt(baris, 0).toString());
	Namapelanggan.setText(Tblpelanggan.getValueAt(baris, 1).toString());
        Alamat.setText(Tblpelanggan.getValueAt(baris, 2).toString());
        Telpon.setText(Tblpelanggan.getValueAt(baris, 3).toString());
        Email.setText(Tblpelanggan.getValueAt(baris, 4).toString());
    }//GEN-LAST:event_TblpelangganMouseClicked
                                 

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
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JLabel Bg;
    private javax.swing.JButton Btnedit;
    private javax.swing.JButton Btnsimpan;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Idpelanggan;
    private javax.swing.JTextField Namapelanggan;
    private javax.swing.JTable Tblpelanggan;
    private javax.swing.JTextField Telpon;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}