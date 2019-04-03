import java.util.Scanner;
public class Nomer2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число: ");
		String a = in.nextLine();
		System.out.println("Число: " + a.charAt(1) + a.charAt(0) + a.charAt(2) );
	}

}



