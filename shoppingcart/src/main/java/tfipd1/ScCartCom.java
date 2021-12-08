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
List<String>ffrr1;
String fwn;


    public ScCartCom (String username, List<String> frfr)
    {
        
this.usname=username;
this.ffrr=frfr;
fwn= new String("C:\\Users\\sha\\Documents\\tfip-java-assignments\\tfip-d3\\tfip-d1\\shoppingcart\\src\\main\\java\\tfipd1\\"+usname+".db");
    }
    public void Writer() throws IOException{
        
        FileWriter fw=new FileWriter(fwn);
        for (int x=0;x<ffrr.size();x++)
        {
        fw.write(ffrr.get(x)+"\n");
                   }
fw.close();
}

public void listfr() throws IOException
    { 
        File checkfile=new File(fwn);

if (checkfile.exists())
{
    ffrr1=Files.readAllLines(Paths.get(fwn));
    ffrr=ffrr1;
    for (int x=0;x<ffrr.size();x++)
    {
        System.out.println((x+1) +". " +ffrr.get(x));
    }
}
       else if (ffrr.size()<1)
       
        {
            System.out.println("You have nothing in your cart.");
        }
        else if (ffrr.size()>0)
        for (int x=0;x<ffrr.size();x++)
    {  System.out.println((x+1) +". " +ffrr.get(x)); }
    
    }
    
}

