
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TesteChaves {

    @Test
    public void verifyValidCase1() {
        assertTrue(ChavesApp.val("[]{}"));
    }
    @Test
    public void verifyValidCase2() {
        assertTrue(ChavesApp.val("{[()]}"));
    }
    @Test
    public void verifyValidCase3() {
        assertTrue(ChavesApp.val("[{}()]"));
    }
    @Test
    public void verifyValidCase4() {
        assertTrue(ChavesApp.val("({[]{}})"));
    }
    @Test
    public void verifyInvalidCase1() {
        assertFalse(ChavesApp.val("[)"));
    }
    @Test
    public void verifyInvalidCase2() {
        assertFalse(ChavesApp.val("({[(]})"));
    }
    @Test
    public void verifyInvalidCase3() {
        assertFalse(ChavesApp.val("((((([]))))"));
    }
    @Test
    public void verifyInvalidCase4() {
        assertFalse(ChavesApp.val("{()}}"));
    }
}
