import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MathTester {
    @Test
    public void test1() throws IOException{
        assertEquals(200, Math.math("Multiply(20,10)"));   
    }
    @Test
    public void test2() throws IOException{
        assertEquals(200, Math.math("mult(20,10)"));   
    }
    @Test
    public void test3() throws IOException{
        assertEquals(200, Math.math("20*10"));   
    }
}
