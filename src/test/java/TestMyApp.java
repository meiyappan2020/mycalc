import org.junit.Test;
import com.mei.MyApp;

import static org.junit.Assert.assertEquals;

public class TestMyApp {

    @Test
    public void testMynumbers(){
        MyApp app = new MyApp();
        int res = app.add(-1,8);
        assertEquals(7,res);

    }

}
