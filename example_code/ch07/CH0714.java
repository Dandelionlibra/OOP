package ch07;
enum Signal {RED, YELLOW, GREEN}
public class CH0714 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		System.out.println(getTrafficInstruct(Signal.RED));
	}
	public static String getTrafficInstruct(Signal signal) {
		String instruct = "�T���O�G��";
		switch (signal) {
		case RED:
		instruct = "���O��";
		break;
		case YELLOW:
		instruct = "���O�Ъ`�N";
		break;
		case GREEN:
		instruct = "��O��";
		break;
		default:
		break;
		}
		return instruct;
	}
}
