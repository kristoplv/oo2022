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
    @Test public void laevaYonOlemas() {
        tuum.asetaLaev();
        assertNotNull("laeval peab olema määratud Y", tuum.laevaY());
    }

    @Test public void laevaHpOnOlemas() {
        tuum.asetaLaev();
        assertNotNull("laeval peab olema määratud HP", tuum.returnHealth());
    }

    @Test public void laevaHpVaheneb() {
        tuum.asetaLaev();
        int HP, uusHP;
        HP = tuum.returnHealth();
        tuum.damageShip();
        uusHP = tuum.returnHealth();
        assertEquals(HP - 1, uusHP);
    }
    @Test public void testTulemus() {
        tuum.asetaLaev();
        int laevX = tuum.laevaX();
        int laevY = tuum.laevaY();
        tuum.pommitus(laevX + 1, laevY + 1);
        assertEquals("moodas", tuum.tulemus());
        tuum.pommitus(laevX, laevY);
        assertEquals("pihtas", tuum.tulemus());
    }
    @Test public void laevaXolemas(){
        tuum.asetaLaev();
        assertNotNull("laeval peab olema X", tuum.laevaX());
    }

    @Test public void laevaKohtOlemas(){
        tuum.laevaKoht();
        assertNotNull("laeval peab olema koht", tuum.laevaKoht());
    }
}