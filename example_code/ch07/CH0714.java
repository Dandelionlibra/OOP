package ch07;
enum Signal {RED, YELLOW, GREEN}
public class CH0714 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		System.out.println(getTrafficInstruct(Signal.RED));
	}
	public static String getTrafficInstruct(Signal signal) {
		String instruct = "訊號燈故障";
		switch (signal) {
		case RED:
		instruct = "紅燈停";
		break;
		case YELLOW:
		instruct = "黃燈請注意";
		break;
		case GREEN:
		instruct = "綠燈行";
		break;
		default:
		break;
		}
		return instruct;
	}
}
