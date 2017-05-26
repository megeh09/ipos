/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipos.view.stock.out;

import com.ipos.entity.Item;
import com.ipos.entity.Personnel;
import com.ipos.entity.Stock;
import com.ipos.entity.StockWithdrawal;
import com.ipos.helper.util.DateUtil;
import com.ipos.helper.util.DecimalFormatterUtil;
import com.ipos.helper.util.JComboBoxModelUtil;
import com.ipos.jpa.controller.ItemJpaController;
import com.ipos.jpa.controller.PersonnelJpaController;
import com.ipos.jpa.controller.StockJpaController;
import com.ipos.jpa.controller.StockWithdrawalJpaController;
import com.ipos.jpa.controller.UnitJpaController;
import com.ipos.start.IPOS;
import java.awt.HeadlessException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author megeh
 */
public class StockWithdrawalDialog extends javax.swing.JDialog {

    private StockWithdrawalJpaController controller;
    private StockJpaController stockJpaController;
    private PersonnelJpaController personnelJpaController;
    private ItemJpaController itemJpaController;
    private UnitJpaController unitJpaController;
    private DecimalFormatterUtil dfNoComma;
    private DecimalFormatterUtil dfWithComma;
    private Stock stock;

    /**
     * Creates new form StockInDialog
     *
     * @param parent
     * @param modal
     * @param emf
     */
    public StockWithdrawalDialog(java.awt.Frame parent, boolean modal, EntityManagerFactory emf) {
        super(parent, modal);
        initComponents();
        initElements(emf);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        centerPanel = new javax.swing.JPanel();
        bottomSeparator = new javax.swing.JSeparator();
        quantityLabel = new javax.swing.JLabel();
        quantityFormattedTextField = new javax.swing.JFormattedTextField();
        purposeLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        purposeTextArea = new javax.swing.JTextArea();
        personnelLabel = new javax.swing.JLabel();
        personnelComboBox = new javax.swing.JComboBox();
        unitLabel = new javax.swing.JLabel();
        itemLabel = new javax.swing.JLabel();
        itemComboBox = new javax.swing.JComboBox();
        stockLabel = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();
        withdrawButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Stock Withdrawal");

        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        mainPanel.add(topPanel, java.awt.BorderLayout.NORTH);

        quantityLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quantityLabel.setText("Quantity");

        quantityFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        quantityFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        quantityFormattedTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quantityFormattedTextField.setName("assetValue"); // NOI18N
        quantityFormattedTextField.setPreferredSize(new java.awt.Dimension(6, 27));

        purposeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        purposeLabel.setText("Purpose");

        purposeTextArea.setColumns(20);
        purposeTextArea.setRows(5);
        jScrollPane1.setViewportView(purposeTextArea);

        personnelLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        personnelLabel.setText("Personnel");

        personnelComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        personnelComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        personnelComboBox.setName("approvedBy"); // NOI18N
        personnelComboBox.setPreferredSize(new java.awt.Dimension(205, 27));

        unitLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        unitLabel.setForeground(new java.awt.Color(255, 0, 0));
        unitLabel.setText("-- unit --");

        itemLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itemLabel.setText("Item");

        itemComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itemComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        itemComboBox.setName("approvedBy"); // NOI18N
        itemComboBox.setPreferredSize(new java.awt.Dimension(205, 27));
        itemComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemComboBoxActionPerformed(evt);
            }
        });

        stockLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stockLabel.setForeground(new java.awt.Color(255, 0, 0));
        stockLabel.setText("-- item --");

        javax.swing.GroupLayout centerPanelLayout = new javax.swing.GroupLayout(centerPanel);
        centerPanel.setLayout(centerPanelLayout);
        centerPanelLayout.setHorizontalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bottomSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(centerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(centerPanelLayout.createSequentialGroup()
                        .addComponent(purposeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(centerPanelLayout.createSequentialGroup()
                        .addComponent(personnelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(personnelComboBox, 0, 296, Short.MAX_VALUE))
                    .addGroup(centerPanelLayout.createSequentialGroup()
                        .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantityFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(centerPanelLayout.createSequentialGroup()
                        .addComponent(itemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stockLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(itemComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        centerPanelLayout.setVerticalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(purposeLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personnelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personnelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stockLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityLabel)
                    .addComponent(quantityFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(bottomSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainPanel.add(centerPanel, java.awt.BorderLayout.CENTER);

        bottomPanel.setPreferredSize(new java.awt.Dimension(400, 50));

        withdrawButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        withdrawButton.setText("WITHDRAW");
        withdrawButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cancelButton.setText("CANCEL");
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(withdrawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(withdrawButton, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        mainPanel.add(bottomPanel, java.awt.BorderLayout.SOUTH);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        StockWithdrawal entity = new StockWithdrawal();

        try {
            // Check if it has unit and supplier selected.
            if (personnelComboBox.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Error, please select personnel.", "Failed", JOptionPane.ERROR_MESSAGE);

                return;
            }
            
            if (itemComboBox.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Error, please select item.", "Failed", JOptionPane.ERROR_MESSAGE);

                return;
            }

            entity.setPurpose(purposeTextArea.getText());
            entity.setQuantity(dfNoComma.format(quantityFormattedTextField.getText()));
            entity.setDate(DateUtil.current());
            entity.setFKstockId((stock).getId());
            entity.setFKpersonnelId(((Personnel) personnelComboBox.getSelectedItem()).getId());
            entity.setFKcreatedByUserId(IPOS.currentUser.getId());

            controller.create(entity);

            // Update stock on quantity withdrawn.
            stock.setQuantity(stock.getQuantity().subtract(entity.getQuantity()));

            stockJpaController.edit(stock);

            JOptionPane.showMessageDialog(null, "Stock successfully withdrawn.", "Sucess", JOptionPane.INFORMATION_MESSAGE);

            hideThis();
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Error, stock not withdrawn.", "Failed", JOptionPane.ERROR_MESSAGE);

            Logger.getLogger(StockWithdrawalDialog.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(StockWithdrawalDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_withdrawButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        hideThis();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void itemComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemComboBoxActionPerformed
        Item item = (Item) itemComboBox.getSelectedItem();
        List<Stock> stocks = stockJpaController.findStock(item);

        if (!stocks.isEmpty()) {
            stock = stocks.get(0);
        }

        stockLabel.setText(stock.getCode().concat(" / ").concat(stock.getStockCardNumber()));
        unitLabel.setText(unitJpaController.findUnit(item.getFKunitId()).getDescription());
        quantityFormattedTextField.setText(dfNoComma.format(stock.getQuantity()));
    }//GEN-LAST:event_itemComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JSeparator bottomSeparator;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JComboBox itemComboBox;
    private javax.swing.JLabel itemLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JComboBox personnelComboBox;
    private javax.swing.JLabel personnelLabel;
    private javax.swing.JLabel purposeLabel;
    private javax.swing.JTextArea purposeTextArea;
    public javax.swing.JFormattedTextField quantityFormattedTextField;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JLabel stockLabel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel unitLabel;
    private javax.swing.JButton withdrawButton;
    // End of variables declaration//GEN-END:variables

    private void initElements(EntityManagerFactory emf) {
        controller = new StockWithdrawalJpaController(emf);
        stockJpaController = new StockJpaController(emf);
        personnelJpaController = new PersonnelJpaController(emf);
        itemJpaController = new ItemJpaController(emf);
        unitJpaController = new UnitJpaController(emf);
        dfNoComma = new DecimalFormatterUtil("#####0.00");
        dfWithComma = new DecimalFormatterUtil();

        // Set combo box.
        itemComboBox.setModel(JComboBoxModelUtil.getItemModel("Select Item", itemJpaController.findItemEntities()));
        personnelComboBox.setModel(JComboBoxModelUtil.getPersonnelModel("Select Personnel", personnelJpaController.findPersonnelEntities()));
    }

    private void hideThis() {
        this.setVisible(false);
    }
}
