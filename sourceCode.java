package JavaÖdevler;

import java.util.Scanner;

public class İkiNoktaArasındakiMesafe {
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("enter x1 and y1:");
			double x1 = input.nextDouble();
			double y1 = input.nextDouble();
			
			System.out.println("enter x2 and y2:");
			double x2 = input.nextDouble();
			double y2 = input.nextDouble();
			
			input.close();
			
			double mesafe = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5);
			
			System.out.printf("İki nokta arasındaki mesafe = %.4f", mesafe);
		}
}
