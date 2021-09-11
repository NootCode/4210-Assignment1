public class MyClass {
    public static void main(String args[]) {
        System.out.println(entCalc(4, 6));
    }

    public static double entCalc(double pos, double neg) {
        int total = (int) pos + (int) neg;
        double ppos = pos / total;
        double pneg = neg / total;
        return -ppos * (Math.log(ppos) / Math.log(2)) - pneg * (Math.log(pneg) / Math.log(2));
    }
