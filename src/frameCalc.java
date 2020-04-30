import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class frameCalc extends JFrame implements ActionListener {
    public JPanel panelOne = new JPanel();
    public JPanel panelTwo = new JPanel();
    public JPanel panelThree = new JPanel();
    public JPanel panelFour = new JPanel();
    public static JTextField display = new JTextField("0");
    public static JButton btnZero = new JButton("0");
    public static JButton btnOne = new JButton("1");
    public static JButton btnTwo = new JButton("2");
    public static JButton btnThree = new JButton("3");
    public static JButton btnFour = new JButton("4");
    public static JButton btnFive = new JButton("5");
    public static JButton btnSix = new JButton("6");
    public static JButton btnSeven = new JButton("7");
    public static JButton btnEight = new JButton("8");
    public static JButton btnNine = new JButton("9");
    public static JButton btnDot = new JButton(".");
    public static JButton btnEqual = new JButton("=");
    public static JButton btnPlus = new JButton("+");
    public static JButton btnMinus = new JButton("-");
    public static JButton btnDivide = new JButton("/");
    public static JButton btnMultiply = new JButton("*");
    public static JButton btnReset = new JButton("C");
    public static JButton btnCE = new JButton("CE");
    public static JButton btnSin = new JButton("sin");
    public static JButton btnCos = new JButton("cos");
    public static JButton btnTan = new JButton("tan");
    public static JButton btnLog = new JButton("log");
    public static JButton btnSqrRoot = new JButton("√");
    public static JButton btnSquare = new JButton("(²)");
    public static JButton btnAbsolute = new JButton("|x|");
    public static JButton btnSqrMultiple = new JButton("x^y");
    public static JButton btnLinear = new JButton("ln");
    public static JButton btnExp = new JButton("Exp");
    public static JButton btnFactorial = new JButton("X!");

    btnFunction btnFunction = new btnFunction();

    KeyListener listener = new KeyListener() {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyChar() == '0' || e.getKeyChar() == '1' || e.getKeyChar() == '2' || e.getKeyChar() == '3' || e.getKeyChar() == '4' || e.getKeyChar() == '5' || e.getKeyChar() == '6' || e.getKeyChar() == '7' || e.getKeyChar() == '8' || e.getKeyChar() == '9') {
                btnFunction.num(String.valueOf(e.getKeyChar()));
            }

            if (e.getKeyChar() == '+' || e.getKeyChar() == '-' || e.getKeyChar() == '/' || e.getKeyChar() == '*') {
                btnFunction.operator(String.valueOf(e.getKeyChar()));
            }

            if (e.getKeyChar() == '.') {
                btnFunction.dot(String.valueOf(e.getKeyChar()));
            }

            if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                String str = frameCalc.display.getText();
                frameCalc.display.setText(str.substring(0,str.length()-1));
                if (frameCalc.display.getText().equals("")){
                    frameCalc.display.setText("0");
                }
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    };

    public void initComponents() {
        actionListener(btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnDot, btnEqual, btnPlus, btnMinus);
        actionListener(btnDivide, btnMultiply, btnReset, btnCE, btnSin, btnCos, btnTan, btnLog, btnSqrRoot, btnSquare, btnAbsolute, btnSqrMultiple, btnLinear, btnExp);
        btnFactorial.addActionListener(this);
        display.addKeyListener(listener);
        display.setFocusable(true);
        display.setEditable(false);

        setTitle("Calculator - ");
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        display.setHorizontalAlignment(JTextField.RIGHT);
        btnFactorial.setFont(new java.awt.Font("Tahoma", 2, 11));
        Font newFont = new Font(display.getFont().getName(), Font.BOLD, 20);
        display.setFont(newFont);
        GroupLayout jPanel1Layout = new GroupLayout(panelOne);
        panelOne.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnSeven, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnEight, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnNine))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnFour, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnFive, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnSix))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btnOne, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnDot, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(btnZero, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(btnTwo, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnThree)))))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSeven, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnEight, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNine, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnFour, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnFive, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSix, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnOne, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnTwo, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnThree, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnZero, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDot, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout jPanel2Layout = new GroupLayout(panelTwo);
        panelTwo.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(btnPlus)
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(btnMinus, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnDivide, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnMultiply, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnPlus, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMinus, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDivide, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMultiply, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout jPanel3Layout = new GroupLayout(panelThree);
        panelThree.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnCE, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnReset, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCE, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout jPanel4Layout = new GroupLayout(panelFour);
        panelFour.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnLog, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnTan, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(4, 4, 4)
                                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnSqrMultiple, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnAbsolute, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnEqual, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                                        .addComponent(btnFactorial, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnCos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnSin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(2, 2, 2)
                                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnSquare, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                                        .addComponent(btnSqrRoot, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnExp, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnLinear, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSin, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSqrRoot, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnLinear, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCos, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSquare, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnExp, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnTan, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAbsolute, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnFactorial, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnLog, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSqrMultiple, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnEqual, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(display)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(panelOne, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(panelTwo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(panelThree, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(panelFour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(display, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(panelOne, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(panelTwo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(panelThree, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(panelFour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }

    public void actionListener(JButton btnZero, JButton btnOne, JButton btnTwo, JButton btnThree, JButton btnFour, JButton btnFive, JButton btnSix, JButton btnSeven, JButton btnEight, JButton btnNine, JButton btnDot, JButton btnEqual, JButton btnPlus, JButton btnMinus) {
        btnZero.addActionListener(this);
        btnOne.addActionListener(this);
        btnTwo.addActionListener(this);
        btnThree.addActionListener(this);
        btnFour.addActionListener(this);
        btnFive.addActionListener(this);
        btnSix.addActionListener(this);
        btnSeven.addActionListener(this);
        btnEight.addActionListener(this);
        btnNine.addActionListener(this);
        btnDot.addActionListener(this);
        btnEqual.addActionListener(this);
        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object obj = String.valueOf(frameCalc.display.getText().charAt(frameCalc.display.getText().length()-1));
        if (e.getSource() == btnEqual && !obj.equals("+") && !obj.equals("-") && !obj.equals("*") && !obj.equals("/")) {
            System.out.println(obj);
            btnFunction.equal();
        }

        if (e.getSource() == btnReset) {
            btnFunction.reset();
        }

        if (e.getSource() == btnCE) {
            btnFunction.ce();
        }

        if (e.getSource() == btnZero || e.getSource() == btnOne || e.getSource() == btnTwo || e.getSource() == btnThree || e.getSource() == btnFour || e.getSource() == btnFive || e.getSource() == btnSix || e.getSource() == btnSeven || e.getSource() == btnEight || e.getSource() == btnNine) {
            btnFunction.num(e.getActionCommand());
        }

        if (e.getSource() == btnPlus || e.getSource() == btnMinus || e.getSource() == btnMultiply || e.getSource() == btnDivide) {
            btnFunction.operator(e.getActionCommand());
        }

        if (e.getSource() == btnDot) {
            btnFunction.dot(e.getActionCommand());
        }

        if ((e.getSource() == btnSin) || (e.getSource() == btnCos) || (e.getSource() == btnTan) || (e.getSource() == btnLog) || (e.getSource() == btnSqrRoot) || (e.getSource() == btnSquare) || (e.getSource() == btnSqrMultiple) || (e.getSource() == btnLinear) || (e.getSource() == btnExp) || (e.getSource() == btnFactorial) || (e.getSource() == btnAbsolute)) {
            btnFunction.trigonometry(e.getActionCommand());
        }
    }
}