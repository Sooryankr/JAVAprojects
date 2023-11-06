import java.util.Scanner;

public class details{
  public  static float famount,tcvalue;
  public static String tcurrency,fcurrency;

public void getdetails() {
    Scanner read = new Scanner(System.in);

    System.out.println("enter the currency");
   fcurrency = read.nextLine();
    
    System.out.println("enter the amount");
   famount = read.nextFloat();
     
       System.out.println("enter the currency to which you want to convert");
            tcurrency = read.next();

           System.out.println("enter the value of one " +fcurrency+ " "+ "in   "+tcurrency);
            tcvalue = read.nextFloat();


            


        

  
   
  



}}