import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class VowelsTest {
    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }

}