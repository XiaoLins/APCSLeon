/*
Time class of Chap11.java
 */

//One common reason to define a class it to encapsulate related data in
//an object that can be treated as a single unit
public class Time {
    //The Time class is public which means it can be used in other classes.
    //Attributes are also called instance variables. What instance variables do we need?
    private int hour;
    private int minute;
    private double second;
    /*
    The instance variables are private, which means they can only be accessed
    from inside the Time class
    Private instance variables help keep classes isolated from each other so that
    changes in one class will not require changes in other classes.
    (information hiding).
     */
    //After declaring the instance variables, the next step is to define a
    //constructor, which is a special method that initialized the instance variables.
    public Time(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
        //This constructor does not take any argument.
        /*
        The name this is a keyword that refers to the object we are creating.
        Each line initializes an instance variable to 0.

        This constructor make it possible to create a Time object with default
        attributes.

        Now create a Time object, time1, in Chap11Leon.java
         */
    }

    //Now create a value constructor.
    public Time(int hour, int minute, double second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;

        if (this.second >= 60){
            this.second -= 60;
            this.minute += 1;
        }
        if (this.minute >= 60){
            this.minute -= 60;
            this.hour += 1;
        }
        if (this.hour >= 24){
            this.hour -= 24;
        }

        /*
        To invoke this value constructor, we have to provide arguments after the new
        operator.

        The preceding constructors are overloading. Overloading constructors provide
        the flexibility to create an object first and then fill in the attributes.
        Now create a Time object, time2, in Chap11.java with
        hour = 24, minute = 59 and second = 60
         */
    }

    //Create an instance method printTime()
    public void printTime() {
        System.out.printf("%02d:%02d:%04.1f\n", this.hour, this.minute, this.second);
    }
    //An instance method is not static. We have to invoke it on an instane of the class.

    //Create getters and setters.
    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }

    public double getSecond(){
        return this.second;
    }
    //These methods are instance methods.
    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public void setSecond(double second){
        this.second = second;
    }
    //Recall that Strings are immutable. To make a class immutable we should not provide setters.

    public String toString(){
        return String.format("%02d:%02d:%04.1f", this.hour, this.minute, this.second);
    }

    public boolean equals (Time that){
        return this.hour == that.hour && this.minute == that.minute && this.second == that.second;
    }

    public static Time add (Time time1, Time time2){
        return new Time(time1.getHour()+time2.getHour(),time1.getMinute()+time2.getMinute(),time1.getSecond()+time2.getSecond());
    }

    public Time add (Time that){
        return new Time(this.hour+that.hour,this.minute+that.minute,this.second+that.second);
    }

    public Time modifier (Time that){
        this.hour += that.hour;
        this.minute += that.minute;
        this.second += that.second;
        if (this.second >= 60){
            this.second -= 60;
            this.minute += 1;
        }
        if (this.minute >= 60){
            this.minute -= 60;
            this.hour += 1;
        }
        if (this.hour >= 24){
            this.hour -= 24;
        }
        return this;
    }

    public void increment (double seconds){
        this.second += seconds;
        this.minute = this.minute + ((int)this.second - ((int)this.second % 60)) / 60;
        this.second = this.second % 60;
        this.hour = this.hour + (this.minute - (this.minute % 60)) / 60;
        this.minute = this.minute % 60;
    }
}
