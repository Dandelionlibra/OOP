package ch02;
import java.util.Date;
import java.util.Locale;
public class CH0209 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		// �Ыؤ���ﹳ  
		Date date=new Date();  
		// �榡�Ƥ���r�Ŧ�  
		String str=String.format(Locale.US,"�^����²�١G%tb",date);  
		// ��X�r�Ŧꤺ�e  
		System.out.println(str);  
		System.out.printf("���a���²�١G%tb%n",date);  
		str=String.format(Locale.US,"�^�������١G%tB",date);  
		System.out.println(str);  
		System.out.printf("���a������١G%tB%n",date);  
		str=String.format(Locale.US,"�^��P����²�١G%ta",date);  
		System.out.println(str);  
		System.out.printf("���a�P����²�١G%tA%n",date);  
		System.out.printf("�~���e���Ʀr�]�e��0��2��^�G%tC%n",date);  
		System.out.printf("�~������Ʀr�]�e��0��2��^�G%ty%n",date);  
		System.out.printf("�@�~�����Ѽơ]�Y�~���ĴX�ѡ^�G%tj%n",date);  
		System.out.printf("���Ʀr������]�e��0��2��^�G%tm%n",date);  
		System.out.printf("���Ʀr����]�e��0��2��^�G%td%n",date);  
		System.out.printf("�������G%te",date);  
	}
}
