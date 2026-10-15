/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistempakar;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Font;

/**
 *
 * @author sharziel
 */
public class Diagnosa extends javax.swing.JFrame {
    private SistemPakar sistemPakar;
    private JTextArea outputTextArea;
    private JScrollPane outputScrollPane;

    public Diagnosa() {
        initComponents();
        setupOutputArea();
    }
    
    private void setupOutputArea() {
        outputTextArea = new JTextArea();
        outputTextArea.setEditable(false);
        outputTextArea.setFont(new java.awt.Font("Monospaced", 0, 12));
        outputTextArea.setBackground(new java.awt.Color(255, 255, 255));
        outputTextArea.setForeground(new java.awt.Color(0, 0, 0));
        
        outputScrollPane = new JScrollPane(outputTextArea);
        outputScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        jDiagnosaOutput.removeAll();
        jDiagnosaOutput.setLayout(new java.awt.BorderLayout());
        jDiagnosaOutput.add(outputScrollPane, BorderLayout.CENTER);
        jDiagnosaOutput.revalidate();
        jDiagnosaOutput.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDiagnosaPenyakit = new javax.swing.JPanel();
        diangnosa1 = new javax.swing.JCheckBox();
        diangnosa2 = new javax.swing.JCheckBox();
        diangnosa3 = new javax.swing.JCheckBox();
        diangnosa4 = new javax.swing.JCheckBox();
        diangnosa5 = new javax.swing.JCheckBox();
        diangnosa6 = new javax.swing.JCheckBox();
        diangnosa7 = new javax.swing.JCheckBox();
        diangnosa8 = new javax.swing.JCheckBox();
        diangnosa9 = new javax.swing.JCheckBox();
        diangnosa10 = new javax.swing.JCheckBox();
        diangnosa11 = new javax.swing.JCheckBox();
        diangnosa12 = new javax.swing.JCheckBox();
        diangnosa13 = new javax.swing.JCheckBox();
        diangnosa14 = new javax.swing.JCheckBox();
        diangnosa15 = new javax.swing.JCheckBox();
        diangnosa16 = new javax.swing.JCheckBox();
        diangnosa17 = new javax.swing.JCheckBox();
        diangnosa18 = new javax.swing.JCheckBox();
        diagnosa19 = new javax.swing.JCheckBox();
        jDiagnosaOutput = new javax.swing.JPanel();
        labelTreshold = new javax.swing.JLabel();
        hasilPenyakit = new javax.swing.JTextField();
        labelPersen = new javax.swing.JLabel();
        labelHasilPenyakit1 = new javax.swing.JLabel();
        hasilPersen = new javax.swing.JTextField();
        btnProses = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDiagnosaPenyakit.setBackground(new java.awt.Color(0, 153, 204));

        diangnosa1.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        diangnosa1.setForeground(new java.awt.Color(255, 255, 255));
        diangnosa1.setText("Apakah anda sering mengalami buang air besar (>2x)?");
        diangnosa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diangnosa1ActionPerformed(evt);
            }
        });

        diangnosa2.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        diangnosa2.setForeground(new java.awt.Color(255, 255, 255));
        diangnosa2.setText("Apakah anda mengalami berak encer?");

        diangnosa3.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        diangnosa3.setForeground(new java.awt.Color(255, 255, 255));
        diangnosa3.setText("Apakah anda mengalami berak berdarah?");
        diangnosa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diangnosa3ActionPerformed(evt);
            }
        });

        diangnosa4.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        diangnosa4.setForeground(new java.awt.Color(255, 255, 255));
        diangnosa4.setText("Apakah anda merasa lesu dan tidak bergairah?");
        diangnosa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diangnosa4ActionPerformed(evt);
            }
        });

        diangnosa5.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        diangnosa5.setForeground(new java.awt.Color(255, 255, 255));
        diangnosa5.setText("Apakah anda tidak selera makan?");
        diangnosa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diangnosa5ActionPerformed(evt);
            }
        });

        diangnosa6.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        diangnosa6.setForeground(new java.awt.Color(255, 255, 255));
        diangnosa6.setText("Apakah anda merasa mual dan sering muntah  (>1x)?");
        diangnosa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diangnosa6ActionPerformed(evt);
            }
        });

        diangnosa7.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        diangnosa7.setForeground(new java.awt.Color(255, 255, 255));
        diangnosa7.setText("Apakah anda merasa sakit di bagian perut?");
        diangnosa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diangnosa7ActionPerformed(evt);
            }
        });

        diangnosa8.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        diangnosa8.setForeground(new java.awt.Color(255, 255, 255));
        diangnosa8.setText("Apakah tekanan darah anda rendah?");
        diangnosa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diangnosa8ActionPerformed(evt);
            }
        });

        diangnosa9.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        diangnosa9.setForeground(new java.awt.Color(255, 255, 255));
        diangnosa9.setText("Apakah anda merasa pusing?");
        diangnosa9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diangnosa9ActionPerformed(evt);
            }
        });

        diangnosa10.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        diangnosa10.setForeground(new java.awt.Color(255, 255, 255));
        diangnosa10.setText("Apakah anda mengalami pingsan?");
        diangnosa10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diangnosa10ActionPerformed(evt);
            }
        });

        diangnosa11.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        diangnosa11.setForeground(new java.awt.Color(255, 255, 255));
        diangnosa11.setText("Apakah suhu badan anda tinggi?");
        diangnosa11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diangnosa11ActionPerformed(evt);
            }
        });

        diangnosa12.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        diangnosa12.setForeground(new java.awt.Color(255, 255, 255));
        diangnosa12.setText("Apakah anda mengalami luka di bagian tertentu?");
        diangnosa12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diangnosa12ActionPerformed(evt);
            }
        });

        diangnosa13.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        diangnosa13.setForeground(new java.awt.Color(255, 255, 255));
        diangnosa13.setText("Apakah anda tidak dapat menggerakkan anggota badan tertentu?");
        diangnosa13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diangnosa13ActionPerformed(evt);
            }
        });

        diangnosa14.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        diangnosa14.setForeground(new java.awt.Color(255, 255, 255));
        diangnosa14.setText("Apakah anda pernah memakan sesuatu?");
        diangnosa14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diangnosa14ActionPerformed(evt);
            }
        });

        diangnosa15.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        diangnosa15.setForeground(new java.awt.Color(255, 255, 255));
        diangnosa15.setText("Apakah anda memakan daging?");
        diangnosa15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diangnosa15ActionPerformed(evt);
            }
        });

        diangnosa16.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        diangnosa16.setForeground(new java.awt.Color(255, 255, 255));
        diangnosa16.setText("Apakah anda memakan jamur?");
        diangnosa16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diangnosa16ActionPerformed(evt);
            }
        });

        diangnosa17.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        diangnosa17.setForeground(new java.awt.Color(255, 255, 255));
        diangnosa17.setText("Apakah anda memakan makanan kaleng?");
        diangnosa17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diangnosa17ActionPerformed(evt);
            }
        });

        diangnosa18.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        diangnosa18.setForeground(new java.awt.Color(255, 255, 255));
        diangnosa18.setText("Apakah anda membeli susu?");
        diangnosa18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diangnosa18ActionPerformed(evt);
            }
        });

        diagnosa19.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        diagnosa19.setForeground(new java.awt.Color(255, 255, 255));
        diagnosa19.setText("Apakah anda meminum susu?");
        diagnosa19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnosa19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDiagnosaPenyakitLayout = new javax.swing.GroupLayout(jDiagnosaPenyakit);
        jDiagnosaPenyakit.setLayout(jDiagnosaPenyakitLayout);
        jDiagnosaPenyakitLayout.setHorizontalGroup(
            jDiagnosaPenyakitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDiagnosaPenyakitLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDiagnosaPenyakitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diangnosa2)
                    .addComponent(diangnosa3)
                    .addComponent(diangnosa5)
                    .addComponent(diangnosa6)
                    .addComponent(diangnosa7)
                    .addComponent(diangnosa8)
                    .addComponent(diangnosa4)
                    .addComponent(diangnosa1)
                    .addComponent(diangnosa9)
                    .addComponent(diangnosa11)
                    .addComponent(diangnosa12)
                    .addComponent(diangnosa13)
                    .addComponent(diangnosa14)
                    .addComponent(diangnosa10)
                    .addComponent(diangnosa15)
                    .addComponent(diangnosa16)
                    .addComponent(diangnosa17)
                    .addComponent(diangnosa18)
                    .addComponent(diagnosa19))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jDiagnosaPenyakitLayout.setVerticalGroup(
            jDiagnosaPenyakitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDiagnosaPenyakitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(diangnosa1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diangnosa2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diangnosa3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diangnosa4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diangnosa5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diangnosa6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diangnosa7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diangnosa8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diangnosa9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diangnosa10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diangnosa11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diangnosa12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diangnosa13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diangnosa14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diangnosa15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diangnosa16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diangnosa17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diangnosa18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diagnosa19)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jDiagnosaOutput.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDiagnosaOutputLayout = new javax.swing.GroupLayout(jDiagnosaOutput);
        jDiagnosaOutput.setLayout(jDiagnosaOutputLayout);
        jDiagnosaOutputLayout.setHorizontalGroup(
            jDiagnosaOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDiagnosaOutputLayout.setVerticalGroup(
            jDiagnosaOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        labelTreshold.setText("Threshold");

        labelPersen.setText("%");

        labelHasilPenyakit1.setText("Anda terkena penyakit :");

        hasilPersen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilPersenActionPerformed(evt);
            }
        });

        btnProses.setText("Proses");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelTreshold)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hasilPersen, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPersen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProses)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelHasilPenyakit1))
                    .addComponent(jDiagnosaPenyakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hasilPenyakit, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addComponent(jDiagnosaOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDiagnosaPenyakit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDiagnosaOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPersen)
                    .addComponent(labelTreshold)
                    .addComponent(hasilPersen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProses)
                    .addComponent(hasilPenyakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHasilPenyakit1))
                .addGap(18, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void diangnosa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diangnosa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diangnosa1ActionPerformed

    private void diangnosa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diangnosa3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diangnosa3ActionPerformed

    private void diangnosa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diangnosa4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diangnosa4ActionPerformed

    private void diangnosa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diangnosa5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diangnosa5ActionPerformed

    private void diangnosa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diangnosa6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diangnosa6ActionPerformed

    private void diangnosa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diangnosa7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diangnosa7ActionPerformed

    private void diangnosa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diangnosa8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diangnosa8ActionPerformed

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        if (sistemPakar == null) {
            int threshold = 80; // default
            try {
                threshold = Integer.parseInt(hasilPersen.getText().trim());
                if (threshold < 0 || threshold > 100) {
                    threshold = 80;
                    hasilPersen.setText("80");
                }
            } catch (NumberFormatException e) {
                hasilPersen.setText("80");
                threshold = 80;
            }
            sistemPakar = new SistemPakar(threshold);
            System.out.println("Threshold diset ke: " + threshold + "%");
        } else {
            try {
                int newThreshold = Integer.parseInt(hasilPersen.getText().trim());
                if (newThreshold >= 0 && newThreshold <= 100) {
                    sistemPakar.setThreshold(newThreshold);
                    System.out.println("Threshold diupdate ke: " + newThreshold + "%");
                }
            } catch (NumberFormatException e) {
                // ignore
            }
        }

        javax.swing.JCheckBox[] checkBoxes = {
            diangnosa1, diangnosa2, diangnosa3, diangnosa4, diangnosa5,
            diangnosa6, diangnosa7, diangnosa8, diangnosa9, diangnosa10,
            diangnosa11, diangnosa12, diangnosa13, diangnosa14, diangnosa15,
            diangnosa16, diangnosa17, diangnosa18, diagnosa19
        };

        boolean[] answers = sistemPakar.collectAnswers(checkBoxes);
        int selectedCount = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i]) {
                selectedCount++;
            }
        }

        if (selectedCount == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Silakan pilih gejala yang anda alami terlebih dahulu!", 
                "Peringatan", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        System.out.println("\n=== GEJALA YANG DIPILIH (" + selectedCount + " gejala) ===");
        for (int i = 0; i < answers.length; i++) {
            if (answers[i]) {
                System.out.println((i+1) + ". " + checkBoxes[i].getText());
            }
        }

        String result = sistemPakar.diagnoseComplete(answers);
        System.out.println("\n=== HASIL DIAGNOSA ===");
        System.out.println(result);

        if (outputTextArea != null) {
            outputTextArea.setText(result);
            outputTextArea.setCaretPosition(0);
        } else {
            System.out.println("WARNING: outputTextArea masih null!");
            System.out.println(result);
        }

        String mainDisease = sistemPakar.getMainDisease(answers);
        hasilPenyakit.setText(mainDisease);
        hasilPenyakit.setPreferredSize(new java.awt.Dimension(300, 35));
        hasilPenyakit.setEditable(false);
        hasilPenyakit.setBackground(new java.awt.Color(240, 240, 240));
        hasilPenyakit.setFont(new java.awt.Font("Arial", Font.BOLD, 14));
        hasilPenyakit.setVisible(true);

        double topScore = sistemPakar.getTopScore(answers);
        hasilPersen.setText(String.valueOf((int)topScore));

        javax.swing.JOptionPane.showMessageDialog(this, 
            "Gejala dipilih: " + selectedCount + " gejala\n" +
            "Penyakit: " + mainDisease + "\n" +
            "Tingkat Keyakinan: " + String.format("%.1f", topScore) + "%",
            "Hasil Diagnosa", 
        javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnProsesActionPerformed

    private void diangnosa9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diangnosa9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diangnosa9ActionPerformed

    private void diangnosa10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diangnosa10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diangnosa10ActionPerformed

    private void diangnosa11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diangnosa11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diangnosa11ActionPerformed

    private void diangnosa12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diangnosa12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diangnosa12ActionPerformed

    private void diangnosa13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diangnosa13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diangnosa13ActionPerformed

    private void diangnosa14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diangnosa14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diangnosa14ActionPerformed

    private void diangnosa15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diangnosa15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diangnosa15ActionPerformed

    private void diangnosa16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diangnosa16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diangnosa16ActionPerformed

    private void diangnosa17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diangnosa17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diangnosa17ActionPerformed

    private void diangnosa18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diangnosa18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diangnosa18ActionPerformed

    private void diagnosa19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnosa19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diagnosa19ActionPerformed

    private void hasilPersenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilPersenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilPersenActionPerformed

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
            java.util.logging.Logger.getLogger(Diagnosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diagnosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diagnosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diagnosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diagnosa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnProses;
    private javax.swing.JCheckBox diagnosa19;
    private javax.swing.JCheckBox diangnosa1;
    private javax.swing.JCheckBox diangnosa10;
    private javax.swing.JCheckBox diangnosa11;
    private javax.swing.JCheckBox diangnosa12;
    private javax.swing.JCheckBox diangnosa13;
    private javax.swing.JCheckBox diangnosa14;
    private javax.swing.JCheckBox diangnosa15;
    private javax.swing.JCheckBox diangnosa16;
    private javax.swing.JCheckBox diangnosa17;
    private javax.swing.JCheckBox diangnosa18;
    private javax.swing.JCheckBox diangnosa2;
    private javax.swing.JCheckBox diangnosa3;
    private javax.swing.JCheckBox diangnosa4;
    private javax.swing.JCheckBox diangnosa5;
    private javax.swing.JCheckBox diangnosa6;
    private javax.swing.JCheckBox diangnosa7;
    private javax.swing.JCheckBox diangnosa8;
    private javax.swing.JCheckBox diangnosa9;
    private javax.swing.JTextField hasilPenyakit;
    private javax.swing.JTextField hasilPersen;
    private javax.swing.JPanel jDiagnosaOutput;
    private javax.swing.JPanel jDiagnosaPenyakit;
    private javax.swing.JLabel labelHasilPenyakit1;
    private javax.swing.JLabel labelPersen;
    private javax.swing.JLabel labelTreshold;
    // End of variables declaration//GEN-END:variables
}
