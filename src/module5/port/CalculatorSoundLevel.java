package module5.port;


public class CalculatorSoundLevel {
    // data fields
    private String name;
    private double L1;
    private double L2;
    private double r1;
    private double r2;



    public CalculatorSoundLevel(){
        this.L1 = 0;
        this.L2 = 0;
        this.r1 = 0;
        this.r2 = 0;
    }

    public void setL2(double input){
        this.L2 = input;
    }

    public void setL1(double input) {
        this.L1 = input;
    }

    public void setR1(double input){
        this.r1 = input;
    }

    public void setR2(double input) {
        this.r2 = input;
    }

    public double solveForL1() {
        this.L1 = L2 + Math.abs(20 * Math.log10(r1 / r2));
        return Math.round(L1 * 100d) / 100d;
    }

    public double solveForL2() {
        this.L2 = L1 - Math.abs(20 * Math.log10(r1 / r2));
        if(L2 < 0){
            return 0;
        }
        return Math.round(L2 * 100d) / 100d;
    }

    public double solveForR1() {
        this.r1 = r2/(Math.pow(10, Math.abs(L1-L2)/20));
        return Math.round(r1 * 100d) / 100d;
    }

    public double solveForR2() {
        this.r2 = r1 * Math.pow(10, Math.abs(L1-L2)/20);
        return Math.round(r2 * 100d) / 100d;
    }
}
