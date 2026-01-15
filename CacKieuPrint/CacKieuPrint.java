package CacKieuPrint;

public class CacKieuPrint {
	public static void main(String[] args) {
		System.out.print("TrongDepTrai");// -chỉ in ra mà
		// mà không quan tâm có xuống dòng hay không
		System.out.print("Trọng đẹp trai\n");
		System.out.println("Trọng đẹp trai");
		// -in ra và sẽ tự động xuống dòng nội dung tiếp theo
		System.out.print("Trọng đẹp trai");

		System.out.printf("Trọng nghèo có chỉ có %d VNĐ\n", 50000);
		System.out.printf("Trọng nghèo có chỉ có %f VNĐ", 50000.59);
		// -code in ra sẽ có định dạng format
		// -có 2 loại %d là kiểu số nguyên còn %f là kiểu số thực
		System.out.printf("Trọng nghèo có chỉ có %.4f VNĐ\n", 50000.9842402);
		// -%f nếu muốn lấy n số thập phân phía sau thì code là %.nf trong đó n là số số
		// thập phân
		// muốn hiện ra
		System.out.printf("Tôi tên là %s và hiện tại tôi sống ở %s", "Trọng", "Hậu Giang");
		// -%s cũng giống với %d nhưng chỉ áp dụng cho chuỗi và chuỗi phải đặt trong
		// cặp "
	}
}
