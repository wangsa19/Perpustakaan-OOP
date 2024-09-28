/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form_perpustakaan;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import perpustakaan.Anggota;
import perpustakaan.Buku;
import perpustakaan.Perpustakaan;

/**
 *
 * @author ACER
 */
public class FormAnggota extends javax.swing.JFrame {

    private Perpustakaan perpus;
    private ArrayList<Anggota> user = new ArrayList<>();
    private ArrayList<Buku> dataBuku = new ArrayList<>();
//    private Anggota user;

    /**
     * Creates new form FormAnggota
     */
    public FormAnggota() {
        initComponents();
        perpus = Perpustakaan.getInstance();

        Anggota a1 = new Anggota("wangsa", "123");
        Anggota a2 = new Anggota("ojan", "123");
        Anggota a3 = new Anggota("ridho", "123");

        perpus.tambahAnggota(a1);
        perpus.tambahAnggota(a2);
        perpus.tambahAnggota(a3);

//        dataBuku.add(new Buku("Java Basics", "John Doe", "123456", 2020, true));
//        dataBuku.add(new Buku("Data Structures", "Jane Smith", "654321", 2019, true));
//        dataBuku.add(new Buku("Introduction to Algorithms", "Thomas H. Cormen", "987654", 2018, true));
//        dataBuku.add(new Buku("Effective Java", "Joshua Bloch", "111213", 2021, true));
//        dataBuku.add(new Buku("Design Patterns", "Erich Gamma", "141516", 2017, true));
//        dataBuku.add(new Buku("Clean Code", "Robert C. Martin", "171819", 2020, true));
//        dataBuku.add(new Buku("The Pragmatic Programmer", "Andrew Hunt", "202122", 2019, true));
//        dataBuku.add(new Buku("Head First Java", "Kathy Sierra", "232425", 2020, true));
//        dataBuku.add(new Buku("Java Concurrency in Practice", "Brian Goetz", "262728", 2019, true));
//        dataBuku.add(new Buku("Spring in Action", "Craig Walls", "293031", 2021, true));
//        dataBuku.add(new Buku("Java: The Complete Reference", "Herbert Schildt", "323334", 2020, true));
//        dataBuku.add(new Buku("Learning Java", "Building Java Programs", "353637", 2018, true));
//        dataBuku.add(new Buku("Java Cookbook", "Ian Darwin", "383940", 2020, true));
//        dataBuku.add(new Buku("Java Performance", "Scott Oaks", "414243", 2021, true));
//        dataBuku.add(new Buku("Programming in Java", "Carlo C. B. Dello", "444546", 2019, true));
//        dataBuku.add(new Buku("Core Java Volume I", "Cay S. Horstmann", "474849", 2020, true));
//        dataBuku.add(new Buku("Java All-in-One For Dummies", "Doug Lowe", "505152", 2021, true));
//        dataBuku.add(new Buku("Java 8 in Action", "Raoul-Gabriel Urma", "535455", 2019, true));
//        dataBuku.add(new Buku("Beginning Java 8 Fundamentals", "Kishori Sharan", "565758", 2020, true));
//        dataBuku.add(new Buku("Java Programming and Problem Solving", "Lana L. S. Meyer", "596061", 2021, true));
//
//        // Menambah buku ke perpustakaan
//        for (Buku buku : dataBuku) {
//            perpus.tambahBuku(buku);
//        }
//
//        perpus.simpanBukuKeFile();

    }

    public Perpustakaan getPerpustakan() {
        return perpus;
    }

    public ArrayList<Anggota> getAnggota() {
        return user;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tfNamaAnggota = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(20, 73, 122));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 125));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form_perpustakaan/assets/PENS_polos.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Politeknik Elektronika Negeri Surabaya");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PERPUSTAKAAN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 225));

        tfNamaAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaAnggotaActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Username");

        btnSubmit.setText("Submit");
        btnSubmit.setMargin(new java.awt.Insets(2, 14, 2, 14));
        btnSubmit.setPreferredSize(new java.awt.Dimension(72, 20));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Password");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNamaAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNamaAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String username = tfNamaAnggota.getText();
        String password = tfPassword.getText();

        if (!username.equalsIgnoreCase("") && !password.equalsIgnoreCase("")) {
            user = perpus.getDataAnggota();
            boolean loginBerhasil = false; // Variabel untuk menandakan keberhasilan login

            // Memeriksa setiap anggota untuk mencocokkan username dan password
            for (Anggota anggota : user) {
                if (anggota.getUsername().equalsIgnoreCase(username)
                        && anggota.getPassword().equals(password)) {
                    loginBerhasil = true;
                    break;
                }
            }

            if (loginBerhasil) {
                FormMenu f2 = new FormMenu(user);
                f2.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Username atau password salah");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Username atau password tidak boleh kosong");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void tfNamaAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaAnggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaAnggotaActionPerformed

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
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAnggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfNamaAnggota;
    private javax.swing.JPasswordField tfPassword;
    // End of variables declaration//GEN-END:variables
}
