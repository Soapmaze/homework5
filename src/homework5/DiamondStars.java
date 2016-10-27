package homework5;

import java.util.*;

public class DiamondStars {
	
	Scanner s = new Scanner(System.in);
	String inputSize;
	
	void input() {
		do {
			System.out.println("다이아몬드 크기 입력  (Q: 종료) : ");
			this.inputSize = s.nextLine();

			if (this.inputSize.equalsIgnoreCase("q"))
				break;
			else if (!ExamForWhileStars.isNumber(inputSize)) {
				System.out.println("숫자만 입력하셔야 합니다.");
				continue;
			}

			int size = Integer.parseInt(inputSize);

			for(int i = 0; i<size; i++)
			{
				System.out.print("     ");
					for(int j =0; j<size-(i+1); j++)
						System.out.print(" ");
					for(int k =0; k<((i+1)*2)-1; k++)
						System.out.print("*");
				System.out.println();
			}
			
			for(int i = size-1; i>0; i--)
			{
				System.out.print("     ");
					for(int j =0; j<size-i; j++)
						System.out.print(" ");
					for(int k =0; k<((i+1)*2)-3; k++)
						System.out.print("*");
				System.out.println();
			}
		} while (true);

		return;
	}
}
