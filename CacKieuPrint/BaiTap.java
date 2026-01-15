package CacKieuPrint;

//-in ra chuỗi "tôi tên là Phan Minh Trọng và tôi năm nay 20 tuổi , hiện tại tôi sống ở Cần Thơ
public class BaiTap {
	public static void main(String[] args) {
		int age = 20;
		String name = "Phan Minh Trọng";
		String Country = "Cần Thơ";
		// cách 1 : nối chuỗi
		System.out.println(
				"Tôi tên là " + name + " và tôi năm nay " + age + "" + " tuổi , hiện tại tôi sống ở " + Country);
		// cách 2 : dùng định dạng format
		System.out.printf("Tôi tên là %s và tôi năm nay %d , hiện tại tôi sống ở %s tuổi", name, age, Country);
		// TEST GIT PUSSHHHHHHHHHHHH
	}
}
