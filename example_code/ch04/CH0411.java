package ch04;

public class CH0411 {
	public static void main(String[] args) {
        int upper, step, c; // �ܼƫŧi
        double f;
        upper = 300;
        step = 20;
        System.out.println("���\t�ؤ�");
        for (c = 100;c <= upper;c += step) {
            f = (9.0 * c) / 5.0 + 32.0;
            System.out.println(c + "\t" + f);
        }	
	}
}
