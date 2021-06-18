/**
 *  final driver, which should test Money, Bill and Date classes
 *
 * @author Nikita Patel
 * @version 1
 * 
Simple driver to test Money, Date, and Bill classes
@author Rob Nash, borrowed from cfolsen
 */
public class BillMoneyDateDriver{
    /**
    main driver function
    pre:  none
    post: exercises the methods in Bill, Money, and Date (not done)
     */
    public static void main(String[] args){
        try{
            //Construct some money
            //Test 1: no argument constructor
            Money money = new Money();
            //Test 2: constructor initializes using dollars input 
            Money money1 = new Money(10);
            //Test 3: Copy constructor with the Money clas object as a parameter
            Money money2 = new Money(money1);
            Money money3 = new Money(100);
            Money money4 = new Money(100);
            Money money5 = new Money(12);
            //Test 4: constructor initializes dollars and cents accordingly
            Money money6 = new Money(0,10);

            //money1.setMoney(30,50);
            //Test 5: Sets our dollars and cents, accordingly 
            money2.setMoney(34,90);
            money3.setMoney(287,55);
            money4.setMoney(287,55);

            //Test 6: Adds the int passed into the function to dollars- positive number
            money5.add(12);
            //Test 7: Adds to dollars and cents the two ints passed into the function
            money6.add(12,30);

            //TODO: do more functional exercises with the money class   
            //print statements
            System.out.println("money: " + money);
            System.out.println("money1: " + money1);
            System.out.println("money2.setMoney(34,90): " + money2);
            System.out.println("money3.setMoney(287,55): " + money3);
            System.out.println("money4.setMoney(287,55): " + money4);
            System.out.println("money5.add(12): " + money5);
            System.out.println("money6.add(12,30): " + money6);
            //Test 9: Adds to this object the dollars and cents stored in the other object.
            money1.add(money1);
            System.out.println("add(money1): " + money1);
            //Test 10: Adds the int passed into the function to dollars- negative number
            money1.add(-2);
            System.out.println("add(-2): " + money1);
            //Test 11: Determines if this money object is equal to that Money object- True
            System.out.println("money2.equals(money3): " + money2.equals(money3));
            //Test 12: Determines if this money object is equal to that Money object- False
            System.out.println("money3.equals(money4): " + money3.equals(money4));
            //Test 13: Prints out a Money object as a String, such as “$3.75"
            System.out.println("money1.toString(): " + money1.toString());
            //Test 14: A getter for the total monetary amount, as a double
            System.out.println("money6.getMoney(): " + money6.getMoney());

            System.out.println();

            //Construct some bills
            //Test 15: This constructor initializes using dollars input 
            Money amount = new Money(20);
            //Test 16: sets the instance variables day, month and year 
            Date dueDate = new Date(4, 30, 2007);
            Date paidDate = new Date(5, 29, 2007);
            //Test 17: sets Money, Date, Originator
            Bill bill1 = new Bill(amount, dueDate, "The phone company");
            //Test 18: make the bill paid, save the date
            bill1.setPaid(paidDate);

            Bill bill2 = new Bill(bill1);
            bill2.setDueDate(new Date(5, 30, 2007));
            amount.setMoney(31, 99);
            //Test 19: set the day
            dueDate.setDay(29);
            //Test 20: set the month
            dueDate.setMonth(4);
            //Test 21: set the year
            dueDate.setYear(2004);
            bill2.setPaid(paidDate);

            //Test 24: getPaidDate
            System.out.println("Get paid date for bill 2: " + bill2.getPaidDate());  
            //Test 34: getPaidDate
            System.out.println("Get due date for bill 2: " + bill2.getDueDate());  
            //Test 29: getMoney
            System.out.println("Bill2 getMoney:" + amount.getMoney());
            //Test 30: getMonth
            System.out.println("Bill2 getMonth:" + dueDate.getMonth());
            //Test 31: getDay
            System.out.println("Bill2 getDay:" + dueDate.getDay());
            //Test 32: getYear
            System.out.println("Bill2 getYear:" + dueDate.getYear());
            //Test 33: equals method for Date class - false
            System.out.println("Bill2 dueDate equals paidDate:" + dueDate.equals(paidDate));
            System.out.println();

            amount.setMoney(50,67);
            dueDate.setYear(2010);
            Bill bill3 = new Bill(amount, dueDate, "The record company");
            bill3.setPaid(paidDate);

            Bill bill5 = new Bill(amount, dueDate, "Coffee Shop");
            amount.setMoney(5,00);
            bill5.setDueDate(new Date(6, 1, 2014));
            //Test 28: setUnpaid
            bill5.setUnPaid();
            Date paid = new Date(7, 1, 2014);
            bill5.setPaid(paid);

            //Test 26: copy constructor
            Bill bill4 = new Bill(bill3);

            System.out.println("Bill 1:");
            System.out.println(bill1);
            System.out.println("Bill 2:");
            System.out.println(bill2);
            System.out.println("Bill 3:");
            System.out.println(bill3);
            System.out.println("Bill 4:");
            System.out.println(bill4);
            System.out.println();

            //Test 22: equals for bill- true
            System.out.println("Are bill 3 & 4 the same?: " + bill3.equals(bill4));
            //Test 22: equals mehtod for bill- false
            System.out.println("Are bill 1 & 4 the same?: " + bill1.equals(bill4));   
            //Test 23: getOriginator
            System.out.println("Get originator for bill 1: " + bill1.getOriginator());   

            //Test 25: toString for bill
            System.out.println("toString for bill 3: " + bill3.toString());  
            //Test 27: setUnpaid
            System.out.println();
            System.out.println(bill5);  
            //Test 34
            bill5.setPaid(null);
            System.out.println("Bill 5 with null input fro setPaid should print error message" 
                + bill5);         
        }
        catch(Exception e){
            System.err.println("Eception caught in the catch block.");
        }
    }
}