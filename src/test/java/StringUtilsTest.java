import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {
    @Test
    public void testIfIsNumericIsCorrect() {
        String expected = "eert eht morf raf llaf tnod elppa ehT";
        String actual = ((StringUtils.reverse("The apple dont fall far from the tree")));


        assertEquals(expected, actual);

    }

//
//// When you're using floating points values a third parameter is required (Delta) which represents a positive margin of error of decimals.
//
    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
    }
}
