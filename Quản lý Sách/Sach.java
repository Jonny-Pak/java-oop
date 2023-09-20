public class Sach {
    private String tensach;
    private double giasach;
    private int namxuatban;
    private tacgia tacgia;

    public Sach(String tensach, double giasach, int namxuatban, tacgia tacgia) {
        this.tensach = tensach;
        this.giasach = giasach;
        this.namxuatban = namxuatban;
        this.tacgia = tacgia;
    }
    public String gettensach() {
        return tensach;
    }
    public void settensach(String tensach) {
        this.tensach = tensach;
    }
    public double getgiasach() {
        return giasach;
    }
    public void setgiasach(double giasach) {
        this.giasach = giasach;
    }
    public int getnamxuatban() {
        return namxuatban;
    }
    public void setnamxuatban(int namxuatban) {
        this.namxuatban = namxuatban;
    }
    public tacgia gettacgia() {
        return tacgia;
    }
    public void settacgia(tacgia tacgia) {
        this.tacgia = tacgia;
    }
    public void intensach() {
        System.out.println("Sach:"+ this.tensach +", Giá:"+ this.giasach +", San xuat:"+ this.namxuatban +", Tac gia:"+ this.tacgia);
    }
}