
package module5.port;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

class CalculatorSoundLevelTest {


    @Test
    void solveForL1() {
        CalculatorSoundLevel checkResult = new CalculatorSoundLevel();

        checkResult.setL2(26.02);
        checkResult.setR1(1);
        checkResult.setR2(50);

        double L1Solved = checkResult.solveForL1();

        assertEquals(60,L1Solved);
    }

    @Test
    void solveForL2() {
        CalculatorSoundLevel checkResult = new CalculatorSoundLevel();

        checkResult.setL1(60);
        checkResult.setR1(1);
        checkResult.setR2(50);

        double L2Solved = checkResult.solveForL2();

        assertEquals(26.02,L2Solved);
    }

    @Test
    void solveForR1() {
        CalculatorSoundLevel checkResult = new CalculatorSoundLevel();

        checkResult.setL1(60);
        checkResult.setL2(26.02);
        checkResult.setR2(50);

        double R1Solved = checkResult.solveForR1();

        assertEquals(1,R1Solved);
    }

    @Test
    void solveForR2() {
        CalculatorSoundLevel checkResult = new CalculatorSoundLevel();

        checkResult.setL1(60);
        checkResult.setL2(26.02);
        checkResult.setR1(1);

        double R2Solved = checkResult.solveForR2();

        assertEquals(50,R2Solved);
    }
}