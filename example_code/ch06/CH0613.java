package ch06;

public class CH0613 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		// �̤j�ȩM�̤p��
        System.out.print("�̤j��max(34, 78): ");
        System.out.println(Math.max(34,78));
        System.out.print("�̤p��min(34, 78): ");
        System.out.println(Math.min(34,78));
        System.out.print("�|�ˤ��Jround(34.567):");
        System.out.println(Math.round(34.567));
        System.out.print("�|�ˤ��Jround(34.467):");
        System.out.println(Math.round(34.467));
        System.out.print("�ü�random(): ");
        System.out.println(Math.random());
        // 0-10���ü�
        int no = (int)(Math.random()*10);
        System.out.println("0-10�ü�: " + no);
        // 1-100���ü�
        no = (int)(Math.random()*100 + 1);
        System.out.println("1-100�ü�: " + no);
	}
}