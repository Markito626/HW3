
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
               
    }
}
