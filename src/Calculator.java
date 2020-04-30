public class Calculator {
    public static void main (String[] args){
        frameCalc newFrame = new frameCalc();
        newFrame.initComponents();
        newFrame.setVisible(true);
        newFrame.getRootPane().setDefaultButton(newFrame.btnEqual);
    }
}