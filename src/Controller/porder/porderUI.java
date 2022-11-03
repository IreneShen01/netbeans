package Controller.porder;//UI內容


import Controller.logInUI;
import Controller.platform;
import Model.porder;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Dao.porder.implporder;


public class porderUI extends javax.swing.JFrame {
    
          JFrame frame = new JFrame();


    public porderUI() {
        initComponents();
        Date date=new Date();
        SimpleDateFormat sd=new SimpleDateFormat("yyyy/MM/dd");
        String stringDate= sd.format(date);
        todaydate.setText(stringDate);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        totalprice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        payment = new javax.swing.JTextField();
        finalok = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        首圖 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        優惠券圖 = new javax.swing.JLabel();
        discount = new javax.swing.JCheckBox();
        購買人 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        platform1 = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        userphone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        滑鼠圖 = new javax.swing.JLabel();
        RAM圖 = new javax.swing.JLabel();
        LCD圖 = new javax.swing.JLabel();
        lcd價格 = new javax.swing.JLabel();
        lcd數量 = new javax.swing.JLabel();
        lcd標題 = new javax.swing.JLabel();
        lcd = new javax.swing.JTextField();
        ram標題 = new javax.swing.JLabel();
        ram價格 = new javax.swing.JLabel();
        ram數量 = new javax.swing.JLabel();
        ram = new javax.swing.JTextField();
        滑鼠標題 = new javax.swing.JLabel();
        滑鼠價格 = new javax.swing.JLabel();
        mouse數量 = new javax.swing.JLabel();
        mouse = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        change = new javax.swing.JTextField();
        print = new javax.swing.JButton();
        todaydate = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        finalarea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("微軟正黑體", 1, 18)); // NOI18N
        jLabel1.setText("應付金額：");

        jLabel2.setFont(new java.awt.Font("微軟正黑體", 1, 18)); // NOI18N
        jLabel2.setText("實付金額：");

        finalok.setFont(new java.awt.Font("微軟正黑體", 1, 18)); // NOI18N
        finalok.setText("結帳");
        finalok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalokMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payment))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalprice, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(finalok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(totalprice, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(payment, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finalok)
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 260, 130));

        title.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 204, 0));
        title.setText("FLASH SALE");
        title.setToolTipText("");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        首圖.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controller/porder/bacgbround-02.png"))); // NOI18N
        getContentPane().add(首圖, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        優惠券圖.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controller/porder/discount.png"))); // NOI18N

        discount.setFont(new java.awt.Font("微軟正黑體", 1, 18)); // NOI18N
        discount.setText("點選領取優惠");

        購買人.setFont(new java.awt.Font("微軟正黑體", 1, 18)); // NOI18N
        購買人.setText("購買人");

        ok.setFont(new java.awt.Font("微軟正黑體", 1, 18)); // NOI18N
        ok.setText("確認");
        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okMouseClicked(evt);
            }
        });

        reset.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        reset.setText("清除");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        platform1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        platform1.setText("回到控制台");
        platform1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platform1ActionPerformed(evt);
            }
        });

        username.setFont(new java.awt.Font("微軟正黑體", 1, 18)); // NOI18N
        username.setText("帳號");

        userphone.setText("輸入會員手機");
        userphone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userphoneMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(優惠券圖)
                            .addComponent(discount))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(platform1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reset, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ok, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(購買人)
                                    .addComponent(username))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(name)
                                    .addComponent(userphone))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(discount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(優惠券圖)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username)
                    .addComponent(userphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(購買人)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(platform1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 186, 390));

        output.setBackground(new java.awt.Color(250, 250, 250));
        output.setColumns(20);
        output.setRows(5);
        output.setAlignmentX(0.0F);
        output.setAlignmentY(0.0F);
        output.setAutoscrolls(false);
        output.setMargin(new java.awt.Insets(0, 0, 0, 0));
        output.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(output);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, -10, 260, 200));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        滑鼠圖.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controller/porder/product-03.png"))); // NOI18N

        RAM圖.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controller/porder/product-04.png"))); // NOI18N

        LCD圖.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controller/porder/product-05.png"))); // NOI18N

        lcd價格.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        lcd價格.setForeground(new java.awt.Color(255, 0, 0));
        lcd價格.setText("NT$4,999");

        lcd數量.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        lcd數量.setText("數量");

        lcd標題.setFont(new java.awt.Font("微軟正黑體", 1, 18)); // NOI18N
        lcd標題.setText("LCD液晶顯示器");

        lcd.setText("0");
        lcd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lcdMouseClicked(evt);
            }
        });

        ram標題.setFont(new java.awt.Font("微軟正黑體", 1, 18)); // NOI18N
        ram標題.setText("8G RAM記憶體");

        ram價格.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        ram價格.setForeground(new java.awt.Color(255, 0, 0));
        ram價格.setText("NT$1,280");

        ram數量.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        ram數量.setText("數量");

        ram.setText("0");
        ram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ramMouseClicked(evt);
            }
        });

        滑鼠標題.setFont(new java.awt.Font("微軟正黑體", 1, 18)); // NOI18N
        滑鼠標題.setText("USB無線藍芽滑鼠");

        滑鼠價格.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        滑鼠價格.setForeground(new java.awt.Color(255, 0, 0));
        滑鼠價格.setText("NT$1,099");
        滑鼠價格.setToolTipText("");

        mouse數量.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        mouse數量.setText("數量");

        mouse.setText("0");
        mouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(滑鼠圖)
                    .addComponent(RAM圖)
                    .addComponent(LCD圖))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(滑鼠標題)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lcd標題)
                                .addGap(46, 46, 46))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lcd價格)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lcd數量)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(lcd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ram標題)
                                .addGap(46, 46, 46))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ram價格)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ram數量)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(ram, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(滑鼠價格)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mouse數量)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mouse, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lcd標題)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lcd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lcd數量)
                            .addComponent(lcd價格))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RAM圖)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ram標題)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(ram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ram數量)
                                    .addComponent(ram價格))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(滑鼠圖)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(滑鼠標題)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(mouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mouse數量)
                                    .addComponent(滑鼠價格)))))
                    .addComponent(LCD圖))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 440, 390));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("微軟正黑體", 1, 18)); // NOI18N
        jLabel3.setText("找零：");

        print.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        print.setText("列印");
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(todaydate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(print))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(print, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(todaydate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 260, 70));

        finalarea.setBackground(new java.awt.Color(250, 250, 250));
        finalarea.setColumns(20);
        finalarea.setRows(5);
        jScrollPane2.setViewportView(finalarea);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 260, 150));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void platform1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platform1ActionPerformed
        new platform().setVisible(true);
         dispose();
    }//GEN-LAST:event_platform1ActionPerformed

    private void okMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseClicked
        
        String PhoneNumber=userphone.getText();
       String Name=name.getText();
       String Lcd=lcd.getText();
       String Ram=ram.getText();
       String Mouse=mouse.getText();
       boolean Discount=discount.isSelected();
        
        int L=Integer.parseInt(Lcd);
        int R=Integer.parseInt(Ram);
        int M=Integer.parseInt(Mouse);
        
        implporder h=new implporder();
        
         if(discount.isSelected())
        { 
            output.setText(h.show1(new porder(PhoneNumber,Name,L,R,M,Discount)));
            totalprice.setText(h.show2(new porder(PhoneNumber,Name,L,R,M,Discount)));
        }
        else
        {
            JOptionPane.showMessageDialog(frame, "你忘了領95折優惠券！");
            output.setText(h.show1(new porder(PhoneNumber,Name,L,R,M)));
            totalprice.setText(h.show2(new porder(PhoneNumber,Name,L,R,M)));
        }
         
         
   
        
    }//GEN-LAST:event_okMouseClicked

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        lcd.setText("0");
        ram.setText("0");
        mouse.setText("0");
        name.setText(null);
        discount.setSelected(false);
        output.setText(null);
        totalprice.setText(null);
        payment.setText(null);
        finalarea.setText(null);
        change.setText(null);
    }//GEN-LAST:event_resetActionPerformed

    private void finalokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalokMouseClicked
        // TODO add your handling code here:
      
        String PhoneNumber=userphone.getText();
       String Name=name.getText();
       String Lcd=lcd.getText();
       String Ram=ram.getText();
       String Mouse=mouse.getText();
        
        int L=Integer.parseInt(Lcd);
        int R=Integer.parseInt(Ram);
        int M=Integer.parseInt(Mouse);
        boolean Discount=discount.isSelected();
        new implporder().add(new porder(PhoneNumber,Name,L,R,M,Discount));
        
        String Totalprice=totalprice.getText(); //應付金額
        String Payment=payment.getText(); //實付金額
        
        int T=Integer.parseInt(Totalprice);
        int P=Integer.parseInt(Payment);
        String Change=String.valueOf(P-T);
        change.setText(Change);
        
        int C=P-T;
        finalarea.setText("找零明細"+
                "\n============================="+
                "\n500元\t"+(Math.abs(C-C%500))/500+"張"+
                "\n100元\t"+(Math.abs(C%500-C%100))/100+"張"+
                "\n50元\t"+(Math.abs(C%100-C%50))/50+"個"+
                "\n10元\t"+Math.abs((C%50-C%10))/10+"個"+
                "\n5元\t"+(Math.abs(C%10-C%5))/5+"個"+
                "\n1元\t"+(Math.abs(C%5))+"個");
        lcd.setText("0");
        ram.setText("0");
        mouse.setText("0");
        discount.setSelected(false);
        output.setText(null);
        totalprice.setText(null);
        payment.setText(null);
        
    }//GEN-LAST:event_finalokMouseClicked

    private void lcdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lcdMouseClicked
        // TODO add your handling code here:
         lcd.setText(null);
    }//GEN-LAST:event_lcdMouseClicked

    private void ramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ramMouseClicked
        // TODO add your handling code here:
         ram.setText(null);
    }//GEN-LAST:event_ramMouseClicked

    private void mouseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMouseClicked
        // TODO add your handling code here:
         mouse.setText(null);
    }//GEN-LAST:event_mouseMouseClicked

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        // TODO add your handling code here:
        try
        {
        finalarea.print();
        }
        catch(PrinterException p)
        {
        }
    }//GEN-LAST:event_printMouseClicked

    private void userphoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userphoneMouseClicked
        userphone.setText(null);
    }//GEN-LAST:event_userphoneMouseClicked

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
            java.util.logging.Logger.getLogger(porderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(porderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(porderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(porderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new porderUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LCD圖;
    private javax.swing.JLabel RAM圖;
    private javax.swing.JTextField change;
    private javax.swing.JCheckBox discount;
    private javax.swing.JTextArea finalarea;
    private javax.swing.JButton finalok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField lcd;
    private javax.swing.JLabel lcd價格;
    private javax.swing.JLabel lcd數量;
    private javax.swing.JLabel lcd標題;
    private javax.swing.JTextField mouse;
    private javax.swing.JLabel mouse數量;
    private javax.swing.JTextField name;
    private javax.swing.JButton ok;
    private javax.swing.JTextArea output;
    private javax.swing.JTextField payment;
    private javax.swing.JButton platform1;
    private javax.swing.JButton print;
    private javax.swing.JTextField ram;
    private javax.swing.JLabel ram價格;
    private javax.swing.JLabel ram數量;
    private javax.swing.JLabel ram標題;
    private javax.swing.JButton reset;
    private javax.swing.JLabel title;
    private javax.swing.JLabel todaydate;
    private javax.swing.JTextField totalprice;
    private javax.swing.JLabel username;
    private javax.swing.JTextField userphone;
    private javax.swing.JLabel 優惠券圖;
    private javax.swing.JLabel 滑鼠價格;
    private javax.swing.JLabel 滑鼠圖;
    private javax.swing.JLabel 滑鼠標題;
    private javax.swing.JLabel 購買人;
    private javax.swing.JLabel 首圖;
    // End of variables declaration//GEN-END:variables
}
