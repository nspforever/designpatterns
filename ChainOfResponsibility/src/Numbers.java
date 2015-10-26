/**
 * Created by nsp on 2015/10/25.
 */
public class Numbers {
    private int number1, number2;
    private String calculationWanted;

    public Numbers(int n1, int n2, String calcWanted) {
        this.number1 = n1;
        this.number2 = n2;
        this.calculationWanted = calcWanted;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public String getCalculationWanted() {
        return calculationWanted;
    }
}
