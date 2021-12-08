package tfipd1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class ScCartCom {
    public String usname="empty";
List<String> ffrr;
//List<String>ffrr1;
String fwn;

    public ScCartCom (String username, List<String> frfr)
    {
        
this.usname=username;
this.ffrr=frfr;
fwn= new String("C:\\Users\\sha\\Documents\\tfip-java-assignments\\tfip-d3\\tfip-d1\\shoppingcart\\src\\main\\java\\tfipd1\\db\\"+usname+".db");
    }
    public void Writer() throws IOException{
        
        FileWriter fw=new FileWriter(fwn);
        for (int x=0;x<ffrr.size();x++)
        {
        fw.write((x+1)+". "+ffrr.get(x)+"\n");
                   }
fw.close();
}

public void listfr() throws IOException
    { 
        File checkfile=new File(fwn);

if (checkfile.exists())
{
    ffrr=Files.readAllLines(Paths.get(fwn));
    
    for (int x=0;x<ffrr.size();x++)
    {
        System.out.println(ffrr.get(x));
    }
}
if (ffrr.size()==0)      
        {
            System.out.println("You have nothing in your cart.");
        }
        
    
    }
    
}

