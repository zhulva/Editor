/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editor;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author student
 */
public class HlavniOkno extends javax.swing.JFrame {
    
    private File soubor;
    private final Soubor txtSoubor = new Soubor();
    private String kodovani = "UTF-8";
    /**
     * Creates new form HlavniOkno
     */
    public HlavniOkno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jToolBar2 = new javax.swing.JToolBar();
        toolNew = new javax.swing.JButton();
        toolOpen = new javax.swing.JButton();
        toolPane = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        editor = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        row = new javax.swing.JLabel();
        sings = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        itemNew = new javax.swing.JMenuItem();
        itemOpen = new javax.swing.JMenuItem();
        itemSave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemInfo = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itemClose = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        itemCut = new javax.swing.JMenuItem();
        itemCopy = new javax.swing.JMenuItem();
        itemPaste = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        itemFind = new javax.swing.JMenuItem();
        itemReplace = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        itemSelectAll = new javax.swing.JMenuItem();
        menuSettings = new javax.swing.JMenu();
        menuViews = new javax.swing.JMenu();
        itemToolBar = new javax.swing.JCheckBoxMenuItem();
        itemStatusBar = new javax.swing.JCheckBoxMenuItem();
        itemColor = new javax.swing.JMenuItem();
        itemFont = new javax.swing.JMenuItem();
        menuCodePage = new javax.swing.JMenu();
        itemUTF8 = new javax.swing.JRadioButtonMenuItem();
        itemWin1250 = new javax.swing.JRadioButtonMenuItem();
        itemISO = new javax.swing.JRadioButtonMenuItem();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar2.setRollover(true);

        toolNew.setIcon(new javax.swing.ImageIcon("E:\\PCV\\Editor\\ikony\\new.png")); // NOI18N
        toolNew.setText("Nový");
        toolNew.setToolTipText("Otevření nového souboru");
        toolNew.setFocusable(false);
        toolNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(toolNew);

        toolOpen.setIcon(new javax.swing.ImageIcon("E:\\PCV\\Editor\\ikony\\open.png")); // NOI18N
        toolOpen.setText("Otevřít");
        toolOpen.setToolTipText("Otevře vámi vybraný textový soubor");
        toolOpen.setFocusable(false);
        toolOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(toolOpen);

        toolPane.setIcon(new javax.swing.ImageIcon("E:\\PCV\\Editor\\ikony\\save.png")); // NOI18N
        toolPane.setText("Uložit");
        toolPane.setToolTipText("Uloží soubor");
        toolPane.setFocusable(false);
        toolPane.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolPane.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolPane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolPaneActionPerformed(evt);
            }
        });
        jToolBar2.add(toolPane);

        editor.setPreferredSize(new java.awt.Dimension(106, 400));
        jScrollPane1.setViewportView(editor);

        jPanel1.setPreferredSize(new java.awt.Dimension(445, 30));

        name.setBackground(new java.awt.Color(0, 51, 204));
        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Název souboru");
        name.setOpaque(true);

        row.setBackground(new java.awt.Color(255, 102, 0));
        row.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        row.setForeground(new java.awt.Color(255, 255, 255));
        row.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        row.setText("Počet řádků:");
        row.setOpaque(true);

        sings.setBackground(new java.awt.Color(51, 153, 0));
        sings.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sings.setForeground(new java.awt.Color(255, 255, 255));
        sings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sings.setText("Počet znaků:");
        sings.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(row, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sings, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
            .addComponent(row, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuFile.setText("Soubor");

        itemNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        itemNew.setIcon(new javax.swing.ImageIcon("E:\\PCV\\Editor\\ikony\\new-small.png")); // NOI18N
        itemNew.setText("Nový");
        itemNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNewActionPerformed(evt);
            }
        });
        menuFile.add(itemNew);

        itemOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        itemOpen.setIcon(new javax.swing.ImageIcon("E:\\PCV\\Editor\\ikony\\open-small.png")); // NOI18N
        itemOpen.setText("Otevřít...");
        itemOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOpenActionPerformed(evt);
            }
        });
        menuFile.add(itemOpen);

        itemSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        itemSave.setIcon(new javax.swing.ImageIcon("E:\\PCV\\Editor\\ikony\\save-small.png")); // NOI18N
        itemSave.setText("Uložit");
        itemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSaveActionPerformed(evt);
            }
        });
        menuFile.add(itemSave);
        menuFile.add(jSeparator1);

        itemInfo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        itemInfo.setText("Informace o souboru");
        menuFile.add(itemInfo);
        menuFile.add(jSeparator2);

        itemClose.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        itemClose.setText("Konec");
        itemClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCloseActionPerformed(evt);
            }
        });
        menuFile.add(itemClose);

        menuBar.add(menuFile);

        menuEdit.setText("Úpravy");

        itemCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        itemCut.setText("Výjmout");
        menuEdit.add(itemCut);

        itemCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        itemCopy.setText("Kopírovat");
        menuEdit.add(itemCopy);

        itemPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        itemPaste.setText("Vložit");
        menuEdit.add(itemPaste);
        menuEdit.add(jSeparator3);

        itemFind.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        itemFind.setText("Hledat...");
        itemFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFindActionPerformed(evt);
            }
        });
        menuEdit.add(itemFind);

        itemReplace.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        itemReplace.setText("Nahradit..");
        itemReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReplaceActionPerformed(evt);
            }
        });
        menuEdit.add(itemReplace);
        menuEdit.add(jSeparator4);

        itemSelectAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itemSelectAll.setText("Vybrat vše");
        itemSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSelectAllActionPerformed(evt);
            }
        });
        menuEdit.add(itemSelectAll);

        menuBar.add(menuEdit);

        menuSettings.setText("Nastavení");

        menuViews.setText("Zobrazení");

        itemToolBar.setSelected(true);
        itemToolBar.setText("Panel nástrojů");
        menuViews.add(itemToolBar);

        itemStatusBar.setSelected(true);
        itemStatusBar.setText("Stavový řádek");
        itemStatusBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemStatusBarActionPerformed(evt);
            }
        });
        menuViews.add(itemStatusBar);

        menuSettings.add(menuViews);

        itemColor.setText("Barva pozadí...");
        menuSettings.add(itemColor);

        itemFont.setText("Písmo..");
        itemFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFontActionPerformed(evt);
            }
        });
        menuSettings.add(itemFont);

        menuCodePage.setText("Kódování znaků");

        buttonGroup1.add(itemUTF8);
        itemUTF8.setSelected(true);
        itemUTF8.setText("UTF-8");
        menuCodePage.add(itemUTF8);

        buttonGroup1.add(itemWin1250);
        itemWin1250.setText("Windows 1250");
        itemWin1250.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemWin1250ActionPerformed(evt);
            }
        });
        menuCodePage.add(itemWin1250);

        buttonGroup1.add(itemISO);
        itemISO.setText("ISO-8859-2");
        menuCodePage.add(itemISO);

        menuSettings.add(menuCodePage);

        menuBar.add(menuSettings);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void itemSaveActionPerformed(java.awt.event.ActionEvent evt) {                                         
/*        try{
            JFileChooser fc = new JFileChooser();
            fc.setDialogType(JFileChooser.SAVE_DIALOG);
            fc.setDialogTitle("Uložení souboru");
            fc.setCurrentDirectory(new java.io.File("."));
            FileNameExtensionFilter myFilter = new FileNameExtensionFilter("Text","txt");
            fc.setFileFilter(myFilter);
            if(fc.showSaveDialog(this)==JFileChooser.APPROVE_OPTION){
            
                txtSoubor.setData(editor.getText());
              // txtSoubor.ulozDoSouboru
                }catch (HeadlessException | FileNotFoundException e){
                JOptionPane.showMessageDialog(this, "Požadovaný soubor nebyl nalezen","Chyba",JOptionPane.ERROR_MESSAGE);
                }
            }
        }  catch (Exception e){
    JOptionPane.showMessageDialog(this, "Požadovaný soubor nebyl nalezen","Chyba",JOptionPane.ERROR_MESSAGE);                      
        }*/
    }                                        

    private void itemCloseActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void itemFindActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void itemReplaceActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void itemFontActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        FontDialog fontDialog = new FontDialog(this, true, editor.getFont(), editor.getForeground());
        fontDialog.setVisible(true);
    }                                        

    private void itemStatusBarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void itemWin1250ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void toolPaneActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void itemSelectAllActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void itemNewActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void itemOpenActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try{
            JFileChooser fc = new JFileChooser();
            fc.setDialogType(JFileChooser.OPEN_DIALOG);
            fc.setDialogTitle("Otevreni souboru");
            fc.setCurrentDirectory(new java.io.File("."));
            FileNameExtensionFilter myFilter = new FileNameExtensionFilter("Text","txt");
            fc.setFileFilter(myFilter);
            if(fc.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
                soubor = fc.getSelectedFile();
                try{
                txtSoubor.nactiZeSouboru(soubor, kodovani);
                editor.setText(txtSoubor.getData());
                }catch (FileNotFoundException ex){
                JOptionPane.showMessageDialog(this, "Požadovaný soubor nebyl nalezen","Chyba",JOptionPane.ERROR_MESSAGE);
                }
            }
        }  catch (Exception e){
    JOptionPane.showMessageDialog(this, "Požadovaný soubor nebyl nalezen","Chyba",JOptionPane.ERROR_MESSAGE);                      
        }
    }                                        

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HlavniOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HlavniOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HlavniOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HlavniOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HlavniOkno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JEditorPane editor;
    private javax.swing.JMenuItem itemClose;
    private javax.swing.JMenuItem itemColor;
    private javax.swing.JMenuItem itemCopy;
    private javax.swing.JMenuItem itemCut;
    private javax.swing.JMenuItem itemFind;
    private javax.swing.JMenuItem itemFont;
    private javax.swing.JRadioButtonMenuItem itemISO;
    private javax.swing.JMenuItem itemInfo;
    private javax.swing.JMenuItem itemNew;
    private javax.swing.JMenuItem itemOpen;
    private javax.swing.JMenuItem itemPaste;
    private javax.swing.JMenuItem itemReplace;
    private javax.swing.JMenuItem itemSave;
    private javax.swing.JMenuItem itemSelectAll;
    private javax.swing.JCheckBoxMenuItem itemStatusBar;
    private javax.swing.JCheckBoxMenuItem itemToolBar;
    private javax.swing.JRadioButtonMenuItem itemUTF8;
    private javax.swing.JRadioButtonMenuItem itemWin1250;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCodePage;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuSettings;
    private javax.swing.JMenu menuViews;
    private javax.swing.JLabel name;
    private javax.swing.JLabel row;
    private javax.swing.JLabel sings;
    private javax.swing.JButton toolNew;
    private javax.swing.JButton toolOpen;
    private javax.swing.JButton toolPane;
    // End of variables declaration                   

    private void statusBarInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
