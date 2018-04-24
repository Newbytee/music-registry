package musicregister;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import sparare.Sparare;

public class Window extends javax.swing.JFrame {

    int keyNumber;
    String adress;
    String owner;
    Key key;
    
    ArrayList<Key> list;
    
    public Window() {
        initComponents();
        
        list = (ArrayList<Key>)Sparare.ladda("nycklar.xml");
        
        if (list == null) {
            
            list = new ArrayList<>();
            
        }
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        infoArea = new javax.swing.JTextArea();
        fieldKeyNumber = new javax.swing.JTextField();
        fieldOwner = new javax.swing.JTextField();
        fieldAddress = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonSortKeyN = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        buttonSearchKeyN = new javax.swing.JButton();
        buttonSearchAddress = new javax.swing.JButton();
        buttonSearchOwner = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        infoArea.setColumns(20);
        infoArea.setRows(5);
        jScrollPane1.setViewportView(infoArea);

        jLabel1.setText("Nyckelnummer:");

        jLabel2.setText("Adress:");

        jLabel3.setText("Ägare:");

        buttonSortKeyN.setText("Sortera efter nyckelnummer");
        buttonSortKeyN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSortKeyNActionPerformed(evt);
            }
        });

        buttonAdd.setText("Lägg till");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        jLabel4.setText("Sökfält:");

        buttonSearchKeyN.setText("Sök efter nyckelnummer");
        buttonSearchKeyN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchKeyNActionPerformed(evt);
            }
        });

        buttonSearchAddress.setText("Sök efter adress");
        buttonSearchAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchAddressActionPerformed(evt);
            }
        });

        buttonSearchOwner.setText("Sök efter ägare");
        buttonSearchOwner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchOwnerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldKeyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonSearchAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonSearchKeyN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonSearchOwner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonSortKeyN, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(fieldKeyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonAdd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldOwner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSearchKeyN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSearchAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSearchOwner)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSortKeyN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSortKeyNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSortKeyNActionPerformed
        
        infoArea.setText("");
        infoArea.append("Nyckelnummer" + "\t\t" + "Ägare" + "\t\t" + "Address" + "\n");
        
        for (int i = 0; i < list.size(); i++) {
            
            key = list.get(i);
            infoArea.append(key.getKeyNumber() + "\t\t" + key.getOwner() + "\t\t" + key.getAdress() + "\n");
            
        }
        
    }//GEN-LAST:event_buttonSortKeyNActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        
        try {
            
            String address = fieldAddress.getText();
            String owner = fieldOwner.getText();        
            int keyNumber = Integer.valueOf(fieldKeyNumber.getText());
            key = new Key(keyNumber, address, owner);
            list.add(key);
            
            Sparare.spara(list, "nycklar.xml");
            
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Nyckelnummer måste vara ett heltal\n\n(" + e + ")");
            
        }
        
        fieldKeyNumber.setText("");
        fieldAddress.setText("");
        fieldOwner.setText("");
        
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonSearchKeyNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchKeyNActionPerformed
        
        doSearch("keyN");
        
    }//GEN-LAST:event_buttonSearchKeyNActionPerformed

    private void buttonSearchAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchAddressActionPerformed
        
        doSearch("adress");
        
    }//GEN-LAST:event_buttonSearchAddressActionPerformed

    private void buttonSearchOwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchOwnerActionPerformed
        
        doSearch("owner");
        
    }//GEN-LAST:event_buttonSearchOwnerActionPerformed

    private void doSearch(String type) {
        
        infoArea.setText("");
        infoArea.append("Nyckelnummer" + "\t\t" + "Ägare" + "\t\t" + "Address" + "\n");
        
        switch(type) {
            
        case "keyN":
            
            try {
            
                int tmpKeyN = Integer.parseInt(searchField.getText());

                for (int i = 0; i < list.size(); i++) {

                    key = list.get(i);

                    if (key.getKeyNumber()== tmpKeyN) {

                        infoArea.append(key.getKeyNumber() + "\t\t" + key.getOwner() + "\t\t" + key.getAdress() + "\n");

                    }

                }
            
            } catch (NumberFormatException e) {
                
                JOptionPane.showMessageDialog(null, "Nyckelnummer måste vara ett heltal\n\n(" + e + ")");
                
            }
            
            break;
        case "adress":
        case "owner":
            
            String tmpStr = searchField.getText();
            
            for (int i = 0; i < list.size(); i++) {
                
                key = list.get(i);
                
                if ("adress".equals(type)) {
                    
                    if (key.getAdress().equals(tmpStr)) {

                        infoArea.append(key.getKeyNumber() + "\t\t" + key.getOwner() + "\t\t" + key.getAdress() + "\n");

                    }
                    
                } else {
                    
                    if (key.getOwner().equals(tmpStr)) {
                        
                        infoArea.append(key.getKeyNumber() + "\t\t" + key.getOwner() + "\t\t" + key.getAdress() + "\n");
                        
                    }
                    
                }
                
            }
            break;
            
        }
            
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonSearchAddress;
    private javax.swing.JButton buttonSearchKeyN;
    private javax.swing.JButton buttonSearchOwner;
    private javax.swing.JButton buttonSortKeyN;
    private javax.swing.JTextField fieldAddress;
    private javax.swing.JTextField fieldKeyNumber;
    private javax.swing.JTextField fieldOwner;
    private javax.swing.JTextArea infoArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
