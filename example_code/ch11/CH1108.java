package ch11;
import java.util.*;
public class CH1108 {
	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
	    TreeSet<Integer> tset = new TreeSet<>();    //�إ� tset ���X����
	    System.out.println("�N1~40����Ʀs�Jtset���X����...");
	    for(int i=1; i<=40; i++)
	      tset.add(i);
	    System.out.println("�}�l�ɡAtset���X���󤺤����ӼƬ��G" + tset.size());
	    Iterator<Integer> itera = tset.iterator();    //�إߨ��X������ itera
	    System.out.println("\n�D��Ʋ�����...");
	    int n1 = itera.next();
	    itera.remove();                 //1���O���,������
	    while(itera.hasNext())
	    {
	      int num = itera.next();
	      for(int j=2; j<num; j++)
	      {
	        if(num % j == 0)
	        {
	          itera.remove();           //�]���䥦�]��,�G�D���
	          break;
	        }
	      }
	    }
	    System.out.println("�D��Ʋ�������");
	    System.out.println("�̫�Atset���X���󤺤����ӼƬ��G" + tset.size());
	    System.out.println("1~40����Ʀ��G" + tset);
	}
}