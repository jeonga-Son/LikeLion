package java_220707;

public class chapter19_2 {

	public static void main(String[] args) {
		���� a���� = new ����();
		
		System.out.println(a����.���ϱ�(10, 20));
		// ��� : 30
		
		System.out.println(a����.���ϱ�(10, 20, 30));
		// ��� : 60
		
		System.out.println(a����.���ϱ�(10.5, 20, 30));
		// ��� : 60.5
	}
}

class ���� {
	int ���ϱ�(int a, int b) {
		return a + b;
	}
	
	int ���ϱ�(int a, int b , int c) {
		return a + b + c;
	}
	
	double ���ϱ� (double a, int b, int c) {
		return a + b + c;
	}
}


// �̰͵� ���� !
//class ���� {
//	int ���ϱ�(int a, int b) {
//		return ���ϱ�(a, b, 0);
//	}
//	
//	double ���ϱ� (double a, int b, int c) {
//		return a + b + c;
//	}
//}
