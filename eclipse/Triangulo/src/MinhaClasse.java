
public class MinhaClasse {
	public static void main(String[] args) {
		
//		int l1, l2, l3;
		
		int l1 = -2;
		int l2 = 2;
		int l3 = 100;
		
		if (l1 == l2 && l2 == l3) {
			System.out.println("Equilátero!");
		} else {
			if (l1 != l2 && l2 != l3 && l1 != l3) {
				System.out.println("Escaleno!");
			} else {
				System.out.println("Isosceles!");
			}
		}
		
//		if (l1 == l2 && l2 == l3) {
//			System.out.println("Equilátero");
//		} else if (l1 != l2 && l2 != l3 && l1 != l3) {
//			System.out.println("Escaleno");
//		} else {
//			System.out.println("Isosceles");
//		}
	}
}