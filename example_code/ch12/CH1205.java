package ch12;
import java.util.Arrays;
public class CH1205 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		// �إ�name[0]~name[3]�r��}�C����
		String[] name = new String[] { "peter", "Tom", "Jacky", "Eric" };
		// �r�����W�h�ϥ� String���O��compareToIgnoreCase()��k
		Arrays.sort(name, String::compareToIgnoreCase);
		// �L�X�Ƨǫ᪺���G
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}
}
