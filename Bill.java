
/**
 * Bill Class
 * The internal paid date should be on or earlier than the due date.
 * Every Bill is owed someone, so the originator should never be empty.
 *
 * @author Nikita Patel
 * @version 1
 */
//create the class called Bill
public class Bill{
    //instance variables
    //a Money object ste to null
    private Money amount = null;
    //a Date object set to null
    private Date dueDate = null;
    //a Date object, null if not yet paid
    private Date paidDate = null;
    //a String containing the company or institution who issued the bill
    private String originator = "";

    /**
     * Constructor for objects of class Bill
     */
    public Bill(){

    }

    /**
     * Bill Constructor- sets amount, duedate, and originator
     *
     * @param amountInput A parameter
     * @param dueDateInput A parameter
     * @param originatorInput A parameter
     */
    public Bill (Money amountInput, Date dueDateInput, String originatorInput){
        //set amount, dueDate, originaotr
        setAmount(amountInput);
        setDueDate(dueDateInput);
        setOriginator(originatorInput);
    }

    /**
     * Bill Constructor- is a copy constructor that intitializes an object using another 
     * object of the same class
     *
     * @param toCopy A parameter
     */
    public Bill(Bill toCopy){
        //initialize amount, dueDate, paidDate and originator 
        this.amount = toCopy.amount;
        this.dueDate = toCopy.dueDate;
        this.paidDate = toCopy.paidDate;
        this.originator = toCopy.originator;
    }

    /**
     * Method isPaid- returns whether the bill was paid or not
     *
     * @return The return value
     */
    public boolean isPaid(){
        //check if paidDate is not null
        if(getPaidDate() != null){
            //if the dat is not null thenb check if the year, mont, and day are the same
            if(getPaidDate().getYear() <= getDueDate().getYear() &&
            getPaidDate().getMonth() <= getDueDate().getMonth() &&
            getPaidDate().getDay() <= getDueDate().getDay()){
                //return true 
                return true;
            }
        }
        
        //if not return false
        return false;
    }

    /**
     * Method setDueDate- sets the due date value by taking in a Date parameter value
     *
     * @param nextDate A parameter
     */
    public void setDueDate(Date nextDate){
        //check if the nextDate is null
        if (nextDate == null){
            //if it is print error message
            System.err.println("No date has been entered.");
        } 
        else {
            //crate a new object of the date class and set to the input value
            Date dueDateObject = new Date (nextDate);
            //set the dueDate to the new object
            this.dueDate = dueDateObject;
        }
    }

    /**
     * Method getDueDate - return the due date 
     *
     * @return The return value
     */
    public Date getDueDate() {
        //return dueDate
        return new Date(this.dueDate);
    }

    /**
     * Method setUnPaid- paid date is set to null to show that it is unpaid
     *
     */
    public void setUnPaid(){
        //paidDate is set to null is its unpaid
        this.paidDate = null;
    }

    /**
     * Method getPaidDate- return the paid Date
     *
     * @return The return value
     */
    public Date getPaidDate(){  
        //return paidDate
        return new Date(this.paidDate);
    }

    /**
     * Method setPaid- set the paid date by taking in a parameter
     *
     * @param onDay A parameter
     */
    public void setPaid(Date onDay){
        if (onDay == null){
            //print error message ang exit
            System.err.println("No date has been entered.");
        }
        else{
            //create a objec tof the Date class and set to the input value
            Date setPaidObject = new Date(onDay);
            //set the new objec to teh the paidDate
            this.paidDate = setPaidObject;
        }
    }

    /**
     * Method setAmount- sets the amount by takin a money class parameter
     *
     * @param amount A parameter
     */
    public void setAmount(Money amount){
        if(amount == null){
            System.err.println("No amount has been entered");
        }
        else{
            //create a new money object set to the input value
            Money amountObject = new Money(amount);
            //set the new object ot amount
            this.amount = amountObject;
        }
    }

    /**
     * Method getAmount- return the amount of money 
     *
     * @return The return value
     */
    public Money getAmount() {
        //return the amount
        return new Money(this.amount);
    }

    /**
     * Method setOriginator- sets the originator as a string by taking in a string parameter
     *
     * @param originatorInput A parameter
     */
    public void setOriginator(String originatorInput){
        //check if originator Input isnull
        if(originatorInput == null){
            //return error message
            System.err.println("There is no originator input");
        }
        else{
            //set the originator to the input
            this.originator = new String(originatorInput);
        }    
    }

    /**
     * Method getOriginator- return the originator as a string value
     *
     * @return The return value
     */
    public String getOriginator(){
        //return the originator
        return new String(this.originator);
    }

    /**
     * Method toString- returns a bill in a formatted report
     *
     * @return The return value
     */
    public String toString() {
        //create a temp variable string
        String report = " ";
        report = "Amount: " + getAmount() 
        + "\nDue: " + getDueDate() 
        + "\nOriginator: " + getOriginator();
        //check if the date is not null before check if the the payment was made of the date it was paid
        if (paidDate != null) {
            report = report 
            + "\nWas the payment made?: " + isPaid() 
            + "\nDate the payment was paid: " + getPaidDate();
        }   
        //return the report
        return report;
    }

    /**
     * Method equals- Determines if this BIll object is equal to that Bill object
     *
     * @param toCompare A parameter
     * @return The return value
     */
    public boolean equals(Bill toCompare){
        //check if the obejct is null or an instance of the Bill class
        if (toCompare == null || toCompare instanceof Bill == false){
            //return false
            return false;
        }
        else{
            //casting
            Bill that = (Bill) toCompare;
            //return if they're equal
            return this.dueDate == that.dueDate &&
            this.amount == that.amount &&
            this.originator == that.originator;
        }
    }
}