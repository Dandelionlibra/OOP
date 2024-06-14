package ch11;
import java.util.*;
public class CH1106 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
	    HashMap<String, String> hmap = new HashMap<>();
	    hmap.put("張無忌", "明教教主");
	    hmap.put("楊逍", "光明左使");
	    hmap.put("范遙", "光明右使");
	    hmap.put("黛綺絲", "紫衫龍王");
	    System.out.println("集合內容：" + hmap);
	    System.out.println("hmap集合的元素個數：" + hmap.size());
	    System.out.println();
	    System.out.println("\"張無忌\" 重複加入....");
	    
	    if (hmap.containsKey("張無忌"))
	      System.out.println("\"張無忌\" 已存在，重複加入時身份欄資料會被覆蓋");
	    hmap.put("張無忌", "張三豐之孫");
	    System.out.println("\"張無忌\" 的身份更改為：" + hmap.get("張無忌"));
	    System.out.println("\n加入\"殷天正\" ....");
	    String name = "殷天正";
	    
	    if (hmap.containsKey(name))
	      System.out.println("\"" + name +"\" 已存在，不接受更改");
	    else
	      hmap.put(name, "白眉鷹王");
	    System.out.println("移除\"黛綺絲\" ....");
	    hmap.remove("黛綺絲");
	    System.out.println("\n集合內容：" + hmap);
	}
}
