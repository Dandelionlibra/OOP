package ch12;
import java.util.*; //使用Comparator必須引用此命名空間
class CStudent
{
   public int id;
   public String name;
   public int score;
   public CStudent(int i,String j,int k){id = i; name = j; score = k;}
   public void showData()
   {
       System.out.print("學號:" + id);
       System.out.print("\t姓名:" + name);
       System.out.println("\t成績:" + score);
   }
}
public class CH1203 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		// 建立S[0]~S[3]的CStudent物件陣列
		CStudent[] S = new CStudent[] { new CStudent(0001,"張無忌", 100), 
				                        new CStudent(0002,"宋遠橋", 95),
				                        new CStudent(0003,"張翠山", 85), 
				                        new CStudent(0004,"殷梨亭", 80)};
		// Arrays.sort第二個參數建立Comparator匿名介面物件
		// 並實作Comparator介面的compare方法用來比較 CStudent 成績
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
