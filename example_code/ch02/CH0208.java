package ch02;
import java.util.Date;
public class CH0208 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		// �Ыؤ���ﹳ  
		Date date=new Date();  
		// �榡�ƿ�X����ήɶ�  
		System.out.printf("��������M�ɶ��H���G%tc%n",date);  
		System.out.printf("�~-��-��榡�G%tF%n",date);  
		System.out.printf("��/��/�~�榡�G%tD%n",date);  
		System.out.printf("HH:MM:SS PM�榡�]12�ɨ�^�G%tr%n",date);  
		System.out.printf("HH:MM:SS�榡�]24�ɨ�^�G%tT%n",date);  
		System.out.printf("HH:MM�榡�]24�ɨ�^�G%tR",date);  
		System.out.printf("�~-��-�� HH:MM:SS�榡�G%1$tF %1$tT%n",date);  
	}
}
