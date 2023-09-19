public class B321 {
    public static void main(String[] args) {
        MyDate md = new MyDate(17, 9, 2023);
        md.setDay(17);
        md.setMonth(9);
        md.setYear(2023);
        System.out.println("Day: " + md.getDay());
        System.out.println("Month: " + md.getMonth());
        System.out.println("Year: "+ md.getYear());
        System.out.println("Date:" + md.getDay() +"," + md.getMonth() +"," + md.getYear());
    }
}