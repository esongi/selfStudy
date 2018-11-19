package javaStudy.topicInterface;

public interface Enter {
	
	// 인터페이스 필드는 static, public, final 만 가능
	String host ="주인";
	
	// 추상 메서드는 선언만 가능
	// 인터페이스에서 abstract 명시 안해도 추상메서드로 인식
	public abstract void abstractDo();
	
	// 추상 메서드로 인식 
	public void noWriteDo();
	
	// 디폴트 메서드는 명시해줘야 함, 선언만 하는건 불가능
	public default void defaultDo() {
		System.out.println("구현은 가능");
	}
	
	// 정적 메서드는 구현 가능
	public static void staticDo() {
		System.out.println("구현은 가능");
	}
	
	// 정적 메서드는 선언만 하는건 안되나봄
	public static void staticDo2() {
	}
}
