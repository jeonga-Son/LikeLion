package java_220630;

public class chapter12_1 {
	
	public static void main(String[] args) {
		��� a��� = new ���();
		int �����հ���_���� = a���.a����.a��.a�����հ���.����;
		
		System.out.println(�����հ���_���� + "cm");
		// ��� : 7cm
	}
}

class ��� {
	�� a����;
	
	���() {
		a���� = new ��();
		a����.a�� = new ��();
		a����.a��.a�����հ��� = new �հ���();
		a����.a��.a�����հ���.���� = 7;
	}
}

class �� {
	�� a��;
}

class �� {
	�հ��� a�����հ���;
}

class �հ��� {
	int ����;
}