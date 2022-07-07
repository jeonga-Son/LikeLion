//code.oa.gg/java8/938
// 문제 : 아래와 같이 출력되도록 해주세요. init() 메세드에 의해서 출력되어야 합니다.
// 조건 : 사람 클래스의 생성자는 사용할 수 없습니다.
// 힌트 : 모든 생성자는 자신의 일을 하기 전에 super(); 부터 실행합니다.
// 힌트 : 모든 생성자는 자신의 일을 하기 전에 부모클래스의 생성자 부터 실행합니다.

package java_220707;

public class chapter19_7 {

	public static void main(String[] args) {
		new 사람4();
		// 출력 : 사람이 초기화 됩니다.
	}
}

class 동물3 {
	동물3 () {
		init();
	}
	
	void init() {}
}

class 사람4 extends 동물3 {
	
// 이것 없어도 만들어짐.	
//	사람4() {
//		super();
//	} 
	
	void init() {
		System.out.println("사람이 초기화 됩니다.");
	}
}