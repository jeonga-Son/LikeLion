package java_220630;

public class chapter12_1 {
	
	public static void main(String[] args) {
		사람 a사람 = new 사람();
		int 엄지손가락_길이 = a사람.a왼팔.a손.a엄지손가락.길이;
		
		System.out.println(엄지손가락_길이 + "cm");
		// 출력 : 7cm
	}
}

class 사람 {
	팔 a왼팔;
	
	사람() {
		a왼팔 = new 팔();
		a왼팔.a손 = new 손();
		a왼팔.a손.a엄지손가락 = new 손가락();
		a왼팔.a손.a엄지손가락.길이 = 7;
	}
}

class 팔 {
	손 a손;
}

class 손 {
	손가락 a엄지손가락;
}

class 손가락 {
	int 길이;
}