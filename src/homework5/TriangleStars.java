package homework5;

import java.util.*;

public class TriangleStars {

	Scanner s = new Scanner(System.in);
	String inputPaddingNum;
	String inputHeight;

	void input() {
		do {
			System.out.println("직각삼각형의 왼쪽여백과 높이입력 (Q: 종료) : ");
			this.inputPaddingNum = s.next();
			this.inputHeight = s.next();

			if (this.inputPaddingNum.equalsIgnoreCase("q"))
				break;
			else if (!ExamForWhileStars.isNumber(inputPaddingNum)) {
				System.out.println("숫자만 입력하셔야 합니다.");
				continue;
			}

			int paddingNum = Integer.parseInt(inputPaddingNum);
			int height = Integer.parseInt(inputHeight);

			for (int i = 0; i < height; i++) {

				for (int j = i; j < paddingNum; j++)
					System.out.print(" ");

				for (int k = 0; k < i + 1; k++)
					System.out.print("*");

				System.out.print("\n");
			}
		} while (true);

		return;
	}
}
