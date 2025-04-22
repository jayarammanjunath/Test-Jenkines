import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloJenkinsTest {

    @Test
    public void testGreet() {
        HelloJenkins hj = new HelloJenkins();
        assertEquals("Hello from Jenkins Test!", hj.greet());
    }
}
