public class billcaffe {
    private String Caphe;
    private double giatien, khoiluong;

    public billcaffe (String Name, double tien, double KL) {
        this.Caphe = Name;
        this.giatien = tien;
        this.khoiluong = KL;
    }
    public double tongcong() {
        return this.giatien * this.khoiluong;
    
    }
}