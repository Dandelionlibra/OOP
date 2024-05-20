// package ch07;

public class CH0712 {
	enum Color {RED, GREEN, BLUE;}
	enum Size {BIG, MIDDLE, SMALL;}
	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		System.out.println("=========== �L�X�Ҧ��� Color ===========");
		for (Color c : Color.values()) {
			System.out.println("ordinal: "+ c.ordinal());
		}
		Color green = Color.GREEN;
		System.out.println("green: "+ green);
		System.out.println("Color.GREEN: "+ Color.GREEN);

		System.out.println("green name(): "+green.name());
		System.out.println("green getDeclaringClass(): " + green.getDeclaringClass());
		System.out.println("green hashCode(): "  + green.hashCode());
		System.out.println("green compareTo Color.GREEN: " + green.compareTo(Color.GREEN));
		System.out.println("green compareTo Color.RED: " + green.compareTo(Color.RED));
		System.out.println("green compareTo Color.BLUE: " + green.compareTo(Color.BLUE));

		System.out.println("green equals Color.GREEN: " + green.equals(Color.GREEN));
		System.out.println("green equals 1: " + green.equals(1));
		System.out.println("Color.GREEN equals 1: " + Color.GREEN.equals(1));

		// int a = 1;
		// System.out.println("1 equals 1: " + a.equals(a));
		System.out.format("green == Color.BLUE: %b\n"+ green == Color.BLUE);
	}
}
