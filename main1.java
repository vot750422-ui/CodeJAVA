public class main1 {
    public static void main(String[] args) {
        conmeo meo = new conmeo();
        meo.ten = "Bon";
        meo.tuoi = 2;
        meo.giong = "Anh lông ngắn";
        meo.mauLong = "Xám";
        meo.keu();
        meo.an();
        meo.ngu();
        System.out.println("Ten meo: " + meo.ten);
        System.out.println("Tuoi meo: " + meo.tuoi);
        System.out.println("Giong meo: " + meo.giong);
        System.out.println("Mau long meo: " + meo.mauLong);
    }
}
