public class phim {
    private String tenphim;
    private String nhaxuatban;
    private int namsanxuat;
    private String quocgia;
    private double giave;
    private ngaychieu ngaychieu;

    public phim(String tenphim, String nhaxuatban, int namsanxuat, String quocgia, double giave, ngaychieu ngaychieu) {
        this.tenphim = tenphim;
        this.nhaxuatban = nhaxuatban;
        this.namsanxuat = namsanxuat;
        this.quocgia = quocgia;
        this.giave = giave;
        this.ngaychieu = ngaychieu;
    }
    public String gettenphim() {
        return tenphim;
    }
    public void settenphim(String tenphim) {
        this.tenphim = tenphim;
    }
    public String getnhaxuatban() {
        return nhaxuatban;
    }
    public void setnhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }
    public int getnamsanxuat() {
        return namsanxuat;
    }
    public void setnamsanxuat(int namsanxuat) {
        this.namsanxuat = namsanxuat;
    }
    public String getquocgia() {
        return quocgia;
    }
    public void setquocgia(String quocgia) {
        this.quocgia = quocgia;
    }
    public double getgiave() {
        return giave;
    }
    public void setgiave(double giave) {
        this.giave = giave;
    }
    public ngaychieu getngaychieu() {
        return ngaychieu;
    }
    public void setngaychieu(ngaychieu ngaychieu){
        this.ngaychieu = ngaychieu;
    }
    public double giamgiave(double x){
        return this.giave*(1-x/100);
    }
    public boolean ssgiave(phim y) {
        return this.giave < y.giave;
    }
    public void qcphim() {
        System.out.println("Phim: "+ this.tenphim +", Nha xuat ban: "+ this.nhaxuatban+ ", San xuat: "+ this.namsanxuat +", Quoc gia: "+ this.quocgia +", Gia ve: " +this.giave +" VND");
    }

}