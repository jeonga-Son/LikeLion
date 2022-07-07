package java_220707;

public class chapter19_1 {

	public static void main(String[] args) {
		new 사람1();
		// 출력 : 사람이 태어났습니다.
		
		new 사람1(10);
		// 출력 : 태어나서부터 10살인 사람이 태어났습니다.
		
		new 사람1(20);
		// 출력 : 태어나서부터 20살인 사람이 태어났습니다.
	}
}

class 사람1 {
	int 나이;
	
	사람1() {
		System.out.println("사람이 태어났습니다.");
	}
	
	사람1(int 나이) {
		this.나이 = 나이;
		System.out.println("태어나서부터 " + 나이 +"인 사람이 태어났습니다.");
	}
}
