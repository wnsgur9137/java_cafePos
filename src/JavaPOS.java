
import java.text.DateFormat;
import javax.swing.table.DefaultTableModel;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class JavaPOS extends javax.swing.JFrame {

    /**
     * Creates new form JavaPOS
     */
    public JavaPOS() {
        initComponents();
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    //=================================Function==================================================
    public void ItemCost(){
        double sum = 0;
        for (int i = 0; i < jTable2.getRowCount(); i++){
            sum = sum + Double.parseDouble(jTable2.getValueAt(i,2).toString());
        }
        jtxtSubTotal.setText(Double.toString(sum));
        double cTotall = Double.parseDouble(jtxtSubTotal.getText());
        
        double cTax = (cTotall * 3.9)/100;
        String iTaxTotal = String.format("%.2f",cTax);
        jtxtTax.setText(iTaxTotal);
        
       String iSubTotal = String.format("%.2f" ,cTotall);
       jtxtSubTotal.setText(iSubTotal);
     
       String iTotal = String.format("%.2f", cTotall - cTax);
       jtxtTotal.setText(iTotal);
       
}
    //=================================Function Changer==================================================
    
    public void Change(){
        double sum = 0;
        double tax = 3.9;
        double cash = Double.parseDouble(jtxtDisplay.getText());
        
        for (int i = 0; i < jTable2.getRowCount(); i++){
            sum = sum + Double.parseDouble(jTable2.getValueAt(i,2).toString());
        }
        double cTax = (sum * 3.9)/100;
        double cChange = (cash - (sum));
        
        String ChangeGiven = String.format("%.1f",cChange);
        jtxtChange.setText(ChangeGiven);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        IceAmericano = new javax.swing.JButton();
        IceMocha = new javax.swing.JButton();
        HotMocha = new javax.swing.JButton();
        HotAmericano = new javax.swing.JButton();
        IceEinspanner = new javax.swing.JButton();
        HotEinspanner = new javax.swing.JButton();
        IceVanillalatte = new javax.swing.JButton();
        HotVanillalatte = new javax.swing.JButton();
        Cappuccino = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jbtnPay = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnRemove = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();
        jbtnList = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtDisplay = new javax.swing.JTextField();
        jtxtChange = new javax.swing.JTextField();
        jcboPayment = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        Total = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtTotal = new javax.swing.JTextField();
        jtxtSubTotal = new javax.swing.JTextField();
        jtxtTax = new javax.swing.JTextField();
        jtxtBarCode = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 268, 160, 200));

        IceAmericano.setFont(new java.awt.Font("??????", 1, 12)); // NOI18N
        IceAmericano.setText("????????? ???????????????");
        IceAmericano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IceAmericanoActionPerformed(evt);
            }
        });
        jPanel1.add(IceAmericano, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 160, 80));

        IceMocha.setFont(new java.awt.Font("??????", 1, 12)); // NOI18N
        IceMocha.setText("????????? ?????? ??????");
        IceMocha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IceMochaActionPerformed(evt);
            }
        });
        jPanel1.add(IceMocha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 80));

        HotMocha.setFont(new java.awt.Font("??????", 1, 12)); // NOI18N
        HotMocha.setText("??? ????????????");
        HotMocha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HotMochaActionPerformed(evt);
            }
        });
        jPanel1.add(HotMocha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 160, 80));

        HotAmericano.setFont(new java.awt.Font("??????", 1, 12)); // NOI18N
        HotAmericano.setText("??? ???????????????");
        HotAmericano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HotAmericanoActionPerformed(evt);
            }
        });
        jPanel1.add(HotAmericano, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, 80));

        IceEinspanner.setFont(new java.awt.Font("??????", 1, 12)); // NOI18N
        IceEinspanner.setText("????????? ???????????????");
        IceEinspanner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IceEinspannerActionPerformed(evt);
            }
        });
        jPanel1.add(IceEinspanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 160, 80));

        HotEinspanner.setFont(new java.awt.Font("??????", 1, 12)); // NOI18N
        HotEinspanner.setText("??? ???????????????");
        HotEinspanner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HotEinspannerActionPerformed(evt);
            }
        });
        jPanel1.add(HotEinspanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 160, 80));

        IceVanillalatte.setFont(new java.awt.Font("??????", 1, 12)); // NOI18N
        IceVanillalatte.setText("????????? ????????? ??????");
        IceVanillalatte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IceVanillalatteActionPerformed(evt);
            }
        });
        jPanel1.add(IceVanillalatte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 160, 80));

        HotVanillalatte.setFont(new java.awt.Font("??????", 1, 12)); // NOI18N
        HotVanillalatte.setText("??? ????????? ??????");
        HotVanillalatte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HotVanillalatteActionPerformed(evt);
            }
        });
        jPanel1.add(HotVanillalatte, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 160, 80));

        Cappuccino.setFont(new java.awt.Font("??????", 1, 12)); // NOI18N
        Cappuccino.setText("????????????");
        Cappuccino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CappuccinoActionPerformed(evt);
            }
        });
        jPanel1.add(Cappuccino, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 160, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 670, 390));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn7.setFont(new java.awt.Font("??????", 1, 25)); // NOI18N
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 60, 60));

        jbtn8.setFont(new java.awt.Font("??????", 1, 25)); // NOI18N
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 60, 60));

        jbtn9.setFont(new java.awt.Font("??????", 1, 25)); // NOI18N
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 60, 60));

        jbtn4.setFont(new java.awt.Font("??????", 1, 25)); // NOI18N
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 60, 60));

        jbtn5.setFont(new java.awt.Font("??????", 1, 25)); // NOI18N
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 60, 60));

        jbtn6.setFont(new java.awt.Font("??????", 1, 25)); // NOI18N
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 60, 60));

        jbtn1.setFont(new java.awt.Font("??????", 1, 25)); // NOI18N
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 60, 60));

        jbtn2.setFont(new java.awt.Font("??????", 1, 25)); // NOI18N
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 60, 60));

        jbtn3.setFont(new java.awt.Font("??????", 1, 25)); // NOI18N
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 60, 60));

        jbtn0.setFont(new java.awt.Font("??????", 1, 25)); // NOI18N
        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 60, 60));

        jbtnDot.setFont(new java.awt.Font("??????", 1, 25)); // NOI18N
        jbtnDot.setText(".");
        jbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 60, 60));

        jbtnC.setFont(new java.awt.Font("??????", 1, 25)); // NOI18N
        jbtnC.setText("C");
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 60, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 280, 400));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 860, 270));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 860, 270));

        jbtnReset.setText("?????????");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 100, 40));

        jbtnPay.setText("??????");
        jbtnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPayActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 40));

        jbtnExit.setText("???????????? ??????");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 100, 40));

        jbtnRemove.setText("??????");
        jbtnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemoveActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 100, 40));

        jbtnPrint.setText("?????????");
        jbtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrintActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, 40));

        jbtnList.setText("?????? ??????");
        jbtnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnListActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnList, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, 40));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, 290, 140));

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 860, 270));

        jLabel4.setFont(new java.awt.Font("??????", 1, 20)); // NOI18N
        jLabel4.setText("?????? ??????");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, -1));

        jLabel5.setFont(new java.awt.Font("??????", 1, 24)); // NOI18N
        jLabel5.setText("?????? ???");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("??????", 1, 24)); // NOI18N
        jLabel6.setText("????????? ???");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jtxtDisplay.setFont(new java.awt.Font("??????", 0, 24)); // NOI18N
        jPanel7.add(jtxtDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 140, -1));

        jtxtChange.setFont(new java.awt.Font("??????", 0, 24)); // NOI18N
        jPanel7.add(jtxtChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 140, -1));

        jcboPayment.setFont(new java.awt.Font("??????", 1, 24)); // NOI18N
        jcboPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "??????", "??????", " ", " " }));
        jPanel7.add(jcboPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 140, 30));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 340, 130));

        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 860, 270));

        Total.setFont(new java.awt.Font("??????", 1, 24)); // NOI18N
        Total.setText("?????????");
        jPanel9.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("??????", 1, 24)); // NOI18N
        jLabel2.setText("?????? ??????");
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("??????", 1, 24)); // NOI18N
        jLabel3.setText("??????");
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jtxtTotal.setFont(new java.awt.Font("??????", 0, 24)); // NOI18N
        jPanel9.add(jtxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 140, -1));

        jtxtSubTotal.setFont(new java.awt.Font("??????", 0, 24)); // NOI18N
        jPanel9.add(jtxtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 140, -1));

        jtxtTax.setFont(new java.awt.Font("??????", 0, 24)); // NOI18N
        jPanel9.add(jtxtTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 140, -1));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 310, 130));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 1190, 200));
        getContentPane().add(jtxtBarCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 230, 70));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Qty", "Amount"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 230, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IceMochaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IceMochaActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 1500;
        
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.addRow(new Object [] {"IceMocha","1",PriceOfItem} );
        ItemCost();
                
    }//GEN-LAST:event_IceMochaActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        // TODO add your handling code here:
        String Enternumber = jtxtDisplay.getText();
        if(Enternumber == ""){
            jtxtDisplay.setText(jbtn7.getText());
        }else{
            Enternumber = jtxtDisplay.getText() + jbtn7.getText();
            jtxtDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        // TODO add your handling code here:
       String Enternumber = jtxtDisplay.getText();
        if(Enternumber == ""){
            jtxtDisplay.setText(jbtn8.getText());
        }else{
            Enternumber = jtxtDisplay.getText() + jbtn8.getText();
            jtxtDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        // TODO add your handling code here:
        String Enternumber = jtxtDisplay.getText();
        if(Enternumber == ""){
            jtxtDisplay.setText(jbtn9.getText());
        }else{
            Enternumber = jtxtDisplay.getText() + jbtn9.getText();
            jtxtDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        // TODO add your handling code here:
               String Enternumber = jtxtDisplay.getText();
        if(Enternumber == ""){
            jtxtDisplay.setText(jbtn4.getText());
        }else{
            Enternumber = jtxtDisplay.getText() + jbtn4.getText();
            jtxtDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
       String Enternumber = jtxtDisplay.getText();
        if(Enternumber == ""){
            jtxtDisplay.setText(jbtn5.getText());
        }else{
            Enternumber = jtxtDisplay.getText() + jbtn5.getText();
            jtxtDisplay.setText(Enternumber);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
       String Enternumber = jtxtDisplay.getText();
        if(Enternumber == ""){
            jtxtDisplay.setText(jbtn6.getText());
        }else{
            Enternumber = jtxtDisplay.getText() + jbtn6.getText();
            jtxtDisplay.setText(Enternumber);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
       String Enternumber = jtxtDisplay.getText();
        if(Enternumber == ""){
            jtxtDisplay.setText(jbtn1.getText());
        }else{
            Enternumber = jtxtDisplay.getText() + jbtn1.getText();
            jtxtDisplay.setText(Enternumber);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
             String Enternumber = jtxtDisplay.getText();
        if(Enternumber == ""){
            jtxtDisplay.setText(jbtn2.getText());
        }else{
            Enternumber = jtxtDisplay.getText() + jbtn2.getText();
            jtxtDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
       String Enternumber = jtxtDisplay.getText();
        if(Enternumber == ""){
            jtxtDisplay.setText(jbtn7.getText());
        }else{
            Enternumber = jtxtDisplay.getText() + jbtn7.getText();
            jtxtDisplay.setText(Enternumber);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
       String Enternumber = jtxtDisplay.getText();
        if(Enternumber == ""){
            jtxtDisplay.setText(jbtn0.getText());
        }else{
            Enternumber = jtxtDisplay.getText() + jbtn0.getText();
            jtxtDisplay.setText(Enternumber);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
         jtxtDisplay.setText("");
         jtxtChange.setText("");
    }//GEN-LAST:event_jbtnCActionPerformed

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDotActionPerformed
        // TODO add your handling code here:
        if(! jtxtDisplay.getText().contains(".")){
            jtxtDisplay.setText(jbtnDot.getText() + jtxtDisplay.getText());
        }
    }//GEN-LAST:event_jbtnDotActionPerformed

    private void HotMochaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HotMochaActionPerformed
        // TODO add your handling code here
        double PriceOfItem = 1500;
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.addRow(new Object [] {"HotMocha","1",PriceOfItem} );
        ItemCost();
    }//GEN-LAST:event_HotMochaActionPerformed

    private void IceAmericanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IceAmericanoActionPerformed
         double PriceOfItem = 1500;      
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.addRow(new Object [] {"IceAmericano","1",PriceOfItem} );
        ItemCost();
    }//GEN-LAST:event_IceAmericanoActionPerformed

    private void HotAmericanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HotAmericanoActionPerformed
         double PriceOfItem = 1500;      
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.addRow(new Object [] {"HotAmericano","1",PriceOfItem} );
        ItemCost();   
    }//GEN-LAST:event_HotAmericanoActionPerformed

    private void IceEinspannerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IceEinspannerActionPerformed
        double PriceOfItem = 3000;      
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.addRow(new Object [] {"IceEinspanner","1",PriceOfItem} );
        ItemCost(); 
    }//GEN-LAST:event_IceEinspannerActionPerformed

    private void HotEinspannerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HotEinspannerActionPerformed
        double PriceOfItem = 3000;      
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.addRow(new Object [] {"HotEinspanner","1",PriceOfItem} );
        ItemCost(); 
    }//GEN-LAST:event_HotEinspannerActionPerformed

    private void IceVanillalatteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IceVanillalatteActionPerformed
        double PriceOfItem = 1400;      
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.addRow(new Object [] {"IceVanillalatte","1",PriceOfItem} );
        ItemCost(); 
    }//GEN-LAST:event_IceVanillalatteActionPerformed

    private void HotVanillalatteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HotVanillalatteActionPerformed
        double PriceOfItem = 1400;      
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.addRow(new Object [] {"HotVanillalatte","1",PriceOfItem} );
        ItemCost(); 
    }//GEN-LAST:event_HotVanillalatteActionPerformed

    private void CappuccinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CappuccinoActionPerformed
        double PriceOfItem = 1800;      
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.addRow(new Object [] {"Cappuccino","1",PriceOfItem} );
        ItemCost(); 
    }//GEN-LAST:event_CappuccinoActionPerformed

    private void jbtnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPayActionPerformed
        // TODO add your handling code here:
        
        if(jtxtDisplay.getText().length() < 1) {
            JOptionPane.showMessageDialog(null, "?????? ????????? ????????? ????????????.", "?????? ??????", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(jcboPayment.getSelectedItem().equals("??????")){
            Change();
        }else if(jcboPayment.getSelectedItem().equals("??????")){
            Change();
        }
        
        
        // DB ????????? ?????? ??????
        int count = -1;
        for (int i = 0; i < jTable2.getRowCount(); i++){
             jTable2.getValueAt(i,2).toString();
             count++;
        }
        
        String item = jTable2.getValueAt(0,0).toString() + " ??? " + count + "???";
        String payment = jcboPayment.getSelectedItem().toString();
        String amount = jtxtSubTotal.getText();
        String change = jtxtChange.getText();
        String tax = jtxtTax.getText();
        String profit = jtxtTotal.getText();
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String created = dateFormat.format(date);
        
        Statement stat = new Statement(item, Integer.toString(count+1), payment, amount, change, tax, profit, created);
        StatementDAO statDAO = new StatementDAO();
        
        int result = statDAO.save(stat);
        if(result != 1) {
            JOptionPane.showMessageDialog(null, "DB ?????? ??????", "DB ??????", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_jbtnPayActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        jtxtChange.setText("");
        jtxtTax.setText("");
        jtxtTotal.setText("");
        jtxtSubTotal.setText("");
        jtxtDisplay.setText("");
        jtxtBarCode.setText("");
        
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintActionPerformed
      MessageFormat header = new MessageFormat("Printing in progress");
      MessageFormat footer = new MessageFormat("Page {0, number, integer}");
      
      try{
          jTable2.print(JTable.PrintMode.NORMAL, header, footer);
      }catch(java.awt.print.PrinterException e){
          System.err.format("??????????????? ?????? ??? ????????????.", e.getMessage());
      }
    }//GEN-LAST:event_jbtnPrintActionPerformed

    private void jbtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemoveActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        
        int RemoveItem = jTable2.getSelectedRow();
        if(RemoveItem >= 0){
            model.removeRow(RemoveItem);
        }
        
        ItemCost();
        
        if(jcboPayment.getSelectedItem().equals("??????")){
            Change();
        }else{
            jtxtChange.setText("");
            jtxtDisplay.setText("");
            
        }
    }//GEN-LAST:event_jbtnRemoveActionPerformed
private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"??????????????? ?????????????????????????","Point of Sale",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
        
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnListActionPerformed
        ListForm listForm = new ListForm();
        
        listForm.show();
    }//GEN-LAST:event_jbtnListActionPerformed
    
    public void login() {
        LoginForm loginForm = new LoginForm();

        loginForm.show();
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
            java.util.logging.Logger.getLogger(JavaPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
                
//                new JavaPOS().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cappuccino;
    private javax.swing.JButton HotAmericano;
    private javax.swing.JButton HotEinspanner;
    private javax.swing.JButton HotMocha;
    private javax.swing.JButton HotVanillalatte;
    private javax.swing.JButton IceAmericano;
    private javax.swing.JButton IceEinspanner;
    private javax.swing.JButton IceMocha;
    private javax.swing.JButton IceVanillalatte;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnList;
    private javax.swing.JButton jbtnPay;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JButton jbtnRemove;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JComboBox<String> jcboPayment;
    private javax.swing.JTextField jtxtBarCode;
    private javax.swing.JTextField jtxtChange;
    private javax.swing.JTextField jtxtDisplay;
    private javax.swing.JTextField jtxtSubTotal;
    private javax.swing.JTextField jtxtTax;
    private javax.swing.JTextField jtxtTotal;
    // End of variables declaration//GEN-END:variables
}
