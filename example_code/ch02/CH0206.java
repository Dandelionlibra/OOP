package ch02;

public class CH0206 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		String str=null;  
	    // �榡�Ʀr�Ŧ�  
	    str=String.format("Hi,%s", "Java!");  
        // ��X�r�Ŧ��ܶqstr�����e  
		System.out.println(str);  
		System.out.printf("�r��a���j�g�O�G%c %n", 'A');  
		System.out.printf("3>7�����G�O�G%b %n", 3>7);  
		System.out.printf("100���@�b�O�G%d %n", 100/2);  
        System.out.printf("100��16�i��ƬO�G%x %n", 100);  
        System.out.printf("100��8�i��ƬO�G%o %n", 100);  
        System.out.printf("100�����ѥ�8.5�馩�O�G%f ��%n", 100*0.85);  
		System.out.printf("�W�����檺16�i��ƬO�G%a %n", 100*0.85);  
		System.out.printf("�W�����檺���ƪ�ܡG%e %n", 100*0.85);  
		System.out.printf("�W�����檺���ƩM�B�I�Ƶ��G�����׸��u���O�G%g %n", 50*0.85);  
		System.out.printf("�W�����馩�O%d%% %n", 85);  
		System.out.printf("�r��A��ASCII�X�O�G%h %n", 'A');  
	}
}
