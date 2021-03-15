import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle (100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void drinkRemoves10(){
        assertEquals(90, waterbottle.drink());
    }

    @Test
    public void emptyRemoves100(){
        assertEquals(0, waterbottle.empty());
    }

    @Test
    public void fillAdds100(){
        WaterBottle emptybottle = new WaterBottle (0);
        assertEquals(100, emptybottle.fill());
    }
}
