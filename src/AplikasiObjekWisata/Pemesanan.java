/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikasiObjekWisata;

import Connection.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pemesanan extends javax.swing.JFrame {

    /**
     * Creates new form Pemesanan
     */
    public Pemesanan() {
        initComponents();
        tampilan();
        clear();        
    }
  
    public final Connection conn = new Koneksi().getConnection();
    Statement st;
    ResultSet rs;
    PreparedStatement pst;
    DefaultTableModel tabMode;
    
    
            public void tampilan(){
        Object [] baris = {"id_pemesanan", "tgl_pemesanan", "id_pelanggan","id_destinasi","jmh_pemesanan"};
        tabMode = new DefaultTableModel(null, baris);
       Tblpemesanan.setModel(tabMode);
        try {
                String sql = "SELECT * FROM pemesanan";
                st = conn.createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()){
                        String pmn = rs.getString("id_pemesanan");
                        String tgl = rs.getString("tgl_pemesanan");
                        String pln= rs.getString("id_pelanggan");
                        String dsi = rs.getString("id_destinasi");
                        String jml = rs.getString("jmh_pemesanan");

                        Object [] data = {pmn,tgl,pln,dsi,jml};
                        tabMode.addRow(data);
                }
        } catch (Exception e){
                System.out.println(e.toString());
        }
    }
            
    public void clear(){
        Idpemesanan.setText(null);
        Tglpemesanan.setText(null);
        Idpelanggan.setText(null);
        Iddestinasi.setText(null);
        Jumlahpemesanan.setText(null);
    }
    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Idpemesanan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Tglpemesanan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Idpelanggan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Iddestinasi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Jumlahpemesanan = new javax.swing.JTextField();
        Btnsimpan = new javax.swing.JButton();
        Btnedit = new javax.swing.JButton();
        Btnhapus = new javax.swing.JButton();
        Btnkeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tblpemesanan = new javax.swing.JTable();
        Bg = new javax.swing.JLabel();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("PEMESANAN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("ID PEMESANAN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));
        jPanel1.add(Idpemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 190, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("TGL PEMESANAN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));
        jPanel1.add(Tglpemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 190, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("ID PELANGGAN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
        jPanel1.add(Idpelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 190, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("ID DESTINASI");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));
        jPanel1.add(Iddestinasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 190, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("JUMLAH PEMESANAN");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));
        jPanel1.add(Jumlahpemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 190, 30));

        Btnsimpan.setText("SIMPAN");
        Btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsimpanActionPerformed(evt);
            }
        });
        jPanel1.add(Btnsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        Btnedit.setText("EDIT");
        Btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtneditActionPerformed(evt);
            }
        });
        jPanel1.add(Btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        Btnhapus.setText("HAPUS");
        Btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnhapusActionPerformed(evt);
            }
        });
        jPanel1.add(Btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        Btnkeluar.setText("KELUAR");
        Btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnkeluarActionPerformed(evt);
            }
        });
        jPanel1.add(Btnkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        Tblpemesanan.setModel(new javax.swing.table.DefaultTableModel(
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
        Tblpemesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblpemesananMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tblpemesanan);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 420, 240));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsimpanActionPerformed
                 if (Idpemesanan.getText().equals("") || 
                     Tglpemesanan.getText().equals("") ||  
                     Idpelanggan.getText().equals("") || 
                     Iddestinasi.getText().equals("") ||
                     Jumlahpemesanan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Field Tidak Boleh Kosong");
        } else {
            try {
               int s;
               String sql = "INSERT INTO pemesanan VALUES ('"+Idpemesanan.getText()+"',"
                       + " '"+Tglpemesanan.getText()+"',"
                       + " '"+Idpelanggan.getText()+"',"
                       + " '"+Iddestinasi.getText()+"',"
                       + " '"+Jumlahpemesanan.getText()+"')";
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
            if (Idpemesanan.getText().equals("") || 
                    Tglpemesanan.getText().equals("") ||  
                    Idpelanggan.getText().equals("") || 
                    Iddestinasi.getText().equals("") || 
                    Jumlahpemesanan.getText().equals("")  ){
                JOptionPane.showMessageDialog(null, "Field Tidak Boleh Kosong");
            } else {
                try {
                    int s;
                    String sql = "UPDATE pemesanan SET Tgl_pemesanan = '"
                            +Tglpemesanan.getText()+"',"
                            + "id_pelanggan = '"+Idpelanggan.getText()+"', "
                            + "id_destinasi = '"+Iddestinasi.getText()+"', "
                            + "jmh_pemesanan = '"+Jumlahpemesanan.getText()
                            +"' WHERE id_pelanggan = '"
                            +Idpemesanan.getText()+"' ";
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

    private void BtnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnhapusActionPerformed
  int c = JOptionPane.showConfirmDialog(null, "Ingin Menghapus Data?","Informasi", JOptionPane.YES_NO_OPTION);
        if (c == JOptionPane.YES_OPTION){
            try {
                int s;
                String sql = "DELETE FROM pemesanan WHERE Id_pemesanan = '"+Idpemesanan.getText()+"' ";
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
    }//GEN-LAST:event_BtnhapusActionPerformed

    private void BtnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnkeluarActionPerformed
        new MenuUtama().setVisible(true);
         dispose(); 
    }//GEN-LAST:event_BtnkeluarActionPerformed

    private void TblpemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblpemesananMouseClicked
             int baris = Tblpemesanan.getSelectedRow();
	Idpemesanan.setText(Tblpemesanan.getValueAt(baris, 0).toString());
	Tglpemesanan.setText(Tblpemesanan.getValueAt(baris, 1).toString());
        Idpelanggan.setText(Tblpemesanan.getValueAt(baris, 2).toString());
        Iddestinasi.setText(Tblpemesanan.getValueAt(baris, 3).toString());
        Jumlahpemesanan.setText(Tblpemesanan.getValueAt(baris, 4).toString());
    }//GEN-LAST:event_TblpemesananMouseClicked

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
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pemesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bg;
    private javax.swing.JButton Btnedit;
    private javax.swing.JButton Btnhapus;
    private javax.swing.JButton Btnkeluar;
    private javax.swing.JButton Btnsimpan;
    private javax.swing.JTextField Iddestinasi;
    private javax.swing.JTextField Idpelanggan;
    private javax.swing.JTextField Idpemesanan;
    private javax.swing.JTextField Jumlahpemesanan;
    private javax.swing.JTable Tblpemesanan;
    private javax.swing.JTextField Tglpemesanan;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
