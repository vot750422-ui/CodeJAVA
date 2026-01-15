public class main1 {
	public static void main(String[] args) {
		conmeo meo = new conmeo();
		meo.ten = "Bon";
		meo.tuoi = 2;
		meo.giong = "Anh lông ngắn";
		meo.mauLong = "Xám";
		meo.ten1 = "SuSu";
		meo.tuoi1 = 2;
		meo.giong1 = "Ai Cập";
		meo.mauLong1 = "Trụi Lông";
		meo.keu();
		meo.an();
		meo.ngu();
		meo.ia();
		System.out.println("--CON MÈO THỨ NHẤT--");
		System.out.println("Ten meo: " + meo.ten);
		System.out.println("Tuoi meo: " + meo.tuoi);
		System.out.println("Giong meo: " + meo.giong);
		System.out.println("Mau long meo: " + meo.mauLong);
		System.out.println("---CON MÈO THỨ HAI--");
		System.out.println("Ten meo: " + meo.ten1);
		System.out.println("Tuoi meo: " + meo.tuoi1);
		System.out.println("Giong meo: " + meo.giong1);
		System.out.println("Mau long meo: " + meo.mauLong1);
	}
}
