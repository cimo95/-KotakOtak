package kotakotak;

import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * @author cimosoft
 */
public class kotakOtakUI extends javax.swing.JFrame {

    String[][] _s0 = null;
    String _s1;
    boolean _b0 = false;
    boolean _b1 = false;
    boolean _b2 = false;
    int _i0 = 0;
    int _i1 = 1;
    int _i2, _i3 = 0;
    int _i4;

    public kotakOtakUI() {
        initComponents();
    }

    public void pGenSoal(int _i5) {
        String[][] _s2 = new String[_i5][2];
        //random bilangan 1 & 2
        //maksimal 2 digit angka terbesar 50
        for (int _i6 = 0; _i6 < _i5; _i6++) {
            int _i7 = 1 + new Random().nextInt(51);
            int _i8 = 1 + new Random().nextInt(_i7);
            //random operator hitung(+ - * /) 
            int _i9 = new Random().nextInt(2); //coba + dam - saja
            //hitung hasil (_ia)
            int _ia;
            switch (_i9) {
                default:
                case 0:
                    _ia = _i7 + _i8;
                    break;
                case 1:
                    _ia = _i7 - _i8;
                    break;
                case 2:
                    _ia = _i7 * _i8;
                    break;
                case 3:
                    _ia = _i7 / _i8;
                    break;
            }
            //tulis soal
            String _s3 = "+-X:";
            _s2[_i6][0] = _i7 + " " + _s3.split("")[_i9] + " " + _i8;
            _s2[_i6][1] = String.valueOf(_ia);

        }
        _s0 = _s2;
    }

    public void pAnimSoal() {
        l0.setText(_s0[_i0][0]);
        _i4 = (getWidth() - l0.getWidth()) / 2;
        l0.setLocation(0, -50);
        l0.show();
        _s1 = _s0[_i0][1];
        _i0++;
        Timer _ti0 = new Timer(25, (ActionEvent e) -> {
            if (!_b2) {
                if (!_b1 && (l0.getY() <= 400)) {
                    l0.setLocation(_i4, l0.getY() + 1);
                } else {
                    l0.setLocation(_i4, -50);
                    if (_b1) {
                        _i2++;
                    } else {
                        _i3++;
                    }
                    l0.hide();
                    tf0.setText("");
                    if (_i0 < _s0.length) {
                        l0.setText(_s0[_i0][0]);
                        _i4 = (getWidth() - l0.getWidth()) / 2;
                        l0.setLocation(0, -50);
                        l0.show();
                        this._s1 = _s0[_i0][1];
                        l2.setText("SALAH : " + _i3);
                        l1.setText("BENAR : " + _i2);
                        _i0++;
                        _b1 = false;
                    } else {
                        l2.setText("SALAH : " + _i3);
                        l1.setText("BENAR : " + _i2);
                        l0.hide();
                        tf0.setEnabled(false);
                        b0.show();
                        _b2 = true;
                    }
                }
            }
        });
        _ti0.setInitialDelay(10);
        _ti0.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf0 = new javax.swing.JTextField();
        l0 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        b0 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kotak Otak");
        setName("f0"); // NOI18N
        setPreferredSize(new java.awt.Dimension(350, 550));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(null);

        tf0.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        tf0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf0.setToolTipText("");
        tf0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tf0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf0KeyPressed(evt);
            }
        });
        getContentPane().add(tf0);
        tf0.setBounds(10, 400, 320, 50);

        l0.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        l0.setText("10 + 10");
        getContentPane().add(l0);
        l0.setBounds(10, 10, 129, 48);

        l2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l2.setText("SALAH : 0");
        getContentPane().add(l2);
        l2.setBounds(260, 460, 70, 14);

        l1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l1.setText("BENAR : 0");
        getContentPane().add(l1);
        l1.setBounds(10, 460, 70, 14);

        b0.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        b0.setText("MULAI MAIN");
        b0.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        getContentPane().add(b0);
        b0.setBounds(60, 170, 230, 100);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("© 2019 Cimosoft Codelicious, Org");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 480, 330, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        tf0.setEnabled(false);
        l0.setLocation(0, -50);
    }//GEN-LAST:event_formComponentShown

    private void tf0KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf0KeyPressed
        int _ib = evt.getKeyCode();
        if (_ib == KeyEvent.VK_ENTER) {
            _b1 = tf0.getText().equals(_s1);
        }
    }//GEN-LAST:event_tf0KeyPressed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        String _s4 = JOptionPane.showInputDialog(this, "Masukkan jumlah soal yang ingin dikerjakan", "Kotak Otak", JOptionPane.QUESTION_MESSAGE);
        int _ic;
        try {
            _ic = Integer.valueOf(_s4);
            b0.setText("MAIN LAGI");
            tf0.setEnabled(true);
            l0.setLocation(0, -50);
            _i2 = 0;
            _i3 = 0;
            _i0 = 0;
            _b2 = false;
            b0.hide();
            pGenSoal(_ic);
            pAnimSoal();
        } catch (NumberFormatException e) {
            if (_s4 != null) {
                JOptionPane.showMessageDialog(this, "Masukkan nilai dengan yang benar", "Kotak Otak", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_b0ActionPerformed

    public static void main(String args[]) {
        /**
        * @author cimosoft
        */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kotakOtakUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            kotakOtakUI kotakotakui = new kotakOtakUI();
            kotakotakui.setLocationRelativeTo(null);
            kotakotakui.l0.setVisible(false);
            kotakotakui.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l0;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JTextField tf0;
    // End of variables declaration//GEN-END:variables
}
