package ch11;
import java.util.*;      //�ϥ�Collections Framework�����O�ݸ��J
public class CH1112 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		LinkedList<Integer> objLList1 = new LinkedList<Integer>();
    	objLList1.add(24);  objLList1.add(17);  objLList1.add(41);
    	objLList1.add(18);  objLList1.add(30);  objLList1.add(12);
    	
    	System.out.println("���S�O�����~,�j�ֳz�}�����X�O:" + objLList1);
    	    	
    	Collections.sort(objLList1); 
    	System.out.println("         �Ѥp�j��ƧǪ����X�O:" + objLList1);
	}
}
