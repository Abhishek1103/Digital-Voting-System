/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evm;
import java.sql.*;
/**
 *
 * @author Surbhit
 */
public class layout extends javax.swing.JFrame {

    /**
     * Creates new form layout
     */
    public layout() {
        initComponents();
        sub.setVisible(false);
        nxt.setVisible(false);
        prv.setVisible(false);
        c1.setVisible(false);
        c2.setVisible(false);
        c3.setVisible(false);
        c4.setVisible(false);
        none.setVisible(false);
        reglb.setText(""+login.regno);
    }
    help obj=new help();
    int b;
    
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
        jPanel2 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        p1 = new javax.swing.JPanel();
        ques = new javax.swing.JLabel();
        c1 = new javax.swing.JRadioButton();
        c3 = new javax.swing.JRadioButton();
        c2 = new javax.swing.JRadioButton();
        c4 = new javax.swing.JRadioButton();
        sub = new javax.swing.JButton();
        none = new javax.swing.JRadioButton();
        event = new javax.swing.JTextField();
        nxt = new javax.swing.JButton();
        reglb = new javax.swing.JLabel();
        prv = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        hlp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        b1.setText("Head Boy");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        b2.setText("Head Girl");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        b3.setText("Sports Captain");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        b4.setText("Arts Captain");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        ques.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        ques.setForeground(new java.awt.Color(153, 153, 255));
        ques.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ques.setText("Welcome");

        buttonGroup1.add(c1);
        c1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        c1.setText("Cand1");

        buttonGroup1.add(c3);
        c3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        c3.setText("Cand2");

        buttonGroup1.add(c2);
        c2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        c2.setText("Cand3");
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(c4);
        c4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        c4.setText("Cand4");
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });

        sub.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        sub.setText("Submit");
        sub.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        buttonGroup1.add(none);
        none.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        none.setText("None");

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ques, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c3, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(c1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(c4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(none)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ques, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1)
                    .addComponent(c2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(none)
                .addGap(8, 8, 8)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c3)
                    .addComponent(c4))
                .addGap(18, 18, 18)
                .addComponent(sub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        event.setEditable(false);
        event.setFont(new java.awt.Font("Times New Roman", 1, 19)); // NOI18N
        event.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        event.setText("Motilal Nehru National Institute of Technology");
        event.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        event.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventActionPerformed(evt);
            }
        });

        nxt.setText("Next");
        nxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtActionPerformed(evt);
            }
        });

        prv.setText("Previous");
        prv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prvActionPerformed(evt);
            }
        });

        jMenu1.setText("Help");

        hlp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        hlp.setText("Help");
        hlp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hlpActionPerformed(evt);
            }
        });
        jMenu1.add(hlp);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(event, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(prv, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nxt, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(reglb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(reglb, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(event, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nxt)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(prv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
       sub.setEnabled(true);
        sub.setVisible(true);
        nxt.setVisible(true);
        prv.setVisible(false);
        c1.setVisible(true);
        c2.setVisible(true);
        c3.setVisible(true);
        c4.setVisible(true);
        none.setVisible(true);
        b=1;
        c1.setText("Abhishek");
        c2.setText("Surbhit");
        c3.setText("Anuj");
        c4.setText("Abhyuday");
        ques.setFont(new java.awt.Font("Times New Roman", 1, 20));
        ques.setText("Choose a deserving candidate for Headboy");
        nxt.setText("Next");
       
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
       sub.setEnabled(true);
        sub.setVisible(true);
        nxt.setVisible(true);
        prv.setVisible(true);
        c1.setVisible(true);
        c2.setVisible(true);
        c3.setVisible(true);
        c4.setVisible(true);
        none.setVisible(true);
        b=2;
        c1.setText("Abhilasha");
        c2.setText("Saumya");
        c3.setText("Aishanya");
        c4.setText("Lavisha");
        ques.setFont(new java.awt.Font("Times New Roman", 1, 20));
        ques.setText("Choose a deserving candidate for Headgirl");
        nxt.setText("Next");
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        sub.setEnabled(true);
        sub.setVisible(true);
        nxt.setVisible(true);
        prv.setVisible(true);
        c1.setVisible(true);
        c2.setVisible(true);
        c3.setVisible(true);
        c4.setVisible(true);
        none.setVisible(true);
        b=3;
        c1.setText("Shivam");
        c2.setText("Varnit");
        c3.setText("Rakesh");
        c4.setText("Mukeh");
        ques.setFont(new java.awt.Font("Times New Roman", 1, 18));
        ques.setText("Choose a deserving candidate for Sports Captain");
        nxt.setText("Next");
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        sub.setEnabled(true);
        sub.setVisible(true);
        nxt.setVisible(false);
        prv.setVisible(true);
        c1.setVisible(true);
        c2.setVisible(true);
        c3.setVisible(true);
        c4.setVisible(true);
        none.setVisible(true);
        b=4;
        c1.setText("Vivek");
        c2.setText("Natasha");
        c3.setText("Anand");
        c4.setText("Vidushi");
        ques.setFont(new java.awt.Font("Times New Roman", 1, 19));
        ques.setText("Choose a deserving candidate for Arts Captain");
        nxt.setText("Send");
    }//GEN-LAST:event_b4ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

    private void nxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtActionPerformed
        switch(b){
            case 1:
                    if(b2.isEnabled())
                       b2.doClick();
                    else if(b3.isEnabled())
                        b3.doClick();
                    else if(b4.isEnabled())
                        b4.doClick();
                  break;
            case 2:
                    if(b3.isEnabled())
                        b3.doClick();
                    else if(b4.isEnabled())
                        b4.doClick();
                  break;
            case 3:
                    if(b4.isEnabled())
                        b4.doClick();
                  break;
            case 4:
                {
                    
                    /*ques.setText("Thank You for using our system.");
                    c1.setVisible(false);
                    c2.setVisible(false);
                    c3.setVisible(false);
                    c4.setVisible(false);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);*/
                    
                }
                  break;
        }
    }//GEN-LAST:event_nxtActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c4ActionPerformed

    private void hlpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hlpActionPerformed
    obj.setVisible(true);
    }//GEN-LAST:event_hlpActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
sub.setEnabled(false);
        try{
       String q="";
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","1234");
        Statement st=cn.createStatement();
        ResultSet rs=null;
        switch(b){
            case 1:if(c1.isSelected()){
                   q="update headboy set vote=vote+1 where name="+"\"Abhishek\""+";";
                   st.executeUpdate(q);
            }if(c2.isSelected()){
                   q="update headboy set vote=vote+1 where name="+"\"Surbhit\""+";";
                   st.executeUpdate(q);
            }if(c3.isSelected()){
                   q="update headboy set vote=vote+1 where name="+"\"Anuj\""+";";
                   st.executeUpdate(q);
            }if(c4.isSelected()){
                   q="update headboy set vote=vote+1 where name="+"\"Abhyuday\""+";";
                   st.executeUpdate(q);
            }
            b1.setEnabled(false);
                break;
            case 2:if(c1.isSelected()){
                   q="update headgirl set vote=vote+1 where name="+"\"Abhilasha\""+";";
                   st.executeUpdate(q);
            }if(c2.isSelected()){
                   q="update headgirl set vote=vote+1 where name="+"\"Saumya\""+";";
                   st.executeUpdate(q);
            }if(c3.isSelected()){
                   q="update headgirl set vote=vote+1 where name="+"\"Aishanya\""+";";
                   st.executeUpdate(q);
            }if(c4.isSelected()){
                   q="update headgirl set vote=vote+1 where name="+"\"Lavisha\""+";";
                   st.executeUpdate(q);
            }b2.setEnabled(false);
                break;
            case 3:if(c1.isSelected()){
                   q="update sportscaptain set vote=vote+1 where name="+"\"Shivam\""+";";
                   st.executeUpdate(q);
            }if(c2.isSelected()){
                   q="update sportscaptain set vote=vote+1 where name="+"\"Varnit\""+";";
                   st.executeUpdate(q);
            }if(c3.isSelected()){
                   q="update sportscaptain set vote=vote+1 where name="+"\"Rakesh\""+";";
                   st.executeUpdate(q);
            }if(c4.isSelected()){
                   q="update sportscaptain set vote=vote+1 where name="+"\"Mukesh\""+";";
                   st.executeUpdate(q);
            }b3.setEnabled(false);
                break;
            case 4:if(c1.isSelected()){
                   q="update artscaptain set vote=vote+1 where name="+"\"Vivek\""+";";
                   st.executeUpdate(q);
            }if(c2.isSelected()){
                   q="update artscaptain set vote=vote+1 where name="+"\"Natasha\""+";";
                   st.executeUpdate(q);
            }if(c3.isSelected()){
                   q="update artscaptain set vote=vote+1 where name="+"\"Anand\""+";";
                   st.executeUpdate(q);
            }if(c4.isSelected()){
                   q="update artscaptain set vote=vote+1 where name="+"\"Vidushi\""+";";
                   st.executeUpdate(q);
            }b4.setEnabled(false);
                break;
                
            
} 
}catch(Exception e){
    
}
if((b1.isEnabled()==false&&b2.isEnabled()==false&&b3.isEnabled()==false&&b4.isEnabled()==false)){
    ty t=new ty();
    t.setVisible(true);
    this.dispose();
            
}
    
    }//GEN-LAST:event_subActionPerformed

    private void prvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prvActionPerformed
        switch(b){
            case 1:;
                  break;
            case 2:
                    if(b1.isEnabled())
                        b1.doClick();
                  break;
            case 3:
                    if(b2.isEnabled())
                        b2.doClick();
                    else if(b1.isEnabled())
                        b1.doClick();
                  break;
            case 4:
                    if(b3.isEnabled())
                       b3.doClick();
                    else if(b2.isEnabled())
                        b2.doClick();
                    else if(b1.isEnabled())
                        b1.doClick();
                  break;
        }
    }//GEN-LAST:event_prvActionPerformed

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
            java.util.logging.Logger.getLogger(layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new layout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton c1;
    private javax.swing.JRadioButton c2;
    private javax.swing.JRadioButton c3;
    private javax.swing.JRadioButton c4;
    private javax.swing.JTextField event;
    private javax.swing.JMenuItem hlp;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton none;
    private javax.swing.JButton nxt;
    private javax.swing.JPanel p1;
    private javax.swing.JButton prv;
    private javax.swing.JLabel ques;
    private javax.swing.JLabel reglb;
    private javax.swing.JButton sub;
    // End of variables declaration//GEN-END:variables
}
