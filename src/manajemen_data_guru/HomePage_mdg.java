/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package manajemen_data_guru;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/**
 *
 * @author lenov
 */
public class HomePage_mdg extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage_mdg() {
        initComponents();
        updateTabelGuru();
    }
    
    // Method untuk memperbarui tabel guru setelah data baru ditambahkan
    public void updateTabelGuru() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        DefaultTableModel model = (DefaultTableModel) tbldaftarguru.getModel();

    try {
        conn = DatabaseConnection_mdg.connect(); // Menggunakan koneksi dari DatabaseConnection_mdg
        stmt = conn.createStatement();
        String sql = "SELECT * FROM guru";
        rs = stmt.executeQuery(sql);

        // Mengosongkan tabel sebelum menambahkan data baru
        model.setRowCount(0);

        // Menambahkan data ke tabel
        while (rs.next()) {
            String idGuru = rs.getString("idGuru");
            String nama = rs.getString("nama");
            String tanggalLahir = rs.getString("tanggalLahir");
            String jenisKelamin = rs.getString("jenisKelamin");
            String mataPelajaran = rs.getString("mataPelajaran");
            String statusGuru = rs.getString("statusGuru"); // Tambahkan status guru jika diperlukan

            model.addRow(new Object[]{idGuru, nama, tanggalLahir, jenisKelamin, mataPelajaran, statusGuru});
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    /**
     * Creates new form HomePage_mdg
     */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btntbhguru = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldaftarguru = new javax.swing.JTable();
        btnkeluar = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(243, 249, 249));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Aplikasi Manajemen Data Guru");

        btntbhguru.setBackground(new java.awt.Color(0, 153, 51));
        btntbhguru.setForeground(new java.awt.Color(255, 255, 255));
        btntbhguru.setText(" Tambah Guru");
        btntbhguru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntbhguruActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Daftar Guru");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btntbhguru)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(318, 318, 318))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntbhguru)
                    .addComponent(jLabel2)))
        );

        tbldaftarguru.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Guru", "Nama Lengkap", "Tanggal Lahir", "Jenis Kelamin", "Mata Pelajaran", "Status Guru"
            }
        ));
        jScrollPane1.setViewportView(tbldaftarguru);

        btnkeluar.setBackground(new java.awt.Color(204, 0, 0));
        btnkeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        btnupdate.setBackground(new java.awt.Color(51, 51, 255));
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnhapus.setBackground(new java.awt.Color(204, 0, 0));
        btnhapus.setForeground(new java.awt.Color(255, 255, 255));
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(243, 249, 249));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 905, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnkeluar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnupdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnhapus))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnkeluar)
                    .addComponent(btnupdate)
                    .addComponent(btnhapus))
                .addGap(0, 41, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btntbhguruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntbhguruActionPerformed
        // Membuka form tambah guru
        new tambahguru(this).setVisible(true);
        updateTabelGuru();
        this.dispose();
    }//GEN-LAST:event_btntbhguruActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        this.dispose(); // tutup form 
        new register_mdg().setVisible(true);  // menampilkan form register
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        int selectedRow = tbldaftarguru.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tbldaftarguru.getModel();

            // Ambil data lama dari baris yang dipilih
            String idGuru = model.getValueAt(selectedRow, 0).toString();
            String nama = model.getValueAt(selectedRow, 1).toString();
            String tanggalLahir = model.getValueAt(selectedRow, 2).toString();
            String jenisKelamin = model.getValueAt(selectedRow, 3).toString();
            String mataPelajaran = model.getValueAt(selectedRow, 4).toString();
            String statusGuru = model.getValueAt(selectedRow, 5).toString();

            JTextField txtIdGuru = new JTextField(idGuru);
            JTextField txtNama = new JTextField(nama);
            JTextField txtTanggalLahir = new JTextField(tanggalLahir);
            JTextField txtJenisKelamin = new JTextField(jenisKelamin);
            JTextField txtMataPelajaran = new JTextField(mataPelajaran);
            JTextField txtStatusGuru = new JTextField(statusGuru);

            Object[] message = {
                "ID Guru:", txtIdGuru,
                "Nama Lengkap:", txtNama,
                "Tanggal Lahir:", txtTanggalLahir,
                "Jenis Kelamin:", txtJenisKelamin,
                "Mata Pelajaran:", txtMataPelajaran,
                "Status Guru:", txtStatusGuru
            };

            int option = JOptionPane.showConfirmDialog(this, message, "Edit Data Guru", JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                model.setValueAt(txtNama.getText(), selectedRow, 1);
                model.setValueAt(txtTanggalLahir.getText(), selectedRow, 2);
                model.setValueAt(txtJenisKelamin.getText(), selectedRow, 3);
                model.setValueAt(txtMataPelajaran.getText(), selectedRow, 4);
                model.setValueAt(txtStatusGuru.getText(), selectedRow, 5);

                // Update di database
                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/manajemen_data_guru", "root", "")) {
                    String query = "UPDATE guru SET nama = ?, tanggalLahir = ?, jenisKelamin = ?, mataPelajaran = ?, statusGuru = ? WHERE idGuru = ?";
                    PreparedStatement pst = conn.prepareStatement(query);
                    pst.setString(1, txtNama.getText());
                    pst.setString(2, txtTanggalLahir.getText());
                    pst.setString(3, txtJenisKelamin.getText());
                    pst.setString(4, txtMataPelajaran.getText());
                    pst.setString(5, txtStatusGuru.getText());
                    pst.setString(6, txtIdGuru.getText());
                    
                    pst.executeUpdate();
                    
                // Menampilkan pesan bahwa update berhasil
                JOptionPane.showMessageDialog(this, "Data berhasil diperbarui!");

                // Perbarui tabel setelah data diupdate
                updateTabelGuru();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan diedit!");
        }

    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
    int selectedRow = tbldaftarguru.getSelectedRow();
         if (selectedRow != -1) {
         DefaultTableModel model = (DefaultTableModel) tbldaftarguru.getModel();
         String idGuru = model.getValueAt(selectedRow, 0).toString();

         int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Hapus Data", JOptionPane.YES_NO_OPTION);
         if (confirm == JOptionPane.YES_OPTION) {
             try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/manajemen_data_guru", "root", "")) {
                 String query = "DELETE FROM guru WHERE idGuru = ?";
                 PreparedStatement pst = conn.prepareStatement(query);
                 pst.setString(1, idGuru);
                 int affectedRows = pst.executeUpdate();

                 if (affectedRows > 0) {
                     // Menghapus data pada tabel secara langsung
                     model.removeRow(selectedRow);

                     // Menampilkan pesan bahwa hapus berhasil
                     JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");

                     // Perbarui tabel setelah data dihapus
                     updateTabelGuru();
                 } else {
                     JOptionPane.showMessageDialog(this, "Data gagal dihapus.");
                 }
                 
             } catch (SQLException e) {
                 JOptionPane.showMessageDialog(this, "Gagal menghapus data: " + e.getMessage());
             }
         }
     } else {
         JOptionPane.showMessageDialog(this, "Pilih baris yang akan dihapus!");
     }


    }//GEN-LAST:event_btnhapusActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btntbhguru;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbldaftarguru;
    // End of variables declaration//GEN-END:variables
}
