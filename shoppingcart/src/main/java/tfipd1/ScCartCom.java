package tfipd1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ScCartCom {
    public String usname;
ArrayList<String> ffrr;

    public ScCartCom (String username, ArrayList<String> frfr)
    {
this.usname=username;
this.ffrr=frfr;

    }
    public void Writer() throws IOException{
        String fwn= new String("C:\\Users\\sha\\Documents\\tfip-java-assignments\\tfip-d3\\tfip-d1\\shoppingcart\\src\\main\\java\\tfipd1\\"+usname+".db");
        FileWriter fw=new FileWriter(fwn);
        for (int x=0;x<ffrr.size();x++)
        {
        fw.write(ffrr.get(x)+"\n");
                   }
fw.close();
}
}
