package netflix;

import com.mysql.jdbc.Connection;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class anasayfa extends javax.swing.JFrame {

    /**
     * Creates new form anasayfa
     */
    public anasayfa() {
        initComponents();
        setIconImage();
        begenilenSirala1();
        begenilenSirala2();
        setText();
        izle7.setVisible(false);
    }
    Connection conn;
    Statement st;
    ResultSet rs1;


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        adagoreara = new javax.swing.JButton();
        arama = new javax.swing.JTextField();
        turegoreara = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        s6 = new javax.swing.JLabel();
        s5 = new javax.swing.JLabel();
        s4 = new javax.swing.JLabel();
        hoekranı = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        alan = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        izle7 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        adagoreara.setBackground(new java.awt.Color(255, 0, 0));
        adagoreara.setForeground(new java.awt.Color(255, 255, 255));
        adagoreara.setText("Ada göre ara");
        adagoreara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adagorearaActionPerformed(evt);
            }
        });

        arama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aramaActionPerformed(evt);
            }
        });

        turegoreara.setBackground(new java.awt.Color(255, 0, 0));
        turegoreara.setForeground(new java.awt.Color(255, 255, 255));
        turegoreara.setText("Türe göre ara");
        turegoreara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turegorearaActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sevebileceğiniz Programlar");

        s1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        s1.setForeground(new java.awt.Color(255, 255, 255));

        s2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        s2.setForeground(new java.awt.Color(255, 255, 255));

        s3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        s3.setForeground(new java.awt.Color(255, 255, 255));

        s6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        s6.setForeground(new java.awt.Color(255, 255, 255));

        s5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        s5.setForeground(new java.awt.Color(255, 255, 255));

        s4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        s4.setForeground(new java.awt.Color(255, 255, 255));

        hoekranı.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        hoekranı.setForeground(new java.awt.Color(255, 255, 255));

        alan.setBackground(new java.awt.Color(0, 0, 0));
        alan.setColumns(20);
        alan.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        alan.setForeground(new java.awt.Color(255, 255, 255));
        alan.setRows(5);
        alan.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(alan);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        izle7.setBackground(new java.awt.Color(255, 0, 0));
        izle7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        izle7.setForeground(new java.awt.Color(255, 255, 255));
        izle7.setText("İzle");
        izle7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izle7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(s4, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(s5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(s2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(s3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(s1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(s6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hoekranı, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(arama)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(turegoreara)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(adagoreara, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(izle7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(hoekranı, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arama, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(turegoreara, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adagoreara, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(izle7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
String metin = "";
    private void turegorearaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turegorearaActionPerformed
        conn = Sqlbaglanti.getConnection();
        boolean a = false;
        try {
            st = conn.createStatement();
            rs1 = st.executeQuery("SELECT * FROM programlar");

            while (rs1.next()) {
                String cumle = rs1.getString("tur");
                String[] ayrılan1 = cumle.split(", ");
                for (String ayrı1 : ayrılan1) {
                    if (ayrı1.equalsIgnoreCase(arama.getText())) {
                        a = true;
                        metin += " Ad: " + rs1.getString("ad") + "  Tip: " + rs1.getString("tip") + " Tür: " + rs1.getString("tur") + "  Puan: " + new DecimalFormat("#.##").format(rs1.getFloat("puan")) + "\n";
                    }
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(anasayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a) {
            alan.setText(metin);
            jLabel3.setText("İzlemek istediğiniz filmi ada göre arayarak izleyebilirsiniz.");
        } else {
            alan.setText("Hatalı giriş yaptınız.");
        }
        Sqlbaglanti.closeConnection(conn);
    }//GEN-LAST:event_turegorearaActionPerformed
    static String izlenecekfilm;
    static String izlencektur;
    static int bolsayi;
    private void adagorearaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adagorearaActionPerformed
        conn = Sqlbaglanti.getConnection();
        boolean a = false;
        try {
            st = conn.createStatement();
            rs1 = st.executeQuery("SELECT * FROM programlar");
            while (rs1.next()) {
                if (rs1.getString("ad").equalsIgnoreCase(arama.getText())) {
                    a = true;
                    jLabel4.setText(rs1.getString("ad"));
                    izle7.setVisible(true);
                    jLabel3.setText("");
                    izlenecekfilm = rs1.getString("ad");
                    izlencektur = rs1.getString("tip");
                    bolsayi = rs1.getInt("bolumsayisi");
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(anasayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a == false) {
            jLabel3.setText("Hatalı giriş yaptınız.");
        }
        Sqlbaglanti.closeConnection(conn);
    }//GEN-LAST:event_adagorearaActionPerformed

    private void aramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aramaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aramaActionPerformed

    private void izle7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izle7ActionPerformed
        setVisible(false);
        new izlemeekranı().setVisible(true);
    }//GEN-LAST:event_izle7ActionPerformed

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
            java.util.logging.Logger.getLogger(anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new anasayfa().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adagoreara;
    private javax.swing.JTextArea alan;
    private javax.swing.JTextField arama;
    public static javax.swing.JLabel hoekranı;
    private javax.swing.JButton izle7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s2;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel s4;
    private javax.swing.JLabel s5;
    private javax.swing.JLabel s6;
    private javax.swing.JButton turegoreara;
    // End of variables declaration//GEN-END:variables
    public float[] puan1 = new float[100];
    public float[] puan2 = new float[100];
    public float[] puan3 = new float[100];
    public String[] sev_dizi = new String[6];
    public float p;

    private void begenilenSirala1() {
        String cumle1, filmadi;
        //String[] ayrılan1;

        int dsayac1 = 0, dsayac2 = 0, dsayac3 = 0;
        conn = Sqlbaglanti.getConnection();

        try {
            st = conn.createStatement();
            rs1 = st.executeQuery("SELECT ad,tur,puan,sevdigi1,sevdigi2,sevdigi3 FROM programlar ,kullanici WHERE kullanici.mail='" + girisekrani.mail + "'");

            while (rs1.next()) {
                cumle1 = rs1.getString("tur");
                p = rs1.getFloat("puan");
                String[] ayrılan1 = cumle1.split(", ");
                for (String ayrı1 : ayrılan1) {
                    if (ayrı1.equals(rs1.getString("sevdigi1"))) {
                        puan1[dsayac1++] = p;
                    }
                    if (ayrı1.equals(rs1.getString("sevdigi2"))) {
                        puan2[dsayac2++] = p;
                    }
                    if (ayrı1.equals(rs1.getString("sevdigi3"))) {
                        puan3[dsayac3++] = p;
                    }
                }
            }
            Arrays.sort(puan1);
            Arrays.sort(puan2);
            Arrays.sort(puan3);
            System.out.println(puan1[puan1.length - 1]);
            System.out.println(puan1[puan1.length - 2]);
            System.out.println(puan2[puan2.length - 1]);
            System.out.println(puan2[puan2.length - 2]);
            System.out.println(puan3[puan3.length - 1]);
            System.out.println(puan3[puan3.length - 2]);

        } catch (SQLException ex) {
            Logger.getLogger(anasayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
        Sqlbaglanti.closeConnection(conn);
    }

    private void begenilenSirala2() {
        try {
            conn = Sqlbaglanti.getConnection();
            st = conn.createStatement();
            rs1 = st.executeQuery("SELECT ad,tur,puan,sevdigi1,sevdigi2,sevdigi3 FROM programlar ,kullanici WHERE kullanici.mail='" + girisekrani.mail + "'");
            String filmadi, cumle1;

            while (rs1.next()) {

                filmadi = rs1.getString("ad");
                cumle1 = rs1.getString("tur");
                String[] ayrılan1 = cumle1.split(", ");
                p = rs1.getFloat("puan");

                for (String ayrı1 : ayrılan1) {
                    System.out.println(ayrı1);
                    if (ayrı1.equals(rs1.getString("sevdigi1")) && puan1[puan1.length - 1] == p) {
                        sev_dizi[0] = filmadi;
                    } else if (ayrı1.equals(rs1.getString("sevdigi1")) && puan1[puan1.length - 2] == p) {
                        sev_dizi[1] = filmadi;
                    }
                    if (ayrı1.equals(rs1.getString("sevdigi2")) && puan2[puan2.length - 1] == p) {
                        sev_dizi[2] = filmadi;
                    } else if (ayrı1.equals(rs1.getString("sevdigi2")) && puan2[puan2.length - 2] == p) {
                        sev_dizi[3] = filmadi;
                    }
                    if (ayrı1.equals(rs1.getString("sevdigi3")) && puan3[puan3.length - 1] == p) {
                        sev_dizi[4] = filmadi;
                    } else if (ayrı1.equals(rs1.getString("sevdigi3")) && puan3[puan3.length - 2] == p) {
                        sev_dizi[5] = filmadi;
                    }
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(anasayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
        Sqlbaglanti.closeConnection(conn);
    }

    private void setText() {
        hoekranı.setText("Hoşgeldin " + girisekrani.hoadi);
        s1.setText(sev_dizi[0] + "  Puan: " + new DecimalFormat("#.##").format(puan1[puan1.length - 1]));
        s2.setText(sev_dizi[1] + "  Puan: " + new DecimalFormat("#.##").format(puan1[puan1.length - 2]));
        s3.setText(sev_dizi[2] + "  Puan: " + new DecimalFormat("#.##").format(puan1[puan2.length - 1]));
        s4.setText(sev_dizi[3] + "  Puan: " + new DecimalFormat("#.##").format(puan1[puan2.length - 2]));
        s5.setText(sev_dizi[4] + "  Puan: " + new DecimalFormat("#.##").format(puan1[puan3.length - 1]));
        s6.setText(sev_dizi[5] + "  Puan: " + new DecimalFormat("#.##").format(puan1[puan3.length - 2]));
        System.out.println(sev_dizi[5]);
    }

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
