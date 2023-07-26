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
import java.util.Map.Entry;
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
public class BangLuongChiTietFrame extends javax.swing.JFrame {

    public BangLuongChiTietFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Thông Tin Cán Bộ Giáo Viên Trường X");
        showDataBangLuongChiTiet(ConnectionSQL.findAllBangLuongChiTiet());
    }

    
    
    private void showDataBangLuongChiTiet(List<BangLuongChiTiet>bangluongchitietList){
    List<BangLuongChiTiet>listBangLuongChiTiet = new ArrayList<>();
    listBangLuongChiTiet=bangluongchitietList;
    DefaultTableModel tableModel;
    jTable1.getModel();
    tableModel=(DefaultTableModel)jTable1.getModel();
    tableModel.setRowCount(0);
    listBangLuongChiTiet.forEach((bangluongchitiet) -> {
        tableModel.addRow(new Object[]{
            bangluongchitiet.getMaBangLuong(), bangluongchitiet.getMaCB(), bangluongchitiet.getThang(), bangluongchitiet.getNam() ,(int) bangluongchitiet.getLuongCung(),(int) bangluongchitiet.getPhuCapThamNien(),(int) bangluongchitiet.getPhuCapChucVu(),(int) bangluongchitiet.getTongLuong(), 
    });
    });
            jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(jTable1.getSelectedRow() >= 0){
                    jlbMaBangLuongApDung.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "");
                    jtfMaCB.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1) + "");
                    jtfThang.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2)+"");
                    jtfNam.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3)+"");
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
        jtfMaCB = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfThang = new javax.swing.JTextField();
        jtfNam = new javax.swing.JTextField();
        jlbMaBangLuongApDung = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlbThoiGianApDung = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlbLuongCoSoApDung = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edu.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 26)); // NOI18N
        jLabel2.setText(" Thông tin bảng lương chi tiết của các cán bộ trường THCS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addContainerGap(425, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setText("Mã bảng lương được áp dụng: ");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel4.setText("Mã cán bộ: ");

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

        jLabel5.setText("Tháng:");

        jLabel7.setText("Năm:");

        jtfThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfThangActionPerformed(evt);
            }
        });

        jtfNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNamActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel6.setText("Được áp dụng trong thời gian:");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel8.setText("Mức lương cơ sở áp dụng: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbThoiGianApDung, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jlbMaBangLuongApDung, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfThang, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfMaCB, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(jtfNam)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbLuongCoSoApDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtfMaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbMaBangLuongApDung, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbThoiGianApDung, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbLuongCoSoApDung, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnRefresh)
                    .addComponent(btnExit))
                .addContainerGap())
        );

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                " Mã bảng lương", " Mã cán bộ", "Tháng", "Năm", "Lương cứng", "Phụ cấp thâm niên", "Phụ cấp chức vụ", "Tổng lương"
            }
        ));
        jTable1.setEditingColumn(0);
        jTable1.setEditingRow(0);
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        BangLuongChiTiet st = new BangLuongChiTiet() {};
        if(!jtfMaCB.getText().equals("")) {
            st.setMaCB(Integer.parseInt(jtfMaCB.getText()));
        } else{
            st.setMaCB(0);
            System.out.println("MaCB trong");
        }
        if(!jtfNam.getText().equals("")){
            st.setNam(Integer.parseInt(jtfNam.getText()));
        }        
        else {
            System.out.println("Nam trong");
            st.setNam(0);
        }
        
        if(!jtfThang.getText().equals("")){
            st.setThang(Integer.parseInt(jtfThang.getText()));
        } else {
            System.out.println("Thang trong");
            st.setThang(0);
        }
        System.out.println("Can bo can tim kiem: "+st.getMaCB()+" - "+st.getThang()+" - "+st.getNam());
        showDataBangLuongChiTiet(ConnectionSQL.SearchBangLuongChiTiet(st));
    }//GEN-LAST:event_btnSearchActionPerformed

    
    
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(  jtfMaCB.getText().equals("") || jtfThang.getText().equals("") || jtfNam.getText().equals("")){
               JOptionPane.showMessageDialog(this, "Hãy Nhập Đầy Đủ Dữ Liệu");              
           } else{
            
            String checkMaCB = "select MaCB from canbo where MaCB = '"+jtfMaCB.getText()+"'";
            try{
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(checkMaCB);
                while(!rs.next()){
                    
                JOptionPane.showMessageDialog(this,"Cán bộ bạn vừa nhập hiện chưa có trong danh sách cán bộ!!!");
                return;
                }
            }catch(Exception e){}
            
     BangLuongChiTiet st = new BangLuongChiTiet() {
     };
     st.setMaCB(Integer.parseInt(jtfMaCB.getText()));
     st.setThang(Integer.parseInt(jtfThang.getText()));
     st.setNam(Integer.parseInt(jtfNam.getText()));
     
     String chucvu = "";
     int luongCoSo = 0;
     double HeSo = 0.0;
     String TuDen = "";
     int maBangLuong = 0;
     int countYear = 0;
     int month = Integer.parseInt(jtfThang.getText());
     int year = Integer.parseInt(jtfNam.getText());
     
     //Từ năm 2004 trở về trước
     if(year <= 2005 && month <=9){
         st.setMaBangLuong(1);
         String query = "SELECT TuDen, LuongCoSo FROM bangluong WHERE MaBangLuong ='1'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             while(rs.next()){
                 jlbThoiGianApDung.setText(rs.getString("TuDen"));
                 luongCoSo = rs.getInt("LuongCoSo");
                 jlbLuongCoSoApDung.setText(String.valueOf(luongCoSo));
             }
         }catch(Exception e){}
         
         
         //Tim luong cung bang = he so luong (theo bac) * luong co so
         String query1 = "SELECT HeSo FROM bacluong, canbo WHERE bacluong.Bac = canbo.Bac and MaCB = '"+jtfMaCB.getText()+"'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query1);
             while(rs.next()){
                 HeSo = rs.getDouble("HeSo");
                 System.out.println("He so la "+HeSo);
             }
         }catch(Exception e){}
         
        if(HeSo != 0.0 && luongCoSo !=0){
            st.setLuongCung(HeSo*luongCoSo);
        }
        else if(HeSo == 0) System.out.println("He so bang 0!!!");
        else if(luongCoSo == 0) System.out.println("Luong co So bang 0!!!");
        System.out.println("Lương cứng là:" +st.getLuongCung());
        
        
        
        //tim phu cap chuc vu
        String query2 = "SELECT ChucVu FROM canbo WHERE MaCB = '"+jtfMaCB.getText()+"'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query2);
             while(rs.next()){
                 chucvu = rs.getString("ChucVu");
                 if(chucvu.equals("Hiệu trưởng")) st.setPhuCapChucVu(0.45*luongCoSo);
                 else if(chucvu.equals("Hiệu phó")) st.setPhuCapChucVu(0.35*luongCoSo); 
                 else if(chucvu.equals("Trưởng bộ môn")) st.setPhuCapChucVu(0.2*luongCoSo);
                 else if(chucvu.equals("Giáo viên")) st.setPhuCapChucVu(0.15*luongCoSo); 
                 System.out.println("Chức vụ là: "+chucvu+" - lương cơ sở: "+luongCoSo);
             }
         }catch(Exception e){}
         System.out.println("Lương phụ cấp chức vụ là: "+st.getPhuCapChucVu());   
        
        
        
        //tim phu cap tham nien
        String query3 = "SELECT ThoiGianBatDau, ThoiGianKetThuc FROM quatrinhluong WHERE MaCB='"+jtfMaCB.getText()+"' AND ThoiGianKetThuc <= '2005'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query3);
             while(rs.next()){
                 countYear += (rs.getInt("ThoiGianKetThuc") - rs.getInt("ThoiGianBatDau"));
             }
         }catch(Exception e){}
        
        System.out.println("số năm đếm được là "+countYear);
        
        if(countYear >= 5){
            st.setPhuCapThamNien(countYear/100.0 * luongCoSo);
        }
        System.out.println("Lương phụ cấp thâm niên là:"+st.getPhuCapThamNien());
        
        
        
        //Tong luong = luong cung + luong phu cap - bao hiem (=10,5% luong cung + luongphucap)
        double tongluong = st.getLuongCung()+st.getPhuCapChucVu()+st.getPhuCapThamNien();
        st.setTongLuong(tongluong * 89.5/100);
        
        
     }
     
     
     
     
    //Từ 01/10/2005 đến 30/9/2006
    if((year ==2005 && month >=10) || (year==2006 && month<=9) ){
               
         st.setMaBangLuong(2);
         String query = "SELECT TuDen, LuongCoSo FROM bangluong WHERE MaBangLuong ='2'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             while(rs.next()){
                 jlbThoiGianApDung.setText(rs.getString("TuDen"));
                 luongCoSo = rs.getInt("LuongCoSo");
                 jlbLuongCoSoApDung.setText(String.valueOf(luongCoSo));
             }
         }catch(Exception e){}
         
         
         //Tim luong cung bang = he so luong (theo bac) * luong co so
         String query1 = "SELECT HeSo FROM bacluong, canbo WHERE bacluong.Bac = canbo.Bac and MaCB = '"+jtfMaCB.getText()+"'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query1);
             while(rs.next()){
                 HeSo = rs.getDouble("HeSo");
                 System.out.println("He so la "+HeSo);
             }
         }catch(Exception e){}
         
        if(HeSo != 0.0 && luongCoSo !=0){
            st.setLuongCung(HeSo*luongCoSo);
        }
        else if(HeSo == 0) System.out.println("He so bang 0!!!");
        else if(luongCoSo == 0) System.out.println("Luong co So bang 0!!!");
        System.out.println("Lương cứng là:" +st.getLuongCung());
        
        
        
        //tim phu cap chuc vu
        String query2 = "SELECT ChucVu FROM canbo WHERE MaCB = '"+jtfMaCB.getText()+"'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query2);
             while(rs.next()){
                 chucvu = rs.getString("ChucVu");
                 if(chucvu.equals("Hiệu trưởng")) st.setPhuCapChucVu(0.45*luongCoSo);
                 else if(chucvu.equals("Hiệu phó")) st.setPhuCapChucVu(0.35*luongCoSo); 
                 else if(chucvu.equals("Trưởng bộ môn")) st.setPhuCapChucVu(0.2*luongCoSo);
                 else if(chucvu.equals("Giáo viên")) st.setPhuCapChucVu(0.15*luongCoSo); 
                 System.out.println("Chức vụ là: "+chucvu+" - lương cơ sở: "+luongCoSo);
             }
         }catch(Exception e){}
         System.out.println("Lương phụ cấp chức vụ là: "+st.getPhuCapChucVu());   
        
        
        
        //tim phu cap tham nien
        String query3 = "SELECT ThoiGianBatDau, ThoiGianKetThuc FROM quatrinhluong WHERE MaCB='"+jtfMaCB.getText()+"' AND ThoiGianKetThuc <= '2006'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query3);
             while(rs.next()){
                 countYear += (rs.getInt("ThoiGianKetThuc") - rs.getInt("ThoiGianBatDau"));
             }
         }catch(Exception e){}
        
        System.out.println("số năm đếm được là "+countYear);
        
        if(countYear >= 5){
            st.setPhuCapThamNien(countYear/100.0 * luongCoSo);
        }
        System.out.println("Lương phụ cấp thâm niên là:"+st.getPhuCapThamNien());
        
        
        
        //Tong luong = luong cung + luong phu cap - bao hiem (=10,5% luong cung + luongphucap)
        double tongluong = st.getLuongCung()+st.getPhuCapChucVu()+st.getPhuCapThamNien();
        st.setTongLuong(tongluong * 89.5/100);
        
        
     }
    
    
    
    //tu 10/2006 den 12/2007
    if((year ==2006 && month >=10) || (year==2007 && month<=12) ){
               
         st.setMaBangLuong(3);
         String query = "SELECT TuDen, LuongCoSo FROM bangluong WHERE MaBangLuong ='3'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             while(rs.next()){
                 jlbThoiGianApDung.setText(rs.getString("TuDen"));
                 luongCoSo = rs.getInt("LuongCoSo");
                 jlbLuongCoSoApDung.setText(String.valueOf(luongCoSo));
             }
         }catch(Exception e){}
         
         
         //Tim luong cung bang = he so luong (theo bac) * luong co so
         String query1 = "SELECT HeSo FROM bacluong, canbo WHERE bacluong.Bac = canbo.Bac and MaCB = '"+jtfMaCB.getText()+"'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query1);
             while(rs.next()){
                 HeSo = rs.getDouble("HeSo");
                 System.out.println("He so la "+HeSo);
             }
         }catch(Exception e){}
         
        if(HeSo != 0.0 && luongCoSo !=0){
            st.setLuongCung(HeSo*luongCoSo);
        }
        else if(HeSo == 0) System.out.println("He so bang 0!!!");
        else if(luongCoSo == 0) System.out.println("Luong co So bang 0!!!");
        System.out.println("Lương cứng là:" +st.getLuongCung());
        
        
        
        //tim phu cap chuc vu
        String query2 = "SELECT ChucVu FROM canbo WHERE MaCB = '"+jtfMaCB.getText()+"'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query2);
             while(rs.next()){
                 chucvu = rs.getString("ChucVu");
                 if(chucvu.equals("Hiệu trưởng")) st.setPhuCapChucVu(0.45*luongCoSo);
                 else if(chucvu.equals("Hiệu phó")) st.setPhuCapChucVu(0.35*luongCoSo); 
                 else if(chucvu.equals("Trưởng bộ môn")) st.setPhuCapChucVu(0.2*luongCoSo);
                 else if(chucvu.equals("Giáo viên")) st.setPhuCapChucVu(0.15*luongCoSo); 
                 System.out.println("Chức vụ là: "+chucvu+" - lương cơ sở: "+luongCoSo);
             }
         }catch(Exception e){}
         System.out.println("Lương phụ cấp chức vụ là: "+st.getPhuCapChucVu());   
        
        
        
        //tim phu cap tham nien
        String query3 = "SELECT ThoiGianBatDau, ThoiGianKetThuc FROM quatrinhluong WHERE MaCB='"+jtfMaCB.getText()+"' AND ThoiGianKetThuc <= '2007'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query3);
             while(rs.next()){
                 countYear += (rs.getInt("ThoiGianKetThuc") - rs.getInt("ThoiGianBatDau"));
             }
         }catch(Exception e){}
        
        System.out.println("số năm đếm được là "+countYear);
        
        if(countYear >= 5){
            st.setPhuCapThamNien(countYear/100.0 * luongCoSo);
        }
        System.out.println("Lương phụ cấp thâm niên là:"+st.getPhuCapThamNien());
        
        
        
        //Tong luong = luong cung + luong phu cap - bao hiem (=10,5% luong cung + luongphucap)
        double tongluong = st.getLuongCung()+st.getPhuCapChucVu()+st.getPhuCapThamNien();
        st.setTongLuong(tongluong * 89.5/100);
        
        
     }
    
    
    
    //tu 01/2008 den 4/2008
    if(year == 2008 && month>=1 && month<=4){
               
         st.setMaBangLuong(4);
         String query = "SELECT TuDen, LuongCoSo FROM bangluong WHERE MaBangLuong ='4'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             while(rs.next()){
                 jlbThoiGianApDung.setText(rs.getString("TuDen"));
                 luongCoSo = rs.getInt("LuongCoSo");
                 jlbLuongCoSoApDung.setText(String.valueOf(luongCoSo));
             }
         }catch(Exception e){}
         
         
         //Tim luong cung bang = he so luong (theo bac) * luong co so
         String query1 = "SELECT HeSo FROM bacluong, canbo WHERE bacluong.Bac = canbo.Bac and MaCB = '"+jtfMaCB.getText()+"'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query1);
             while(rs.next()){
                 HeSo = rs.getDouble("HeSo");
                 System.out.println("He so la "+HeSo);
             }
         }catch(Exception e){}
         
        if(HeSo != 0.0 && luongCoSo !=0){
            st.setLuongCung(HeSo*luongCoSo);
        }
        else if(HeSo == 0) System.out.println("He so bang 0!!!");
        else if(luongCoSo == 0) System.out.println("Luong co So bang 0!!!");
        System.out.println("Lương cứng là:" +st.getLuongCung());
        
        
        
        //tim phu cap chuc vu
        String query2 = "SELECT ChucVu FROM canbo WHERE MaCB = '"+jtfMaCB.getText()+"'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query2);
             while(rs.next()){
                 chucvu = rs.getString("ChucVu");
                 if(chucvu.equals("Hiệu trưởng")) st.setPhuCapChucVu(0.45*luongCoSo);
                 else if(chucvu.equals("Hiệu phó")) st.setPhuCapChucVu(0.35*luongCoSo); 
                 else if(chucvu.equals("Trưởng bộ môn")) st.setPhuCapChucVu(0.2*luongCoSo);
                 else if(chucvu.equals("Giáo viên")) st.setPhuCapChucVu(0.15*luongCoSo); 
                 System.out.println("Chức vụ là: "+chucvu+" - lương cơ sở: "+luongCoSo);
             }
         }catch(Exception e){}
         System.out.println("Lương phụ cấp chức vụ là: "+st.getPhuCapChucVu());   
        
        
        
        //tim phu cap tham nien
        String query3 = "SELECT ThoiGianBatDau, ThoiGianKetThuc FROM quatrinhluong WHERE MaCB='"+jtfMaCB.getText()+"' AND ThoiGianKetThuc <= '2008'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query3);
             while(rs.next()){
                 countYear += (rs.getInt("ThoiGianKetThuc") - rs.getInt("ThoiGianBatDau"));
             }
         }catch(Exception e){}
        
        System.out.println("số năm đếm được là "+countYear);
        
        if(countYear >= 5){
            st.setPhuCapThamNien(countYear/100.0 * luongCoSo);
        }
        System.out.println("Lương phụ cấp thâm niên là:"+st.getPhuCapThamNien());
        
        
        
        //Tong luong = luong cung + luong phu cap - bao hiem (=10,5% luong cung + luongphucap)
        double tongluong = st.getLuongCung()+st.getPhuCapChucVu()+st.getPhuCapThamNien();
        st.setTongLuong(tongluong * 89.5/100);
        
        
     }
    
    
    
    //tu 5/2008 den 4/2009
    if((year ==2008 && month >=5) || (year==2009 && month<=4) ){
               
         st.setMaBangLuong(5);
         String query = "SELECT TuDen, LuongCoSo FROM bangluong WHERE MaBangLuong ='5'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             while(rs.next()){
                 jlbThoiGianApDung.setText(rs.getString("TuDen"));
                 luongCoSo = rs.getInt("LuongCoSo");
                 jlbLuongCoSoApDung.setText(String.valueOf(luongCoSo));
             }
         }catch(Exception e){}
         
         
         //Tim luong cung bang = he so luong (theo bac) * luong co so
         String query1 = "SELECT HeSo FROM bacluong, canbo WHERE bacluong.Bac = canbo.Bac and MaCB = '"+jtfMaCB.getText()+"'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query1);
             while(rs.next()){
                 HeSo = rs.getDouble("HeSo");
                 System.out.println("He so la "+HeSo);
             }
         }catch(Exception e){}
         
        if(HeSo != 0.0 && luongCoSo !=0){
            st.setLuongCung(HeSo*luongCoSo);
        }
        else if(HeSo == 0) System.out.println("He so bang 0!!!");
        else if(luongCoSo == 0) System.out.println("Luong co So bang 0!!!");
        System.out.println("Lương cứng là:" +st.getLuongCung());
        
        
        
        //tim phu cap chuc vu
        String query2 = "SELECT ChucVu FROM canbo WHERE MaCB = '"+jtfMaCB.getText()+"'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query2);
             while(rs.next()){
                 chucvu = rs.getString("ChucVu");
                 if(chucvu.equals("Hiệu trưởng")) st.setPhuCapChucVu(0.45*luongCoSo);
                 else if(chucvu.equals("Hiệu phó")) st.setPhuCapChucVu(0.35*luongCoSo); 
                 else if(chucvu.equals("Trưởng bộ môn")) st.setPhuCapChucVu(0.2*luongCoSo);
                 else if(chucvu.equals("Giáo viên")) st.setPhuCapChucVu(0.15*luongCoSo); 
                 System.out.println("Chức vụ là: "+chucvu+" - lương cơ sở: "+luongCoSo);
             }
         }catch(Exception e){}
         System.out.println("Lương phụ cấp chức vụ là: "+st.getPhuCapChucVu());   
        
        
        
        //tim phu cap tham nien
        String query3 = "SELECT ThoiGianBatDau, ThoiGianKetThuc FROM quatrinhluong WHERE MaCB='"+jtfMaCB.getText()+"' AND ThoiGianKetThuc <= '2009'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query3);
             while(rs.next()){
                 countYear += (rs.getInt("ThoiGianKetThuc") - rs.getInt("ThoiGianBatDau"));
             }
         }catch(Exception e){}
        
        System.out.println("số năm đếm được là "+countYear);
        
        if(countYear >= 5){
            st.setPhuCapThamNien(countYear/100.0 * luongCoSo);
        }
        System.out.println("Lương phụ cấp thâm niên là:"+st.getPhuCapThamNien());
        
        
        
        //Tong luong = luong cung + luong phu cap - bao hiem (=10,5% luong cung + luongphucap)
        double tongluong = st.getLuongCung()+st.getPhuCapChucVu()+st.getPhuCapThamNien();
        st.setTongLuong(tongluong * 89.5/100);
        
        
     }
    
    
    
    //tu 5/2009 den 4/2011
    if((year ==2009 && month >=5) || (year==2011 && month<=4) ){
               
         st.setMaBangLuong(6);
         String query = "SELECT TuDen, LuongCoSo FROM bangluong WHERE MaBangLuong ='6'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             while(rs.next()){
                 jlbThoiGianApDung.setText(rs.getString("TuDen"));
                 luongCoSo = rs.getInt("LuongCoSo");
                 jlbLuongCoSoApDung.setText(String.valueOf(luongCoSo));
             }
         }catch(Exception e){}
         
         
         //Tim luong cung bang = he so luong (theo bac) * luong co so
         String query1 = "SELECT HeSo FROM bacluong, canbo WHERE bacluong.Bac = canbo.Bac and MaCB = '"+jtfMaCB.getText()+"'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query1);
             while(rs.next()){
                 HeSo = rs.getDouble("HeSo");
                 System.out.println("He so la "+HeSo);
             }
         }catch(Exception e){}
         
        if(HeSo != 0.0 && luongCoSo !=0){
            st.setLuongCung(HeSo*luongCoSo);
        }
        else if(HeSo == 0) System.out.println("He so bang 0!!!");
        else if(luongCoSo == 0) System.out.println("Luong co So bang 0!!!");
        System.out.println("Lương cứng là:" +st.getLuongCung());
        
        
        
        //tim phu cap chuc vu
        String query2 = "SELECT ChucVu FROM canbo WHERE MaCB = '"+jtfMaCB.getText()+"'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query2);
             while(rs.next()){
                 chucvu = rs.getString("ChucVu");
                 if(chucvu.equals("Hiệu trưởng")) st.setPhuCapChucVu(0.45*luongCoSo);
                 else if(chucvu.equals("Hiệu phó")) st.setPhuCapChucVu(0.35*luongCoSo); 
                 else if(chucvu.equals("Trưởng bộ môn")) st.setPhuCapChucVu(0.2*luongCoSo);
                 else if(chucvu.equals("Giáo viên")) st.setPhuCapChucVu(0.15*luongCoSo); 
                 System.out.println("Chức vụ là: "+chucvu+" - lương cơ sở: "+luongCoSo);
             }
         }catch(Exception e){}
         System.out.println("Lương phụ cấp chức vụ là: "+st.getPhuCapChucVu());   
        
        
        
        //tim phu cap tham nien
        String query3 = "SELECT ThoiGianBatDau, ThoiGianKetThuc FROM quatrinhluong WHERE MaCB='"+jtfMaCB.getText()+"' AND ThoiGianKetThuc <= '2011'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query3);
             while(rs.next()){
                 countYear += (rs.getInt("ThoiGianKetThuc") - rs.getInt("ThoiGianBatDau"));
             }
         }catch(Exception e){}
        
        System.out.println("số năm đếm được là "+countYear);
        
        if(countYear >= 5){
            st.setPhuCapThamNien(countYear/100.0 * luongCoSo);
        }
        System.out.println("Lương phụ cấp thâm niên là:"+st.getPhuCapThamNien());
        
        
        
        //Tong luong = luong cung + luong phu cap - bao hiem (=10,5% luong cung + luongphucap)
        double tongluong = st.getLuongCung()+st.getPhuCapChucVu()+st.getPhuCapThamNien();
        st.setTongLuong(tongluong * 89.5/100);
        
        
     }
    
    
    
    
    //5/2011 den 4/2012
    if((year ==2011 && month >=5) || (year==2012 && month<=4) ){
               
         st.setMaBangLuong(7);
         String query = "SELECT TuDen, LuongCoSo FROM bangluong WHERE MaBangLuong ='7'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             while(rs.next()){
                 jlbThoiGianApDung.setText(rs.getString("TuDen"));
                 luongCoSo = rs.getInt("LuongCoSo");
                 jlbLuongCoSoApDung.setText(String.valueOf(luongCoSo));
             }
         }catch(Exception e){}
         
         
         //Tim luong cung bang = he so luong (theo bac) * luong co so
         String query1 = "SELECT HeSo FROM bacluong, canbo WHERE bacluong.Bac = canbo.Bac and MaCB = '"+jtfMaCB.getText()+"'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query1);
             while(rs.next()){
                 HeSo = rs.getDouble("HeSo");
                 System.out.println("He so la "+HeSo);
             }
         }catch(Exception e){}
         
        if(HeSo != 0.0 && luongCoSo !=0){
            st.setLuongCung(HeSo*luongCoSo);
        }
        else if(HeSo == 0) System.out.println("He so bang 0!!!");
        else if(luongCoSo == 0) System.out.println("Luong co So bang 0!!!");
        System.out.println("Lương cứng là:" +st.getLuongCung());
        
        
        
        //tim phu cap chuc vu
        String query2 = "SELECT ChucVu FROM canbo WHERE MaCB = '"+jtfMaCB.getText()+"'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query2);
             while(rs.next()){
                 chucvu = rs.getString("ChucVu");
                 if(chucvu.equals("Hiệu trưởng")) st.setPhuCapChucVu(0.45*luongCoSo);
                 else if(chucvu.equals("Hiệu phó")) st.setPhuCapChucVu(0.35*luongCoSo); 
                 else if(chucvu.equals("Trưởng bộ môn")) st.setPhuCapChucVu(0.2*luongCoSo);
                 else if(chucvu.equals("Giáo viên")) st.setPhuCapChucVu(0.15*luongCoSo); 
                 System.out.println("Chức vụ là: "+chucvu+" - lương cơ sở: "+luongCoSo);
             }
         }catch(Exception e){}
         System.out.println("Lương phụ cấp chức vụ là: "+st.getPhuCapChucVu());   
        
        
        
        //tim phu cap tham nien
        String query3 = "SELECT ThoiGianBatDau, ThoiGianKetThuc FROM quatrinhluong WHERE MaCB='"+jtfMaCB.getText()+"' AND ThoiGianKetThuc <= '2012'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query3);
             while(rs.next()){
                 countYear += (rs.getInt("ThoiGianKetThuc") - rs.getInt("ThoiGianBatDau"));
             }
         }catch(Exception e){}
        
        System.out.println("số năm đếm được là "+countYear);
        
        if(countYear >= 5){
            st.setPhuCapThamNien(countYear/100.0 * luongCoSo);
        }
        System.out.println("Lương phụ cấp thâm niên là:"+st.getPhuCapThamNien());
        
        
        
        //Tong luong = luong cung + luong phu cap - bao hiem (=10,5% luong cung + luongphucap)
        double tongluong = st.getLuongCung()+st.getPhuCapChucVu()+st.getPhuCapThamNien();
        st.setTongLuong(tongluong * 89.5/100);
        
        
     }
    
    
    
    //5/2012 den 6/2013
    if((year ==2012 && month >=5) || (year==2013 && month<=6) ){
               
         st.setMaBangLuong(8);
         String query = "SELECT TuDen, LuongCoSo FROM bangluong WHERE MaBangLuong ='8'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             while(rs.next()){
                 jlbThoiGianApDung.setText(rs.getString("TuDen"));
                 luongCoSo = rs.getInt("LuongCoSo");
                 jlbLuongCoSoApDung.setText(String.valueOf(luongCoSo));
             }
         }catch(Exception e){}
         
         
         //Tim luong cung bang = he so luong (theo bac) * luong co so
         String query1 = "SELECT HeSo FROM bacluong, canbo WHERE bacluong.Bac = canbo.Bac and MaCB = '"+jtfMaCB.getText()+"'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query1);
             while(rs.next()){
                 HeSo = rs.getDouble("HeSo");
                 System.out.println("He so la "+HeSo);
             }
         }catch(Exception e){}
         
        if(HeSo != 0.0 && luongCoSo !=0){
            st.setLuongCung(HeSo*luongCoSo);
        }
        else if(HeSo == 0) System.out.println("He so bang 0!!!");
        else if(luongCoSo == 0) System.out.println("Luong co So bang 0!!!");
        System.out.println("Lương cứng là:" +st.getLuongCung());
        
        
        
        //tim phu cap chuc vu
        String query2 = "SELECT ChucVu FROM canbo WHERE MaCB = '"+jtfMaCB.getText()+"'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query2);
             while(rs.next()){
                 chucvu = rs.getString("ChucVu");
                 if(chucvu.equals("Hiệu trưởng")) st.setPhuCapChucVu(0.45*luongCoSo);
                 else if(chucvu.equals("Hiệu phó")) st.setPhuCapChucVu(0.35*luongCoSo); 
                 else if(chucvu.equals("Trưởng bộ môn")) st.setPhuCapChucVu(0.2*luongCoSo);
                 else if(chucvu.equals("Giáo viên")) st.setPhuCapChucVu(0.15*luongCoSo); 
                 System.out.println("Chức vụ là: "+chucvu+" - lương cơ sở: "+luongCoSo);
             }
         }catch(Exception e){}
         System.out.println("Lương phụ cấp chức vụ là: "+st.getPhuCapChucVu());   
        
        
        
        //tim phu cap tham nien
        String query3 = "SELECT ThoiGianBatDau, ThoiGianKetThuc FROM quatrinhluong WHERE MaCB='"+jtfMaCB.getText()+"' AND ThoiGianKetThuc <= '2013'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query3);
             while(rs.next()){
                 countYear += (rs.getInt("ThoiGianKetThuc") - rs.getInt("ThoiGianBatDau"));
             }
         }catch(Exception e){}
        
        System.out.println("số năm đếm được là "+countYear);
        
        if(countYear >= 5){
            st.setPhuCapThamNien(countYear/100.0 * luongCoSo);
        }
        System.out.println("Lương phụ cấp thâm niên là:"+st.getPhuCapThamNien());
        
        
        
        //Tong luong = luong cung + luong phu cap - bao hiem (=10,5% luong cung + luongphucap)
        double tongluong = st.getLuongCung()+st.getPhuCapChucVu()+st.getPhuCapThamNien();
        st.setTongLuong(tongluong * 89.5/100);
        
        
     }
    
    
    
    //tu 7/2013 den 4/2016
    if((year ==2013 && month >=7) || (year==2016 && month<=4) ){
               
         st.setMaBangLuong(9);
         String query = "SELECT TuDen, LuongCoSo FROM bangluong WHERE MaBangLuong ='9'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             while(rs.next()){
                 jlbThoiGianApDung.setText(rs.getString("TuDen"));
                 luongCoSo = rs.getInt("LuongCoSo");
                 jlbLuongCoSoApDung.setText(String.valueOf(luongCoSo));
             }
         }catch(Exception e){}
         
         
         //Tim luong cung bang = he so luong (theo bac) * luong co so
         String query1 = "SELECT HeSo FROM bacluong, canbo WHERE bacluong.Bac = canbo.Bac and MaCB = '"+jtfMaCB.getText()+"'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query1);
             while(rs.next()){
                 HeSo = rs.getDouble("HeSo");
                 System.out.println("He so la "+HeSo);
             }
         }catch(Exception e){}
         
        if(HeSo != 0.0 && luongCoSo !=0){
            st.setLuongCung(HeSo*luongCoSo);
        }
        else if(HeSo == 0) System.out.println("He so bang 0!!!");
        else if(luongCoSo == 0) System.out.println("Luong co So bang 0!!!");
        System.out.println("Lương cứng là:" +st.getLuongCung());
        
        
        
        //tim phu cap chuc vu
        String query2 = "SELECT ChucVu FROM canbo WHERE MaCB = '"+jtfMaCB.getText()+"'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query2);
             while(rs.next()){
                 chucvu = rs.getString("ChucVu");
                 if(chucvu.equals("Hiệu trưởng")) st.setPhuCapChucVu(0.45*luongCoSo);
                 else if(chucvu.equals("Hiệu phó")) st.setPhuCapChucVu(0.35*luongCoSo); 
                 else if(chucvu.equals("Trưởng bộ môn")) st.setPhuCapChucVu(0.2*luongCoSo);
                 else if(chucvu.equals("Giáo viên")) st.setPhuCapChucVu(0.15*luongCoSo); 
                 System.out.println("Chức vụ là: "+chucvu+" - lương cơ sở: "+luongCoSo);
             }
         }catch(Exception e){}
         System.out.println("Lương phụ cấp chức vụ là: "+st.getPhuCapChucVu());   
        
        
        
        //tim phu cap tham nien
        String query3 = "SELECT ThoiGianBatDau, ThoiGianKetThuc FROM quatrinhluong WHERE MaCB='"+jtfMaCB.getText()+"' AND ThoiGianKetThuc <= '2016'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query3);
             while(rs.next()){
                 countYear += (rs.getInt("ThoiGianKetThuc") - rs.getInt("ThoiGianBatDau"));
             }
         }catch(Exception e){}
        
        System.out.println("số năm đếm được là "+countYear);
        
        if(countYear >= 5){
            st.setPhuCapThamNien(countYear/100.0 * luongCoSo);
        }
        System.out.println("Lương phụ cấp thâm niên là:"+st.getPhuCapThamNien());
        
        
        
        //Tong luong = luong cung + luong phu cap - bao hiem (=10,5% luong cung + luongphucap)
        double tongluong = st.getLuongCung()+st.getPhuCapChucVu()+st.getPhuCapThamNien();
        st.setTongLuong(tongluong * 89.5/100);
        
        
     }
    
    
    //5/2016 den 6/2017
    if((year ==2016 && month >=5) || (year==2017 && month<=6) ){
               
         st.setMaBangLuong(10);
         String query = "SELECT TuDen, LuongCoSo FROM bangluong WHERE MaBangLuong ='10'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             while(rs.next()){
                 jlbThoiGianApDung.setText(rs.getString("TuDen"));
                 luongCoSo = rs.getInt("LuongCoSo");
                 jlbLuongCoSoApDung.setText(String.valueOf(luongCoSo));
             }
         }catch(Exception e){}
         
         
         //Tim luong cung bang = he so luong (theo bac) * luong co so
         String query1 = "SELECT HeSo FROM bacluong, canbo WHERE bacluong.Bac = canbo.Bac and MaCB = '"+jtfMaCB.getText()+"'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query1);
             while(rs.next()){
                 HeSo = rs.getDouble("HeSo");
                 System.out.println("He so la "+HeSo);
             }
         }catch(Exception e){}
         
        if(HeSo != 0.0 && luongCoSo !=0){
            st.setLuongCung(HeSo*luongCoSo);
        }
        else if(HeSo == 0) System.out.println("He so bang 0!!!");
        else if(luongCoSo == 0) System.out.println("Luong co So bang 0!!!");
        System.out.println("Lương cứng là:" +st.getLuongCung());
        
        
        
        //tim phu cap chuc vu
        String query2 = "SELECT ChucVu FROM canbo WHERE MaCB = '"+jtfMaCB.getText()+"'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query2);
             while(rs.next()){
                 chucvu = rs.getString("ChucVu");
                 if(chucvu.equals("Hiệu trưởng")) st.setPhuCapChucVu(0.45*luongCoSo);
                 else if(chucvu.equals("Hiệu phó")) st.setPhuCapChucVu(0.35*luongCoSo); 
                 else if(chucvu.equals("Trưởng bộ môn")) st.setPhuCapChucVu(0.2*luongCoSo);
                 else if(chucvu.equals("Giáo viên")) st.setPhuCapChucVu(0.15*luongCoSo); 
                 System.out.println("Chức vụ là: "+chucvu+" - lương cơ sở: "+luongCoSo);
             }
         }catch(Exception e){}
         System.out.println("Lương phụ cấp chức vụ là: "+st.getPhuCapChucVu());   
        
        
        
        //tim phu cap tham nien
        String query3 = "SELECT ThoiGianBatDau, ThoiGianKetThuc FROM quatrinhluong WHERE MaCB='"+jtfMaCB.getText()+"' AND ThoiGianKetThuc <= '2017'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query3);
             while(rs.next()){
                 countYear += (rs.getInt("ThoiGianKetThuc") - rs.getInt("ThoiGianBatDau"));
             }
         }catch(Exception e){}
        
        System.out.println("số năm đếm được là "+countYear);
        
        if(countYear >= 5){
            st.setPhuCapThamNien(countYear/100.0 * luongCoSo);
        }
        System.out.println("Lương phụ cấp thâm niên là:"+st.getPhuCapThamNien());
        
        
        
        //Tong luong = luong cung + luong phu cap - bao hiem (=10,5% luong cung + luongphucap)
        double tongluong = st.getLuongCung()+st.getPhuCapChucVu()+st.getPhuCapThamNien();
        st.setTongLuong(tongluong * 89.5/100);
        
        
     }
    
    //7/2017 den 6/2018
    if((year ==2017 && month >=7) || (year==2018 && month<=6) ){
               
         st.setMaBangLuong(11);
         String query = "SELECT TuDen, LuongCoSo FROM bangluong WHERE MaBangLuong ='11'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             while(rs.next()){
                 jlbThoiGianApDung.setText(rs.getString("TuDen"));
                 luongCoSo = rs.getInt("LuongCoSo");
                 jlbLuongCoSoApDung.setText(String.valueOf(luongCoSo));
             }
         }catch(Exception e){}
         
         
         //Tim luong cung bang = he so luong (theo bac) * luong co so
         String query1 = "SELECT HeSo FROM bacluong, canbo WHERE bacluong.Bac = canbo.Bac and MaCB = '"+jtfMaCB.getText()+"'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query1);
             while(rs.next()){
                 HeSo = rs.getDouble("HeSo");
                 System.out.println("He so la "+HeSo);
             }
         }catch(Exception e){}
         
        if(HeSo != 0.0 && luongCoSo !=0){
            st.setLuongCung(HeSo*luongCoSo);
        }
        else if(HeSo == 0) System.out.println("He so bang 0!!!");
        else if(luongCoSo == 0) System.out.println("Luong co So bang 0!!!");
        System.out.println("Lương cứng là:" +st.getLuongCung());
        
        
        
        //tim phu cap chuc vu
        String query2 = "SELECT ChucVu FROM canbo WHERE MaCB = '"+jtfMaCB.getText()+"'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query2);
             while(rs.next()){
                 chucvu = rs.getString("ChucVu");
                 if(chucvu.equals("Hiệu trưởng")) st.setPhuCapChucVu(0.45*luongCoSo);
                 else if(chucvu.equals("Hiệu phó")) st.setPhuCapChucVu(0.35*luongCoSo); 
                 else if(chucvu.equals("Trưởng bộ môn")) st.setPhuCapChucVu(0.2*luongCoSo);
                 else if(chucvu.equals("Giáo viên")) st.setPhuCapChucVu(0.15*luongCoSo); 
                 System.out.println("Chức vụ là: "+chucvu+" - lương cơ sở: "+luongCoSo);
             }
         }catch(Exception e){}
         System.out.println("Lương phụ cấp chức vụ là: "+st.getPhuCapChucVu());   
        
        
        
        //tim phu cap tham nien
        String query3 = "SELECT ThoiGianBatDau, ThoiGianKetThuc FROM quatrinhluong WHERE MaCB='"+jtfMaCB.getText()+"' AND ThoiGianKetThuc <= '2006'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query3);
             while(rs.next()){
                 countYear += (rs.getInt("ThoiGianKetThuc") - rs.getInt("ThoiGianBatDau"));
             }
         }catch(Exception e){}
        
        System.out.println("số năm đếm được là "+countYear);
        
        if(countYear >= 5){
            st.setPhuCapThamNien(countYear/100.0 * luongCoSo);
        }
        System.out.println("Lương phụ cấp thâm niên là:"+st.getPhuCapThamNien());
        
        
        
        //Tong luong = luong cung + luong phu cap - bao hiem (=10,5% luong cung + luongphucap)
        double tongluong = st.getLuongCung()+st.getPhuCapChucVu()+st.getPhuCapThamNien();
        st.setTongLuong(tongluong * 89.5/100);
        
        
     }
    
    
    //tu 7/2018 den 6/2019
    if((year ==2018 && month >=7) || (year==2019 && month<=6) ){
               
         st.setMaBangLuong(12);
         String query = "SELECT TuDen, LuongCoSo FROM bangluong WHERE MaBangLuong ='12'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             while(rs.next()){
                 jlbThoiGianApDung.setText(rs.getString("TuDen"));
                 luongCoSo = rs.getInt("LuongCoSo");
                 jlbLuongCoSoApDung.setText(String.valueOf(luongCoSo));
             }
         }catch(Exception e){}
         
         
         //Tim luong cung bang = he so luong (theo bac) * luong co so
         String query1 = "SELECT HeSo FROM bacluong, canbo WHERE bacluong.Bac = canbo.Bac and MaCB = '"+jtfMaCB.getText()+"'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query1);
             while(rs.next()){
                 HeSo = rs.getDouble("HeSo");
                 System.out.println("He so la "+HeSo);
             }
         }catch(Exception e){}
         
        if(HeSo != 0.0 && luongCoSo !=0){
            st.setLuongCung(HeSo*luongCoSo);
        }
        else if(HeSo == 0) System.out.println("He so bang 0!!!");
        else if(luongCoSo == 0) System.out.println("Luong co So bang 0!!!");
        System.out.println("Lương cứng là:" +st.getLuongCung());
        
        
        
        //tim phu cap chuc vu
        String query2 = "SELECT ChucVu FROM canbo WHERE MaCB = '"+jtfMaCB.getText()+"'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query2);
             while(rs.next()){
                 chucvu = rs.getString("ChucVu");
                 if(chucvu.equals("Hiệu trưởng")) st.setPhuCapChucVu(0.45*luongCoSo);
                 else if(chucvu.equals("Hiệu phó")) st.setPhuCapChucVu(0.35*luongCoSo); 
                 else if(chucvu.equals("Trưởng bộ môn")) st.setPhuCapChucVu(0.2*luongCoSo);
                 else if(chucvu.equals("Giáo viên")) st.setPhuCapChucVu(0.15*luongCoSo); 
                 System.out.println("Chức vụ là: "+chucvu+" - lương cơ sở: "+luongCoSo);
             }
         }catch(Exception e){}
         System.out.println("Lương phụ cấp chức vụ là: "+st.getPhuCapChucVu());   
        
        
        
        //tim phu cap tham nien
        String query3 = "SELECT ThoiGianBatDau, ThoiGianKetThuc FROM quatrinhluong WHERE MaCB='"+jtfMaCB.getText()+"' AND ThoiGianKetThuc <= '2019'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query3);
             while(rs.next()){
                 countYear += (rs.getInt("ThoiGianKetThuc") - rs.getInt("ThoiGianBatDau"));
             }
         }catch(Exception e){}
        
        System.out.println("số năm đếm được là "+countYear);
        
        if(countYear >= 5){
            st.setPhuCapThamNien(countYear/100.0 * luongCoSo);
        }
        System.out.println("Lương phụ cấp thâm niên là:"+st.getPhuCapThamNien());
        
        
        
        //Tong luong = luong cung + luong phu cap - bao hiem (=10,5% luong cung + luongphucap)
        double tongluong = st.getLuongCung()+st.getPhuCapChucVu()+st.getPhuCapThamNien();
        st.setTongLuong(tongluong * 89.5/100);
        
        
     }
    
    
    
    //tu 7/2019 den 6/2023
    if((year ==2019 && month >=7) || (year==2023 && month<=6) ){
               
         st.setMaBangLuong(13);
         String query = "SELECT TuDen, LuongCoSo FROM bangluong WHERE MaBangLuong ='13'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             while(rs.next()){
                 jlbThoiGianApDung.setText(rs.getString("TuDen"));
                 luongCoSo = rs.getInt("LuongCoSo");
                 jlbLuongCoSoApDung.setText(String.valueOf(luongCoSo));
             }
         }catch(Exception e){}
         
         
         //Tim luong cung bang = he so luong (theo bac) * luong co so
         String query1 = "SELECT HeSo FROM bacluong, canbo WHERE bacluong.Bac = canbo.Bac and MaCB = '"+jtfMaCB.getText()+"'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query1);
             while(rs.next()){
                 HeSo = rs.getDouble("HeSo");
                 System.out.println("He so la "+HeSo);
             }
         }catch(Exception e){}
         
        if(HeSo != 0.0 && luongCoSo !=0){
            st.setLuongCung(HeSo*luongCoSo);
        }
        else if(HeSo == 0) System.out.println("He so bang 0!!!");
        else if(luongCoSo == 0) System.out.println("Luong co So bang 0!!!");
        System.out.println("Lương cứng là:" +st.getLuongCung());
        
        
        
        //tim phu cap chuc vu
        String query2 = "SELECT ChucVu FROM canbo WHERE MaCB = '"+jtfMaCB.getText()+"'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query2);
             while(rs.next()){
                 chucvu = rs.getString("ChucVu");
                 if(chucvu.equals("Hiệu trưởng")) st.setPhuCapChucVu(0.45*luongCoSo);
                 else if(chucvu.equals("Hiệu phó")) st.setPhuCapChucVu(0.35*luongCoSo); 
                 else if(chucvu.equals("Trưởng bộ môn")) st.setPhuCapChucVu(0.2*luongCoSo);
                 else if(chucvu.equals("Giáo viên")) st.setPhuCapChucVu(0.15*luongCoSo); 
                 System.out.println("Chức vụ là: "+chucvu+" - lương cơ sở: "+luongCoSo);
             }
         }catch(Exception e){}
         System.out.println("Lương phụ cấp chức vụ là: "+st.getPhuCapChucVu());   
        
        
        
        //tim phu cap tham nien
        String query3 = "SELECT ThoiGianBatDau, ThoiGianKetThuc FROM quatrinhluong WHERE MaCB='"+jtfMaCB.getText()+"' AND ThoiGianKetThuc <= '2023'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query3);
             while(rs.next()){
                 countYear += (rs.getInt("ThoiGianKetThuc") - rs.getInt("ThoiGianBatDau"));
             }
         }catch(Exception e){}
        
        System.out.println("số năm đếm được là "+countYear);
        
        if(countYear >= 5){
            st.setPhuCapThamNien(countYear/100.0 * luongCoSo);
        }
        System.out.println("Lương phụ cấp thâm niên là:"+st.getPhuCapThamNien());
        
        
        
        //Tong luong = luong cung + luong phu cap - bao hiem (=10,5% luong cung + luongphucap)
        double tongluong = st.getLuongCung()+st.getPhuCapChucVu()+st.getPhuCapThamNien();
        st.setTongLuong(tongluong * 89.5/100);
        
        
     }
    
    
    
    if(year>=2023 && month>6 ){
               
         st.setMaBangLuong(14);
         String query = "SELECT TuDen, LuongCoSo FROM bangluong WHERE MaBangLuong ='14'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             while(rs.next()){
                 jlbThoiGianApDung.setText(rs.getString("TuDen"));
                 luongCoSo = rs.getInt("LuongCoSo");
                 jlbLuongCoSoApDung.setText(String.valueOf(luongCoSo));
             }
         }catch(Exception e){}
         
         
         //Tim luong cung bang = he so luong (theo bac) * luong co so
         String query1 = "SELECT HeSo FROM bacluong, canbo WHERE bacluong.Bac = canbo.Bac and MaCB = '"+jtfMaCB.getText()+"'";
         try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query1);
             while(rs.next()){
                 HeSo = rs.getDouble("HeSo");
                 System.out.println("He so la "+HeSo);
             }
         }catch(Exception e){}
         
        if(HeSo != 0.0 && luongCoSo !=0){
            st.setLuongCung(HeSo*luongCoSo);
        }
        else if(HeSo == 0) System.out.println("He so bang 0!!!");
        else if(luongCoSo == 0) System.out.println("Luong co So bang 0!!!");
        System.out.println("Lương cứng là:" +st.getLuongCung());
        
        
        
        //tim phu cap chuc vu
        String query2 = "SELECT ChucVu FROM canbo WHERE MaCB = '"+jtfMaCB.getText()+"'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query2);
             while(rs.next()){
                 chucvu = rs.getString("ChucVu");
                 if(chucvu.equals("Hiệu trưởng")) st.setPhuCapChucVu(0.45*luongCoSo);
                 else if(chucvu.equals("Hiệu phó")) st.setPhuCapChucVu(0.35*luongCoSo); 
                 else if(chucvu.equals("Trưởng bộ môn")) st.setPhuCapChucVu(0.2*luongCoSo);
                 else if(chucvu.equals("Giáo viên")) st.setPhuCapChucVu(0.15*luongCoSo); 
                 System.out.println("Chức vụ là: "+chucvu+" - lương cơ sở: "+luongCoSo);
             }
         }catch(Exception e){}
         System.out.println("Lương phụ cấp chức vụ là: "+st.getPhuCapChucVu());   
        
        
        
        //tim phu cap tham nien
        String query3 = "SELECT ThoiGianBatDau, ThoiGianKetThuc FROM quatrinhluong WHERE MaCB='"+jtfMaCB.getText()+"' AND ThoiGianKetThuc >='2023'";
        try{
             Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query3);
             while(rs.next()){
                 countYear += (rs.getInt("ThoiGianKetThuc") - rs.getInt("ThoiGianBatDau"));
             }
         }catch(Exception e){}
        
        System.out.println("số năm đếm được là "+countYear);
        
        if(countYear >= 5){
            st.setPhuCapThamNien(countYear/100.0 * luongCoSo);
        }
        System.out.println("Lương phụ cấp thâm niên là:"+st.getPhuCapThamNien());
        
        
        
        //Tong luong = luong cung + luong phu cap - bao hiem (=10,5% luong cung + luongphucap)
        double tongluong = st.getLuongCung()+st.getPhuCapChucVu()+st.getPhuCapThamNien();
        st.setTongLuong(tongluong * 89.5/100);
        
        
     }
     
     
     

     
     System.out.println("Thông tin lương chi tiết: "+st.getMaCB()+" - "+st.getMaBangLuong()+" - "+st.getThang()+" - "+st.getNam()+" - "+st.getLuongCung()+" - "+st.getPhuCapChucVu()+" - "+st.getPhuCapThamNien()+" - "+st.getTongLuong());
     ConnectionSQL.InsertBangLuongChiTiet(st);
        JOptionPane.showMessageDialog(null, "Thêm Mới Thành Công");
        showDataBangLuongChiTiet(ConnectionSQL.findAllBangLuongChiTiet());}
    }//GEN-LAST:event_btnAddActionPerformed

    
    
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(jlbMaBangLuongApDung.getText().equals("") || jtfMaCB.getText().equals("") || jtfThang.getText().equals("") || jtfNam.getText().equals("")){
               JOptionPane.showMessageDialog(this, "Hãy Nhập Đầy Đủ Dữ Liệu");              
           } else{
        BangLuongChiTiet st = new BangLuongChiTiet() {
        };
     st.setMaBangLuong(Integer.parseInt(jlbMaBangLuongApDung.getText()));
     st.setMaCB(Integer.parseInt(jtfMaCB.getText()));
     st.setThang(Integer.parseInt(jtfThang.getText()));
     st.setNam(Integer.parseInt(jtfNam.getText()));
     ConnectionSQL.UpdateBangLuongChiTiet(st);
        JOptionPane.showMessageDialog(null, "Cập Nhật Thành Công");
        showDataBangLuongChiTiet(ConnectionSQL.findAllBangLuongChiTiet());}
    }//GEN-LAST:event_btnUpdateActionPerformed

    
    
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        BangLuongChiTiet st;
        st = new BangLuongChiTiet() {
        };
    st.setMaBangLuong(Integer.parseInt(jlbMaBangLuongApDung.getText()));
    st.setMaCB(Integer.parseInt(jtfMaCB.getText()));
    ConnectionSQL.DeleteBangLuongChiTiet(st);
        JOptionPane.showMessageDialog(null, "Xóa Dữ Liệu Thành Công");

        showDataBangLuongChiTiet(ConnectionSQL.findAllBangLuongChiTiet());
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        jlbMaBangLuongApDung.setText("");
        jtfMaCB.setText("");
        jtfThang.setText("");
        jtfNam.setText("");
        jlbLuongCoSoApDung.setText("");
        jlbThoiGianApDung.setText("");
        showDataBangLuongChiTiet(ConnectionSQL.findAllBangLuongChiTiet());
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    private void jtfThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfThangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfThangActionPerformed

    private void jtfNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNamActionPerformed

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
            java.util.logging.Logger.getLogger(BangLuongChiTietFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BangLuongChiTietFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BangLuongChiTietFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BangLuongChiTietFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BangLuongChiTietFrame().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlbLuongCoSoApDung;
    private javax.swing.JLabel jlbMaBangLuongApDung;
    private javax.swing.JLabel jlbThoiGianApDung;
    private javax.swing.JTextField jtfMaCB;
    private javax.swing.JTextField jtfNam;
    private javax.swing.JTextField jtfThang;
    // End of variables declaration//GEN-END:variables
}
