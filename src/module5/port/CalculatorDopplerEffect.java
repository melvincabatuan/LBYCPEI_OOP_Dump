package module5.port;


public class CalculatorDopplerEffect {
    // data fields
    private String name;
    private double fa;
    private double fo;
    private double Vo;
    private double Vs;



    public CalculatorDopplerEffect(){
        this.fa = 0;
        this.fo = 0;
        this.Vo = 0;
        this.Vs = 0;
    }

    public void setFa(double input){
        this.fa = input;
    }

    public void setFo(double input) {

        this.fo = input;
    }

    public void setVo(double input){

        this.Vo = input;
    }

    public void setVs(double input) {

        this.Vs = input;
    }

    public double solveForFo() {
        this.fo = ( (343 + Vo) / (343 - Vs) ) * fa;
        return Math.round(fo * 100d) / 100d;
    }

    public double solveForFa() {
        this.fa = ( (343 - Vs) / (343 + Vo) ) * fo;
        return Math.round(fa * 100d) / 100d;
    }

    public double solveForVo() {
        this.Vo = (((343 - Vs) * fo) / fa) - 343;
        return Math.round(Vo * 100d) / 100d;
    }

    public double solveForVs() {
        this.Vs = 343 - (((343 + Vo) * fa) / fo);
        return Math.round(Vs * 100d) / 100d;
    }
}
