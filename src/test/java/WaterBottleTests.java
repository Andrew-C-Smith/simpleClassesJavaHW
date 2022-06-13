import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTests {

    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }

    @Test

    public void volumeIs100(){
        assertEquals(100, waterBottle.getVolume());
    }

       @Test

    public void takeADrink(){
        assertEquals(90, waterBottle.getHadOneDrinkVolume());
    }

    @Test

    public void take2Drinks(){
        waterBottle.getHadOneDrinkVolume();
        waterBottle.getHadOneDrinkVolume();
        assertEquals(80, waterBottle.getVolume());
    }

    @Test

    public void CheckItsEmpty(){
        waterBottle.emptyBottle();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test

    public void CheckItsFull(){
        waterBottle.FillBottle();
        assertEquals(100, waterBottle.getVolume());
    }





}
