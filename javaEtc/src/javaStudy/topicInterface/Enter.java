package javaStudy.topicInterface;

public interface Enter {
	
	// �������̽� �ʵ�� static, public, final �� ����
	String host ="����";
	
	// �߻� �޼���� ���� ����
	// �������̽����� abstract ��� ���ص� �߻�޼���� �ν�
	public abstract void abstractDo();
	
	// �߻� �޼���� �ν� 
	public void noWriteDo();
	
	// ����Ʈ �޼���� �������� ��, ���� �ϴ°� �Ұ���
	public default void defaultDo() {
		System.out.println("������ ����");
	}
	
	// ���� �޼���� ���� ����
	public static void staticDo() {
		System.out.println("������ ����");
	}
	
	// ���� �޼���� ���� �ϴ°� �ȵǳ���
	public static void staticDo2() {
	}
}
