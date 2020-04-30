import java.lang.reflect.Array;
import java.util.Iterator;

public class btnFunction {

    public static String math = "";
    Calculation calc = new Calculation();

    public void equal() {
        if (frameCalc.btnSqrMultiple.isEnabled() == false) {
            calc.setPow2(Double.parseDouble(frameCalc.display.getText()));
            frameCalc.display.setText(String.valueOf(calc.Power()));
            frameCalc.btnSqrMultiple.setEnabled(true);
        } else{
            math = frameCalc.display.getText();
            calc.getDigits(math);
            calc.getOperators(math);
            calc.getNextOperator(calc.operators);

            Iterator<Double> i = calc.digits.iterator();

            while (i.hasNext()) {
                frameCalc.display.setText(String.valueOf(i.next()));
                i.remove();
            }
        }
    }

    public void reset(){
        frameCalc.display.setText("0");
        math = "";
    }

    public void ce(){
        String[] result = frameCalc.display.getText().split("[-+/*]");
        calc.getOperators(frameCalc.display.getText());
        String newMath = "";

        for (int i = 0; i <= result.length - 2; i++) {
            newMath += Array.get(result, i) + String.valueOf(calc.operators.get(i));
        }
        frameCalc.display.setText(newMath);
        if (frameCalc.display.getText().equals("")) {
            frameCalc.display.setText("0");
        }
        calc.operators.clear();
    }

    public void num (String btnString){
        if (btnString.equals("0")){
            if (!frameCalc.display.getText().equals("0")){
                frameCalc.display.setText(frameCalc.display.getText() + btnString);
            }
        }
        else{
            if (frameCalc.display.getText().equals("0")) {
                frameCalc.display.setText("");
            }
            frameCalc.display.setText(frameCalc.display.getText() + btnString);
        }
    }

    public void operator (String btnString){
        String str = frameCalc.display.getText();
        Object obj = String.valueOf(str.charAt(str.length() - 1));
        if (btnString == "-"){
            if (obj.equals("1") || obj.equals("2") || obj.equals("3") || obj.equals("4") || obj.equals("5") || obj.equals("6") || obj.equals("7") || obj.equals("8") || obj.equals("9")) {
                frameCalc.display.setText(frameCalc.display.getText() + btnString);
            } else if (frameCalc.display.getText().equals("0")) {
                frameCalc.display.setText("");
                frameCalc.display.setText(frameCalc.display.getText() + btnString);
            }
        }
        else {
            if (obj.equals("1") || obj.equals("2") || obj.equals("3") || obj.equals("4") || obj.equals("5") || obj.equals("6") || obj.equals("7") || obj.equals("8") || obj.equals("9") || obj.equals("0")) {
                frameCalc.display.setText(frameCalc.display.getText() + btnString);
            }
        }
    }

    public void dot (String btnString){
        String str = frameCalc.display.getText();
        String[] result = str.split("[-+*/]");
        String result2 = (String) Array.get(result, result.length - 1);

        if (!result2.contains(".")) {
            frameCalc.display.setText(frameCalc.display.getText() + btnString);
        }
    }

    public void trigonometry (String btnString){
        if (btnString.equals("|x|")){
            double x = Double.parseDouble(frameCalc.display.getText());
            frameCalc.display.setText(String.valueOf(Math.abs(x)));
        }
        else {
            math = frameCalc.display.getText();
            calc.getDigits(math);
            calc.getOperators(math);
            calc.getNextOperator(calc.operators);

            Iterator<Double> i = calc.digits.iterator();

            double result = 0;
            while (i.hasNext()) {
                result = i.next();
                i.remove();
            }
            double radian = Math.toRadians(result);

            if (btnString.equals("sin")) {
                frameCalc.display.setText(String.valueOf(Math.sin(radian)));
            } else if (btnString.equals("cos")) {
                frameCalc.display.setText(String.valueOf(Math.cos(radian)));
            } else if (btnString.equals("tan")) {
                frameCalc.display.setText(String.valueOf(Math.tan(radian)));
            } else if (btnString.equals("log")) {
                frameCalc.display.setText(String.valueOf(Math.log10(result)));
            } else if (btnString.equals("√")) {
                frameCalc.display.setText(String.valueOf(Math.sqrt(result)));
            } else if (btnString.equals("(²)")) {
                frameCalc.display.setText(String.valueOf(result * result));
            } else if (btnString.equals("x^y")) {
                frameCalc.display.setText("");
                frameCalc.btnSqrMultiple.setEnabled(false);
                calc.setPow1(result);
            } else if (btnString.equals("ln")) {
                frameCalc.display.setText(String.valueOf(Math.log(result)));
            } else if (btnString.equals("Exp")) {
                frameCalc.display.setText(String.valueOf(Math.exp(result)));
            } else if (btnString.equals("X!")) {
                int a = 1;
                for (int x = (int) result; x > 0; x--) {
                    a = a * x;
                }
                frameCalc.display.setText(String.valueOf(a));
            }
        }
    }
}