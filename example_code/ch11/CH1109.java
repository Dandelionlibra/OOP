package ch11;
import java.util.*;      //�ϥ�Collections Framework�����O�ݸ��J
public class CH1109 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		LinkedList<Integer> objLList1 = new LinkedList<>();     	
    	objLList1.add(24);  objLList1.add(17);  objLList1.add(41);
    	objLList1.add(18);  objLList1.add(30);  objLList1.add(12);
    	    	
    	int len=objLList1.size();
    	System.out.print("���X�ثe���׬�:" + len);
    	System.out.println("  ���X�ثe���e��:" + objLList1); 	
    	    	
    	ListIterator<Integer> objListItr1 = objLList1.listIterator(); 
    	ListIterator<Integer> objListItr2 = objLList1.listIterator(len);  
    	System.out.print("���V���X:");
    	while(objListItr1.hasNext())
    	{
            System.out.print(objListItr1.next() + " ");
    	}
    	System.out.println();    	
    	
    	System.out.print("�ϦV���X:");
    	while(objListItr2.hasPrevious())
    	{
            System.out.print(objListItr2.previous() + " ");
    	}
    	System.out.println();
	}
}
