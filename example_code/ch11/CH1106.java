package ch11;
import java.util.*;
public class CH1106 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
	    HashMap<String, String> hmap = new HashMap<>();
	    hmap.put("�i�L��", "���бХD");
	    hmap.put("���p", "��������");
	    hmap.put("�S��", "�����k��");
	    hmap.put("�L����", "���m�s��");
	    System.out.println("���X���e�G" + hmap);
	    System.out.println("hmap���X�������ӼơG" + hmap.size());
	    System.out.println();
	    System.out.println("\"�i�L��\" ���ƥ[�J....");
	    
	    if (hmap.containsKey("�i�L��"))
	      System.out.println("\"�i�L��\" �w�s�b�A���ƥ[�J�ɨ������Ʒ|�Q�л\");
	    hmap.put("�i�L��", "�i�T�פ��]");
	    System.out.println("\"�i�L��\" ��������אּ�G" + hmap.get("�i�L��"));
	    System.out.println("\n�[�J\"��ѥ�\" ....");
	    String name = "��ѥ�";
	    
	    if (hmap.containsKey(name))
	      System.out.println("\"" + name +"\" �w�s�b�A���������");
	    else
	      hmap.put(name, "�լ��N��");
	    System.out.println("����\"�L����\" ....");
	    hmap.remove("�L����");
	    System.out.println("\n���X���e�G" + hmap);
	}
}
