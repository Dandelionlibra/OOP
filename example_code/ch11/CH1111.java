package ch11;
import java.util.*;      //�ϥ�Collections Framework�����O�ݸ��J
public class CH1111 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
        LinkedList<Integer> objLList1 = new LinkedList<>(); 
    	
    	objLList1.add(24);  objLList1.add(17);  objLList1.add(41);
    	objLList1.add(18);  objLList1.add(30);  objLList1.add(12);    	    	
    	System.out.print("���X�ثe���׬�:" + objLList1.size());
    	System.out.println("  ���X�ثe���e��:" + objLList1); 
    	ListIterator<Integer> objListItr1 = objLList1.listIterator(2); 
    	System.out.println("ListItr1���U�@�Ӥ�����:" + objListItr1.next());
    	
    	objListItr1.add(40);
    	System.out.println("�w���J�@�Ӥ���40");
    	System.out.print("���X�ثe���׬�:" + objLList1.size());
    	System.out.println("  ���X�ثe���e��:" + objLList1); 	
    	
    	objListItr1.next();
    	objListItr1.next();
    	System.out.println("�w���Ჾ�ʨ�Ӥ���");
    	
    	objListItr1.remove();
    	System.out.println("�w�R���@�Ӥ���");
    	
    	System.out.print("���X�ثe���׬�:" + objLList1.size());
    	System.out.println("  ���X�ثe���e��:" + objLList1); 
	}
}
