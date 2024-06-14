package ch12;
import java.util.*; //�ϥ�Comparator�����ޥΦ��R�W�Ŷ�
class CStudent
{
   public int id;
   public String name;
   public int score;
   public CStudent(int i,String j,int k){id = i; name = j; score = k;}
   public void showData()
   {
       System.out.print("�Ǹ�:" + id);
       System.out.print("\t�m�W:" + name);
       System.out.println("\t���Z:" + score);
   }
}
public class CH1203 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		// �إ�S[0]~S[3]��CStudent����}�C
		CStudent[] S = new CStudent[] { new CStudent(0001,"�i�L��", 100), 
				                        new CStudent(0002,"������", 95),
				                        new CStudent(0003,"�i�A�s", 85), 
				                        new CStudent(0004,"����F", 80)};
		// Arrays.sort�ĤG�ӰѼƫإ�Comparator�ΦW��������
		// �ù�@Comparator������compare��k�ΨӤ�� CStudent ���Z
		Arrays.sort(S, new Comparator<CStudent>() {
			public int compare(CStudent s1, CStudent s2) {
				int a, b, r = 1;
				a = s1.score;
				b = s2.score;
				if (a > b) {
					r = 1;
				}else if (a == b) {
					r = 0;
				} else if (a < b) {
					r = -1;
				}
				return r;
			}
		});
		for (int i = 0; i <= S.length - 1; i++) {
			S[i].showData();
		}
	}
}
