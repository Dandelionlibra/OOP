package ch02;
import java.util.Date;
import java.util.Locale;
public class CH0210 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		// �Ыؤ���ﹳ  
		Date date=new Date();  
		System.out.printf("2��Ʀr24�ɨ�p�ɡ]�e��0��2��^:%tH%n",date);  
		System.out.printf("2��Ʀr12�ɨ�p�ɡ]�e��0��2��^:%tI%n",date);  
		System.out.printf("2��Ʀr24�ɨ�p��:%tk%n",date);  
		System.out.printf("2��Ʀr12�ɨ�p��:%tl%n",date);  
		System.out.printf("2��Ʀr�������]�e��0��2��^:%tM%n",date);  
		System.out.printf("2��Ʀr����]�e��0��2��^:%tS%n",date);  
		System.out.printf("3��Ʀr���@��]�e��0��3��^:%tL%n",date);  
		System.out.printf("9��Ʀr���@��ơ]�e��0��9��^:%tN%n",date);  
		String str=String.format(Locale.US,"�p�g�r�����W�ȩΤU�ȼаO(�^)�G%tp",date);  
    	// ��X�r�Ŧ��ܶqstr�����e  
		System.out.println(str);  
		System.out.printf ("�p�g�r�����W�ȩΤU�ȼаO�]���^�G%tp%n",date);  
		System.out.printf("�۹��GMT��RFC822�ɰϪ������q:%tz%n",date);  
		System.out.printf("�ɰ��Y�g�r�Ŧ�:%tZ%n",date);  
	}
}
