import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Main Tests")
public class MainTest {

    @Test
    @DisplayName("String Dummy Test")
    public void stringDummyTest() {
        assertEquals("Dummy", "Dumy");
    }

}
