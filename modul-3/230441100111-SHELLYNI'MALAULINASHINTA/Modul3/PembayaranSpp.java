
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Shely
 */
public class PembayaranSpp extends javax.swing.JFrame {
    JFrame frame = new JFrame("PEMBAYARAN SPP");
   

    /**
     * Creates new form PembayaranSpp
     */
    public PembayaranSpp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        lblSpp = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblSiswa = new javax.swing.JLabel();
        lblBulan = new javax.swing.JLabel();
        lbldiBayar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtNama = new javax.swing.JTextField();
        txtJumlahbln = new javax.swing.JTextField();
        checkJanuari = new javax.swing.JCheckBox();
        checkFebruary = new javax.swing.JCheckBox();
        checkMarch = new javax.swing.JCheckBox();
        checkAppril = new javax.swing.JCheckBox();
        checkMei = new javax.swing.JCheckBox();
        checkJuni = new javax.swing.JCheckBox();
        checkJuli = new javax.swing.JCheckBox();
        checkAgustus = new javax.swing.JCheckBox();
        checkSeptember = new javax.swing.JCheckBox();
        checkOktober = new javax.swing.JCheckBox();
        checkNovember = new javax.swing.JCheckBox();
        checkDesember = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        lblPembayaran = new javax.swing.JLabel();
        lblRiwayat = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreapembayaran = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreariwayat = new javax.swing.JTextArea();
        btnBayar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pembayaran_SPP");

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        lblSpp.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblSpp.setForeground(new java.awt.Color(204, 102, 0));
        lblSpp.setText("PEMBAYARAN SPP");
        lblSpp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSppMouseClicked(evt);
            }
        });
        jPanel1.add(lblSpp);

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        lblSiswa.setFont(new java.awt.Font("Regime", 1, 14)); // NOI18N
        lblSiswa.setForeground(new java.awt.Color(0, 102, 102));
        lblSiswa.setText("Nama Siswa : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 37, 0, 0);
        jPanel2.add(lblSiswa, gridBagConstraints);

        lblBulan.setFont(new java.awt.Font("Regime", 1, 14)); // NOI18N
        lblBulan.setForeground(new java.awt.Color(0, 102, 102));
        lblBulan.setText("Jumlah SPP Dibayar : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(86, 20, 0, 0);
        jPanel2.add(lblBulan, gridBagConstraints);

        lbldiBayar.setFont(new java.awt.Font("Regime", 1, 14)); // NOI18N
        lbldiBayar.setForeground(new java.awt.Color(0, 102, 102));
        lbldiBayar.setText("Memilih Bulan Apa saja :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(86, 20, 58, 0);
        jPanel2.add(lbldiBayar, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(255, 153, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNama.setBackground(new java.awt.Color(255, 255, 153));
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        jPanel3.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 439, 72));

        txtJumlahbln.setEditable(false);
        txtJumlahbln.setBackground(new java.awt.Color(255, 255, 153));
        txtJumlahbln.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        txtJumlahbln.setForeground(new java.awt.Color(0, 0, 153));
        txtJumlahbln.setText("500.000 (per bulan)");
        txtJumlahbln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahblnActionPerformed(evt);
            }
        });
        jPanel3.add(txtJumlahbln, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 439, 80));

        checkJanuari.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        checkJanuari.setForeground(new java.awt.Color(0, 0, 102));
        checkJanuari.setText("January");
        jPanel3.add(checkJanuari, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 205, 85, -1));

        checkFebruary.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        checkFebruary.setForeground(new java.awt.Color(0, 0, 102));
        checkFebruary.setText("February");
        jPanel3.add(checkFebruary, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 230, 85, -1));

        checkMarch.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        checkMarch.setForeground(new java.awt.Color(0, 0, 102));
        checkMarch.setText("March");
        checkMarch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMarchActionPerformed(evt);
            }
        });
        jPanel3.add(checkMarch, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 255, 85, -1));

        checkAppril.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        checkAppril.setForeground(new java.awt.Color(0, 0, 102));
        checkAppril.setText("April");
        jPanel3.add(checkAppril, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 205, 85, -1));

        checkMei.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        checkMei.setForeground(new java.awt.Color(0, 0, 102));
        checkMei.setText("May");
        jPanel3.add(checkMei, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 230, 85, -1));

        checkJuni.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        checkJuni.setForeground(new java.awt.Color(0, 0, 102));
        checkJuni.setText("June");
        jPanel3.add(checkJuni, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 255, 85, -1));

        checkJuli.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        checkJuli.setForeground(new java.awt.Color(0, 0, 102));
        checkJuli.setText("July");
        jPanel3.add(checkJuli, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 205, 85, -1));

        checkAgustus.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        checkAgustus.setForeground(new java.awt.Color(0, 0, 102));
        checkAgustus.setText("August");
        jPanel3.add(checkAgustus, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 230, 85, -1));

        checkSeptember.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        checkSeptember.setForeground(new java.awt.Color(0, 0, 102));
        checkSeptember.setText("September");
        jPanel3.add(checkSeptember, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 255, 85, -1));

        checkOktober.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        checkOktober.setForeground(new java.awt.Color(0, 0, 102));
        checkOktober.setText("October");
        checkOktober.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOktoberActionPerformed(evt);
            }
        });
        jPanel3.add(checkOktober, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 205, 85, -1));

        checkNovember.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        checkNovember.setForeground(new java.awt.Color(0, 0, 102));
        checkNovember.setText("November");
        jPanel3.add(checkNovember, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 230, 85, -1));

        checkDesember.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        checkDesember.setForeground(new java.awt.Color(0, 0, 102));
        checkDesember.setText("December");
        jPanel3.add(checkDesember, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 255, 85, -1));

        jPanel4.setBackground(new java.awt.Color(153, 51, 0));

        lblPembayaran.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblPembayaran.setForeground(new java.awt.Color(255, 255, 204));
        lblPembayaran.setText("STATUS PEMBAYARAN");

        lblRiwayat.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblRiwayat.setForeground(new java.awt.Color(255, 255, 204));
        lblRiwayat.setText("RIWAYAT PEMBAYARAN");

        btnKeluar.setBackground(new java.awt.Color(255, 255, 153));
        btnKeluar.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        btnKeluar.setForeground(new java.awt.Color(102, 0, 0));
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 255, 153));
        btnReset.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        btnReset.setForeground(new java.awt.Color(102, 0, 0));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        textAreapembayaran.setEditable(false);
        textAreapembayaran.setBackground(new java.awt.Color(255, 255, 204));
        textAreapembayaran.setColumns(20);
        textAreapembayaran.setFont(new java.awt.Font("Regime", 0, 14)); // NOI18N
        textAreapembayaran.setRows(5);
        jScrollPane1.setViewportView(textAreapembayaran);

        textAreariwayat.setEditable(false);
        textAreariwayat.setBackground(new java.awt.Color(255, 255, 204));
        textAreariwayat.setColumns(20);
        textAreariwayat.setFont(new java.awt.Font("Regime", 0, 14)); // NOI18N
        textAreariwayat.setRows(5);
        jScrollPane2.setViewportView(textAreariwayat);

        btnBayar.setBackground(new java.awt.Color(255, 255, 153));
        btnBayar.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        btnBayar.setForeground(new java.awt.Color(102, 0, 0));
        btnBayar.setText("Bayar");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(btnReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBayar)
                .addGap(109, 109, 109)
                .addComponent(btnKeluar)
                .addGap(92, 92, 92))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRiwayat)
                .addGap(240, 240, 240))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(53, 211, Short.MAX_VALUE)
                        .addComponent(lblPembayaran)
                        .addGap(243, 243, 243))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPembayaran)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRiwayat)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnKeluar)
                    .addComponent(btnBayar))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSppMouseClicked
        // TODO add your handling code here:
        lblSpp.setHorizontalAlignment(SwingConstants.CENTER);
        lblSpp.setOpaque(true);
    }//GEN-LAST:event_lblSppMouseClicked

    private void txtJumlahblnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahblnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahblnActionPerformed

    private void checkMarchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMarchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMarchActionPerformed

    private void checkOktoberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOktoberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkOktoberActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar dari Pembayaran Spp ini?", "Peringatan", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (response == JOptionPane.YES_OPTION){
//            Logika untuk menangani pembatalan
            dispose();
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here
        String namaSiswa = txtNama.getText().trim();
        if(namaSiswa.isEmpty()){
            // Jika nama kosong, tampilkan pesan kesalahan
            JOptionPane.showMessageDialog(null, "Silahkan isi nama terlebih dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int total =0;
        if(checkJanuari.isSelected()) total += 500000;
        if(checkFebruary.isSelected()) total += 500000;
        if(checkMarch.isSelected()) total += 500000;
        if(checkAppril.isSelected()) total += 500000;
        if(checkMei.isSelected()) total += 500000;
        if(checkJuni.isSelected()) total += 500000;
        if(checkJuli.isSelected()) total += 500000;
        if(checkAgustus.isSelected()) total += 500000;
        if(checkSeptember.isSelected()) total += 500000;
        if(checkOktober.isSelected()) total += 500000;
        if(checkNovember.isSelected()) total += 500000;
        if(checkDesember.isSelected()) total += 500000;
        
        textAreariwayat.append("Nominal yang dibayarkan : " + total);
        JOptionPane.showMessageDialog(null, "Nominal yang Harus dibayar " + total, "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
        return;

    }//GEN-LAST:event_txtNamaActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        // TODO add your handling code here:
        String nama = txtNama.getText();
        ArrayList<String>bulanSelesai = new ArrayList<>();
        ArrayList<String>bulanBelum = new ArrayList<>();
        int sisaPembayaran = 0;
        int hargaPerbulan = 500000;
        
        if (checkJanuari.isSelected()) bulanSelesai.add("Januari");
        else bulanBelum.add("Januari");
             sisaPembayaran += hargaPerbulan;
        if (checkFebruary.isSelected()) bulanSelesai.add("Februari");
        else bulanBelum.add("Februari");
             sisaPembayaran += hargaPerbulan;
        if (checkMarch.isSelected()) bulanSelesai.add("Maret");
        else bulanBelum.add("Maret");
             sisaPembayaran += hargaPerbulan;
        if (checkAppril.isSelected()) bulanSelesai.add("Appril");
        else bulanBelum.add("Appril");
             sisaPembayaran += hargaPerbulan;
        if (checkMei.isSelected()) bulanSelesai.add("Mei");
        else bulanBelum.add("Mei");
             sisaPembayaran += hargaPerbulan;
        if (checkJuni.isSelected()) bulanSelesai.add("Juni");
        else bulanBelum.add("Juni");
             sisaPembayaran += hargaPerbulan;   
        if (checkJuli.isSelected()) bulanSelesai.add("Juli");
        else bulanBelum.add("Juli");
             sisaPembayaran += hargaPerbulan;
        if (checkAgustus.isSelected()) bulanSelesai.add("Agustus");
        else bulanBelum.add("Agustus");
             sisaPembayaran += hargaPerbulan;
        if (checkSeptember.isSelected()) bulanSelesai.add("September");
        else bulanBelum.add("September");
             sisaPembayaran += hargaPerbulan;
        if (checkOktober.isSelected()) bulanSelesai.add("Oktober");
        else bulanBelum.add("Oktober");
             sisaPembayaran += hargaPerbulan;
        if (checkNovember.isSelected()) bulanSelesai.add("November");
        else bulanBelum.add("November");
            sisaPembayaran += hargaPerbulan;
        if (checkDesember.isSelected()) bulanSelesai.add("Desember");
        else bulanBelum.add("Desember");
             sisaPembayaran += hargaPerbulan;
             
        textAreariwayat.append("\n~~~~ Informasi Bayar ~~~~" + "\nNama Siswa : " + nama + "\nPembayaran Bulan " + bulanSelesai + "\nBerhasilll!!!");
        
        if(bulanBelum.isEmpty()){
            textAreapembayaran.append("\n~~~~ STATUS PEMBAYARAN ~~~~\n" + "\nNama Siswa : " + nama + "\nStatus pembayaran : Lunas"+ "\n");
        }else{
            textAreapembayaran.append("\n~~~~ STATUS PEMBAYARAN ~~~~\n" + "\nNama Siswa : " + nama + "\nStatus Pembayaran : Belum Lunas" + "\nBulan yang belum dibayar : " + bulanBelum + "\nSisa yang harus dibayar : Rp. " + sisaPembayaran + "\n");
        }
    }//GEN-LAST:event_btnBayarActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtNama.setText("");
        checkJanuari.setSelected(false);
        checkFebruary.setSelected(false);
        checkMarch.setSelected(false);
        checkAppril.setSelected(false);
        checkMei.setSelected(false);
        checkJuni.setSelected(false);
        checkJuli.setSelected(false);
        checkAgustus.setSelected(false);
        checkSeptember.setSelected(false);
        checkOktober.setSelected(false);
        checkNovember.setSelected(false);
        checkDesember.setSelected(false);
        textAreapembayaran.setText("");
        textAreariwayat.setText("");
        
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(PembayaranSpp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PembayaranSpp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PembayaranSpp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PembayaranSpp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PembayaranSpp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnReset;
    private javax.swing.JCheckBox checkAgustus;
    private javax.swing.JCheckBox checkAppril;
    private javax.swing.JCheckBox checkDesember;
    private javax.swing.JCheckBox checkFebruary;
    private javax.swing.JCheckBox checkJanuari;
    private javax.swing.JCheckBox checkJuli;
    private javax.swing.JCheckBox checkJuni;
    private javax.swing.JCheckBox checkMarch;
    private javax.swing.JCheckBox checkMei;
    private javax.swing.JCheckBox checkNovember;
    private javax.swing.JCheckBox checkOktober;
    private javax.swing.JCheckBox checkSeptember;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBulan;
    private javax.swing.JLabel lblPembayaran;
    private javax.swing.JLabel lblRiwayat;
    private javax.swing.JLabel lblSiswa;
    private javax.swing.JLabel lblSpp;
    private javax.swing.JLabel lbldiBayar;
    private javax.swing.JTextArea textAreapembayaran;
    private javax.swing.JTextArea textAreariwayat;
    private javax.swing.JTextField txtJumlahbln;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}