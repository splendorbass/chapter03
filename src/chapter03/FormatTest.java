package chapter03;

public class FormatTest {

	public static void main(String[] args) {
		String name = "김태완";
		int score = 100;
		
		System.out.println( name + "님의 점수는" + score + "입니다.");
		String s = String.format("%s님의 점수는 %d입니다.", name, score);
		System.out.println( s );
	}

}
