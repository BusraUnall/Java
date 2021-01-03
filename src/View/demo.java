package View;

import Helper.*;
import Model.*;
import java.sql.*;
import Helper.DBConnection;
public class demo extends javax.swing.JFrame {
 private DBConnection Dbconnection=new DBConnection();
 
  DBConnection conn=new DBConnection();
  Connection connection=null;

    public demo() {
       
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbllogin1 = new javax.swing.JTabbedPane();
        lblYoneticiLogIn = new javax.swing.JPanel();
        btnGirisYonetici = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SfrYoneticiAd = new javax.swing.JPasswordField();
        SfrYoneticisfr = new javax.swing.JPasswordField();
        lblOgrenciLogIn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnKayitOgrenci = new javax.swing.JButton();
        btnGirisOgrenci = new javax.swing.JButton();
        SfrOgrenciAd = new javax.swing.JPasswordField();
        SfrOgrenciSfr = new javax.swing.JPasswordField();
        SfrOgrenciNo = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("E-okul");
        setName("jframe1"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(248, 240, 233));
        jPanel2.setForeground(new java.awt.Color(51, 51, 0));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("E-okul Bilgilendirme Sistemine Hoşgeldiniz");

        lbllogin1.setBackground(new java.awt.Color(255, 255, 255));

        lblYoneticiLogIn.setBackground(new java.awt.Color(255, 255, 255));

        btnGirisYonetici.setBackground(new java.awt.Color(102, 153, 255));
        btnGirisYonetici.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        btnGirisYonetici.setText("Giriş Yap");
        btnGirisYonetici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirisYoneticiActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Şifre:");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Kullanıcı Adı:");

        javax.swing.GroupLayout lblYoneticiLogInLayout = new javax.swing.GroupLayout(lblYoneticiLogIn);
        lblYoneticiLogIn.setLayout(lblYoneticiLogInLayout);
        lblYoneticiLogInLayout.setHorizontalGroup(
            lblYoneticiLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblYoneticiLogInLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblYoneticiLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGirisYonetici, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(lblYoneticiLogInLayout.createSequentialGroup()
                        .addGroup(lblYoneticiLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lblYoneticiLogInLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SfrYoneticiAd, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(lblYoneticiLogInLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SfrYoneticisfr, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 82, Short.MAX_VALUE)))
                .addContainerGap())
        );
        lblYoneticiLogInLayout.setVerticalGroup(
            lblYoneticiLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblYoneticiLogInLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblYoneticiLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(SfrYoneticiAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblYoneticiLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SfrYoneticisfr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btnGirisYonetici, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lbllogin1.addTab("Yönetici Girişi", lblYoneticiLogIn);

        lblOgrenciLogIn.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Şifre:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Kullanıcı Adı:");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Öğrenci Okul No:");

        btnKayitOgrenci.setBackground(new java.awt.Color(255, 102, 102));
        btnKayitOgrenci.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        btnKayitOgrenci.setText("Kayıt Ol");
        btnKayitOgrenci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKayitOgrenciActionPerformed(evt);
            }
        });

        btnGirisOgrenci.setBackground(new java.awt.Color(102, 153, 255));
        btnGirisOgrenci.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        btnGirisOgrenci.setText("Giriş Yap");
        btnGirisOgrenci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirisOgrenciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lblOgrenciLogInLayout = new javax.swing.GroupLayout(lblOgrenciLogIn);
        lblOgrenciLogIn.setLayout(lblOgrenciLogInLayout);
        lblOgrenciLogInLayout.setHorizontalGroup(
            lblOgrenciLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblOgrenciLogInLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblOgrenciLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGirisOgrenci, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(lblOgrenciLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblOgrenciLogInLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(btnKayitOgrenci, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(lblOgrenciLogInLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(lblOgrenciLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SfrOgrenciSfr, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SfrOgrenciAd, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SfrOgrenciNo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        lblOgrenciLogInLayout.setVerticalGroup(
            lblOgrenciLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblOgrenciLogInLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblOgrenciLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(SfrOgrenciAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblOgrenciLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SfrOgrenciSfr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(lblOgrenciLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(SfrOgrenciNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(lblOgrenciLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGirisOgrenci, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(btnKayitOgrenci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lbllogin1.addTab("Öğrenci Girişi", lblOgrenciLogIn);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Eokul.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbllogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jLabel6)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbllogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGirisYoneticiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirisYoneticiActionPerformed
                                                       
        if(SfrYoneticiAd.getText().length()==0 ||SfrYoneticisfr.getText().length()==0){
         Helper.showMsg("fill"); }
        else{
        Connection connection=null;
        Statement statement= null;
        ResultSet resultset;
        try{
        connection= Dbconnection.getConnection();
        statement= connection.createStatement();
        resultset= statement.executeQuery("SELECT * FROM ogrenci_kaydi.mkaydi;"); 
        
        while(resultset.next()){
        if(SfrYoneticiAd.getText().equals(resultset.getString("MKullanıcıAd"))&&
                SfrYoneticisfr.getText().equals(resultset.getString("MŞifre"))){
            MudurVeMudurYardimcisiGirisi ygrs = new MudurVeMudurYardimcisiGirisi();
            ygrs.setId(resultset.getInt("idMKaydi"));
            ygrs.setKullaniciAd(resultset.getString("MKullanıcıAd"));
            ygrs.setKullaniciSifre(resultset.getString("MŞifre")); 
            YoneticiEkrani YEkran= new YoneticiEkrani();
            YEkran.setVisible(true);
            dispose();}}
        resultset=statement.executeQuery("SELECT * FROM ogrenci_kaydi.ökaydi;");
        while(resultset.next()){
        if(SfrYoneticiAd.getText().equals(resultset.getString("ÖKullanıcıAd"))&&
                SfrYoneticisfr.getText().equals(resultset.getString("ÖŞifre"))){
            YoneticiGiris ygrs2=new OgretmenGiris();
            ygrs2.setId(resultset.getInt("idÖKaydi"));
            ygrs2.setKullaniciAd(resultset.getString("ÖKullanıcıAd"));
            ygrs2.setKullaniciSifre(resultset.getString("ÖŞifre")); 
            OgretmenEkrani OEkran= new OgretmenEkrani();
            OEkran.setVisible(true);
            dispose(); }}
 
    }
        catch(SQLException exception){
        Dbconnection.showErrorMessage(exception);}
        
    }    
        
    }//GEN-LAST:event_btnGirisYoneticiActionPerformed

    private void btnGirisOgrenciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirisOgrenciActionPerformed

         if(SfrOgrenciAd.getText().length()==0 ||SfrOgrenciSfr.getText().length()==0 || SfrOgrenciNo.getText().length()==0){
         Helper.showMsg("fill"); }
        else{
        Connection connection=null;
        Statement statement= null;
        ResultSet resultset;
        try{
        connection= Dbconnection.getConnection();
        statement= connection.createStatement();
        resultset=statement.executeQuery("SELECT * FROM ogrenci_kaydi.`öğrenci kayıt`;");
        while(resultset.next()){
        if(SfrOgrenciAd.getText().equals(resultset.getString("ÖğrenciKullanıcıAd"))&&
                SfrOgrenciSfr.getText().equals(resultset.getString("ÖğrenciŞifre"))&&
                SfrOgrenciNo.getText().equals(resultset.getString("ÖğrenciNo"))){
            String no=SfrOgrenciNo.getText();
            OgrenciGiris oGiris=new OgrenciGiris();
            oGiris.setId(resultset.getInt("idÖğrenciKayıt"));
            oGiris.setKullaniciAd(resultset.getString("ÖğrenciKullanıcıAd"));
            oGiris.setKullaniciSifre(resultset.getString("ÖğrenciŞifre")); 
            oGiris.setOgrenciNo(resultset.getString("ÖğrenciNo"));
            new OgrenciEkrani(no).setVisible(true);
            dispose(); }}
    }
        catch(SQLException exception){
        Dbconnection.showErrorMessage(exception);}
        
    }    
    }//GEN-LAST:event_btnGirisOgrenciActionPerformed

    private void btnKayitOgrenciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKayitOgrenciActionPerformed
         PreparedStatement statement=null;
        if(SfrOgrenciAd.getText().length()==0 ||SfrOgrenciSfr.getText().length()==0
            ||SfrOgrenciNo.getText().length()==0){
            Helper.showMsg("fill"); }
        else{try{
            connection= conn.getConnection();
            String sql="insert into `öğrenci kayıt`(ÖğrenciKullanıcıAd,ÖğrenciŞifre,ÖğrenciNo) values(?,?,?);";
            statement=connection.prepareStatement(sql);
            statement.setString(1,(SfrOgrenciAd.getText()));
            statement.setString(2,SfrOgrenciSfr.getText());
            statement.setString(3,SfrOgrenciNo.getText());
            int result=statement.executeUpdate();
            Helper.showMsg("Kaydınız gerçekleşmiştir.");
        }catch(SQLException exception){
            conn.showErrorMessage(exception);}
        finally{
            try {
                statement.close();
                connection.close();
            } catch (SQLException ex) {

            }
        }
        }
    }//GEN-LAST:event_btnKayitOgrenciActionPerformed
    
   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(() -> {
            new demo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField SfrOgrenciAd;
    public javax.swing.JPasswordField SfrOgrenciNo;
    private javax.swing.JPasswordField SfrOgrenciSfr;
    public javax.swing.JPasswordField SfrYoneticiAd;
    private javax.swing.JPasswordField SfrYoneticisfr;
    private javax.swing.JButton btnGirisOgrenci;
    private javax.swing.JButton btnGirisYonetici;
    private javax.swing.JButton btnKayitOgrenci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel lblOgrenciLogIn;
    private javax.swing.JPanel lblYoneticiLogIn;
    private javax.swing.JTabbedPane lbllogin1;
    // End of variables declaration//GEN-END:variables
}
