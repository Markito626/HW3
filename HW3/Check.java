
/**
 * Write a description of class check here.
 *
 * @author (Mark Miner)
 * @version (6/8/17)
 */
public class Check
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
          

}
