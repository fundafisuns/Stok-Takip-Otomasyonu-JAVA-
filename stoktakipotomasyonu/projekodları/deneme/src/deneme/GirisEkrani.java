package deneme;

public class GirisEkrani extends javax.swing.JFrame {
CalisanIslemleri islemler=new CalisanIslemleri(); 
    /** Creates new form GirisEkrani */
    public GirisEkrani() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        giris_butonu_personel = new javax.swing.JButton();
        mesaj_yazisi = new javax.swing.JLabel();
        kullanici_adi_alani = new javax.swing.JTextField();
        parola_alani = new javax.swing.JPasswordField();
        jRadioButton1 = new javax.swing.JRadioButton();
        giris_butonu_malzeme = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setBounds(new java.awt.Rectangle(600, 250, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Kullanıcı Adı :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Parola :");

        giris_butonu_personel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin.png"))); // NOI18N
        giris_butonu_personel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giris_butonu_personelActionPerformed(evt);
            }
        });

        mesaj_yazisi.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        mesaj_yazisi.setForeground(new java.awt.Color(255, 0, 0));

        kullanici_adi_alani.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        kullanici_adi_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici_adi_alaniActionPerformed(evt);
            }
        });

        parola_alani.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(102, 102, 255));
        jRadioButton1.setText("Görüntüle");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        giris_butonu_malzeme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/material.png"))); // NOI18N
        giris_butonu_malzeme.setActionCommand("");
        giris_butonu_malzeme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giris_butonu_malzemeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Stok Takip Otomasyonu");
        jLabel3.setFocusTraversalPolicyProvider(true);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Malzeme İşlemleri");

        jLabel5.setBackground(new java.awt.Color(102, 102, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setText("Personel İşlemleri");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(74, 74, 74)
                .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 117, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(78, 78, 78))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(88, 88, 88)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 91, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 91, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(parola_alani, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(jRadioButton1))
                            .add(kullanici_adi_alani, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .add(61, 61, 61)
                        .add(mesaj_yazisi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 450, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(39, 39, 39)
                        .add(giris_butonu_personel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(42, 42, 42)
                        .add(giris_butonu_malzeme, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel3)
                        .add(164, 164, 164)))
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(32, 32, 32)
                .add(jLabel3)
                .add(58, 58, 58)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(kullanici_adi_alani, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jRadioButton1)
                    .add(parola_alani, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(mesaj_yazisi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 38, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(giris_butonu_personel)
                    .add(giris_butonu_malzeme))
                .add(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void giris_butonu_personelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giris_butonu_personelActionPerformed
       mesaj_yazisi.setText("");
        String kullanici_adi=kullanici_adi_alani.getText();
        String parola=parola_alani.getText();
        
       boolean girisbasarili=islemler.girisYap(kullanici_adi,parola);
        if(girisbasarili){
           CalisanEkrani calisanEkrani=new CalisanEkrani(this,true);
           setVisible(false);
                   calisanEkrani.setVisible(true);
                  
                  
        }
        else{
            mesaj_yazisi.setText("Giriş Başarısız... Lütfen Tekrar Deneyiniz...");
        }
    }//GEN-LAST:event_giris_butonu_personelActionPerformed

    private void kullanici_adi_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici_adi_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kullanici_adi_alaniActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
          if (jRadioButton1.isSelected()) {
            parola_alani.setEchoChar((char)0); }
            if (!jRadioButton1.isSelected()) {
            parola_alani.setEchoChar('*');}
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void giris_butonu_malzemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giris_butonu_malzemeActionPerformed
     mesaj_yazisi.setText("");
        String kullanici_adi=kullanici_adi_alani.getText();
        String parola=parola_alani.getText();
        
       boolean girisbasarili=islemler.girisYap(kullanici_adi,parola);
        if(girisbasarili){
              setVisible(false);
        MalzemeEkrani malzeme=new MalzemeEkrani();
       malzeme.setVisible(true);
      
        }
        else{
            mesaj_yazisi.setText("Giriş Başarısız... Lütfen Tekrar Deneyiniz...");
        }
             
    }//GEN-LAST:event_giris_butonu_malzemeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
       

      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton giris_butonu_malzeme;
    private javax.swing.JButton giris_butonu_personel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField kullanici_adi_alani;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JPasswordField parola_alani;
    // End of variables declaration//GEN-END:variables

}
