public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int d, int m, int y) {
        if(day > 1 && day <= 31){
        this.day = d;
        }else {
            this.day = 0;
        }
        if(month>1 && month<=12) {
            this.month = m;
        }else {
            this.month = 0;
        }
        if(year > 0) {
            this.year = y;
        }else {
            this.year = 0;
        }
    }
    public int getDay() {
        return this.day;
    }
    public void setDay(int d) {
        if(d > 1 && d <= 31)
        this.day = d;
    }
    public int getMonth() {
        return this.month;
    }
    public void setMonth(int m) {
        if(m>1 && m<=12)
        this.month = m;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int y) {
        if(y > 0)
        this.year = y;
    }
}