package tfipd1;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;



public class ShoppingCart {
    ArrayList<String> fruits = new ArrayList<>();
   
   public static void main(String[] args) {
    ShoppingCart abc=new ShoppingCart();
    
    abc.Welcome();
   }
      public void Welcome()
    {
   Console inp=System.console();
String input=inp.readLine("Welcome to your shopping cart!");


if (!input.startsWith("add ") && !input.equals("list") &&!input.startsWith("delete "))
{
    System.out.println("wrong input. Try again");
    Welcome();
}
if (input.startsWith("add "))
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
    Welcome();
}
    if (fruits.contains(addinput))
    {
        System.out.println("you already added "+addinput);
        Welcome();
    }
    else
    {
        fruits.add(addinput);
        System.out.println(addinput+" added to cart");
   }
      Welcome();
    }
if (input.startsWith("delete "))
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
            }
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
            }
            Welcome();
        }
        System.out.println("Your cart does not have "+delinput);
        Welcome();
    }
    else
    {
    fruits.remove(delinput);
System.out.println(delinput+" deleted from cart");
Welcome();
    }


}
if (input.equals("list"))
{
    if (fruits.size()<1)
    {
        System.out.println("You have nothing in your cart.");
    }
    for (int x=0;x<fruits.size();x++)
    {
    System.out.println((x+1) +". " +fruits.get(x));
    }
    Welcome();

}

}

}



