import java.util.ArrayDeque;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		new Scanner(System.in);
		ArrayDeque<Integer> qu1 = new ArrayDeque();
		ArrayDeque<Integer> qu2 = new ArrayDeque();
		int j = 0;
		System.out.println("Введите значения карт первого игрока");

		int a;
		int i;
		for(i = 0; i < 5; ++i) {
			a = (int)(Math.random() * 10.0D);
			qu1.addLast(a);
			System.out.println(a);
		}

		System.out.println("--------------------------------");
		System.out.println("Введите значения карт второго игрока");

		for(i = 0; i < 5; ++i) {
			a = (int)(Math.random() * 10.0D);
			qu2.addLast(a);
			System.out.println(a);
		}

		System.out.println("--------------------------------");

		for(; j != 106 && !qu1.isEmpty() && !qu2.isEmpty(); ++j) {
			if ((Integer)qu1.getFirst() > (Integer)qu2.getFirst()) {
				qu1.addLast((Integer)qu1.pollFirst());
				qu1.addLast((Integer)qu2.pollFirst());
			} else {
				qu2.addLast((Integer)qu1.pollFirst());
				qu2.addLast((Integer)qu2.pollFirst());
			}

			if (qu1.isEmpty()) {
				System.out.println("Победил первый " + (j + 1) + " ход");
			} else if (qu2.isEmpty()) {
				System.out.println("Победил второй " + (j + 1) + " ход");
			}
		}

		if (j >= 106) {
			System.out.println("Ботва");
		}

	}
}
