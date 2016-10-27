package homework5;

import java.util.*;

public class RectangleStars {
	
	Scanner s = new Scanner(System.in);
	String inputNum;
	
	void input(){
		do {
			System.out.println("정사각형 크기입력 (Q: 종료) : ");
			this.inputNum = s.nextLine();
			
			if(this.inputNum.equalsIgnoreCase("q"))
				break;
			else if(!ExamForWhileStars.isNumber(inputNum))
			{
				System.out.println("숫자만 입력하셔야 합니다.");
				continue;
			}
			for(int i = 1; i < Integer.parseInt(inputNum); i+=2){
				for(int j = 1; j < Integer.parseInt(inputNum); j++)
					System.out.print("*");
				System.out.print("\n");
			}
		}
		while (true);
		
		return;
	}

}
