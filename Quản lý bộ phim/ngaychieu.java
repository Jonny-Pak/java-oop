public class ngaychieu {
    private int day;
    private int month;
    private int year;

    public ngaychieu(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getday() {
        return day;
    }
    public void setday(int day) {
        if(day > 1 && day <= 31)
        this.day = day;
    }
    public int getmonth() {
        return month;
    }
    public void setmonth(int month) {
        if(month > 1 && month <= 12)
        this.month = month;
    }
    public int getyear() {
        return year;
    }
    public void setyear(int year) {
        if(year >= 0)
        this.year = year;
    }
}