package View.GUI;

import Controller.Controller;
import Controller.WordControl;
import Model.Word;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * represent for add word dialog
 *
 * @author Nguyễn Phúc
 */
public class AddDialog extends javax.swing.JFrame {

    // controller of this application
    private Controller mainController;
    // controller of word
    private WordControl Controller;
    // Icon true
    ImageIcon iconTrue = new ImageIcon("IconTrue.png");

    /**
     * Creates new form AddDialog
     */
    public AddDialog(Controller controller) {
        this.mainController = controller;
        this.Controller = controller.getWordController();
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbOK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jfWord = new javax.swing.JTextField();
        jfMeaning = new javax.swing.JTextField();
        jbCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jfPronunce = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jImage = new javax.swing.JTextField();
        jImagePreview = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setTitle("Add Word");
        setResizable(false);

        jbOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/GUI/AppIcons/ok.png"))); // NOI18N
        jbOK.setText("OK");
        jbOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOKActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Word:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Meaning:");

        jfWord.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jfMeaning.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jbCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/GUI/AppIcons/cancel.png"))); // NOI18N
        jbCancel.setText("Cancel");
        jbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Pronunciation:");

        jfPronunce.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Image Path:");

        jImage.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jImage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jImageKeyTyped(evt);
            }
        });

        jImagePreview.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel5.setText("Preview:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jfPronunce, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jfMeaning)
                                    .addComponent(jfWord)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jImagePreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jImage)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jbOK, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCancel)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jfWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jfMeaning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jfPronunce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jImagePreview, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbOK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancel))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbCancel, jbOK});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Tạo sự kiện cho jbOK
     *
     * @param evt Sự kiện
     */
    private void jbOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOKActionPerformed
        if (jfWord.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Chưa nhập từ cần thêm.", "Error", JOptionPane.ERROR_MESSAGE);
            jfWord.requestFocus();
            return;
        }
        if (jfMeaning.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Chưa nhập nghĩa từ cần thêm.", "Error", JOptionPane.ERROR_MESSAGE);
            jfMeaning.requestFocus();
            return;
        }
        String Name = jfWord.getText();
        String Meaning = jfMeaning.getText();
        String Pronunce = jfPronunce.getText();
        String ImagePath = jImage.getText();
        
        this.setVisible(false);
        jfWord.setText("");
        jfWord.requestFocus();
        jfMeaning.setText("");
        if (this.Controller.addNewWord(new Word(Name, Meaning, Pronunce, ImagePath))) {
            JOptionPane.showMessageDialog(null, "Thêm từ thành công!", "Information", JOptionPane.INFORMATION_MESSAGE, iconTrue);
        } else {
            JOptionPane.showMessageDialog(null, "Từ đã tồn tại.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        this.mainController.updateView();
    }//GEN-LAST:event_jbOKActionPerformed

    /**
     * Tạo sự kiện cho jbCancel
     *
     * @param evt Sự kiện
     */
    private void jbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelActionPerformed
        this.setVisible(false);
        jfWord.setText("");
        jfWord.requestFocus();
        jfMeaning.setText("");
    }//GEN-LAST:event_jbCancelActionPerformed

    private void jImageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jImageKeyTyped
        if((int)evt.getKeyChar() == 10) {
            String imagePath = jImage.getText();
            Controller.createImage(imagePath, jImagePreview);
        }
    }//GEN-LAST:event_jImageKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jImage;
    private javax.swing.JLabel jImagePreview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton jbOK;
    private javax.swing.JTextField jfMeaning;
    private javax.swing.JTextField jfPronunce;
    private javax.swing.JTextField jfWord;
    // End of variables declaration//GEN-END:variables

    /**
     * Cài đặt icon
     */
    private void setIcon() {
        ImageIcon icon = new ImageIcon("src/View/TitleIcons/IconAdd.png");
        setIconImage(icon.getImage());
    }
}