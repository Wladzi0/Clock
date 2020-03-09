import java.util.*;

public class Cloock2 {

	public static void main(String[] args) {
		Clock(2, 1, 3, 4);

	}

	public static String Clock(int a, int b, int c, int d) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);

		int digitf = 0;
		
		int item = 2;

		for (int i = 0; i < lista.size(); i++) {
			if (lista.indexOf(item) != -1) {
				if (item == 2) {
					digitf = item;
				}
				lista.remove(new Integer(item));
				break;
			} else if (lista.indexOf(item) != -1) {
				item--;
				if (item == 1) {
					digitf = item;
				}
				lista.remove(new Integer(item));
				break;
			} else if (lista.indexOf(item) != -1) {
				item--;

				if (item == 0) {
					digitf = item;
				}
				lista.remove(new Integer(item));
				break;
			} else {
				digitf = 5;

			}
		}

		int result = 0;

		if ((digitf != 0) && (digitf != 1) && (digitf != 2)) {
			System.out.print("Nie mozna stworzyc godziny");
		} else if (digitf == 2) {
			int te = 3;

			for (int i = 0; i < 3; i++) {
			
				if (lista.indexOf(te) != -1) {
					result = te;
					lista.remove(new Integer(result));
					break;
				} 
				
				else {
					te--;
				}
				if(i == 2) {
					System.err.println("Error") ;
					return "";
				}
								

			}
		}

		else if ((digitf == 0) || (digitf == 1)) {
			result = 9;
			for (int i = 0; i < 9; i++) {
				if (lista.indexOf(result) != -1) {
					lista.remove(new Integer(result));
					break;
				} else {
					result--;
				}
			}
		}

		int helper = 5;
		if ((digitf == 2) && (result > 4)) {

			System.out.print("Nie mozna stworzyc godziny");
		} else if ((lista.get(0)) <= 5 || (lista.get(1) <= 5)) {
			System.out.print(digitf);
			System.out.print(result + ":");
			for (int i = 0; i < 5; i++) {
				if (lista.indexOf(helper) != -1) {
					System.out.print(helper);
					lista.remove(new Integer(helper));
					System.out.print(lista.get(0));
					lista.remove(0);
					break;
				} else {
					helper--;
				}
			}

		}
		return "";
	}

}
