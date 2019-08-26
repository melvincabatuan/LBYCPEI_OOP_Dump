
package module5.port;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

class CalculatorDopplerEffectTest {

    @Test
    void solveForFo() {
        CalculatorDopplerEffect checkResult = new CalculatorDopplerEffect();

        checkResult.setFa(900);
        checkResult.setVo(30);
        checkResult.setVs(40);

        double FoSolved = checkResult.solveForFo();

        assertEquals(1107.92,FoSolved);
    }

    @Test
    void solveForFa() {
        CalculatorDopplerEffect checkResult = new CalculatorDopplerEffect();

        checkResult.setFo(1107.92);
        checkResult.setVo(30);
        checkResult.setVs(40);

        double FaSolved = checkResult.solveForFa();

        assertEquals(900,FaSolved);
    }

    @Test
    void solveForVa() {
        CalculatorDopplerEffect checkResult = new CalculatorDopplerEffect();

        checkResult.setFa(900);
        checkResult.setFo(1107.92);
        checkResult.setVs(40);

        double VoSolved = checkResult.solveForVo();

        assertEquals(30,VoSolved);
    }

    @Test
    void solveForVs() {
        CalculatorDopplerEffect checkResult = new CalculatorDopplerEffect();

        checkResult.setFa(900);
        checkResult.setFo(1107.92);
        checkResult.setVo(30);

        double VsSolved = checkResult.solveForVs();

        assertEquals(40,VsSolved);
    }
}