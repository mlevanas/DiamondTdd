package Katas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class DiamondTest {

    private DiamondPrinter diamondPrinter;

    @Before
    public void setup()
    {
        diamondPrinter = new DiamondPrinter();
    }


    @Test
    public void makeDiamond_givenA_shouldPrintA()
    {
        List<String> result = diamondPrinter.makeDiamond('A');
        Assert.assertEquals(Collections.singletonList("A"), result);
        Assert.assertEquals(1, result.size());
    }

    @Test
    public void makeDiamond_givenB_lineCountShouldBeCorrect()
    {
        List<String> result = diamondPrinter.makeDiamond('B');
        Assert.assertEquals(3, result.size());
    }

    @Test
    public void makeDiamond_givenB_firstLineShouldVBeIndented()
    {
        List<String> result = diamondPrinter.makeDiamond('B');
        Assert.assertEquals(" A ", result.get(0));
    }

    @Test
    public void makeDiamond_givenC_indentationShouldMatch()
    {
        List<String> result = diamondPrinter.makeDiamond('C');
        Assert.assertEquals("  A  ", result.get(0));
        Assert.assertEquals("  A  ", result.get(4));
    }

    @Test
    public void makeDiamod_givenB_secondLineShouldBeCorrect()
    {
        List<String> result = diamondPrinter.makeDiamond('B');
        Assert.assertEquals("B B", result.get(1));
    }
}
