import java.io.Serializable;
import java.io.*;
/**
 * Write a description of class check here.
 *
 * @author (Mark Miner)
 * @version (6/8/17)
 */

public class Check implements Serializable
{
    // keep track of balance
    private String date;
    private int check;
    private String reason;
    private String payee;
    private double amount;
    
    public Check(String d, int c, String r, String p, double a)
    {
        amount=a;
        date=d;
        check=c;
        payee=p;
        reason=r;      
 }   
public static void main (String[] args)
{
Check c1= new Check("3/4/17", 12345, "book","bookstore",123.12);

try {
     FileOutputStream f = new FileOutputStream("Hw4.txt,true");
     ObjectOutputStream out = new ObjectOutputStream(f);
     
     out.writeObject(c1);
    }
    catch (IOException e ) {
        e.printStackTrace ();
    }

    System.out.println("Unable to Serialize the object");
  }
 }
