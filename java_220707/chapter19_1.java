package java_220707;

public class chapter19_1 {

	public static void main(String[] args) {
		new ���1();
		// ��� : ����� �¾���ϴ�.
		
		new ���1(10);
		// ��� : �¾������ 10���� ����� �¾���ϴ�.
		
		new ���1(20);
		// ��� : �¾������ 20���� ����� �¾���ϴ�.
	}
}

class ���1 {
	int ����;
	
	���1() {
		System.out.println("����� �¾���ϴ�.");
	}
	
	���1(int ����) {
		this.���� = ����;
		System.out.println("�¾������ " + ���� +"�� ����� �¾���ϴ�.");
	}
}
