package javaStudy.topicInterface;

public class Inn implements Enter {

	public static void main(String[] args) {
		System.out.println(host);
		Inn here = new Inn();
		here.abstractDo();
		here.defaultDo();
	}

	@Override
	public void abstractDo() {
		System.out.println("�߻��ε�");
	}

	@Override
	public void noWriteDo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void defaultDo() {
		System.out.println("�̰� ����Ʈ");
	}
}
