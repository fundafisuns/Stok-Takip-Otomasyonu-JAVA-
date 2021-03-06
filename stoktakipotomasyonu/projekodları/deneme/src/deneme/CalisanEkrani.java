package deneme;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author admin
 */
public class CalisanEkrani extends javax.swing.JDialog {
    DefaultTableModel model;
    CalisanIslemleri islemler =  new CalisanIslemleri();
    
    /** Creates new form CalisanEkrani */
    public CalisanEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model=(DefaultTableModel)calisan_tablosu.getModel();
        calisanGoruntule();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        calisan_tablosu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ad_alani = new javax.swing.JTextField();
        soyad_alani = new javax.swing.JTextField();
        dept_alani = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        calisanekle = new javax.swing.JButton();
        guncelle = new javax.swing.JButton();
        sil = new javax.swing.JButton();
        cikis = new javax.swing.JButton();
        arama_cubugu = new javax.swing.JTextField();
        mesaj_yazisi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(210, 237, 243));
        setBounds(new java.awt.Rectangle(600, 250, 0, 0));
        setPreferredSize(new java.awt.Dimension(1020, 720));

        jScrollPane1.setBackground(new java.awt.Color(173, 216, 230));

        calisan_tablosu.setBackground(new java.awt.Color(204, 204, 255));
        calisan_tablosu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        calisan_tablosu.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        calisan_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "AD", "SOYAD", "DEPARTMAN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        calisan_tablosu.setGridColor(new java.awt.Color(204, 204, 255));
        calisan_tablosu.setSelectionBackground(new java.awt.Color(255, 255, 255));
        calisan_tablosu.setSelectionForeground(new java.awt.Color(0, 0, 0));
        calisan_tablosu.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        calisan_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calisan_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(calisan_tablosu);
        if (calisan_tablosu.getColumnModel().getColumnCount() > 0) {
            calisan_tablosu.getColumnModel().getColumn(0).setResizable(false);
            calisan_tablosu.getColumnModel().getColumn(0).setHeaderValue("ID");
            calisan_tablosu.getColumnModel().getColumn(1).setResizable(false);
            calisan_tablosu.getColumnModel().getColumn(1).setHeaderValue("AD");
            calisan_tablosu.getColumnModel().getColumn(2).setResizable(false);
            calisan_tablosu.getColumnModel().getColumn(2).setHeaderValue("SOYAD");
            calisan_tablosu.getColumnModel().getColumn(3).setResizable(false);
            calisan_tablosu.getColumnModel().getColumn(3).setHeaderValue("DEPARTMAN");
        }

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Ad :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Soyad :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Departman :");

        ad_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ad_alaniActionPerformed(evt);
            }
        });

        soyad_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soyad_alaniActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        calisanekle.setBackground(new java.awt.Color(204, 204, 255));
        calisanekle.setForeground(new java.awt.Color(204, 204, 255));
        calisanekle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_person.png"))); // NOI18N
        calisanekle.setMaximumSize(new java.awt.Dimension(64, 64));
        calisanekle.setMinimumSize(new java.awt.Dimension(64, 64));
        calisanekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calisanekleActionPerformed(evt);
            }
        });

        guncelle.setBackground(new java.awt.Color(204, 204, 255));
        guncelle.setForeground(new java.awt.Color(204, 204, 255));
        guncelle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.png"))); // NOI18N
        guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleActionPerformed(evt);
            }
        });

        sil.setBackground(new java.awt.Color(204, 204, 255));
        sil.setForeground(new java.awt.Color(204, 204, 255));
        sil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        cikis.setBackground(new java.awt.Color(204, 204, 255));
        cikis.setForeground(new java.awt.Color(204, 204, 255));
        cikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisActionPerformed(evt);
            }
        });

        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(46, 46, 46)
                .add(calisanekle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(guncelle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(28, 28, 28)
                .add(sil, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(arama_cubugu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 509, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(cikis, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(calisanekle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, cikis, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, sil, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, guncelle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .add(jPanel1Layout.createSequentialGroup()
                .add(27, 27, 27)
                .add(arama_cubugu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mesaj_yazisi.setForeground(new java.awt.Color(0, 153, 0));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(44, 44, 44)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(312, 312, 312)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, soyad_alani, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, ad_alani, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(dept_alani, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(463, 463, 463))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 926, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(97, 97, 97))))
            .add(layout.createSequentialGroup()
                .add(35, 35, 35)
                .add(mesaj_yazisi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 926, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(31, 31, 31)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(ad_alani, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(soyad_alani, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(dept_alani, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(mesaj_yazisi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 293, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("");
        jLabel2.getAccessibleContext().setAccessibleName("");
        jLabel3.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
        String ara = arama_cubugu.getText();
        
        dinamikAra(ara);
    }//GEN-LAST:event_arama_cubuguKeyReleased

    private void ad_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ad_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ad_alaniActionPerformed

    private void soyad_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soyad_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soyad_alaniActionPerformed

    private void calisanekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calisanekleActionPerformed
        // TODO add your handling code here:
   
        mesaj_yazisi.setText("");
        String ad=ad_alani.getText();
        String soyad=soyad_alani.getText();
        String departman=dept_alani.getText();
        islemler.calisanEkle(ad,soyad,departman);
        
        calisanGoruntule();
        
         mesaj_yazisi.setText("Yeni Kayıt Başarıyla Yüklendi...");
    }//GEN-LAST:event_calisanekleActionPerformed

    private void calisan_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calisan_tablosuMouseClicked
        // TODO add your handling code here:
        int selectedrow=calisan_tablosu.getSelectedRow();
           
        ad_alani.setText(model.getValueAt(selectedrow,1).toString());
        soyad_alani.setText(model.getValueAt(selectedrow,2).toString());
        dept_alani.setText(model.getValueAt(selectedrow,3).toString());
        
        
        
    }//GEN-LAST:event_calisan_tablosuMouseClicked

    private void guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleActionPerformed
        // TODO add your handling code here:
         String ad = ad_alani.getText();
        String soyad = soyad_alani.getText();
        String departman = dept_alani.getText();
        
 int selectedrow = calisan_tablosu.getSelectedRow();
        
        if (selectedrow == -1) {
            
            if (model.getRowCount() == 0) {
                mesaj_yazisi.setText("Çalışanlar Tablosu şu anda boş. ");
            }
            else {
                mesaj_yazisi.setText("Lütfen güncellenecek bir çalışan seçin.");
            }
        }
        else {
            
            
            
            
            int id = (int)model.getValueAt(selectedrow,0);
            
            
            
            islemler.calisanGuncelle(id,ad,soyad,departman);
            
            calisanGoruntule();
            
            mesaj_yazisi.setText("Çalışan başarıyla güncellendi...");
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_guncelleActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
        // TODO add your handling code here:
        
        mesaj_yazisi.setText("");
       
       
       int selectedrow = calisan_tablosu.getSelectedRow();
       
       if (selectedrow == -1) {
           if (model.getRowCount() == 0 ) {
               mesaj_yazisi.setText("Çalışan tablosu şu anda boş...");
           }
           else {
               mesaj_yazisi.setText("Lütfen silinecek bir çalışan seçin...");
           }
      
       }
       else {
           int id = (int)model.getValueAt(selectedrow,0);
           
           islemler.calisanSil(id);
           
           calisanGoruntule();
           
           mesaj_yazisi.setText("Çalışan başarıyla silindi...");
           
        
       }  
    }//GEN-LAST:event_silActionPerformed

    private void cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
      GirisEkrani geridon=new GirisEkrani();
        geridon.setVisible(true);
    }//GEN-LAST:event_cikisActionPerformed
        public void dinamikAra(String ara){
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        
        
        calisan_tablosu.setRowSorter(tr);
        
        
        tr.setRowFilter(RowFilter.regexFilter(ara));
        
        
    }
    /**
     * @param args the command line arguments
     */
    public void calisanGoruntule(){
        model.setRowCount(0);
         CalisanIslemleri islem1=new CalisanIslemleri(); 
        ArrayList<Calisan> calisanlar = islem1.calisanlariGetir();
        if(calisanlar != null){
            for(Calisan calisan: calisanlar){
                Object[] eklenecek={calisan.getId(),calisan.getAd(),calisan.getSoyad(), calisan.getDepartman()};
                model.addRow(eklenecek);
                
            }
            }
        }
    
  
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
            java.util.logging.Logger.getLogger(CalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CalisanEkrani dialog = new CalisanEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad_alani;
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JTable calisan_tablosu;
    private javax.swing.JButton calisanekle;
    private javax.swing.JButton cikis;
    private javax.swing.JTextField dept_alani;
    private javax.swing.JButton guncelle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JButton sil;
    private javax.swing.JTextField soyad_alani;
    // End of variables declaration//GEN-END:variables

}
        
