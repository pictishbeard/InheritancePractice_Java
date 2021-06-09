import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;
import static org.junit.Assert.assertEquals;

public class DeveloperTest {

        Developer developer;

        @Before
        public void before() {
            developer = new Developer("Aaron", 212121, 68000.50);
        }

        @Test
        public void hasName(){
            assertEquals("Aaron",developer.getName() );
        }
    }