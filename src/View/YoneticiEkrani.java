/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Helper.DBConnection;
import Helper.Helper;
import Model.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
public class YoneticiEkrani extends javax.swing.JFrame {

   DBConnection conn=new DBConnection();
   Connection connection=null;
   Statement statement= null;
   ResultSet resultset;
   DefaultTableModel model;
   int a=0;
   String id;
   String mesajKime;
    public YoneticiEkrani() {
        initComponents();
        model=(DefaultTableModel)tblMudurOgretmen.getModel();
        model.setRowCount(0);
        try{
                ArrayList<Ogretmenler> Ogretmenlist=getOgretmenler();
                for(Ogretmenler ogretmen:Ogretmenlist){
                    Object[] row={ogretmen.getIdOgretmen(),ogretmen.getOgretmenAd(),
                        ogretmen.getOgretmenSoyad(),ogretmen.getOgretmenBrans()};
                    model.addRow(row);
                    }
        }
        catch(SQLException exception1){
        }
        populateTable2();

   
           
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMudurOgrenci = new javax.swing.JTable();
        txtEkleOgrenciSoyad = new javax.swing.JTextField();
        txtEkleOgrenciAd = new javax.swing.JTextField();
        txtEkleOgrenciSinif = new javax.swing.JTextField();
        btnEkle = new javax.swing.JButton();
        lblEkleOgrenciNo = new javax.swing.JLabel();
        lblEkleOgrenciAd = new javax.swing.JLabel();
        lblEkleOgrenciSoyad = new javax.swing.JLabel();
        lblEkleOgrenciSinif = new javax.swing.JLabel();
        txtEkleOgrenciNo = new javax.swing.JTextField();
        btnSil = new javax.swing.JButton();
        btnGuncelle = new javax.swing.JButton();
        btnListele = new javax.swing.JButton();
        txtSilinecekid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnArama = new javax.swing.JButton();
        txtAra = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMudurOgretmen = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        areaY = new javax.swing.JTextArea();
        cbmSecY = new javax.swing.JComboBox<>();
        btnGonderY = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtMesajBuyuk = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblMesajYonetici = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yönetici Girişi");

        jPanel1.setBackground(new java.awt.Color(214, 240, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel1.setText("Yönetici Sistemine Hoşgeldiniz");

        jTabbedPane1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 40, 28), 2));

        tblMudurOgrenci.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Öğrenci Id", "Öğrenci No", "Öğrenci Ad", "Öğrenci Soyad", "Öğrenci Sınıf"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMudurOgrenci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMudurOgrenciMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMudurOgrenci);
        if (tblMudurOgrenci.getColumnModel().getColumnCount() > 0) {
            tblMudurOgrenci.getColumnModel().getColumn(0).setResizable(false);
            tblMudurOgrenci.getColumnModel().getColumn(1).setResizable(false);
            tblMudurOgrenci.getColumnModel().getColumn(2).setResizable(false);
            tblMudurOgrenci.getColumnModel().getColumn(3).setResizable(false);
            tblMudurOgrenci.getColumnModel().getColumn(4).setResizable(false);
        }

        txtEkleOgrenciSoyad.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N

        txtEkleOgrenciAd.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N

        txtEkleOgrenciSinif.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N

        btnEkle.setBackground(new java.awt.Color(102, 153, 255));
        btnEkle.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnEkle.setText("Ekle");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });

        lblEkleOgrenciNo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        lblEkleOgrenciNo.setText("Öğrenci No:");

        lblEkleOgrenciAd.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        lblEkleOgrenciAd.setText("Öğrenci Ad:");

        lblEkleOgrenciSoyad.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        lblEkleOgrenciSoyad.setText("Öğrenci Soyad:");

        lblEkleOgrenciSinif.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        lblEkleOgrenciSinif.setText("Öğrenci Sınıf:");

        txtEkleOgrenciNo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N

        btnSil.setBackground(new java.awt.Color(102, 153, 255));
        btnSil.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnSil.setText("Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        btnGuncelle.setBackground(new java.awt.Color(102, 153, 255));
        btnGuncelle.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnGuncelle.setText("Güncelle");
        btnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncelleActionPerformed(evt);
            }
        });

        btnListele.setBackground(new java.awt.Color(102, 153, 255));
        btnListele.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnListele.setText("Listele");
        btnListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListeleActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel2.setText("Silinecek ID");

        btnArama.setBackground(new java.awt.Color(102, 153, 255));
        btnArama.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnArama.setText("Arama");
        btnArama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAramaActionPerformed(evt);
            }
        });

        txtAra.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 11)); // NOI18N
        txtAra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAraKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEkleOgrenciNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEkleOgrenciSoyad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEkleOgrenciNo)
                            .addComponent(txtEkleOgrenciSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEkleOgrenciAd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEkleOgrenciSinif))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEkleOgrenciSinif, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEkleOgrenciAd, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnArama)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnListele, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuncelle)
                            .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSilinecekid, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArama))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnListele)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuncelle)
                        .addGap(18, 18, 18)
                        .addComponent(btnSil)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSilinecekid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEkleOgrenciNo)
                    .addComponent(lblEkleOgrenciAd)
                    .addComponent(txtEkleOgrenciNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEkleOgrenciAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEkleOgrenciSoyad)
                    .addComponent(lblEkleOgrenciSinif)
                    .addComponent(txtEkleOgrenciSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEkleOgrenciSinif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEkle)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Öğrenci İşlemleri", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 40, 28), 2));

        tblMudurOgretmen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Öğretmen Id", "Öğretmen Ad", "Öğretmen Soyad", "Öğretmen Branş"
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
        jScrollPane2.setViewportView(tblMudurOgretmen);
        if (tblMudurOgretmen.getColumnModel().getColumnCount() > 0) {
            tblMudurOgretmen.getColumnModel().getColumn(0).setResizable(false);
            tblMudurOgretmen.getColumnModel().getColumn(1).setResizable(false);
            tblMudurOgretmen.getColumnModel().getColumn(2).setResizable(false);
            tblMudurOgretmen.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Öğretmen İşlemleri", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 40, 28), 2));

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

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("12. Sınıf");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
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
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ders Programı", jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 40, 28), 2));

        areaY.setColumns(20);
        areaY.setRows(5);
        jScrollPane7.setViewportView(areaY);

        cbmSecY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Öğretmenler", "Öğrenciler"}));

        btnGonderY.setBackground(new java.awt.Color(0, 153, 153));
        btnGonderY.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnGonderY.setText("GÖNDER");
        btnGonderY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGonderYActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("Kime:");

        txtMesajBuyuk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jScrollPane8.setViewportView(txtMesajBuyuk);

        tblMesajYonetici.setModel(new javax.swing.table.DefaultTableModel(
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
        tblMesajYonetici.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMesajYoneticiMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tblMesajYonetici);
        if (tblMesajYonetici.getColumnModel().getColumnCount() > 0) {
            tblMesajYonetici.getColumnModel().getColumn(0).setResizable(false);
            tblMesajYonetici.getColumnModel().getColumn(1).setResizable(false);
            tblMesajYonetici.getColumnModel().getColumn(2).setResizable(false);
            tblMesajYonetici.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane7)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(cbmSecY, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGonderY, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnGonderY)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbmSecY, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jTabbedPane1.addTab("Duyurular", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAraKeyReleased

    }//GEN-LAST:event_txtAraKeyReleased

    private void btnAramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAramaActionPerformed
        txtSilinecekid.setText("");
        id=null;
        if(txtAra.getText().length()!=0){
            String arama=txtAra.getText();
            TableRowSorter<DefaultTableModel> tableRowSorter= new TableRowSorter<DefaultTableModel>(model);
            tblMudurOgrenci.setRowSorter(tableRowSorter);
            tableRowSorter.setRowFilter(RowFilter.regexFilter(arama));}
    }//GEN-LAST:event_btnAramaActionPerformed

    private void btnListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListeleActionPerformed
        txtSilinecekid.setText("");
        id=null;
        if(a==0){ populateTable(); a++;}
        String arama="";
        TableRowSorter<DefaultTableModel> tableRowSorter= new TableRowSorter<DefaultTableModel>(model);
        tblMudurOgrenci.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(arama));
    }//GEN-LAST:event_btnListeleActionPerformed

    private void btnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelleActionPerformed
        txtSilinecekid.setText("");
        id=null;
        if(tblMudurOgrenci.getSelectedRow()!=-1){
            model=(DefaultTableModel)tblMudurOgrenci.getModel();
            int selectedRowIndex=tblMudurOgrenci.getSelectedRow();
            int selectOgrncId=Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString());
            int selectOgrncNo=Integer.parseInt(model.getValueAt(selectedRowIndex, 1).toString());
            String selectOgrncAd=model.getValueAt(selectedRowIndex, 2).toString();
            String selectOgrncSoyad=model.getValueAt(selectedRowIndex, 3).toString();
            int selectOgrncSinif=Integer.parseInt(model.getValueAt(selectedRowIndex, 4).toString());

            String newNo=JOptionPane.showInputDialog(null," Yeni öğrenci no giriniz.",selectOgrncNo);
            String newAd=JOptionPane.showInputDialog(null," Yeni öğrenci ad giriniz.",selectOgrncAd);
            String newSoyad=JOptionPane.showInputDialog(null," Yeni öğrenci soyad giriniz.",selectOgrncSoyad);
            String newSinif=JOptionPane.showInputDialog(null," Yeni öğrenci sınıf giriniz.",selectOgrncSinif);
            if(newNo.length()!=0 && newAd.length()!=0 && newSoyad.length()!=0 && newSinif.length()!=0){
                tableChange2(selectOgrncId,Integer.parseInt(newNo),newAd,newSoyad,Integer.parseInt(newSinif));}
            else{
                Helper.showMsg("fill");}}
    }//GEN-LAST:event_btnGuncelleActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed

        PreparedStatement statement=null;
        if(id==null){Helper.showMsg("Lütfen silmek istediğiniz kişiyi seçiniz.");}
        else{
            if(Helper.confirm("sure")){
                try{
                    connection= conn.getConnection();
                    String sql="delete from `öğrenci`WHERE idÖğrenci = ?";
                    statement=connection.prepareStatement(sql);
                    statement.setInt(1,Integer.valueOf(id));
                    int result=statement.executeUpdate();
                    populateTable();
                }catch(SQLException exception){
                    conn.showErrorMessage(exception);}
                finally{
                    try {
                        statement.close();
                        connection.close();
                    } catch (SQLException ex) {
                    }
                }
            }}
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        txtSilinecekid.setText("");
        id=null;
        PreparedStatement statement=null;
        if(txtEkleOgrenciNo.getText().length()==0 ||txtEkleOgrenciAd.getText().length()==0
            ||txtEkleOgrenciSoyad.getText().length()==0  || txtEkleOgrenciSinif.getText().length()==0 ){
            Helper.showMsg("fill"); }
        else{try{
            connection= conn.getConnection();
            String sql="insert into `öğrenci`(ÖğrenciNo,ÖğrenciAd,ÖğrenciSoyad,ÖğrenciSınıf) values(?,?,?,?);";
            statement=connection.prepareStatement(sql);
            statement.setInt(1,Integer.valueOf(txtEkleOgrenciNo.getText()));
            statement.setString(2,txtEkleOgrenciAd.getText());
            statement.setString(3,txtEkleOgrenciSoyad.getText());
            statement.setInt(4,Integer.valueOf(txtEkleOgrenciSinif.getText()));
            int result=statement.executeUpdate();
            populateTable();
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
    }//GEN-LAST:event_btnEkleActionPerformed

    private void tblMudurOgrenciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMudurOgrenciMouseClicked
        tblMudurOgrenci.getSelectionModel().addListSelectionListener(tblMudurOgrenci);
        id=tblMudurOgrenci.getValueAt(tblMudurOgrenci.getSelectedRow(), 0).toString();
        txtSilinecekid.setText(id);
    }//GEN-LAST:event_tblMudurOgrenciMouseClicked

    private void btnGonderYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGonderYActionPerformed
       mesajKime = (String) cbmSecY.getSelectedItem(); 
       PreparedStatement statement=null;
        if(areaY.getText().length()==0 ||mesajKime.length()==0){
            Helper.showMsg("fill"); }
        else{try{
            
            connection= conn.getConnection();
            String sql="insert into `duyuru`(kime,kimden,mesaj) values(?,?,?);";
            statement=connection.prepareStatement(sql);
            statement.setString(1,mesajKime);
            statement.setString(2,"Yönetici");
            statement.setString(3,areaY.getText());
            int result=statement.executeUpdate();
            populateTable2();
            
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
    }//GEN-LAST:event_btnGonderYActionPerformed

    private void tblMesajYoneticiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMesajYoneticiMouseClicked
        txtMesajBuyuk.setText("");
        tblMesajYonetici.getSelectionModel().addListSelectionListener(tblMesajYonetici);
        String mesaj=tblMesajYonetici.getValueAt(tblMesajYonetici.getSelectedRow(), 3).toString();
        txtMesajBuyuk.setText(mesaj);
    }//GEN-LAST:event_tblMesajYoneticiMouseClicked
  
    public ArrayList<Ogrenciler> getOgrenciler() throws SQLException {
       ArrayList<Ogrenciler> Ogrencilist=new ArrayList<>();
       try{
        connection= conn.getConnection();
        statement= connection.createStatement();
        resultset= statement.executeQuery("SELECT * FROM ogrenci_kaydi.`öğrenci`"); 
        while(resultset.next()){
            Ogrencilist.add(new Ogrenciler( resultset.getInt("idÖğrenci"),
                    resultset.getInt("ÖğrenciNo"),
                    resultset.getString("ÖğrenciAd"),
                    resultset.getString("ÖğrenciSoyad"),
                    resultset.getInt("ÖğrenciSınıf")));
            }}
       catch(SQLException exception){           
        conn.showErrorMessage(exception);}
       finally{
       connection.close();
       statement.close();
       resultset.close();}
       return Ogrencilist;
}
    
    public ArrayList<Ogretmenler> getOgretmenler() throws SQLException {
       ArrayList<Ogretmenler> Ogretmenlist=new ArrayList<>();
       try{
        connection= conn.getConnection();
        statement= connection.createStatement();
        resultset= statement.executeQuery("SELECT * FROM ogrenci_kaydi.öğretmen"); 
        while(resultset.next()){
            Ogretmenlist.add(new Ogretmenler( resultset.getInt("idÖğretmen"),
                    resultset.getString("ÖğretmenAd"),
                    resultset.getString("ÖğretmenSoyad"),
                    resultset.getString("ÖğretmenBranş")));
            }}
       catch(SQLException exception){           
        conn.showErrorMessage(exception);}
       finally{
       connection.close();
       statement.close();
       resultset.close();}
       return Ogretmenlist;
}
       public ArrayList<Duyuru> getDuyuru() throws SQLException {
       ArrayList<Duyuru> Duyurulist=new ArrayList<>();
       try{
        connection= conn.getConnection();
        statement= connection.createStatement();
        resultset= statement.executeQuery("SELECT * FROM ogrenci_kaydi.duyuru;"); 
        while(resultset.next()){
            if(resultset.getString("kime").equals("Yönetici")||resultset.getString("kimden").equals("Yönetici")){
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
        model=(DefaultTableModel)tblMudurOgrenci.getModel();
        model.setRowCount(0);
        try{
                ArrayList<Ogrenciler> Ogrencilist=getOgrenciler();
                for(Ogrenciler ogrenci:Ogrencilist){
                    Object[] row={ogrenci.getIdOgrenci(),ogrenci.getOgrenciNo(),
                        ogrenci.getOgrenciAd(),ogrenci.getOgrenciSoyad(),ogrenci.getOgrenciSinif()};
                    model.addRow(row);
                    }
        }
        catch(SQLException exception1){
        }
    }
    public void populateTable2(){
         model=(DefaultTableModel)tblMesajYonetici.getModel();
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
    public void tableChange2(int id,int no,String ad,String soyad,int sinif){
        PreparedStatement statement=null;
        try{
       connection= conn.getConnection();
       String sql="UPDATE `öğrenci` SET `ÖğrenciNo` = ?,`ÖğrenciAd` = ?, `ÖğrenciSoyad` = ?, `ÖğrenciSınıf` = ? WHERE idÖğrenci = ?";
       statement=connection.prepareStatement(sql);
       statement.setInt(1, no);
       statement.setString(2, ad);
       statement.setString(3, soyad);
       statement.setInt(4, sinif);
       statement.setInt(5, id);
       int result=statement.executeUpdate();
       populateTable(); 
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
            java.util.logging.Logger.getLogger(YoneticiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YoneticiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YoneticiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YoneticiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YoneticiEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaY;
    private javax.swing.JButton btnArama;
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnGonderY;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JButton btnListele;
    private javax.swing.JButton btnSil;
    private javax.swing.JComboBox<String> cbmSecY;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel lblEkleOgrenciAd;
    private javax.swing.JLabel lblEkleOgrenciNo;
    private javax.swing.JLabel lblEkleOgrenciSinif;
    private javax.swing.JLabel lblEkleOgrenciSoyad;
    private javax.swing.JTable tblMesajYonetici;
    private javax.swing.JTable tblMudurOgrenci;
    private javax.swing.JTable tblMudurOgretmen;
    private javax.swing.JTextField txtAra;
    private javax.swing.JTextField txtEkleOgrenciAd;
    private javax.swing.JTextField txtEkleOgrenciNo;
    private javax.swing.JTextField txtEkleOgrenciSinif;
    private javax.swing.JTextField txtEkleOgrenciSoyad;
    private javax.swing.JTextPane txtMesajBuyuk;
    private javax.swing.JTextField txtSilinecekid;
    // End of variables declaration//GEN-END:variables
}
