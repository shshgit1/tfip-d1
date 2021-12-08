package tfipd1;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class ScCartComTest {
    List<String> testArray=new ArrayList<>();

    @Test
    public void testWriter() throws IOException{
        ScCartCom tester=new ScCartCom("testone", testArray);
        tester.Writer();
File chck=new File("C:\\Users\\sha\\Documents\\tfip-java-assignments\\tfip-d3\\tfip-d1\\shoppingcart\\src\\main\\java\\tfipd1\\testone.db");
assertTrue(chck.exists());


    }
}
