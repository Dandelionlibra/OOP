package ch04;

public class CH0414 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
        int year = 0;     // �ܼƫŧi
        double amount = 10000;
        double interest, rate = 0.12;   //�Q�v
        // �p�⥻�Q�M��do/while�j��
        do {
            interest = amount * rate;
            amount = amount + interest;
            year = year + 1;
        } while ( amount < 20000 );
        System.out.println(year + "�~ ���Q�M = " + amount);
	}
}
