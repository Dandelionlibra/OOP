package ch12;
import java.util.*; //�ϥ�Comparator�����ޥΦ��R�W�Ŷ�


public class CH1202 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		LinkedList<String> objLList1 = new LinkedList<String>();

        objLList1.add("Jacky");     objLList1.add("Peter");
        objLList1.add("Ace");       objLList1.add("Eric");  
        
        System.out.println(objLList1);
        Collections.sort(objLList1, (o1,o2) -> Integer.compare(o1.length(),o2.length()));
         System.out.println(objLList1);
	}
}
