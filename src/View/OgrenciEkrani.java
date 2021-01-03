/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Helper.DBConnection;
import Model.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;



public class OgrenciEkrani extends javax.swing.JFrame {
   DBConnection conn=new DBConnection();
   Connection connection=null;
   Statement statement= null;
   ResultSet resultset;
   DefaultTableModel model;
    Ortalama ort=new Ortalama();
   
    public OgrenciEkrani() {
        initComponents();
    }

    public OgrenciEkrani(String gelenV) {
        initComponents();
        notlar(gelenV);
        populateTable();
        yilSonuOrt(gelenV);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOgrenciNot = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblYilSonuOrt = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtMesajBuyuk = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblMesajOgrenci = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Öğrenci Girişi");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel1.setText("Öğrenci Sistemine Hoşgeldiniz");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 40, 28), 2));

        tblOgrenciNot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Not Id", "Öğrenci No", "Ders Adı", "Not-1", "Not-2", "Ödev", "Ortalama"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOgrenciNot);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel2.setText("Yıl Sonu Ortalaması:");

        lblYilSonuOrt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(lblYilSonuOrt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYilSonuOrt))
                .addGap(24, 24, 24))
        );

        jTabbedPane2.addTab("Notlar", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 40, 28), 2));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("10. Sınıf");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"08.00-08.30", "Fizik", "Türkçe", "Kimya", "Tarih", "Matematik"},
                {"08.40-09.10", "Fizik", "Türkçe", "Kimya", "Matematik", "Matematik"},
                {"09.20-09.50", "Fizik", "Türkçe", "Coğrafya", "Matematik", "İngilizce"},
                {"10.00-10.30", "Tarih", "Türkçe", "Coğrafya", "Türkçe", "İngilizce"},
                {"10.40-11.10", "Tarih", "Beden Eğitimi", "Biyoloji", "Türkçe", "Tarih"},
                {"11.20-11.50", "Matematik", "Beden Eğitimi", "Biyoloji", "İngilizce", "Din Kültürü"},
                {"12.00-12.30", "Matematik", "Müzik", "Biyoloji", "İngilizce", "Din Kültürü"}
            },
            new String [] {
                "Saat", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable3);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("11. Sınıf");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"08.00-08.30", "Kimya", "İngilizce", "Türkçe", "Biyoloji", "Biyoloji"},
                {"08.40-09.10", "Kimya", "İngilizce", "Türkçe", "Biyoloji", "Türkçe"},
                {"09.20-09.50", "Türkçe", "Müzik", "Matematik", "Matematik", "Türkçe"},
                {"10.00-10.30", "Türkçe", "Tarih", "Matematik", "Fizik", "Din Kültürü"},
                {"10.40-11.10", "Matematik", "Tarih", "Coğrafya", "Fizik", "Beden Eğitimi"},
                {"11.20-11.50", "Matematik", "Tarih", "Coğrafya", "Kimya", "Beden Eğitimi"},
                {"12.00-12.30", "Matematik", "Fizik", "İngilizce", "Din Kültürü", "İngilizce"}
            },
            new String [] {
                "Saat", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable4);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"08.00-08.30", "Matematik", "Fizik", "Türkçe", "İngilizce", "Kimya"},
                {"08.40-09.10", "Matematik", "Fizik", "Türkçe", "İngilizce", "Türkçe"},
                {"09.20-09.50", "Tarih", "Türkçe", "Matematik", "Coğrafya", "Türkçe"},
                {"10.00-10.30", "Tarih", "Türkçe", "Matematik", "Coğrafya", "Biyoloji"},
                {"10.40-11.10", "Müzik", "Kimya", "Din Kültürü", "Metematik", "İngilizce"},
                {"11.20-11.50", "Beden Eğitimi", "Kimya", "Biyoloji", "Matematik", "İngilizce"},
                {"12.00-12.30", "Beden Eğitimi", "Din Kültürü", "Biyoloji", "Fizik", "Tarih"}
            },
            new String [] {
                "Saat", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("12. Sınıf");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("9. Sınıf");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"08.00-08.30", "Türkçe", "Kimya ", "Matematik", "Beden Eğitimi", "Matematik"},
                {"08.40-09.10", "Türkçe", "Biyoloji", "Matematik", "Beden Eğitimi", "Matematik"},
                {"09.20-09.50", "İngilizce", "Fizik", "Matematik", "İngilizce", "Türkçe"},
                {"10.00-10.30", "İngilizce", "Fizik", "Matematik", "İngilizce", "Türkçe"},
                {"10.40-11.10", "Coğrafya", "Türkçe", "Biyoloji", "Türkçe ", "Kimya"},
                {"11.20-11.50", "Coğrafya", "Türkçe", "Biyoloji", "Türkçe", "Kimya"},
                {"12.00-12.30", "Müzik", "Tarih", "Din Kültürü", "Din Kültürü", "Fizik"}
            },
            new String [] {
                "Saat", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Ders Programı", jPanel3);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 40, 28), 2));

        txtMesajBuyuk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jScrollPane8.setViewportView(txtMesajBuyuk);

        tblMesajOgrenci.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id mesaj", "Kime", "Kimden", "Mesaj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMesajOgrenci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMesajOgrenciMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tblMesajOgrenci);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jTabbedPane2.addTab("Duyurular", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
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

    private void tblMesajOgrenciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMesajOgrenciMouseClicked
        txtMesajBuyuk.setText("");
        tblMesajOgrenci.getSelectionModel().addListSelectionListener(tblMesajOgrenci);
        String mesaj=tblMesajOgrenci.getValueAt(tblMesajOgrenci.getSelectedRow(), 3).toString();
        txtMesajBuyuk.setText(mesaj);
    }//GEN-LAST:event_tblMesajOgrenciMouseClicked
    
    public void yilSonuOrt(String a){
        try{
        ArrayList<Notlar> Notlist=getNotlar();
        ArrayList<Double> Ort=new ArrayList<>();
           for(Notlar not:Notlist){  
              if(not.getOgrenciNo().equals(a)){             
                   Ort.add(not.getOrtalama());
                    }}
         double yilSOrt=ort.yilSonuOrtalama(Ort);
         lblYilSonuOrt.setText(String.valueOf(yilSOrt));
        }
        catch(SQLException exception1){
        }
        
    }
   
       public void notlar(String a){
        model=(DefaultTableModel)tblOgrenciNot.getModel();
        model.setRowCount(0);
        try{
                ArrayList<Notlar> Notlist=getNotlar();
                for(Notlar not:Notlist){  
                    if(not.getOgrenciNo().equals(a)){
                    Object[] row={not.getIdNot(),not.getOgrenciNo(),not.getDersAdi()
                            ,not.getNot1(),not.getNot2(),not.getOdev(),not.getOrtalama()};
                    model.addRow(row);
                    }}
        }
        catch(SQLException exception1){
        }
    }
       public ArrayList<Notlar> getNotlar() throws SQLException {
       ArrayList<Notlar> Notlist=new ArrayList<>();
       try{
        connection= conn.getConnection();
        statement= connection.createStatement();
        resultset= statement.executeQuery("SELECT * FROM ogrenci_kaydi.not;"); 
        while(resultset.next()){
      
            Notlist.add(new Notlar( resultset.getInt("idnot"),
                    resultset.getString("ÖğrenciNo"),
                    resultset.getString("DersAdı"),
                    resultset.getInt("ÖğrenciNot1"),
                    resultset.getInt("ÖğrenciNot2"),
                    resultset.getInt("ÖğrenciÖdev"),
                    resultset.getDouble("ÖğrenciOrt")));}}
            
       catch(SQLException exception){           
        conn.showErrorMessage(exception);}
       finally{
       connection.close();
       statement.close();
       resultset.close();}
       return Notlist;
}
       
       public ArrayList<Duyuru> getDuyuru() throws SQLException {
       ArrayList<Duyuru> Duyurulist=new ArrayList<>();
       try{
        connection= conn.getConnection();
        statement= connection.createStatement();
        resultset= statement.executeQuery("SELECT * FROM ogrenci_kaydi.duyuru;"); 
        while(resultset.next()){
            if(resultset.getString("kime").equals("Öğrenciler")){
            Duyurulist.add(new Duyuru( resultset.getInt("idduyuru"),
                    resultset.getString("kime"),
                    resultset.getString("kimden"),
                    resultset.getString("mesaj")));}
            }}
       catch(SQLException exception){           
        conn.showErrorMessage(exception);}
       finally{
       connection.close();
       statement.close();
       resultset.close();}
       return Duyurulist;
}
       
        public void populateTable(){
        model=(DefaultTableModel)tblMesajOgrenci.getModel();
        model.setRowCount(0);
        try{
                ArrayList<Duyuru> Duyurulist=getDuyuru();
                for(Duyuru duyuru:Duyurulist){
                    Object[] row={duyuru.getIdDuyuru(),duyuru.getKime(),
                        duyuru.getKimden(),duyuru.getMesaj()};
                    model.addRow(row);
                    }
        }
        catch(SQLException exception1){
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
            java.util.logging.Logger.getLogger(OgrenciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OgrenciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OgrenciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OgrenciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OgrenciEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel lblYilSonuOrt;
    private javax.swing.JTable tblMesajOgrenci;
    private javax.swing.JTable tblOgrenciNot;
    private javax.swing.JTextPane txtMesajBuyuk;
    // End of variables declaration//GEN-END:variables
}
