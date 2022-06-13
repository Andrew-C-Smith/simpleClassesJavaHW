import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTests {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100);
    }

    @Test

    public void paperLeftIs100(){
        assertEquals(100, printer.getNumberOfSheets());
    }

    @Test

    public void paperLeftIs0(){
        printer.print(10,2);
        printer.print(10,2);
        printer.print(10,2);
        printer.print(10,2);
        printer.print(10,2);
        //assertEquals(80, printer.getNumberOfSheets());
        assertEquals(0,printer.getNumberOfSheets());
    }
}
