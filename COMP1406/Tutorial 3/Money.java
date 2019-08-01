package comp1406t3;

/** Tutorial 3 - Winter 2019
  * <p>
  * A class to model currency (money) as dollars and cents
	* <p>
	*
	* @author Lily Inskip-Shesnicky
	* @version 1.0
  */

public class Money{

  /* attributes */
  private int dollars = -1;
  private int cents = -1;

  public Money(){
		this.dollars = 0;
    this.cents = 0;
  }

  public Money(int c){
    //create variables
    double total;
    int dollar;
    double cent;

    //for every cent there is 0.01 dollars
    // so multiplying by 0.01 gives you the right
    // decimal of dollar.cent
    total = c * 0.01;
    //cast total to int gives you element above decimal
    dollar = (int)total;
    cent = total - dollar;
    cent *= 100;

    this.cents = (int)cent;
    this.dollars = dollar;
		// (adjusting dollars and cents so that 0<=cents<=99)
  }

  public Money(int d, int c){
    //create variables
    double total;
    int dollar;
    double cent;

    //for every cent there is 0.01 dollars
    // so multiplying by 0.01 gives you the right
    // decimal of dollar.cent
    total = (c * 0.01) + d;
    //cast total to int gives you element above decimal
    dollar = (int)total;
    cent = total - dollar;
    cent *= 100;

    this.cents = (int)cent;
    this.dollars = dollar;
    // (adjusting dollars and cents so that 0<=cents<=99)
  }

  public Money(int[] coins){
	  // input array has 6 elements and corresponds to
		// {#toonies, #loonies, #quarters, #dimes, #nickels, #pennies}
    // {$2, $1, $0.25, $0.10, $0.05, $0.01}
		// create an object with total money passed in array
		// (adjusting internal dollars and cents so that 0<=cents<=99)
    double total;
    int dollar;
    double cent;

    //get amount of dollars/cents and multiply by their amounts
    dollar = (coins[0]*2) + (coins[1]*1);
    cent = (coins[2]*0.25) + (coins[3]*0.10) + (coins[4]*0.05) + (coins[5]*0.01);

    total  = cent + dollar;
    dollar = (int)total;
    cent = total - dollar;
    cent *= 100;

    this.cents = (int)cent;
    this.dollars = dollar;
  }

  /**
   * Returns a String representation of the value of the current object.
   *
   * @return The value of the current object is returned as the <code>String</code>"$D.cc"
   * where D is the number of dollars and cc is the cents of the value.  Uses the <code>format()</code>
   * method from the <code>String</code> class to ensure that the cents are displayed properly (2 spaces
   * with leading zeros if needed).
   **/
  public String toString(){
    return "$" + String.format("%01d", dollars) + "." + String.format("%02d", cents);
  }

  public void add(int c){
    //create variables
    double total;
    int dollar;
    double cent;

    //for every cent there is 0.01 dollars
    // so multiplying by 0.01 gives you the right
    // decimal of dollar.cent
    total = (this.cents + c) * 0.01;
    //cast total to int gives you element above decimal
    dollar = (int)total;
    cent = (total - dollar);
    cent *= 100;

    //the total amount used already involved previous cents
    //so can just set to equals
    //  dollars was not involved so must add on top
    this.cents = (int)cent;
    this.dollars += dollar;
  }

  public void add(int d, int c){
    double total;
    int dollar;
    double cent;

    total = ((this.cents + c) * 0.01) + d;
    dollar = (int)total;
    cent = (total - dollar);
    cent *= 100;

    this.cents = (int)cent;
    this.dollars +=  dollar;
  }

  /** Removes as many cents as possible based on input
    *
    * @param c is the amount of cents (int) to be removed
    *
    * @return the amount of cents succesfully removed
    */
  public int remove(int c){
    double total;
    int newTotal;
    int dollar;
    double cent;
    int removed = 0;

    //if cents is already less than just remove
    if(c < this.cents){
      this.cents -= c;
      removed = c;
    } else{
      //if the total amount of cents is greater than c
      if((this.dollars * 100 + this.cents) > c){
        //find the total of c in $.cents
        total = c * 0.01;
        dollar = (int)total;
        cent = total - dollar;
        cent *= 100;
        //amount removed will be equal to c input
        removed = c;

        //if og cents - input cent is less
        // means that it is a case such as 4.00 - 1.50, etc
        // so when you subtract the cents it will say $3.-50
        if(this.cents - cent < 0){
          this.cents += cent;
        }else{
          this.cents -= cent;
        }

        this.dollars -= dollar;

      } else{
        //the original amount of cents
        newTotal = this.cents + (this.dollars * 100);
        //the difference between the input cent and original amount
        removed = c - newTotal;
        //the amount you will be able to remove (to 0 out)
        removed = c - removed;

        //turn the amount removed into $.cents
        total = removed * 0.01;
        dollar = (int)total;
        cent = total - dollar;
        cent = total - dollar;
        cent *= 100;

        //remove proper amounts to 0 out
        this.dollars -= dollar;
        this.cents -= cent;
      }
    }
    //return what amount of money was able to be removed
    return removed;
  }
}
