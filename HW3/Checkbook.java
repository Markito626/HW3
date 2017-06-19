import java.util.*;
/**
 * Check book
 *
 * @author (Mark Miner)
 * @ (6/5/17)
 *  */
public class Checkbook
{
    // instance variables - replace the example below with your own
    public double balance;
    public Check myCheck;

    /**
     * Constructor for objects of class Check
     */
    public Checkbook()
    {
        // initialise instance variables
        balance= 1000.0;
    }
    public void addCheck(Check newCheck)
    {
        myCheck.add(newCheck);
        }
    /**
     * Print the checks
     */
    public void printChecks()
    {


      System.out.println("3/5/17");
        System.out.println("12345");
        System.out.println("rent");
        System.out.println("Apartment");
        System.out.println("$600.00");
        
        System.out.println("2/4/17");
        System.out.println("12346");
        System.out.println("tuition");
        System.out.println("Metropolitan State University");
        System.out.println("$29.30");
        
        System.out.println("1/2/17");
        System.out.println("12347");
        System.out.println("Shoes");
        System.out.println("The Mall");
        System.out.println("$100.00");
        
        System.out.println("4/6/17");
        System.out.println("12348");
        System.out.println("Bills");
        System.out.println("roomate");
        System.out.println("$300.00");
        
        System.out.println("5/7/17");
        System.out.println("12349");
        System.out.println("good grade");
        System.out.println("teacher");
        System.out.println("$1.00");
               
    }
}
