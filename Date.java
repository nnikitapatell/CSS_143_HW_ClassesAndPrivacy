
/**
 * Date Class
 * All days should be between [1-31]
 * All months should be between [1-12]
 * All years should be between [2001-2024]
 *
 * @author Nikita Patel
 * @version 1
 */
public class Date{
    //private instance variables
    private int day = 0;
    private int month = 0;
    private int year = 0;

    /**
     * Date Constructor- sets the instance variables day, month and year 
     * to the values that are passed through the method 
     * and call the setDate method
     *
     * @param monthInput A parameter
     * @param dayInput A parameter
     * @param yearInput A parameter
     */
    public Date(int mInput, int dInput, int yInput){
        //set the month, day, year inputs
        setDate(mInput, dInput, yInput);
    }

    /**
     * Date Constructor- is a overloaded copy constructor that gives us a deep copy of objects
     *
     * @param other A parameter
     */
    public Date(Date other){
        //deep copies of the objects
        this.month = other.getMonth();
        this.day = other.getDay();
        this.year = other.getYear();
    }

    /**
     * Method setDate- setter for date that takes in three parameter for month, day and year
     *
     * @param monthInput A parameter
     * @param dayInput A parameter
     * @param yearInput A parameter
     */
    public void setDate(int mInput, int dInput, int yInput){
        //preventing privacy leaks 
        setMonth(mInput);
        setDay(dInput);
        setYear(yInput);
    }

    /**
     * Method setMonth- setter for month
     * check if the month input is between [1-12] 
     * and if it is then it will set the instance variable month to the input variable
     *
     * @param monthInput A parameter
     */
    public void setMonth(int monthInput){
        //check if month is betweeen 1 and 12
        if (monthInput >= 1 && monthInput <= 12){
            //set this.month to monthInput
            this.month = monthInput;
        }
        else{
            //print error statement
            System.err.println("All months should be between [1-12]");
        }
    }

    /**
     * Method getMonth- getter for month that takes in no parameter 
     *
     * @return The return value
     */
    public int getMonth(){
        //return this.month
        return this.month;
    }

    /**
     * Method setDay- setter for day
     * check if the day input is between [1-31]
     * and if it is it will set the instance variable day to the input variable
     *
     * @param dayInput A parameter
     */
    public void setDay(int dayInput){
        //check if the day input is between [1-31]
        if(dayInput >= 1 && dayInput <= 31){
            //set this.day to dayInput
            this.day = dayInput;
        }        
        else{
            //otherwise return error statment
            System.err.println("All days should be between [1-31]");
        }
    }

    /**
     * Method getDay- getter for day that takes in no parameter
     *
     * @return The return value
     */
    public int getDay(){
        //return this.day
        return this.day;
    }

    /**
     * Method setYear- setter for year
     * check if the year is between [2001-2004]
     * and if it is then set the insance variable to year to the input variable
     *
     * @param yearInput A parameter
     */
    public void setYear(int yearInput){
        //check if the year is between [2001-2004]
        if(yearInput >= 2001 && yearInput <= 2024){
            //this.year is set to yearInput
            this.year = yearInput;
        }
        else{
            //print error statement
            System.err.println("All years should be between [2001-2024]");
        }
    }

    /**
     * Method getYear- getter for year that takes in no parameter but return an int value
     *
     * @return The return value
     */
    public int getYear(){
        //return this.year
        return this.year;
    }
    
    /**
     * Method equals- checks if the two objects/instances of the class are equivalent or not
     *
     * @param other A parameter
     * @return The return value
     */
    public boolean equals(Object o){
        //check if o is an instanc eof the Date class or is null
        if(o == null || o instanceof Date == false){
            return false;
        }
        //casting
        Date that = (Date) o;
        //return if true or false 
        return this.getMonth() == that.getMonth() &&
            this.getDay() == that.getDay() &&
            this.getYear() == that.getYear();       
    }
    
    /**
     * Method toString- stores all the elements of the Date as a String
     *
     * @return The return value
     */
    public String toString(){
        //format the date m/d/y
        return getMonth() + "/" + getDay() + "/" + getYear();
    }
}
