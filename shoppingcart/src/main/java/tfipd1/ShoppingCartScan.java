package tfipd1;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCartScan {
     List<String> fruits=new ArrayList<>();
     String user;
     Boolean isloggedin=false;

    public static void main(String[] args) throws IOException, InterruptedException {
        ShoppingCartScan scart=new ShoppingCartScan();
             
        scart.checklogin();
            }
           
            
                public void checklogin() throws IOException, InterruptedException{
                    
                    if (isloggedin==true)
                    {
                        Welcome();
                    }
                    else
                    { 
                        Console inp=System.console();
    String input=inp.readLine("Welcome to your shopping cart.please log in:");
    Scanner scann=new Scanner(input);
    String scannx=scann.next();
                        
                        if (scannx.equals("login")){
                            String uname=input.substring(6);
                             user=uname;
                             System.out.println("Login complete.");
                             isloggedin=true;
                            checklogin();
                            }   
                            else
                            checklogin();                           
                        }
                           
            }
        
    public void Welcome() throws IOException, InterruptedException  
    {
    
    System.out.println("Please use only the following commands: add, delete, list, login.");
    Console inp=System.console();
    String input=inp.readLine("Welcome to your shopping cart.");
    Scanner scann=new Scanner(input);
    String scannx=scann.next();

    if (input.equals("save")){
       this.saver();
    }
    
       switch (scannx)
       {
           case "add":
     this.add(input);
        break;
        case "list":
        this.listfruits(input);
        break;
        case "delete":
        this.delete(input);
        break;
        case "logout":
        System.out.println("You have been logged out.");
        Thread.sleep(1000);
        isloggedin=false;
        checklogin();
        default:
        System.out.println("wrong input. Try again");
      
       }
        

    }
    public void add(String input) throws IOException, InterruptedException{
        {   
            String addinput= new String(input).substring(4);
            if (addinput.contains(","))
            {
                String[] jjj=addinput.split(",");
              for (int x=0;x<jjj.length;x++)
              {
                if (fruits.contains(jjj[x]))
                {
                    System.out.println("you already added "+jjj[x]);
                }
                else
                    {
                    fruits.add(jjj[x]);
                        System.out.println(jjj[x]+" added to cart");
                    }
              }      
              this.saver();
            Welcome();
        }
            if (fruits.contains(addinput))
            {
                System.out.println("you already added "+addinput);
                this.saver();
                Welcome();
            }
            else
            {
                fruits.add(addinput);
                System.out.println(addinput+" added to cart");
           }this.saver();
              Welcome();
        }
        
            }
    public void delete(String input) throws IOException, InterruptedException
{
    String delinput=new String(input).substring(7);
    String delnum=new String(input).substring(7,8);
    
    if (delnum.matches("[1-9]") && input.length()==8)
    {
   
         int dnum= Integer.parseInt(delnum);
         int addone=fruits.size()+1;

            if (addone>dnum)
            {
                System.out.println(fruits.get(dnum-1) + " removed from cart");
                fruits.remove(dnum-1);                           
            }
            else
            {
                System.out.println(delinput + " does not exist");
            }this.saver();
            Welcome();
            }
    
    if (!fruits.contains(delinput))
    {
        if (delinput.contains(","))
        {
            String[] delstr=delinput.split(",");
            for(int x=0;x<delstr.length;x++)
            { 
                if (!fruits.contains(delstr[x]))
                {
                    System.out.println(delstr[x]+" does not exist in your cart");
                }
                else
                {
                    fruits.remove(delstr[x]);
               System.out.println(delstr[x] +" deleted from cart");
                }
            }this.saver();
            Welcome();
        }
        System.out.println("Your cart does not have "+delinput);
        this.saver();
        Welcome();
    }
    else
    {
    fruits.remove(delinput);
System.out.println(delinput+" deleted from cart");
this.saver();
Welcome();
    } 
}
    
    public void listfruits(String input) throws IOException, InterruptedException
    {
        ScCartCom listthis = new ScCartCom(user, fruits);
        listthis.listfr();
        Welcome();
           } 
           public void saver() throws IOException, InterruptedException
           {
            ScCartCom writethis = new ScCartCom(user, fruits);
            writethis.Writer();
            System.out.println("Cart has been saved.");
            Welcome();
           }
  }
