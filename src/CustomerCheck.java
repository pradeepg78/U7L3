import java.util.ArrayList;

public class CustomerCheck
{
    /** The check for a customer or group of customers
     *  Guaranteed to contain at least one MenuItem and all entries are non-null
     */
    private ArrayList<MenuItem> check;

    /* Constructor */
    public CustomerCheck(ArrayList<MenuItem> check)
    {
        this.check = check;
    }

    /** Returns the total of all MenuItem prices on the check,
     *  as described in part (a)
     */
    public double totalPrices()
    {
        double p = 0.0;
        for (MenuItem price : check)
        {
            p += price.getPrice();
        }
        return p;
    }

    /** Returns true if the restaurant’s coupon offer can be applied to this check and
     *  returns false otherwise, as described in part (b) */
    public boolean couponApplies()
    {
        if (totalPrices() < 40)
        {
            return false;
        }

        for (MenuItem item : check)
        {
            if (item.isDailySpecial())
            {
                return false;
            }
        }

        return true;
    }

    /** Calculates the final cost of this check, as described in part (c) */
    public double calculateCheck()
    {
        double finalCheck = totalPrices();
        int c = 0;
        double tip = 0.0;
        double discount = 0.0;

        if (couponApplies())
        {
            discount =  0.25 * finalCheck;
        }

        for (MenuItem customers : check)
        {
            if (customers.isEntree())
            {
                c++;
            }
        }

        if (c >= 6)
        {
            tip =  (0.2 * finalCheck);
        }

        return finalCheck + tip - discount;
    }
}

