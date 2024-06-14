package ch11;
import java.util.*;
public class CH1102 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
	    Set<String> hset = new HashSet<>();
	    hset.add("張無忌");        //將字串常值資料存入集合物件中
	    //將字串陣列元素資料存入集合物件中
	    String[] peopleName = {"小昭", "楊無悔", "趙敏", "周芷若"};
	    for(String p : peopleName)
	      hset.add(p);
	    String name = "張三豐";
	    hset.add(name);         //將字串變數資料存入集合物件中
	    System.out.println(hset);  //顯示集合中的所有元素內容
	}
}
