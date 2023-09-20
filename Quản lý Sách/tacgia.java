public class tacgia {
    private String tentacgia;
    private ngay ngaysinh;

    public tacgia(String tentacgia, ngay ngaysinh){
        this.tentacgia = tentacgia;
        this.ngaysinh = ngaysinh;
    }
    public String getTentacgia() {
        return tentacgia;
    }
    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }
    public ngay getNgaysinh() {
        return ngaysinh;
    }
    public void setNgaysinh(ngay ngaysinh){
        this.ngaysinh = ngaysinh;
    }
}