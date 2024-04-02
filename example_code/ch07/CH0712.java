package ch07;

public class CH0712 {
	enum Color {RED, GREEN, BLUE;}
	enum Size {BIG, MIDDLE, SMALL;}
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		System.out.println("=========== 印出所有的 Color ===========");
		for (Color c : Color.values()) {
			System.out.println("ordinal: "+ c.ordinal());
		}
		Color green = Color.GREEN;
		System.out.println("green name(): "+green.name());
		System.out.println("green getDeclaringClass(): " + green.getDeclaringClass());
		System.out.println("green hashCode(): "  + green.hashCode());
		System.out.println("green compareTo Color.GREEN: " + green.compareTo(Color.GREEN));
		System.out.println("green equals Color.GREEN: " + green.equals(Color.GREEN));
		System.out.println("green equals 1: " + green.equals(1));
		System.out.format("green == Color.BLUE: %b\n", green == Color.BLUE);
	}
}
