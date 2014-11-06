import java.io.IOException;
import java.net.URL;
import javax.swing.JFrame;

public class CrapsGUI extends javax.swing.JFrame {
Craps game;
boolean newgame;
int money;


    public CrapsGUI() {
        initComponents();
        game = new Craps();
        txtgame.setEditable(false);
        newgame=true;
        txtgame.setText("Welcome to the game! If you roll a 7 or 11 - Win!\n" 
                + "If you roll a 2,3, or 10 - You Lose! \n"
                + "If you don't get 7,11,2,3 or 10\n"
                + "...the game continues!\n"
                + "If you you don't get a 7,11,2,3 or 10 on the\n"
                + "first round, the game continues.\n"
                + "After the first round, you lose with a 7\n"
                + "You win if you match what you got on the first round\n"
                + "And you keep on playing if you don't get a 7 or match\n"
                + "the first round\n"
                + "-----------------\n"
                + "HAVE FUN!!");
        money=100;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnroll = new javax.swing.JButton();
        lbldie1 = new javax.swing.JLabel();
        lblquit = new javax.swing.JButton();
        lbldie2 = new javax.swing.JLabel();
        lblmoney = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtgame = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Craps 2.0");
        setBackground(new java.awt.Color(255, 255, 204));

        btnroll.setBackground(new java.awt.Color(204, 255, 255));
        btnroll.setFont(new java.awt.Font("Euphemia", 3, 11)); // NOI18N
        btnroll.setText("Roll Die");
        btnroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrollActionPerformed(evt);
            }
        });

        lblquit.setBackground(new java.awt.Color(204, 255, 255));
        lblquit.setFont(new java.awt.Font("Euphemia", 3, 11)); // NOI18N
        lblquit.setText("Quit");
        lblquit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblquitActionPerformed(evt);
            }
        });

        lblmoney.setBackground(new java.awt.Color(51, 51, 51));
        lblmoney.setFont(new java.awt.Font("Tekton Pro", 3, 12)); // NOI18N
        lblmoney.setForeground(new java.awt.Color(255, 255, 255));
        lblmoney.setText("$100");
        lblmoney.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblmoney.setOpaque(true);

        lbltotal.setBackground(new java.awt.Color(255, 153, 153));
        lbltotal.setFont(new java.awt.Font("Sylfaen", 3, 11)); // NOI18N
        lbltotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbltotal.setOpaque(true);

        txtgame.setColumns(20);
        txtgame.setRows(5);
        jScrollPane1.setViewportView(txtgame);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("MV Boli", 3, 14)); // NOI18N
        jTextField1.setText(" CRAPS!!");
        jTextField1.setBorder(null);

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("Money ->");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("Roll Total ->");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnroll)
                        .addGap(18, 18, 18)
                        .addComponent(lblquit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbldie1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbldie2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jTextField1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbldie1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldie2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbltotal, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                        .addGap(37, 37, 37)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnroll)
                    .addComponent(lblquit)
                    .addComponent(lblmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrollActionPerformed
   
    game.roll();
    lbldie1.setIcon(game.getDiePic(1));
    lbldie2.setIcon(game.getDiePic(2));
    
    if (newgame){
        txtgame.setText("New Game\n----\n you rolled a: " + game.getTotal());
        newgame=false;
        money-=5;
        lblmoney.setText("$" + money);
    }
    else
        txtgame.append("\n----\n You rolled a: " + game.getTotal());
    lbltotal.setText(""+game.getTotal());
              
    
    if(game.hasWon()){
        txtgame.setText("\n YOU WON! \n click roll to start a new game");
                game=new Craps();
                newgame=true;
                money+=15;
                lblmoney.setText("$"+money);
                
    }
    else if (game.hasLost()){
        txtgame.append("\n YOU LOST! CLICK ROLL TO TRY AGAIN! \n");
                game=new Craps();
                newgame = true;
    }
    else
        txtgame.append("\n THE GAME CONTINUES TO GO ON! \n");
    }//GEN-LAST:event_btnrollActionPerformed

    private void lblquitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblquitActionPerformed
System.exit(0);

    }//GEN-LAST:event_lblquitActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrapsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnroll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbldie1;
    private javax.swing.JLabel lbldie2;
    private javax.swing.JLabel lblmoney;
    private javax.swing.JButton lblquit;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTextArea txtgame;
    // End of variables declaration//GEN-END:variables
}
