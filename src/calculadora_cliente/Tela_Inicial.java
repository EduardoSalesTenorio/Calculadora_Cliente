package calculadora_cliente;

import static java.lang.Double.parseDouble;

public class Tela_Inicial extends javax.swing.JFrame {

    public Tela_Inicial() {
        initComponents();
    }
    float num1, num2, total;
    String operacao;
    String panel = "";
    String a = "";
    boolean cont = true;

    public void converter() {

        if (cont) {
            num1 = Float.parseFloat(a);
            cont = false;
        } else {
            num2 = Float.parseFloat(a);
            cont = true;
        }

    }

    public void pegar() {
        switch (operacao) {
            case "+":
                total = num1 + num2;


                break;
            case "-":
                total = num1 - num2;

                break;
            case "*":
                total = num1 * num2;

                break;
            case "/":
                total = num1 / num2;

                break;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Visor_Numeros = new javax.swing.JTextPane();
        BT_Cinco = new javax.swing.JButton();
        BT_Tres = new javax.swing.JButton();
        BT_Dois = new javax.swing.JButton();
        BT_Quatro = new javax.swing.JButton();
        BT_Oito = new javax.swing.JButton();
        BT_Sete = new javax.swing.JButton();
        BT_Nove = new javax.swing.JButton();
        BT_Seis = new javax.swing.JButton();
        BT_Um = new javax.swing.JButton();
        BT_Ponto = new javax.swing.JButton();
        BT_Zero = new javax.swing.JButton();
        BT_Subtracao = new javax.swing.JButton();
        BT_Divisao = new javax.swing.JButton();
        BT_Multiplicacao = new javax.swing.JButton();
        BT_Soma = new javax.swing.JButton();
        BT_Igualdade = new javax.swing.JButton();
        Visor_Resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Visor_Numeros.setEditable(false);
        Visor_Numeros.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(Visor_Numeros);

        BT_Cinco.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Cinco.setText("5");
        BT_Cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CincoActionPerformed(evt);
            }
        });

        BT_Tres.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Tres.setText("3");
        BT_Tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_TresActionPerformed(evt);
            }
        });

        BT_Dois.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Dois.setText("2");
        BT_Dois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_DoisActionPerformed(evt);
            }
        });

        BT_Quatro.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Quatro.setText("4");
        BT_Quatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_QuatroActionPerformed(evt);
            }
        });

        BT_Oito.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Oito.setText("8");
        BT_Oito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_OitoActionPerformed(evt);
            }
        });

        BT_Sete.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Sete.setText("7");
        BT_Sete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SeteActionPerformed(evt);
            }
        });

        BT_Nove.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Nove.setText("9");
        BT_Nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_NoveActionPerformed(evt);
            }
        });

        BT_Seis.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Seis.setText("6");
        BT_Seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SeisActionPerformed(evt);
            }
        });

        BT_Um.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Um.setText("1");
        BT_Um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_UmActionPerformed(evt);
            }
        });

        BT_Ponto.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Ponto.setText(".");
        BT_Ponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_PontoActionPerformed(evt);
            }
        });

        BT_Zero.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Zero.setText("0");
        BT_Zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ZeroActionPerformed(evt);
            }
        });

        BT_Subtracao.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Subtracao.setText("-");
        BT_Subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SubtracaoActionPerformed(evt);
            }
        });

        BT_Divisao.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Divisao.setText("/");

        BT_Multiplicacao.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Multiplicacao.setText("*");

        BT_Soma.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Soma.setText("+");
        BT_Soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SomaActionPerformed(evt);
            }
        });

        BT_Igualdade.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Igualdade.setText("=");
        BT_Igualdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_IgualdadeActionPerformed(evt);
            }
        });

        Visor_Resultado.setBackground(new java.awt.Color(255, 255, 255));
        Visor_Resultado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Visor_Resultado.setForeground(new java.awt.Color(51, 255, 51));
        Visor_Resultado.setText("Result");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Visor_Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BT_Zero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BT_Ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BT_Um, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BT_Dois, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BT_Tres, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(BT_Quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BT_Cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BT_Seis, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(BT_Sete, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BT_Oito, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BT_Nove, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BT_Subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BT_Soma, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BT_Divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BT_Multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addComponent(BT_Igualdade, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(Visor_Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Sete, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Oito, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Nove, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Seis, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BT_Tres, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT_Dois, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT_Um, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT_Subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BT_Ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BT_Soma, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BT_Zero, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BT_Igualdade, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BT_UmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_UmActionPerformed

        panel += "1";
        a += "1";
        Visor_Numeros.setText(panel);
    }//GEN-LAST:event_BT_UmActionPerformed

    private void BT_SomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SomaActionPerformed

        converter();
        a = "";

        operacao = "+";
        panel += "+";
        Visor_Numeros.setText(panel);

        pegar();

    }//GEN-LAST:event_BT_SomaActionPerformed

    private void BT_DoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_DoisActionPerformed
        panel += "2";
        a += "2";
        Visor_Numeros.setText(panel);
    }//GEN-LAST:event_BT_DoisActionPerformed

    private void BT_TresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_TresActionPerformed
        panel += "3";
        a += "3";
        Visor_Numeros.setText(panel);
    }//GEN-LAST:event_BT_TresActionPerformed

    private void BT_QuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_QuatroActionPerformed
        panel += "4";
        a += "4";
        Visor_Numeros.setText(panel);
    }//GEN-LAST:event_BT_QuatroActionPerformed

    private void BT_CincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CincoActionPerformed
        panel += "5";
        a += "5";
        Visor_Numeros.setText(panel);    }//GEN-LAST:event_BT_CincoActionPerformed

    private void BT_SeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SeisActionPerformed
        panel += "6";
        a += "6";
        Visor_Numeros.setText(panel);    }//GEN-LAST:event_BT_SeisActionPerformed

    private void BT_SeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SeteActionPerformed
        panel += "7";
        a += "7";
        Visor_Numeros.setText(panel);    }//GEN-LAST:event_BT_SeteActionPerformed

    private void BT_OitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_OitoActionPerformed
        panel += "8";
        a += "8";
        Visor_Numeros.setText(panel);    }//GEN-LAST:event_BT_OitoActionPerformed

    private void BT_NoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_NoveActionPerformed
        panel += "9";
        a += "9";
        Visor_Numeros.setText(panel);    }//GEN-LAST:event_BT_NoveActionPerformed

    private void BT_ZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ZeroActionPerformed
        panel += "0";
        a += "0";
        Visor_Numeros.setText(panel);    }//GEN-LAST:event_BT_ZeroActionPerformed

    private void BT_PontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_PontoActionPerformed
        panel += ".";
        a += ".";
        Visor_Numeros.setText(panel);    }//GEN-LAST:event_BT_PontoActionPerformed
    private void BT_SubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SubtracaoActionPerformed
        converter();
        a = "";

        operacao = "-";
        panel += "-";
        Visor_Numeros.setText(panel);

        pegar();
    }//GEN-LAST:event_BT_SubtracaoActionPerformed

    private void BT_IgualdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_IgualdadeActionPerformed

        pegar();
        Visor_Resultado.setText("" + total);
    }//GEN-LAST:event_BT_IgualdadeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Inicial().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Cinco;
    private javax.swing.JButton BT_Divisao;
    private javax.swing.JButton BT_Dois;
    private javax.swing.JButton BT_Igualdade;
    private javax.swing.JButton BT_Multiplicacao;
    private javax.swing.JButton BT_Nove;
    private javax.swing.JButton BT_Oito;
    private javax.swing.JButton BT_Ponto;
    private javax.swing.JButton BT_Quatro;
    private javax.swing.JButton BT_Seis;
    private javax.swing.JButton BT_Sete;
    private javax.swing.JButton BT_Soma;
    private javax.swing.JButton BT_Subtracao;
    private javax.swing.JButton BT_Tres;
    private javax.swing.JButton BT_Um;
    private javax.swing.JButton BT_Zero;
    private javax.swing.JTextPane Visor_Numeros;
    private javax.swing.JLabel Visor_Resultado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
