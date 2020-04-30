import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculation {

    private static Character[] OPERATORS={'/','*','+','-'};

    private static final String REGEXOPERATORS="[/+,-,/*,//,-]";
    private static final String REGEXDIGITS="[0-9]{1,13}(\\.[0-9]*)?";

    public static ArrayList<Double> digits= new ArrayList<>();
    public static ArrayList<Character> operators= new ArrayList<>();

    public static void getNextOperator(ArrayList<Character> operators) {
        for (Character op:OPERATORS) {

            A:for (int i = 0; i < operators.size(); i++) {
                if (operators.get(i) =='/') {
                    operators.remove(i);
                    digits.set(i, (digits.get(i) / digits.get(i + 1)));
                    digits.remove(i + 1);
                    i -= 1;
                    continue A;
                }
            }

            B:for (int i = 0; i < operators.size(); i++) {
                if (operators.get(i) =='*') {
                    operators.remove(i);
                    digits.set(i, (digits.get(i) * digits.get(i + 1)));
                    digits.remove(i + 1);
                    i -= 1;
                    continue B;
                }
            }

            for (int i = 0; i < operators.size(); i++) {
                if (operators.get(i) =='+') {
                    operators.remove(i);
                    digits.set(i, (digits.get(i) + digits.get(i + 1)));
                    digits.remove(i + 1);
                    i -= 1;
                    continue;
                }
            }

            for (int i = 0; i < operators.size(); i++) {
                if (operators.get(i) =='-') {
                    operators.remove(i);
                    digits.set(i, (digits.get(i) - digits.get(i + 1)));
                    digits.remove(i + 1);
                    i -= 1;
                    continue;
                }
            }
        }
    }

    public static void getDigits(String math){
        Pattern r=Pattern.compile(REGEXDIGITS);
        Matcher m=r.matcher(math);
        while (m.find()){
            double t=Double.parseDouble(math.substring(m.start(), m.end()));
            digits.add(t);
        }
    }
    public static void getOperators(String math){
        Pattern r=Pattern.compile(REGEXOPERATORS);
        Matcher m=r.matcher(math);
        while (m.find()){
            operators.add(math.charAt(m.start()));
        }
    }

    public double pow1, pow2, rslt;
    public void setPow1(double a) {
        pow1 = a;
    }
    private double getPow1() {
        return pow1;
    }
    public void setPow2(double b) {
        pow2 = b;
    }
    private double getPow2() {
        return pow2;
    }
    public double Power() {
        rslt = Math.pow(getPow1(), getPow2());
        return rslt;
    }
}