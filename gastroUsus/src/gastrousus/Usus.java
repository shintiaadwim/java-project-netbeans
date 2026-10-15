/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gastrousus;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Font;

/**
 *
 * @author sharziel
 */
public class Usus extends javax.swing.JFrame {
    private GastroUsus gastroUsus;
    private JTextArea outputTextArea;
    private JScrollPane outputScrollPane;
    
    public Usus() {
        initComponents();
        setupOutputArea();
        gastroUsus = new GastroUsus();
    }

    private void setupOutputArea() {
        outputTextArea = new JTextArea();
        outputTextArea.setEditable(false);
        outputTextArea.setFont(new java.awt.Font("Monospaced", 0, 12));
        outputTextArea.setBackground(new java.awt.Color(255, 255, 255));
        outputTextArea.setForeground(new java.awt.Color(0, 0, 0));
        
        outputScrollPane = new JScrollPane(outputTextArea);
        outputScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        jUsusOutput.removeAll();
        jUsusOutput.setLayout(new java.awt.BorderLayout());
        jUsusOutput.add(outputScrollPane, BorderLayout.CENTER);
        jUsusOutput.revalidate();
        jUsusOutput.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jGastroUsus = new javax.swing.JPanel();
        usus1 = new javax.swing.JCheckBox();
        usus2 = new javax.swing.JCheckBox();
        usus3 = new javax.swing.JCheckBox();
        usus4 = new javax.swing.JCheckBox();
        usus5 = new javax.swing.JCheckBox();
        usus6 = new javax.swing.JCheckBox();
        usus7 = new javax.swing.JCheckBox();
        usus8 = new javax.swing.JCheckBox();
        usus9 = new javax.swing.JCheckBox();
        usus10 = new javax.swing.JCheckBox();
        usus11 = new javax.swing.JCheckBox();
        usus12 = new javax.swing.JCheckBox();
        usus13 = new javax.swing.JCheckBox();
        usus14 = new javax.swing.JCheckBox();
        usus15 = new javax.swing.JCheckBox();
        usus16 = new javax.swing.JCheckBox();
        usus17 = new javax.swing.JCheckBox();
        usus18 = new javax.swing.JCheckBox();
        usus19 = new javax.swing.JCheckBox();
        jUsusOutput = new javax.swing.JPanel();
        labelTreshold = new javax.swing.JLabel();
        hasilPersen = new javax.swing.JTextField();
        labelPersen = new javax.swing.JLabel();
        btnProses = new javax.swing.JToggleButton();
        labelHasilPenyakit1 = new javax.swing.JLabel();
        hasilPenyakit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jGastroUsus.setBackground(new java.awt.Color(0, 204, 204));

        usus1.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        usus1.setForeground(new java.awt.Color(255, 255, 255));
        usus1.setText("Apakah anda sering mengalami buang air besar (>2x)?");
        usus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usus1ActionPerformed(evt);
            }
        });

        usus2.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        usus2.setForeground(new java.awt.Color(255, 255, 255));
        usus2.setText("Apakah anda mengalami berak encer?");

        usus3.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        usus3.setForeground(new java.awt.Color(255, 255, 255));
        usus3.setText("Apakah anda mengalami berak berdarah?");
        usus3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usus3ActionPerformed(evt);
            }
        });

        usus4.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        usus4.setForeground(new java.awt.Color(255, 255, 255));
        usus4.setText("Apakah anda merasa lesu dan tidak bergairah?");
        usus4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usus4ActionPerformed(evt);
            }
        });

        usus5.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        usus5.setForeground(new java.awt.Color(255, 255, 255));
        usus5.setText("Apakah anda tidak selera makan?");
        usus5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usus5ActionPerformed(evt);
            }
        });

        usus6.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        usus6.setForeground(new java.awt.Color(255, 255, 255));
        usus6.setText("Apakah anda merasa mual dan sering muntah  (>1x)?");
        usus6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usus6ActionPerformed(evt);
            }
        });

        usus7.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        usus7.setForeground(new java.awt.Color(255, 255, 255));
        usus7.setText("Apakah anda merasa sakit di bagian perut?");
        usus7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usus7ActionPerformed(evt);
            }
        });

        usus8.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        usus8.setForeground(new java.awt.Color(255, 255, 255));
        usus8.setText("Apakah tekanan darah anda rendah?");
        usus8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usus8ActionPerformed(evt);
            }
        });

        usus9.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        usus9.setForeground(new java.awt.Color(255, 255, 255));
        usus9.setText("Apakah anda merasa pusing?");
        usus9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usus9ActionPerformed(evt);
            }
        });

        usus10.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        usus10.setForeground(new java.awt.Color(255, 255, 255));
        usus10.setText("Apakah anda mengalami pingsan?");
        usus10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usus10ActionPerformed(evt);
            }
        });

        usus11.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        usus11.setForeground(new java.awt.Color(255, 255, 255));
        usus11.setText("Apakah suhu badan anda tinggi?");
        usus11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usus11ActionPerformed(evt);
            }
        });

        usus12.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        usus12.setForeground(new java.awt.Color(255, 255, 255));
        usus12.setText("Apakah anda mengalami luka di bagian tertentu?");
        usus12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usus12ActionPerformed(evt);
            }
        });

        usus13.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        usus13.setForeground(new java.awt.Color(255, 255, 255));
        usus13.setText("Apakah anda tidak dapat menggerakkan anggota badan tertentu?");
        usus13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usus13ActionPerformed(evt);
            }
        });

        usus14.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        usus14.setForeground(new java.awt.Color(255, 255, 255));
        usus14.setText("Apakah anda pernah memakan sesuatu?");
        usus14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usus14ActionPerformed(evt);
            }
        });

        usus15.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        usus15.setForeground(new java.awt.Color(255, 255, 255));
        usus15.setText("Apakah anda memakan daging?");
        usus15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usus15ActionPerformed(evt);
            }
        });

        usus16.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        usus16.setForeground(new java.awt.Color(255, 255, 255));
        usus16.setText("Apakah anda memakan jamur?");
        usus16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usus16ActionPerformed(evt);
            }
        });

        usus17.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        usus17.setForeground(new java.awt.Color(255, 255, 255));
        usus17.setText("Apakah anda memakan makanan kaleng?");
        usus17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usus17ActionPerformed(evt);
            }
        });

        usus18.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        usus18.setForeground(new java.awt.Color(255, 255, 255));
        usus18.setText("Apakah anda membeli susu?");
        usus18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usus18ActionPerformed(evt);
            }
        });

        usus19.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        usus19.setForeground(new java.awt.Color(255, 255, 255));
        usus19.setText("Apakah anda meminum susu?");
        usus19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usus19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jGastroUsusLayout = new javax.swing.GroupLayout(jGastroUsus);
        jGastroUsus.setLayout(jGastroUsusLayout);
        jGastroUsusLayout.setHorizontalGroup(
            jGastroUsusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jGastroUsusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jGastroUsusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usus2)
                    .addComponent(usus3)
                    .addComponent(usus5)
                    .addComponent(usus6)
                    .addComponent(usus7)
                    .addComponent(usus8)
                    .addComponent(usus4)
                    .addComponent(usus1)
                    .addComponent(usus9)
                    .addComponent(usus11)
                    .addComponent(usus12)
                    .addComponent(usus13)
                    .addComponent(usus14)
                    .addComponent(usus10)
                    .addComponent(usus15)
                    .addComponent(usus16)
                    .addComponent(usus17)
                    .addComponent(usus18)
                    .addComponent(usus19))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jGastroUsusLayout.setVerticalGroup(
            jGastroUsusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jGastroUsusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usus1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usus2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usus3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usus4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usus5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usus6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usus7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usus8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usus9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usus10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usus11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usus12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usus13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usus14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usus15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usus16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usus17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usus18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usus19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jUsusOutput.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jUsusOutputLayout = new javax.swing.GroupLayout(jUsusOutput);
        jUsusOutput.setLayout(jUsusOutputLayout);
        jUsusOutputLayout.setHorizontalGroup(
            jUsusOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jUsusOutputLayout.setVerticalGroup(
            jUsusOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        labelTreshold.setText("Threshold");

        hasilPersen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilPersenActionPerformed(evt);
            }
        });

        labelPersen.setText("%");

        btnProses.setText("Proses");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });

        labelHasilPenyakit1.setText("Anda terkena penyakit :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelTreshold)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hasilPersen, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPersen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProses)
                        .addGap(102, 102, 102)
                        .addComponent(labelHasilPenyakit1))
                    .addComponent(jGastroUsus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hasilPenyakit, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addComponent(jUsusOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jGastroUsus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jUsusOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPersen)
                    .addComponent(labelTreshold)
                    .addComponent(hasilPersen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProses)
                    .addComponent(hasilPenyakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHasilPenyakit1))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usus1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usus1ActionPerformed

    private void usus3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usus3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usus3ActionPerformed

    private void usus4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usus4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usus4ActionPerformed

    private void usus5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usus5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usus5ActionPerformed

    private void usus6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usus6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usus6ActionPerformed

    private void usus7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usus7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usus7ActionPerformed

    private void usus8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usus8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usus8ActionPerformed

    private void usus9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usus9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usus9ActionPerformed

    private void usus10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usus10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usus10ActionPerformed

    private void usus11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usus11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usus11ActionPerformed

    private void usus12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usus12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usus12ActionPerformed

    private void usus13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usus13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usus13ActionPerformed

    private void usus14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usus14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usus14ActionPerformed

    private void usus15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usus15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usus15ActionPerformed

    private void usus16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usus16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usus16ActionPerformed

    private void usus17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usus17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usus17ActionPerformed

    private void usus18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usus18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usus18ActionPerformed

    private void usus19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usus19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usus19ActionPerformed

    private void hasilPersenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilPersenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilPersenActionPerformed

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        if (gastroUsus == null) {
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
            gastroUsus = new GastroUsus(threshold);
            System.out.println("Threshold diset ke: " + threshold + "%");
        } else {
            try {
                int newThreshold = Integer.parseInt(hasilPersen.getText().trim());
                if (newThreshold >= 0 && newThreshold <= 100) {
                    gastroUsus.setThreshold(newThreshold);
                    System.out.println("Threshold diupdate ke: " + newThreshold + "%");
                }
            } catch (NumberFormatException e) {
                // ignore
            }
        }

        javax.swing.JCheckBox[] checkBoxes = {
            usus1, usus2, usus3, usus4, usus5, usus6, usus7, usus8, usus9, usus10,
            usus11, usus12, usus13, usus14, usus15, usus16, usus17, usus18, usus19
        };

        boolean[] answers = gastroUsus.collectAnswers(checkBoxes);
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

        String result = gastroUsus.diagnoseComplete(answers);
        System.out.println("\n=== HASIL DIAGNOSA ===");
        System.out.println(result);

        if (outputTextArea != null) {
            outputTextArea.setText(result);
            outputTextArea.setCaretPosition(0);
        } else {
            System.out.println("WARNING: outputTextArea masih null!");
            System.out.println(result);
        }

        String mainDisease = gastroUsus.getMainDisease(answers);
        hasilPenyakit.setText(mainDisease);
        hasilPenyakit.setPreferredSize(new java.awt.Dimension(300, 35));
        hasilPenyakit.setEditable(false);
        hasilPenyakit.setBackground(new java.awt.Color(240, 240, 240));
        hasilPenyakit.setFont(new java.awt.Font("Arial", Font.BOLD, 14));
        hasilPenyakit.setVisible(true);

        double topScore = gastroUsus.getTopScore(answers);
        hasilPersen.setText(String.valueOf((int)topScore));

        javax.swing.JOptionPane.showMessageDialog(this,
            "DIAGNOSA SELESAI! \n\n" +
            "Gejala dipilih: " + selectedCount + " gejala\n" +
            "Penyakit: " + mainDisease + "\n" +
            "Tingkat Keyakinan: " + String.format("%.1f", topScore) + "%",
            "Hasil Diagnosa",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnProsesActionPerformed

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
            java.util.logging.Logger.getLogger(Usus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnProses;
    private javax.swing.JTextField hasilPenyakit;
    private javax.swing.JTextField hasilPersen;
    private javax.swing.JPanel jGastroUsus;
    private javax.swing.JPanel jUsusOutput;
    private javax.swing.JLabel labelHasilPenyakit1;
    private javax.swing.JLabel labelPersen;
    private javax.swing.JLabel labelTreshold;
    private javax.swing.JCheckBox usus1;
    private javax.swing.JCheckBox usus10;
    private javax.swing.JCheckBox usus11;
    private javax.swing.JCheckBox usus12;
    private javax.swing.JCheckBox usus13;
    private javax.swing.JCheckBox usus14;
    private javax.swing.JCheckBox usus15;
    private javax.swing.JCheckBox usus16;
    private javax.swing.JCheckBox usus17;
    private javax.swing.JCheckBox usus18;
    private javax.swing.JCheckBox usus19;
    private javax.swing.JCheckBox usus2;
    private javax.swing.JCheckBox usus3;
    private javax.swing.JCheckBox usus4;
    private javax.swing.JCheckBox usus5;
    private javax.swing.JCheckBox usus6;
    private javax.swing.JCheckBox usus7;
    private javax.swing.JCheckBox usus8;
    private javax.swing.JCheckBox usus9;
    // End of variables declaration//GEN-END:variables
}
