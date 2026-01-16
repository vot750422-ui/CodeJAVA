package Input_data;

import java.util.Scanner;

public class Input_data {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("tên của bạn là : ");
		String name = sc.nextLine();
		System.out.println("Tuổi của bạn là : ");
		int age = sc.nextInt();
		System.out.printf("Tên của bạn là %s \n Tuổi của bạn là:%d ", name, age);
		sc.close();
	}
}
