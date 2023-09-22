public class tphim {
    public static void main(String[] args) {
        ngaychieu nc1 = new ngaychieu(21,9,2023);
        ngaychieu nc2 = new ngaychieu(22,9,2023);

        phim p1 = new phim("Doraemon","Fujiko Fujio",2023,"Viet Nam",50000, nc1);
        phim p2 = new phim("Naruto Toc Bien","Kishimoto Masashi",2023,"Viet Nam", 45000, nc2);

        // Giảm giá vé xem phim
        System.out.println("");
        System.out.println("Phim Doraemon giam gia 10% còn: "+ p1.giamgiave(10) +" VND");
        System.out.println("Phim Naruto Toc Bien giam gia 15% còn: "+ p2.giamgiave(15) +" VND");
        // SS giá vé
        System.out.println("");
        System.out.println("SS phim Doraemon re hon Naruto Toc Bien?: "+ p1.ssgiave(p2));
        // Quảng cáo phim
        System.out.println("");
        p1.qcphim();
        System.out.println("Cong chieu: "+ nc1.getday() +"/"+ nc1.getmonth() +"/"+ nc1.getyear());
        p2.qcphim();
        System.out.println("Cong chieu: "+ nc2.getday() +"/"+ nc2.getmonth() +"/"+ nc2.getyear());



    }
}