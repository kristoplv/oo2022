package pr2;

import org.junit.*;
import static org.junit.Assert.*;

public class testBattleship {
    battleshipTuum tuum;
    @Before public void alustus(){
        tuum = new battleshipTuum1();
    }
    @Test public void testAsetaLaev(){
        tuum.asetaLaev();
        assertNotNull("peaks olema laev");
    }
    @Test public void testPommitus(){
        int x = 1;
        int y = 1;
        tuum.pommitus(x, y);
        int[] pommitusKontroll = tuum.pommita();
        assertEquals(1, pommitusKontroll[0]);
        assertEquals(1, pommitusKontroll[1]);
    }
}
