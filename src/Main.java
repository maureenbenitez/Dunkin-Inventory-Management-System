import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Main extends javax.swing.JFrame {
    ArrayList<Donut> list;
    ArrayList<Double> totalItems = new ArrayList<>();
    String header[] = new String[] { "Product", "Quantity", "Price" };
    DefaultTableModel dtm;
    int row, col;
    int counter = 0;
    double total = 0;
    
    public Main() {
        initComponents();
        list = new ArrayList<>();
        dtm = new DefaultTableModel(header, 0);
        jTableDisplayInventory.setModel(dtm);
        this.setLocationRelativeTo(null);
        loadData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextProduct = new javax.swing.JTextField();
        jTextPrice = new javax.swing.JTextField();
        jTextQuantity = new javax.swing.JTextField();
        jButtonClear = new javax.swing.JButton();
        jLabelProd = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jLabelQty = new javax.swing.JLabel();
        jTextSearch = new javax.swing.JTextField();
        jLabelSearch = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDisplayInventory = new javax.swing.JTable();
        jButtonPurchase = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonDel = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaReceipt = new javax.swing.JTextArea();
        jLabelPayment = new javax.swing.JLabel();
        jTextFieldPayment = new javax.swing.JTextField();
        jButtonTransaction = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dunkin' Donuts");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1080, 640));
        setName("Dunkin' Donuts"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextProduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextProductActionPerformed(evt);
            }
        });
        jPanel1.add(jTextProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 150, 30));

        jTextPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPriceActionPerformed(evt);
            }
        });
        jPanel1.add(jTextPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 150, 30));

        jTextQuantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextQuantityActionPerformed(evt);
            }
        });
        jPanel1.add(jTextQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 150, 30));

        jButtonClear.setBackground(new java.awt.Color(245, 131, 33));
        jButtonClear.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClear.setText("Clear Field");
        jButtonClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 90, 44));

        jLabelProd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelProd.setText("Product");
        jPanel1.add(jLabelProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, 20));

        jLabelPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPrice.setText("Price");
        jPanel1.add(jLabelPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        jLabelQty.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelQty.setText("Quantity");
        jPanel1.add(jLabelQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jTextSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSearchActionPerformed(evt);
            }
        });
        jTextSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextSearchKeyReleased(evt);
            }
        });
        jPanel1.add(jTextSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 340, 30));

        jLabelSearch.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSearch.setText("Search Inventory");
        jPanel1.add(jLabelSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, 20));

        jTableDisplayInventory.setBackground(new java.awt.Color(204, 204, 204));
        jTableDisplayInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDisplayInventory.getTableHeader().setReorderingAllowed(false);
        jTableDisplayInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDisplayInventoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDisplayInventory);
        if (jTableDisplayInventory.getColumnModel().getColumnCount() > 0) {
            jTableDisplayInventory.getColumnModel().getColumn(0).setResizable(false);
            jTableDisplayInventory.getColumnModel().getColumn(1).setResizable(false);
            jTableDisplayInventory.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 207, 450, 410));

        jButtonPurchase.setBackground(new java.awt.Color(225, 26, 132));
        jButtonPurchase.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButtonPurchase.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPurchase.setText("Purchase");
        jButtonPurchase.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPurchaseActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 90, 44));

        jButtonAdd.setBackground(new java.awt.Color(255, 219, 164));
        jButtonAdd.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(102, 54, 0));
        jButtonAdd.setText("Add to Inventory");
        jButtonAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAdd.setMaximumSize(new java.awt.Dimension(100, 20));
        jButtonAdd.setMinimumSize(new java.awt.Dimension(100, 20));
        jButtonAdd.setPreferredSize(new java.awt.Dimension(100, 20));
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 160, 50));

        jButtonDel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonDel.setForeground(new java.awt.Color(102, 54, 0));
        jButtonDel.setText("Delete from Inventory");
        jButtonDel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonDel.setMaximumSize(new java.awt.Dimension(100, 20));
        jButtonDel.setMinimumSize(new java.awt.Dimension(100, 20));
        jButtonDel.setPreferredSize(new java.awt.Dimension(100, 20));
        jButtonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 160, 50));

        jButtonUpdate.setBackground(new java.awt.Color(193, 239, 255));
        jButtonUpdate.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(102, 54, 0));
        jButtonUpdate.setText("Update Inventory");
        jButtonUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonUpdate.setMaximumSize(new java.awt.Dimension(100, 20));
        jButtonUpdate.setMinimumSize(new java.awt.Dimension(100, 20));
        jButtonUpdate.setPreferredSize(new java.awt.Dimension(100, 20));
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 160, 50));

        jButton1.setBackground(new java.awt.Color(255, 179, 179));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 54, 0));
        jButton1.setText("Next Customer");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 160, 50));

        jTextAreaReceipt.setEditable(false);
        jTextAreaReceipt.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaReceipt.setColumns(20);
        jTextAreaReceipt.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextAreaReceipt.setRows(5);
        jTextAreaReceipt.setText("              DUNKIN' DONUTS\n\n           RISING SUN FOOD CORP.\n      AI WIN QUICK SERVICE POS V4.0\n\n   THIS SERVES AS OUR OFFICIAL RECEIPT \n   \n ---------------------------------------\n Product          Qty   Price   Subtotal\n ---------------------------------------");
        jScrollPane2.setViewportView(jTextAreaReceipt);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 310, 440));

        jLabelPayment.setBackground(new java.awt.Color(0, 0, 0));
        jLabelPayment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPayment.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPayment.setText("Payment");
        jPanel1.add(jLabelPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, -1, -1));

        jTextFieldPayment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTextFieldPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldPaymentMouseClicked(evt);
            }
        });
        jTextFieldPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPaymentActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 520, 159, 30));

        jButtonTransaction.setBackground(new java.awt.Color(255, 219, 164));
        jButtonTransaction.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButtonTransaction.setForeground(new java.awt.Color(102, 54, 0));
        jButtonTransaction.setText("Proceed to Payment");
        jButtonTransaction.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransactionActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonTransaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 560, 159, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RECEIPT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, -1, -1));

        jLabelBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/final dd logo (1).png"))); // NOI18N
        jLabelBg.setText("jLabel1");
        jPanel1.add(jLabelBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 640));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //ADD TO INVENTORY
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        try{
        String product = jTextProduct.getText();
        int quantity = Integer.parseInt(jTextQuantity.getText());
        double price = Double.parseDouble(jTextPrice.getText());
        list.add(new Donut(product, quantity, price));
        
        writeData();
        clearField();
        } catch (Exception e){
            System.out.print("");
        }
    }//GEN-LAST:event_jButtonAddActionPerformed
  
    //CLEAR FIELD METHOD
    private void clearField() {
        jTextProduct.requestFocus();
        jTextProduct.setText("");
        jTextPrice.setText("");
        jTextQuantity.setText("");
    }
    
    //DELETE FROM INVENTORY
    private void jButtonDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelActionPerformed
        try{
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Delete product", "Delete", dialogButton);
            if (dialogResult == 0) {
            list.remove(row);

            clearField();
            writeData();
            } 
            else {
            }
        } catch (Exception e){
            System.out.print("");
        }
    }//GEN-LAST:event_jButtonDelActionPerformed
    
    //CLEAR FIELD
    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        clearField();
    }//GEN-LAST:event_jButtonClearActionPerformed

    //UPDATE INVENTORY
    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        try{
            String updatedproduct = jTextProduct.getText();
            int updatedquantity = Integer.parseInt(jTextQuantity.getText());
            double updatedprice = Double.parseDouble(jTextPrice.getText());
            list.get(row).product = updatedproduct;
            list.get(row).quantity = updatedquantity;
            list.get(row).price = updatedprice;

            writeData();
        } catch (Exception e){
            System.out.print("");
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    //PROCEED TO PAYMENT
    private void jButtonTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTransactionActionPerformed
        try{
            String quantity = jTextQuantity.getText();
            String price = jTextPrice.getText();

            int qty = Integer.parseInt(quantity);
            double prc = Double.parseDouble(price);
            double subtotal = qty * prc;
            
            String payment =  jTextFieldPayment.getText();
            double pymnt = Double.parseDouble(payment);
            String grndttl;
            double totalAmount = Double.parseDouble(price);
            double valueAddedTax = total;
            valueAddedTax = total * 0.12;
            totalAmount = pymnt - total;
            double Discount = 0;
            
            DecimalFormat format = new DecimalFormat("0.##");
        
            jTextAreaReceipt.append("\n ---------------------------------------");
//            jTextAreaReceipt.append("\n\n TOTAL:\t\t        P" + total);
            jTextAreaReceipt.append("\n VAT:\t\t        " + format.format(valueAddedTax));
            jTextAreaReceipt.append("\n DISCOUNT: " + "\t\t" + Discount+ "%");
            jTextAreaReceipt.append("\n         " + "\t\t" + total + "-" + Discount + "%");
            jTextAreaReceipt.append("\n CASH:\t\t        P" + pymnt);
            jTextAreaReceipt.append("\n Change:\t\tP" + totalAmount);
            jTextAreaReceipt.append("\n\n ---------------------------------------\n" +
                                    "              MAKENDI, INC.\n" +
                                    "          Thank you come again\n" +
                                    "   Please follow us on - FB: Dunkin'\n" +
                                    "    IG: @dunkin ph / TWT: @dunkinph\n" +
                                    "  YT: Dunkin' PH / Tiktok: @dunkin.ph");
        } catch (Exception e){
            System.out.print("");
        }
        
    }//GEN-LAST:event_jButtonTransactionActionPerformed
    
    private void jTextReceiptActionPerformed(java.awt.event.ActionEvent evt){
        // TODO add your handling code here:
    }
    
    private void jTextQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextQuantityActionPerformed

    private void jTextPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPriceActionPerformed

    private void jTextProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextProductActionPerformed

    //DISPLAY INVENTORY
    private void jTableDisplayInventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDisplayInventoryMouseClicked
        row = jTableDisplayInventory.getSelectedRow();
        col = jTableDisplayInventory.getColumnCount();
        //System.out.println(row + "," + col);
        jTextProduct.setText(dtm.getValueAt(row, 0).toString());
        jTextQuantity.setText(dtm.getValueAt(row, 1).toString());
        jTextPrice.setText(dtm.getValueAt(row, 2).toString());
    }//GEN-LAST:event_jTableDisplayInventoryMouseClicked
   
    //SEARCH INVENTORY
    private void jTextSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextSearchKeyReleased
        DefaultTableModel table = (DefaultTableModel)jTableDisplayInventory.getModel();
        String search = jTextSearch.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        jTableDisplayInventory.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_jTextSearchKeyReleased

    private void jTextSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSearchActionPerformed

    //PURCHASE
    private void jButtonPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPurchaseActionPerformed
        try{
            String product = jTextProduct.getText();
            String quantity = jTextQuantity.getText();
            String price = jTextPrice.getText();

            int qty = Integer.parseInt(quantity);
            double prc = Double.parseDouble(price);

            double subtotal = qty * prc;

            counter++;       
            totalItems.add(subtotal);

            total = 0;
            for(int i = 0; i < counter; i++){
                total += totalItems.get(i);

            }
            jTextAreaReceipt.append("\n " + product + "\t   " + quantity + "    " + price + "    " + subtotal);
        
            DefaultTableModel table = (DefaultTableModel)jTableDisplayInventory.getModel();
            String tblQuantity = table.getValueAt(jTableDisplayInventory.getSelectedRow(),1).toString();
            int updatedDunkinQuantity = Integer.parseInt(tblQuantity);
            int purchasedQuantity = Integer.parseInt(jTextQuantity.getText());
        
            updatedDunkinQuantity = updatedDunkinQuantity - purchasedQuantity;
        
            table.setValueAt(updatedDunkinQuantity,jTableDisplayInventory.getSelectedRow(), 1);
     
            
        } catch (Exception e){
            System.out.print("");
        }
        
    }//GEN-LAST:event_jButtonPurchaseActionPerformed

    private void jTextFieldPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPaymentActionPerformed

    //NEXT CUSTOMER
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextAreaReceipt.setText("              DUNKIN' DONUTS\n" +
                                "\n" +
                                "           RISING SUN FOOD CORP.\n" +
                                "      AI WIN QUICK SERVICE POS V4.0\n" +
                                "\n" +
                                "   THIS SERVES AS OUR OFFICIAL RECEIPT \n" +
                                "   \n" +
                                " ---------------------------------------\n" +
                                " Product          Qty   Price   Subtotal\n" +
                                " ---------------------------------------");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldPaymentMouseClicked
        jTextAreaReceipt.append("\n\n TOTAL:\t\t               P" + total);
    }//GEN-LAST:event_jTextFieldPaymentMouseClicked
        
    //READ FILE
    private void loadData() {
        try {
            File file = new File("data.txt");
            file.createNewFile();
            FileReader f = new FileReader("data.txt");
            StringBuffer sb = new StringBuffer();
            while (f.ready()) {
                char c = (char) f.read();
                if (c == '-') {
                    String listArray[] = sb.toString().split(",");
                    // System.out.println(foodarray[2]);
                    list.add(new Donut(listArray[0], Integer.parseInt(listArray[1]), Double.parseDouble(listArray[2])));
                sb = new StringBuffer();
                } 
                else {
                    sb.append(c);
                }
            }
        } catch (IOException e) {
            return;
        }
        dtm.setRowCount(0);
        for (int i = 0; i < list.size(); i++) {
        Object[] objs = {list.get(i).product, list.get(i).quantity, list.get(i).price,};
        dtm.addRow(objs);
        }
    }

    //WRITE TO FILE
    private void writeData() {
        try (FileWriter f = new FileWriter("data.txt")) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i).product + "," + list.get(i).quantity + "," + list.get(i).price + "-" + "\n");
            }
            f.write(sb.toString());
            f.close();
        } catch (IOException e) {
            return;
        }
    dtm.setRowCount(0);
    for (int i = 0; i < list.size(); i++) {
        Object[] objs = {list.get(i).product, list.get(i).quantity, list.get(i).price};
        dtm.addRow(objs);
        }
    }
    
    //MAIN METHOD
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDel;
    private javax.swing.JButton jButtonPurchase;
    private javax.swing.JButton jButtonTransaction;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBg;
    private javax.swing.JLabel jLabelPayment;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelProd;
    private javax.swing.JLabel jLabelQty;
    private javax.swing.JLabel jLabelSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDisplayInventory;
    private javax.swing.JTextArea jTextAreaReceipt;
    private javax.swing.JTextField jTextFieldPayment;
    private javax.swing.JTextField jTextPrice;
    private javax.swing.JTextField jTextProduct;
    private javax.swing.JTextField jTextQuantity;
    private javax.swing.JTextField jTextSearch;
    // End of variables declaration//GEN-END:variables
}
