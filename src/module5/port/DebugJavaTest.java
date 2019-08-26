package module5.port;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class DebugJavaTest {

    @Test
    void isPrime2() {
        DebugJava myCheck = new DebugJava();
        assertTrue(myCheck.isPrime(2));
    }

    @Test
    void isPrime89() {
        DebugJava myCheck = new DebugJava();
        assertTrue(myCheck.isPrime(89));
    }

    @Test
    void isPrime100() {
        DebugJava myCheck = new DebugJava();
        assertFalse(myCheck.isPrime(100));
    }

    @Test
    void isPrime() {
    }
}