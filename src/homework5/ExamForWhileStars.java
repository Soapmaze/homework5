package homework5;

import java.util.*;

public class ExamForWhileStars {

	public static boolean isNumber(String str) {
		if (str == null || str.equals(""))
			return false;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch < '0' || ch > '9') {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String selected;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("1. 정사각형 별찍기");
			System.out.println("2. 직각삼각형 별찍기");
			System.out.println("3. 이등변삼각형 별찍기");
			System.out.println("4. 다이아몬드 별찍기");
			System.out.println("5. 종료하기");
			System.out.println("원하는 메뉴는 >> ");

			selected = s.nextLine();

			if (!isNumber(selected) || Integer.parseInt(selected) > 6 || Integer.parseInt(selected) < 1) {
				System.out.println("잘못 입력하셨습니다. 다시 입력 바랍니다.");
				continue;
			}
			if (Integer.parseInt(selected) == 1)
				new RectangleStars().input();
			/*else if (Integer.parseInt(selected) == 2)
				new TriangleStars().input();

			else if (Integer.parseInt(selected) == 3)
				new IsoscelesTriangleStars().input();

			else if (Integer.parseInt(selected) == 4)
				new DiamondStars().input();
			*/
			else if (Integer.parseInt(selected) == 5) {
				System.out.println("프로그램을 종료합니다.");
				s.close();
				System.exit(0);
			}

		} while (true);
	}
}