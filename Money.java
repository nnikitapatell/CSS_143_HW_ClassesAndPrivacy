
/**
 * This class is used to track a USD amount consisting of two integers to manage 
 * dollars and cents.  All dollars and cents will be positive or 0, and cents will 
 * never exceed 99.
 * 
 * Class invariants: Our internal cents should be between [0-99] at all times
 * Our internal Cents and Dollars should never be < 0, at all times
 *
 * @author Nikita Patel
 * @version 1
 */
public class Money{
    // instance variables are of int and private
    private int dollar = 0;
    private int cent = 0;

    /**
     * Constructor for objects of class Money
     */
    public Money(){

    }

    /**
     * Money Constructor-This constructor initializes using dollars input 
     * and assumes no cents
     *
     * @param dol A parameter
     */
    public Money(int dol){
        //dollars is set to dol
        this.dollar = dol;
        //cents is set to 0
        this.cent = 0;
    }

    /**
     * Money Constructor- This constructor initializes dollars and cents accordingly
     *
     * @param dol A parameter
     * @param cent A parameter
     */
    public Money(int dol, int cent){
        //dollars is set to dol
        this.dollar = dol;
        //cents is set to 0
        this.cent = cent;
    }

    /**
     * Money Constructor- This copy constructor could redirect to the one above
     *
     * @param other A parameter
     */
    Money(Money other){
        //check if other is null or not an instance of Money
        if (other == null || other instanceof Money == false){
            //print error message and exit
            System.err.println("Other is null or not an instance of Money");
            
        }
        //otherwise
        else{
            //set this object to other object 
            this.dollar = other.dollar;
            this.cent = other.cent;
        }
    }


    /**
     * Method setDollar- sets dollar by taking in a parameter int value
     *
     * @param dol A parameter
     */
    private void setDollar(int dol){
        //set the dollar to the input parameter
        this.dollar = dol;
    }

    /**
     * Method getDollar- return a int value when getDOllar is called
     *
     * @return The return value
     */
    private int getDollar(){
        //return the dollar
        return this.dollar;
    }

    /**
     * Method setCent- set the cent by taking in a parameter int and checking if the input is valid
     *
     * @param cent A parameter
     */
    private void setCent(int cent){
        //check if cent is greater than 99 or cent is less than 0
        if(cent > 99 || cent < 0){
            //print error message and exit
            System.err.println("Invalid input!");
        }
        else{
            //set cent to the parameter input
            this.cent = cent;
        }
    }

    /**
     * Method getCent- return a int value when getCent is called
     *
     * @return The return value
     */
    private int getCent(){
        //returns cent
        return this.cent;
    }

    /**
     * Method getMoney- A getter for the total monetary amount, as a double
     * Returns 5.75, for example
     *
     * @return The return value
     */
    public double getMoney(){
        //returns the money formated as a double
        return this.dollar + (this.cent / 100);
    }

    /**
     * Method setMoney- Sets our dollars and cents, accordingly 
     * This function should make use of setters for dollars and cents
     *
     * @param dol A parameter
     * @param cent A parameter
     */
    public void setMoney(int dol, int cent){
        //sets dollar and cent
        setDollar(dol);
        setCent(cent);
    }

    /**
     * Method add- Adds the int passed into the function to dollars
     * Should accept positive and negative arguments.
     *
     * @param dol A parameter
     */
    public void add(int dol){
        //add dollars
        setDollar(getDollar() + dol);
    }

    /**
     * Method add- Adds to dollars and cents the two ints passed into the function.
     * Should accept positive and negative arguments 
     * (though both arguments have to be positive or negative).
     *
     * @param dol A parameter
     * @param cents A parameter
     */
    public void add(int dol, int cents){
       //add dollars
       this.dollar += dol;
       //add cents
       this.cent += cents;
       //check if the cents are greater than 99
       if(this.cent > 99){
          //dollars is cent/100
          this.dollar += this.cent / 100;
          //cent is the remaind of cent and 100
          this.cent = this.cent % 100;
       }
    }

    /**
     * Method add- Adds to this object the dollars and cents stored in the other object.
     *
     * @param other A parameter
     */
    public void add(Money other){
        //add the dollars and cents
        add(other.getDollar(), other.getCent());
    }
    
    /**
     * Method equals- Determines if this money object is equal to that Money object
     *
     * @param o A parameter
     * @return The return value
     */
    public boolean equals(Object o){
        //check if object o is null or not an instance of money class
        if (o == null || o instanceof Money == false){
            //return false
            return false;
        }
        //cast
        Money that = (Money) o;
        //reurn if they are equal
        return this.cent == that. cent && this.dollar == that.dollar;
    }

    /**
     * Method toString- Prints out a Money object as a String, such as “$3.75”
     *
     * @return The return value
     */
    public String toString(){
        //return formatted string
        return "$" + this.dollar + "." + this.cent;
    }
}