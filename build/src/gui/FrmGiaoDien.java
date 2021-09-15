/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Admin
 */
public class FrmGiaoDien extends javax.swing.JFrame {

    FrmMenu frmmenu;

    /**
     * Creates new form FrmGiaoDien
     */
    public FrmGiaoDien(FrmMenu frmmenu) {

        initComponents();

        this.frmmenu = frmmenu;
        this.setLocationRelativeTo(null);

    }

    // cái pnlHienTHi đó ở đâu

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        paMenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        paXe = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        paKhachhang = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        paTaikhoan = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        paThongke = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        paGiaodich = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pnlHienthi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ THUÊ XE");

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
        );

        paMenu.setBackground(new java.awt.Color(0, 153, 153));
        paMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paMenuMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_home_page_32px_2.png"))); // NOI18N
        jLabel2.setText("MENU");

        javax.swing.GroupLayout paMenuLayout = new javax.swing.GroupLayout(paMenu);
        paMenu.setLayout(paMenuLayout);
        paMenuLayout.setHorizontalGroup(
            paMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paMenuLayout.setVerticalGroup(
            paMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paMenuLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paXe.setBackground(new java.awt.Color(0, 153, 153));
        paXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paXeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paXeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paXeMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_motorcycle_32px_2.png"))); // NOI18N
        jLabel3.setText("XE");

        javax.swing.GroupLayout paXeLayout = new javax.swing.GroupLayout(paXe);
        paXe.setLayout(paXeLayout);
        paXeLayout.setHorizontalGroup(
            paXeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paXeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paXeLayout.setVerticalGroup(
            paXeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paXeLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paKhachhang.setBackground(new java.awt.Color(0, 153, 153));
        paKhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paKhachhangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paKhachhangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paKhachhangMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_member_32px_1.png"))); // NOI18N
        jLabel6.setText("KHÁCH HÀNG");

        javax.swing.GroupLayout paKhachhangLayout = new javax.swing.GroupLayout(paKhachhang);
        paKhachhang.setLayout(paKhachhangLayout);
        paKhachhangLayout.setHorizontalGroup(
            paKhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paKhachhangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        paKhachhangLayout.setVerticalGroup(
            paKhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paKhachhangLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paTaikhoan.setBackground(new java.awt.Color(0, 153, 153));
        paTaikhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paTaikhoanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paTaikhoanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paTaikhoanMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_verified_account_32px.png"))); // NOI18N
        jLabel7.setText("TÀI KHOẢN");

        javax.swing.GroupLayout paTaikhoanLayout = new javax.swing.GroupLayout(paTaikhoan);
        paTaikhoan.setLayout(paTaikhoanLayout);
        paTaikhoanLayout.setHorizontalGroup(
            paTaikhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paTaikhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paTaikhoanLayout.setVerticalGroup(
            paTaikhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paTaikhoanLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paThongke.setBackground(new java.awt.Color(0, 153, 153));
        paThongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paThongkeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paThongkeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paThongkeMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_stop_graph_report_32px.png"))); // NOI18N
        jLabel8.setText("THỐNG KÊ");

        javax.swing.GroupLayout paThongkeLayout = new javax.swing.GroupLayout(paThongke);
        paThongke.setLayout(paThongkeLayout);
        paThongkeLayout.setHorizontalGroup(
            paThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paThongkeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paThongkeLayout.setVerticalGroup(
            paThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paThongkeLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paGiaodich.setBackground(new java.awt.Color(0, 153, 153));
        paGiaodich.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paGiaodichMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paGiaodichMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paGiaodichMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_car_rental_32px_3.png"))); // NOI18N
        jLabel9.setText("GIAO DỊCH");

        javax.swing.GroupLayout paGiaodichLayout = new javax.swing.GroupLayout(paGiaodich);
        paGiaodich.setLayout(paGiaodichLayout);
        paGiaodichLayout.setHorizontalGroup(
            paGiaodichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paGiaodichLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paGiaodichLayout.setVerticalGroup(
            paGiaodichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paGiaodichLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paXe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paKhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paTaikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paThongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paGiaodich, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(paMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paXe, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paKhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paGiaodich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paThongke, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlHienthi.setBackground(new java.awt.Color(255, 255, 255));
        pnlHienthi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlHienthi.setLayout(new java.awt.BorderLayout());
        pnlHienthi.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setPreferredSize(new java.awt.Dimension(924, 88));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Địa chỉ: 6 Lê Lợi, Huế");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hoặc gọi Hotline hỗ trợ để được tư vấn về sản phẩm, dịch vụ: 1800 8001 (Miễn phí cho tất cả thuê bao)");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1113, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1113, Short.MAX_VALUE)
                    .addComponent(pnlHienthi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHienthi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paMenuMouseClicked
        FrmMenu frmmenu = new FrmMenu(this);
        this.setVisible(false);
        frmmenu.setVisible(true);
    }//GEN-LAST:event_paMenuMouseClicked

    private void paXeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paXeMouseClicked
        pnlHienthi.removeAll();
        pnlHienthi.add(new pnlXe());
        pnlHienthi.updateUI();
        pnlHienthi.updateUI();
    }//GEN-LAST:event_paXeMouseClicked

    private void paKhachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paKhachhangMouseClicked
        pnlHienthi.removeAll();
        pnlHienthi.add(new pnlKhachhang());
        pnlKhachhang.TableKH.getColumnModel().getColumn(3).setPreferredWidth(500);
        pnlHienthi.updateUI();
    }//GEN-LAST:event_paKhachhangMouseClicked

    private void paGiaodichMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paGiaodichMouseClicked
        pnlHienthi.removeAll();
        pnlHienthi.add(new pnlGiaodich());
        pnlHienthi.updateUI();
    }//GEN-LAST:event_paGiaodichMouseClicked

    private void paThongkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paThongkeMouseClicked
        pnlHienthi.removeAll();
        pnlHienthi.add(new pnlThongke());
        pnlHienthi.updateUI();
    }//GEN-LAST:event_paThongkeMouseClicked

    private void paTaikhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paTaikhoanMouseClicked
        pnlHienthi.removeAll();
        pnlHienthi.add(new pnlTaikhoan());
        pnlHienthi.updateUI();
    }//GEN-LAST:event_paTaikhoanMouseClicked

    private void paMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paMenuMouseEntered
        setcolor(paMenu);
    }//GEN-LAST:event_paMenuMouseEntered

    private void paMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paMenuMouseExited
        resertcolor(paMenu);
    }//GEN-LAST:event_paMenuMouseExited

    private void paXeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paXeMouseEntered
        setcolor(paXe);
    }//GEN-LAST:event_paXeMouseEntered

    private void paXeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paXeMouseExited
        resertcolor(paXe);
    }//GEN-LAST:event_paXeMouseExited

    private void paKhachhangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paKhachhangMouseEntered
        setcolor(paKhachhang);
    }//GEN-LAST:event_paKhachhangMouseEntered

    private void paKhachhangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paKhachhangMouseExited
        resertcolor(paKhachhang);
    }//GEN-LAST:event_paKhachhangMouseExited

    private void paGiaodichMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paGiaodichMouseEntered
        setcolor(paGiaodich);
    }//GEN-LAST:event_paGiaodichMouseEntered

    private void paGiaodichMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paGiaodichMouseExited
        resertcolor(paGiaodich);
    }//GEN-LAST:event_paGiaodichMouseExited

    private void paThongkeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paThongkeMouseEntered
        setcolor(paThongke);
    }//GEN-LAST:event_paThongkeMouseEntered

    private void paThongkeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paThongkeMouseExited
        resertcolor(paThongke);
    }//GEN-LAST:event_paThongkeMouseExited

    private void paTaikhoanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paTaikhoanMouseEntered
        setcolor(paTaikhoan);
    }//GEN-LAST:event_paTaikhoanMouseEntered

    private void paTaikhoanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paTaikhoanMouseExited
        resertcolor(paTaikhoan);
    }//GEN-LAST:event_paTaikhoanMouseExited
    public void setcolor(JPanel panel) {
        panel.setBackground(new java.awt.Color(0, 51, 51));
    }

    public void resertcolor(JPanel panel) {
        panel.setBackground(new java.awt.Color(0, 153, 153));
    }

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
            java.util.logging.Logger.getLogger(FrmGiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGiaoDien(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel paGiaodich;
    private javax.swing.JPanel paKhachhang;
    private javax.swing.JPanel paMenu;
    private javax.swing.JPanel paTaikhoan;
    private javax.swing.JPanel paThongke;
    private javax.swing.JPanel paXe;
    public javax.swing.JPanel pnlHienthi;
    // End of variables declaration//GEN-END:variables
}
