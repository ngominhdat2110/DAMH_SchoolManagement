package Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/* Người xây dựng: Lê Đức Mạnh*/
public class GiaoDien extends javax.swing.JFrame implements ActionListener{
    public GiaoDien() {
        initComponents();
        btnThongTinCanBo.addActionListener(this);
        btnQuaTrinhCongTac.addActionListener(this);
        btnBangLuong.addActionListener(this);
        btnBangLuongChiTiet.addActionListener(this);
        btnBangLuongNgoaiGio.addActionListener(this);
        btnBangLuongNgoaiGioChiTiet.addActionListener(this);
        this.setLocationRelativeTo(null);
        setTitle("Quản Lý Cán Bộ Giáo Viên Trường X - Nhóm 2");
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnThongTinCanBo = new javax.swing.JButton();
        btnQuaTrinhCongTac = new javax.swing.JButton();
        btnBangLuong = new javax.swing.JButton();
        btnBangLuongChiTiet = new javax.swing.JButton();
        btnBangLuongNgoaiGio = new javax.swing.JButton();
        btnBangLuongNgoaiGioChiTiet = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1247, 677));
        setSize(new java.awt.Dimension(1219, 660));

        jPanel1.setMaximumSize(new java.awt.Dimension(1219, 660));

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản Lý Cán Bộ Giáo Viên trường THCS X");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edu.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.GridLayout(0, 1));

        btnThongTinCanBo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnThongTinCanBo.setText("Thông tin Cán Bộ");
        btnThongTinCanBo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnThongTinCanBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinCanBoActionPerformed(evt);
            }
        });
        jPanel3.add(btnThongTinCanBo);

        btnQuaTrinhCongTac.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnQuaTrinhCongTac.setText("Quá Trình Công Tác");
        btnQuaTrinhCongTac.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnQuaTrinhCongTac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuaTrinhCongTacActionPerformed(evt);
            }
        });
        jPanel3.add(btnQuaTrinhCongTac);

        btnBangLuong.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBangLuong.setText("Bảng Lương");
        btnBangLuong.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBangLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangLuongActionPerformed(evt);
            }
        });
        jPanel3.add(btnBangLuong);

        btnBangLuongChiTiet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBangLuongChiTiet.setText("Bảng lương chi tiết");
        btnBangLuongChiTiet.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(btnBangLuongChiTiet);

        btnBangLuongNgoaiGio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBangLuongNgoaiGio.setText("Bảng lương ngoài giờ");
        btnBangLuongNgoaiGio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(btnBangLuongNgoaiGio);

        btnBangLuongNgoaiGioChiTiet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBangLuongNgoaiGioChiTiet.setText("Bảng lương ngoài giờ chi tiết");
        btnBangLuongNgoaiGioChiTiet.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(btnBangLuongNgoaiGioChiTiet);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThongTinCanBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinCanBoActionPerformed

    }//GEN-LAST:event_btnThongTinCanBoActionPerformed

    private void btnQuaTrinhCongTacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuaTrinhCongTacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuaTrinhCongTacActionPerformed

    private void btnBangLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBangLuongActionPerformed

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
            java.util.logging.Logger.getLogger(GiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBangLuong;
    private javax.swing.JButton btnBangLuongChiTiet;
    private javax.swing.JButton btnBangLuongNgoaiGio;
    private javax.swing.JButton btnBangLuongNgoaiGioChiTiet;
    private javax.swing.JButton btnQuaTrinhCongTac;
    private javax.swing.JButton btnThongTinCanBo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnThongTinCanBo)){
        btnThongTinCanBoClick();
    }
        else if(e.getSource().equals(btnQuaTrinhCongTac)){
            btnQuaTrinhCongTacClick();
        }
        else if(e.getSource().equals(btnBangLuong)){
            btnBangLuongClick();
        }
        else if(e.getSource().equals(btnBangLuongChiTiet)){
            btnBangLuongChiTietClick();
        }
        else if(e.getSource().equals(btnBangLuongNgoaiGio)){
            btnBangLuongNgoaiGioClick();
        }
        else if(e.getSource().equals(btnBangLuongNgoaiGioChiTiet)){
            btnBangLuongNgoaiGioChiTietClick();
        }
    }
    
    
    public void btnBangLuongNgoaiGioChiTietClick(){
        new BangLuongNgoaiGioChiTietFrame().setVisible(true);
    }
    
    public void btnBangLuongNgoaiGioClick(){
        new BangLuongNgoaiGioFrame().setVisible(true);
    }
    
    public void btnBangLuongChiTietClick(){
        new BangLuongChiTietFrame().setVisible(true);
    }
    
    
    public void btnBangLuongClick(){
        new BangLuongFrame().setVisible(true);
    }
    
    public void btnThongTinCanBoClick(){
        new CanBoJFrame().setVisible(true);
    }
    
    public void btnQuaTrinhCongTacClick(){
        new QuaTrinhCongTacFrame().setVisible(true);
    }
    
}