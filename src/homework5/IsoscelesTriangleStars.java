package homework5;

import java.util.*;

public class IsoscelesTriangleStars {

	Scanner s = new Scanner(System.in);
	String inputHeight;

	void input() {
		do {
			System.out.println("이등변삼각형 높이입력  (Q: 종료) : ");
			this.inputHeight = s.nextLine();

			if (this.inputHeight.equalsIgnoreCase("q"))
				break;
			else if (!ExamForWhileStars.isNumber(inputHeight)) {
				System.out.println("숫자만 입력하셔야 합니다.");
				continue;
			}

			int height = Integer.parseInt(inputHeight);

			for (int i = 0; i < height; i++) {
				for (int j = 0; j < height - (i + 1); j++)
					System.out.print(" ");

				for (int k = 0; k < 2 * (i + 1) - 1; k++)
					System.out.print("*");

				System.out.println();
			}
		} while (true);

		return;
	}
}
