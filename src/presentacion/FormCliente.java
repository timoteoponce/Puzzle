/*
 * FormCliente.java
 *
 * Created on 23 de abril de 2008, 11:54
 */

package presentacion;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;

/**
 *
 * @author  Juan Timoteo Ponce Ortiz
 */
public class FormCliente extends javax.swing.JFrame {
    /** Creates new form FormCliente */
    public FormCliente() {
        initComponents();
    }
    
    public void initPop( ActionListener listener ){
        menuPop.removeAll();
        
        JMenuItem msg1 = new JMenuItem();
        JMenuItem msg2 = new JMenuItem();
        JMenuItem msg3 = new JMenuItem();
        
        msg1.setActionCommand( "alegre" );
        msg2.setActionCommand( "furioso" );
        msg3.setActionCommand( "llorando" );
        
        msg1.setIcon( new ImageIcon( getClass().getResource("/images/msg/alegre.png") ) );
        msg2.setIcon( new ImageIcon( getClass().getResource("/images/msg/furioso.png") ) );
        msg3.setIcon( new ImageIcon( getClass().getResource("/images/msg/llorando.png") ) );
        
        msg1.addActionListener( listener );
        msg2.addActionListener( listener );
        msg3.addActionListener( listener );
        
        menuPop.add( msg1 );
        menuPop.add( msg2 );
        menuPop.add( msg3 );
        
        listaMsg.setModel( new ModeloLista() );
        listaMsg.setCellRenderer( new ListCellRenderer() {
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                if(value instanceof JComponent) {
                    JComponent p = (JComponent) value;
                    return p;
                }
                return null;
            }
        }
        );
    }
    
    public JLabel getLblID() {
        return lblID;
    }
    
    public void setBuenas( int n ){
        lblBuenas.setText( "<html><h1>" + n + "</h1></html>");
    }
    
    public void setMalas( int n ){
        lblMalas.setText( "<html><h1>" + n + "</h1></html>");
    }
    
    public JButton getBtnAyuda() {
        return btnAyuda;
    }
    
    public JButton getBtnSalir() {
        return btnSalir;
    }
    
    public JList getListaMsg() {
        return listaMsg;
    }
    
    
    public JButton getBtnCambiarImg() {
        return btnCambiarImg;
    }
    
    public JPopupMenu getMenuPop() {
        return menuPop;
    }
    
    
    public JScrollPane getPanelJuego() {
        return panelJuego;
    }
    
    public JPanel getPanelEquip0() {
        return panelEquip0;
    }
    
    public JPanel getPanelEquip1() {
        return panelEquip1;
    }
    
    
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Código Generado  ">//GEN-BEGIN:initComponents
    private void initComponents() {
        menuPop = new javax.swing.JPopupMenu();
        panelJuego = new javax.swing.JScrollPane();
        panelEquip0 = new javax.swing.JPanel();
        panelEquip1 = new javax.swing.JPanel();
        panelOpciones = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnCambiarImg = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaMsg = new javax.swing.JList();
        lblID = new javax.swing.JLabel();
        btnBuenas = new javax.swing.JButton();
        btnMalas = new javax.swing.JButton();
        lblBuenas = new javax.swing.JLabel();
        lblMalas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rompecabezas");
        setBackground(new java.awt.Color(255, 255, 255));

        panelEquip0.setLayout(new javax.swing.BoxLayout(panelEquip0, javax.swing.BoxLayout.X_AXIS));

        panelEquip0.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Equipo azul", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 102, 255)));

        panelEquip1.setLayout(new javax.swing.BoxLayout(panelEquip1, javax.swing.BoxLayout.X_AXIS));

        panelEquip1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Equipo rojo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 102, 102)));

        panelOpciones.setLayout(new javax.swing.BoxLayout(panelOpciones, javax.swing.BoxLayout.Y_AXIS));

        btnCambiarImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ops/cambiar.png")));
        btnCambiarImg.setActionCommand("opsCambiarImg");
        jToolBar1.add(btnCambiarImg);

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ops/ayuda.png")));
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        jToolBar1.add(btnAyuda);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ops/salir.png")));
        btnSalir.setActionCommand("opsSalir");
        jToolBar1.add(btnSalir);

        jScrollPane1.setViewportView(listaMsg);

        lblID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        btnBuenas.setBackground(new java.awt.Color(255, 255, 255));
        btnBuenas.setForeground(new java.awt.Color(255, 255, 255));
        btnBuenas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/msg/bien.png")));
        btnBuenas.setBorderPainted(false);
        btnBuenas.setDefaultCapable(false);
        btnBuenas.setFocusPainted(false);
        btnBuenas.setFocusable(false);
        btnBuenas.setRequestFocusEnabled(false);

        btnMalas.setBackground(new java.awt.Color(255, 255, 255));
        btnMalas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/msg/mal.png")));
        btnMalas.setBorderPainted(false);
        btnMalas.setDefaultCapable(false);
        btnMalas.setFocusPainted(false);
        btnMalas.setFocusable(false);
        btnMalas.setVerifyInputWhenFocusTarget(false);

        lblBuenas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuenas.setText("<html><h1>0</h1></html>");

        lblMalas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMalas.setText("<html><h1>0</h1></html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelJuego, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)
                        .addComponent(btnBuenas, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBuenas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMalas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMalas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))
                    .addComponent(panelEquip1, javax.swing.GroupLayout.DEFAULT_SIZE, 939, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelEquip0, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuenas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblBuenas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnMalas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMalas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelOpciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelEquip0, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEquip1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        try {
            System.out.println("ayuda");
            Runtime.getRuntime().exec( "cmd /K minimanual.pdf" );
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAyudaActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCliente().setVisible(true);
            }
        });
    }
    
    // Declaración de varibales -no modificar//GEN-BEGIN:variables
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnBuenas;
    private javax.swing.JButton btnCambiarImg;
    private javax.swing.JButton btnMalas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblBuenas;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMalas;
    private javax.swing.JList listaMsg;
    private javax.swing.JPopupMenu menuPop;
    private javax.swing.JPanel panelEquip0;
    private javax.swing.JPanel panelEquip1;
    private javax.swing.JScrollPane panelJuego;
    private javax.swing.JPanel panelOpciones;
    // Fin de declaración de variables//GEN-END:variables
    
    
    public class ModeloLista extends AbstractListModel{
        ArrayList lista;
        
        public ModeloLista(){
            lista = new ArrayList();
        }
        
        public void add( Object o){
            lista.add( o );
            fireContentsChanged( this , lista.size()-1 , lista.size()-1 );
        }
        public int getSize() {
            return lista.size();
        }
        
        public Object getElementAt(int index) {
            return lista.get( index );
        }
        
    }
}
