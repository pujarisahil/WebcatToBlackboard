import java.io.File;
import java.util.Arrays;

import javax.swing.JFileChooser;

public class FileChosingWebcat extends javax.swing.JFrame {

    public FileChosingWebcat() {
        initComponents();
    }

    @SuppressWarnings("unchecked")                         
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jFileChooser1.setMultiSelectionEnabled(true);
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel1.setText("Select webcat files to convert");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(176, 176, 176))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }                      

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
		JFileChooser chooser = (JFileChooser) evt.getSource();
		if (JFileChooser.APPROVE_SELECTION.equals(evt.getActionCommand())) {
			files = chooser.getSelectedFiles();
			if(files.length >= 1) {
				MainScreen.check = true;
				System.out.println(Arrays.toString(files));
				check = true;
				
			}
			dispose();
				
		} else if (JFileChooser.CANCEL_SELECTION.equals(evt.getActionCommand())) {
			dispose();
		}
    }                                             

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileChosingWebcat().setVisible(true);
            }
        }); 
    }
                     
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;      
    protected static File[] files;
    protected static boolean check = false;
}
