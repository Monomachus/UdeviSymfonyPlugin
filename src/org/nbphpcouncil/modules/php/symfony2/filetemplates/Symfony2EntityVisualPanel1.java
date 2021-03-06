/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nbphpcouncil.modules.php.symfony2.filetemplates;

import javax.swing.JPanel;

public final class Symfony2EntityVisualPanel1 extends JPanel {
    
     static final String IS_REPO_DECLARED = "isRepositoryDeclared";
     static final String OPTIONAL_TABLE_NAME = "optionalTableName";
    
    
    /**
     * Creates new form Symfony2EntityVisualPanel1
     */
    public Symfony2EntityVisualPanel1() {
        initComponents();
    }

    @Override
    public String getName() {
        return "Step #1";
    }
    
    public boolean isRepositoryDeclared(){
        return declareRepository.isSelected();
    }
    
    public String getOptionalTableName(){
        return txtTableName.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        declareRepository = new javax.swing.JCheckBox();
        txtTableName = new javax.swing.JTextField();
        labelTableName = new javax.swing.JLabel();

        org.openide.awt.Mnemonics.setLocalizedText(declareRepository, org.openide.util.NbBundle.getMessage(Symfony2EntityVisualPanel1.class, "Symfony2EntityVisualPanel1.declareRepository.text")); // NOI18N

        txtTableName.setText(org.openide.util.NbBundle.getMessage(Symfony2EntityVisualPanel1.class, "Symfony2EntityVisualPanel1.txtTableName.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(labelTableName, org.openide.util.NbBundle.getMessage(Symfony2EntityVisualPanel1.class, "Symfony2EntityVisualPanel1.labelTableName.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTableName)
                        .addGap(26, 26, 26)
                        .addComponent(txtTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(declareRepository))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(declareRepository)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTableName, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(txtTableName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox declareRepository;
    private javax.swing.JLabel labelTableName;
    private javax.swing.JTextField txtTableName;
    // End of variables declaration//GEN-END:variables
}
