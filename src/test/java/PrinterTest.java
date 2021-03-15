import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(10, 100);
    }

    @Test
    public void testPrint(){
        assertEquals(5, printer.print(1, 5));
    }

    @Test
    public void testEnoughPaper(){
        assertEquals(true, printer.enoughPaper(1, 5));
    }

    @Test
    public void testTonerVolumeDecreases(){
        assertEquals(90, printer.decreaseToner(2,5));
    }
}
