/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import static Main.ConnectionSQL.getConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akamine
 */
public class BangLuongNgoaiGioChiTietFrame extends javax.swing.JFrame {
    public BangLuongNgoaiGioChiTietFrame() {
        initComponents();
        jtfLuongNgoaiGioTheoTiet.setEditable(false);
        jtfTongLuongNgoaiGio.setEditable(false);
        this.setLocationRelativeTo(null);
        setTitle("Thông Tin Cán Bộ Giáo Viên Trường X - Nhóm 2");
        showDataBangLuongNgoaiGioChiTiet(ConnectionSQL.findAllBangLuongNgoaiGioChiTiet());
    }
    
    
    
    
    
    private void showDataBangLuongNgoaiGioChiTiet(List<BangLuongNgoaiGioChiTiet>bangluongngoaigiochitietList){
    List<BangLuongNgoaiGioChiTiet>listBangLuongNgoaiGioChiTiet = new ArrayList<>();
    listBangLuongNgoaiGioChiTiet=bangluongngoaigiochitietList;
    DefaultTableModel tableModel;
    jTable1.getModel();
    tableModel=(DefaultTableModel)jTable1.getModel();
    tableModel.setRowCount(0);
    listBangLuongNgoaiGioChiTiet.forEach((bangluongngoaigiochitiet) -> {
        tableModel.addRow(new Object[]{
            bangluongngoaigiochitiet.getMaBLNG(), bangluongngoaigiochitiet.getMaCB(),bangluongngoaigiochitiet.getSoTietNgoaiGio(), (int) bangluongngoaigiochitiet.getLuongNgoaiGioTheoTiet(),(int)  bangluongngoaigiochitiet.getTongLuongNgoaiGio()
    });
    });
            jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(jTable1.getSelectedRow() >= 0){
                    jtfMaBLNG.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "");
                    jtfMaCB.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1) + "");
                    jtfSoTietNgoaiGio.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2) + "");
                    jtfLuongNgoaiGioTheoTiet.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3) + "");
                    jtfTongLuongNgoaiGio.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4) + "");
                }
            }
        });
}
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfMaBLNG = new javax.swing.JTextField();
        jtfMaCB = new javax.swing.JTextField();
        jtfSoTietNgoaiGio = new javax.swing.JTextField();
        jtfLuongNgoaiGioTheoTiet = new javax.swing.JTextField();
        jtfTongLuongNgoaiGio = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edu.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 27)); // NOI18N
        jLabel2.setText("Bảng lương ngoài giờ chi tiết trường THCS X");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setText("Mã BLNG: ");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel4.setText("Mã CB:");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel5.setText("Số tiết ngoài giờ:");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel6.setText("Lương ngoài giờ/tiết: ");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel7.setText("Tổng lương ngoài giờ: ");

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDelete.setText("Xoá");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnRefresh.setText("Làm mới");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        jLabel8.setText(" [Hệ số lương  x Lương cơ sở]/72 x 150%");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnAdd)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnDelete)
                                .addGap(18, 18, 18)
                                .addComponent(btnRefresh)
                                .addGap(28, 28, 28)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearch)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfMaBLNG)
                                    .addComponent(jtfMaCB)
                                    .addComponent(jtfSoTietNgoaiGio)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfLuongNgoaiGioTheoTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfTongLuongNgoaiGio)))
                        .addContainerGap(23, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jtfMaBLNG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfMaCB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfSoTietNgoaiGio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jtfLuongNgoaiGioTheoTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfTongLuongNgoaiGio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã BLNG", "Mã cán bộ", "Số tiết ngoài giờ", "Lương ngoài giờ/tiết", "Tổng lương ngoài giờ"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        BangLuongNgoaiGioChiTiet st;
        st = new BangLuongNgoaiGioChiTiet() {
        };
        st.setMaBLNG(Integer.parseInt(jtfMaBLNG.getText()));
        st.setMaCB(Integer.parseInt(jtfMaCB.getText()));
        ConnectionSQL.DeleteBangLuongNgoaiGioChiTiet(st);
        JOptionPane.showMessageDialog(null, "Xóa Dữ Liệu Thành Công");

        showDataBangLuongNgoaiGioChiTiet(ConnectionSQL.findAllBangLuongNgoaiGioChiTiet());
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(jtfMaBLNG.getText().equals("") || jtfMaCB.getText().equals("") || jtfSoTietNgoaiGio.getText().equals("")){
               JOptionPane.showMessageDialog(this, "Hãy Nhập Đầy Đủ Dữ Liệu");              
           } else{
        BangLuongNgoaiGioChiTiet st = new BangLuongNgoaiGioChiTiet() {
        };
     st.setMaBLNG(Integer.parseInt(jtfMaBLNG.getText()));
     st.setMaCB(Integer.parseInt(jtfMaCB.getText()));
     st.setSoTietNgoaiGio(Integer.parseInt(jtfSoTietNgoaiGio.getText()));
     ConnectionSQL.UpdateBangLuongNgoaiGioChiTiet(st);
        JOptionPane.showMessageDialog(null, "Cập Nhật Thành Công");
        showDataBangLuongNgoaiGioChiTiet(ConnectionSQL.findAllBangLuongNgoaiGioChiTiet());}
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        BangLuongNgoaiGioChiTiet st = new BangLuongNgoaiGioChiTiet() {
        };
        if(jtfMaBLNG.equals("")) st.setMaBLNG(0);
        else{
        st.setMaBLNG(Integer.parseInt(jtfMaBLNG.getText()));
        }
        if(jtfMaCB.equals("")) st.setMaCB(0);
        else{
        st.setMaCB(Integer.parseInt(jtfMaCB.getText()));
        }
        showDataBangLuongNgoaiGioChiTiet(ConnectionSQL.SearchBangLuongNgoaiGioChiTiet(st));
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        jtfMaBLNG.setText("");
        jtfMaCB.setText("");
        jtfSoTietNgoaiGio.setText("");
        jtfLuongNgoaiGioTheoTiet.setText("");
        jtfTongLuongNgoaiGio.setText("");
        showDataBangLuongNgoaiGioChiTiet(ConnectionSQL.findAllBangLuongNgoaiGioChiTiet());
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if( jtfMaBLNG.getText().equals("") || jtfMaCB.getText().equals("") || jtfSoTietNgoaiGio.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Hãy Nhập Đầy Đủ Dữ Liệu");
        } else{
            BangLuongNgoaiGioChiTiet st = new BangLuongNgoaiGioChiTiet() {
            };
            st.setMaBLNG(Integer.parseInt(jtfMaBLNG.getText()));
            st.setMaCB(Integer.parseInt(jtfMaCB.getText()));
            st.setSoTietNgoaiGio(Integer.parseInt(jtfSoTietNgoaiGio.getText()));

            double luongCoSo = 0.0;
            String query = "SELECT MaBLNG, LuongToiThieu FROM bangluongngoaigio";
            Map<Integer,Integer> map = new TreeMap<>();

            try{
                Connection conn =getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next()){
                    map.put(rs.getInt("MaBLNG"), rs.getInt("LuongToiThieu"));
                }
                Set<Map.Entry<Integer,Integer>> set = map.entrySet();
                for(Map.Entry<Integer,Integer> entry : set){
                    if(entry.getKey() == Integer.parseInt(jtfMaBLNG.getText()))
                    {
                        luongCoSo = entry.getValue();
                        System.out.println(luongCoSo);
                    }

                }
                if(luongCoSo == 0) {
                    JOptionPane.showMessageDialog(this, "Lương cơ bản trên mã bảng lương chưa được cập nhật!!!!");
                    return;
                }
            }catch (Exception e){
            }

            String query1 = "SELECT quatrinhluong.HeSo FROM quatrinhluong WHERE quatrinhluong.MaCB = '"+Integer.parseInt(jtfMaCB.getText())+"'";
            float HeSo = 0;
            try{
                Connection conn =getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query1);
                while(rs.next()){
                    HeSo = rs.getFloat("HeSo");
                    System.out.println("He so: "+HeSo);
                }
            }catch (Exception e){
            }

            st.setLuongNgoaiGioTheoTiet(HeSo*luongCoSo /72 *1.5);
            st.setTongLuongNgoaiGio(st.getSoTietNgoaiGio() * st.getLuongNgoaiGioTheoTiet());
            ConnectionSQL.InsertBangLuongNgoaiGioChiTiet(st);
            JOptionPane.showMessageDialog(null, "Thêm Mới Thành Công");
            showDataBangLuongNgoaiGioChiTiet(ConnectionSQL.findAllBangLuongNgoaiGioChiTiet());}
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(BangLuongNgoaiGioChiTietFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BangLuongNgoaiGioChiTietFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BangLuongNgoaiGioChiTietFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BangLuongNgoaiGioChiTietFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BangLuongNgoaiGioChiTietFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtfLuongNgoaiGioTheoTiet;
    private javax.swing.JTextField jtfMaBLNG;
    private javax.swing.JTextField jtfMaCB;
    private javax.swing.JTextField jtfSoTietNgoaiGio;
    private javax.swing.JTextField jtfTongLuongNgoaiGio;
    // End of variables declaration//GEN-END:variables
}
