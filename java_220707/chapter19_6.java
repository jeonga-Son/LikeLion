package java_220707;

public class chapter19_6 {

	public static void main(String[] args) {
	    new ���3();
	  }
	}

	class ����2 {
	  ����2(String �̸�) {
	    System.out.println("����(String �̸�) �����!");
	    System.out.println("�̸� : " + �̸�);
	  }
	  ����2(String �̸�, int ����) {
	    System.out.println("����(String �̸�, int ����) �����!");
	    System.out.println("�̸� : " + �̸�);
	    System.out.println("���� : " + ����);
	  }
	  
	}

	class ���3 extends ����2 {
		
		���3() {
			super("ȫ�浿", 22);
		}
	
	}