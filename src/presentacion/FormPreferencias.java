/*
 * FormPreferencias.java
 *
 * Created on 20 de abril de 2008, 06:11 PM
 */

package presentacion;


import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.NumberFormat;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JViewport;

/**
 *
 * @author  Juan TImoteo Ponce Ortiz
 */
public class FormPreferencias extends javax.swing.JDialog implements ActionListener{
    String[] imgs;
    int diff;
    int index;
    String img;
    
    public static final int FACIL = 0;
    public static final int MEDIO = 1;
    public static final int DIFICIL = 2;
    
    /** Creates new form FormPreferencias */
    public FormPreferencias(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
        
        btnFacil.addActionListener( this );
        btnMedio.addActionListener( this );
        btnDificil.addActionListener( this );
        
        btnCambiar.addActionListener( this );
    }
    
    public int getDiff() {
        return diff;
    }
    
    public String getImg() {
        return img;
    }
    
    public JButton getBtnAceptar() {
        return btnAceptar;
    }

    public JButton getBtnEdit() {
        return btnEdit;
    }

    public JFormattedTextField getTxtFilas() {
        return txtFilas;
    }

    public JFormattedTextField getTxtColumnas() {
        return txtColumnas;
    }
    


    
    
    private void init(){
        imgs = new String[ 4 ];
        for (int i = 0; i < imgs.length; i++) {
            imgs[ i ] = "img"+i;
        }
        index = 0;
        img = imgs[ index ];
        diff = 0;
        
        panelImg.setViewportView(  getImage( img ) );
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" C�digo Generado  ">//GEN-BEGIN:initComponents
    private void initComponents() {
        panelImg = new javax.swing.JScrollPane();
        btnAceptar = new javax.swing.JButton();
        btnFacil = new javax.swing.JButton();
        btnMedio = new javax.swing.JButton();
        btnDificil = new javax.swing.JButton();
        btnCambiar = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        txtFilas = new javax.swing.JFormattedTextField( NumberFormat.getIntegerInstance() );
        txtColumnas = new javax.swing.JFormattedTextField( NumberFormat.getIntegerInstance() );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Preferencias");

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ops/mono-aceptar.png")));
        btnAceptar.setText("Aceptar");

        btnFacil.setBackground(new java.awt.Color(255, 255, 255));
        btnFacil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diff/facil.png")));
        btnFacil.setText("Facil");
        btnFacil.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diff/facil.png")));

        btnMedio.setBackground(new java.awt.Color(255, 255, 255));
        btnMedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diff/medio.png")));
        btnMedio.setText("Medio");
        btnMedio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diff/medio.png")));

        btnDificil.setBackground(new java.awt.Color(255, 255, 255));
        btnDificil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diff/dificil.png")));
        btnDificil.setText("Dificil");
        btnDificil.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diff/dificil.png")));

        btnCambiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ops/cambiar.png")));

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ops/edit.png")));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        txtFilas.setText("0");
        txtFilas.setEnabled(false);

        txtColumnas.setText("0");
        txtColumnas.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(btnAceptar)
                .addContainerGap(292, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnFacil)
                .addGap(45, 45, 45)
                .addComponent(btnMedio)
                .addGap(38, 38, 38)
                .addComponent(btnDificil)
                .addGap(125, 125, 125))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelImg, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtFilas, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                        .addComponent(btnCambiar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDificil)
                    .addComponent(btnMedio)
                    .addComponent(btnFacil))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCambiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnAceptar)
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if( !btnEdit.isSelected() ){
            txtFilas.setEnabled( true );
            txtColumnas.setEnabled( true );
            btnEdit.setSelected( true );
        }else{
            txtFilas.setEnabled( false );
            txtColumnas.setEnabled( false );
            btnEdit.setSelected( false );
        }
    }//GEN-LAST:event_btnEditActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPreferencias(new javax.swing.JFrame(), true).setVisible(true);
            }
        });*/
        new FormPreferencias( null , true).setVisible( true );
    }
    
    private ImageComponent getImage(String img) {
        ImageComponent im = new ImageComponent( new ImageIcon( getClass().getResource("/images/tablero/"+img +".png")).getImage()  );
        return im;
    }
    
    public void actionPerformed(ActionEvent e) {
        if( e.getSource().equals( btnFacil )){
            diff = FACIL;
            btnFacil.setSelected( true );
            btnMedio.setSelected( false );
            btnDificil.setSelected( false );
            return;
        }
        if( e.getSource().equals( btnMedio )){
            diff = MEDIO;
            btnFacil.setSelected( false );
            btnMedio.setSelected( true );
            btnDificil.setSelected( false );
            return;
        }
        if( e.getSource().equals( btnDificil )){
            btnFacil.setSelected( false );
            btnMedio.setSelected( false );
            btnDificil.setSelected( true );
            diff = DIFICIL;
            return;
        }
        
        if( e.getSource().equals( btnCambiar ) ){
            index = index % 3 +1;
            img = imgs[ index ];
            panelImg.setViewportView(  getImage( img ) );
            return;
        }
    }
    
    // Declaraci�n de varibales -no modificar//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnDificil;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFacil;
    private javax.swing.JButton btnMedio;
    private javax.swing.JScrollPane panelImg;
    private javax.swing.JFormattedTextField txtColumnas;
    private javax.swing.JFormattedTextField txtFilas;
    // Fin de declaraci�n de variables//GEN-END:variables
    
}