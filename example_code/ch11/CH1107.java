package ch11;
import java.util.*;
public class CH1107 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
	    TreeMap<Integer, String> tmap = new TreeMap<>();
	    tmap.put(330, "���");
	    tmap.put(400, "�x��");
	    tmap.put(600, "�Ÿq");
	    tmap.put(900, "�̪F");
	    tmap.put(800, "����");
	    System.out.println("���X���e�G" + tmap);
	    System.out.println("���X�������ӼơG" + tmap.size());
	    int key = tmap.firstKey();
	    System.out.println("���X���Ĥ@�Ӷl���ϸ��G" + key);
	    System.out.println("���X���Ĥ@�Ӧa�W�G" + tmap.get(key));
	    System.out.println("���X���̫�@�Ӷl���ϸ��G" + tmap.lastKey());
	    System.out.println("���X���̫�@�Ӧa�W�G" + tmap.get(tmap.lastKey()));
	    System.out.println("�l���ϸ��j�󵥩�" + 600 + "���������X�G" + tmap.tailMap(600));
	}
}
