# BAP
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainstream;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author L855-S5309
 */
public class BAPAdmin extends javax.swing.JFrame {

    tampung tp;
    String idinc;

    /**
     * Creates new form BAP
     */
    public BAPAdmin() {
        initComponents();
//        txtkd.setEnabled(false);
//        jDateChooser1.setEnabled(false);
//        labeljam.setEnabled(false);
//        cbxkdmmk.setEnabled(false);
//        txtKddos.setEnabled(false);
//        cbxKelas.setEnabled(false);
//        cbxKdra.setEnabled(false);
//        txtmateri.setEnabled(false);
//        txtket.setEnabled(false);
//        txtJummhs.setEnabled(false);
//        kdjdwl();
//        Date date = jDateChooser1.getDate();
//        tgl();
//        time();
//        carikddosen();
//        jam();
    }

//    void kdjdwl(){
//        try {
//            String id_terakhir = null;
//            Koneksi kon = new Koneksi();
//            Statement st = kon.sambung();
//            String sql = "select * from jadwal";
//            ResultSet rs = null;
//            rs = kon.getData(sql);
//            while (rs.next()) {
//                id_terakhir = rs.getString("kode");
//            }
//            idinc = getautoinc(id_terakhir);
//            txtkd.setText(idinc);
//        } catch (SQLException ex) {
//            Logger.getLogger(BAPAdmin.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
//    void tgl() {
//        jDateChooser1.setDateFormatString("MM-dd-yyyy");
//        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
//        Calendar cal = Calendar.getInstance();
//        jDateChooser1.setDate(cal.getTime());
//    }

//    void time() {
//        ActionListener aksi = new ActionListener() {
//
//            // @Override
//            public void actionPerformed(ActionEvent e) {
//                //       throw new UnsupportedOperationException("Not supported yet.");
//                DateFormat jam = new SimpleDateFormat("HH:mm:ss");
//                Date hasil = new Date();
//                String jam_skr = jam.format(hasil).toString();
//                labeljam.setText(jam_skr);
//            }
//        };
//
//        new Timer(1000, aksi).start();
//    }

//    void carikddosen() {
//        try {
//            String kddos;
//            kddos = tp.getNamadosen();
//            System.out.println(kddos);
//            Koneksi kon = new Koneksi();
//            Statement st = kon.sambung();
//            String sql = "select kode from dosen where username='" + kddos + "'";
//            ResultSet rs = null;
//            rs = kon.getData(sql);
//            while (rs.next()) {
//                txtKddos.setText(rs.getString("kode"));
//
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(BAPAdmin.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }

//    void tampilkdmk() {
//        try {
//            Koneksi kon = new Koneksi();
//            Statement st = kon.sambung();
//            String sql = "select * from matakuliah";
//            ResultSet rs = null;
//            rs = kon.getData(sql);
//            while (rs.next()) {
//                cbxkdmmk.addItem(rs.getString("kode"));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(BAPAdmin.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

//    void tampilkdkelas() {
//        try {
//            Koneksi kon = new Koneksi();
//            Statement st = kon.sambung();
//            String sql = "select * from kelas";
//            ResultSet rs = null;
//            rs = kon.getData(sql);
//            while (rs.next()) {
//                cbxKelas.addItem(rs.getString("kelas"));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(BAPAdmin.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

//    void tampilkdra() {
//        try {
//            Koneksi kon = new Koneksi();
//            Statement st = kon.sambung();
//            String sql = "select * from ruang";
//            ResultSet rs = null;
//            rs = kon.getData(sql);
//            while (rs.next()) {
//                cbxKdra.addItem(rs.getString("kode"));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(BAPAdmin.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

//    void tambahbap() {
//        Koneksi kon = new Koneksi();
//        Statement st = kon.sambung();
//        kdjdwl();
//        Date date = jDateChooser1.getDate();
//        String strDate = DateFormat.getDateInstance().format(date);
//        //jLabel1.setText(strDate);
//        String kodekelas = cbxKdra.getSelectedItem().toString();
//        String koderuangan = cbxkdmmk.getSelectedItem().toString();
//        String kosong = "";
//        if ("".equals(jDateChooser1.getDate())) {
//            JOptionPane.showMessageDialog(null, "Tanggal Tidak Boleh Kosong");
//        } else if ("".equals(cbxkdmmk)) {
//            JOptionPane.showMessageDialog(null, "Password Tidak Boleh Kosong");
//
//        } else if ("".equals(cbxKelas)) {
//            JOptionPane.showMessageDialog(null, "Kelas Tidak Boleh Kosong");
//
//        } else if ("".equals(cbxKdra)) {
//            JOptionPane.showMessageDialog(null, "Kode Ruangan Tidak Boleh Kosong");
//
//        } else if ("".equals(txtmateri.getText())) {
//            JOptionPane.showMessageDialog(null, "Materi Tidak Boleh Kosong ");
//
//        } else if ("".equals(txtket.getText())) {
//            JOptionPane.showMessageDialog(null, "NO.Telepon Buku Tidak Boleh Kosong ");
//
//        } else if ("".equals(txtJummhs.getText())) {
//            JOptionPane.showMessageDialog(null, "Jumlah Mahasiswa Tidak Boleh Kosong ");
//
//        } else {
//            String sql = "insert into jadwal values ('" + idinc +"' ,'"+ strDate + "','" + labeljam.getText() + "','" + cbxkdmmk.getSelectedItem() + "','" + txtKddos.getText() + "','" + cbxKelas.getSelectedItem() + "','" + cbxKdra.getSelectedItem() + "','" + txtmateri.getText() + "','" + txtket.getText() + "','" + Integer.parseInt(txtJummhs.getText()) + "')";
//            kon.query(sql);
//            JOptionPane.showMessageDialog(null, "Input Data Berhasil");
//        }
//    }

    void tampiltabel() {
        try {
            Koneksi kon = new Koneksi();
            Statement st = kon.sambung();
            int i = 0;
            String sql = "select * from jadwal order by kode";
            ResultSet rs = null;

            rs = kon.getData(sql);
            while (rs.next()) {

                tabel.setValueAt(rs.getString("kode"), i, 0);
                tabel.setValueAt(rs.getString("tgl"), i, 1);
                tabel.setValueAt(rs.getString("jam"), i, 2);
                tabel.setValueAt(rs.getString("kodematkul"), i, 3);
                tabel.setValueAt(rs.getString("kodedosen"), i, 4);
                tabel.setValueAt(rs.getString("kelas"), i, 5);
                tabel.setValueAt(rs.getString("koderuang"), i, 6);
                tabel.setValueAt(rs.getString("materi"), i, 7);
                tabel.setValueAt(rs.getString("keterangan"), i, 8);
                tabel.setValueAt(rs.getString("jummhs"), i, 9);
                i++;
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(BAPAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
//    public void clear() {
//        txtmateri.setText("");
//        txtket.setText("");
//        txtJummhs.setText("");
//    }
//    
//    void addbtn(){
//        txtkd.setEnabled(true);
//        jDateChooser1.setEnabled(true);
//        labeljam.setEnabled(true);
//        cbxkdmmk.setEnabled(true);
//        txtKddos.setEnabled(true);
//        cbxKelas.setEnabled(true);
//        cbxKdra.setEnabled(true);
//        txtmateri.setEnabled(true);
//        txtket.setEnabled(true);
//        txtJummhs.setEnabled(true);
//    }
//    void jam(){
//        jDateChooser2.setDateFormatString("HH:mm:ss");
//        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
//        Calendar cal = Calendar.getInstance();
//        
//        jDateChooser2.setDate(cal.getTime());   
//    }

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
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(407, 92));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Form Berita Acara ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(448, 448, 448)
                .addComponent(jLabel1)
                .addContainerGap(456, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navigation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jButton3.setText("Refresh ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addGap(92, 92, 92))
        );

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode", "Tanggal", "Jam", "Kode Matakuliah", "Kode Dosen", "Kelas", "Kode Ruangan", "Materi", "Keterangan", "Jumlah Mahasiswa"
            }
        ));
        jScrollPane3.setViewportView(tabel);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1105, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    private String getautoinc(String id) {
//        char d, e, f;
//        String build_list_num, build_id = null;
//        int angka;
//        d = id.charAt(3);
//        e = id.charAt(4);
//        f = id.charAt(5);
//        build_id = "BAP";
//        build_list_num = Character.toString(d) + Character.toString(e) + Character.toString(f);
//
//        angka = Integer.parseInt(build_list_num);
//        angka = angka + 1;
//
//        if (angka < 1 || angka > 999) {
//            build_list_num = build_id + "000";
//        } else if (angka < 10) {
//            build_list_num = build_id + "00" + angka;
//        } else if (angka < 100) {
//            build_list_num = build_id + "0" + angka;
//        }
//
//        return build_list_num;
//    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
//        tampilkdmk();
//        tampilkdkelas();
//        tampilkdra();
    }//GEN-LAST:event_formWindowOpened

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        tampiltabel();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
//        clear();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        dispose();
        MenuUtamaAdmin mua = new MenuUtamaAdmin();
        mua.setTitle("Menu Utama");
        mua.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(BAPAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BAPAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BAPAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BAPAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BAPAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
