public class Date {
    private int year;
    private int month;
    private int day;
    public Date (){
        this.year = 2001;
        this.month = 10;
        this.day = 19;
    }
    public Date (int y, int m, int d){
        this.year = y;
        this.month = m;
        this.day = d;
    }

    public static void main(String[] args){
        Date birth1 = new Date();
        Date birth2 = new Date(2001,10,19);
    }

    //Below is not actually exercise part

    public boolean isXmasDay(){
        return this.month == 12 && this.day == 25;
    }
}
