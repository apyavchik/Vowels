import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class VowelsTest {
    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }

    @Test
    public void testCase2() {
        assertEquals("Nope!", 5, Vowels.getCount("AbracAdabra"));
    }

    @Test
    public void testCase3() {
        assertEquals("Nope!", 6, Vowels.getCount("Aleksander Pyavchik"));
    }

}