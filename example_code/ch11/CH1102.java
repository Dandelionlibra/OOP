package ch11;
import java.util.*;
public class CH1102 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
	    Set<String> hset = new HashSet<>();
	    hset.add("�i�L��");        //�N�r��`�ȸ�Ʀs�J���X����
	    //�N�r��}�C������Ʀs�J���X����
	    String[] peopleName = {"�p�L", "���L��", "����", "�P��Y"};
	    for(String p : peopleName)
	      hset.add(p);
	    String name = "�i�T��";
	    hset.add(name);         //�N�r���ܼƸ�Ʀs�J���X����
	    System.out.println(hset);  //��ܶ��X�����Ҧ��������e
	}
}
