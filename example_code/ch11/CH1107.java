package ch11;
import java.util.*;
public class CH1107 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
	    TreeMap<Integer, String> tmap = new TreeMap<>();
	    tmap.put(330, "桃園");
	    tmap.put(400, "台中");
	    tmap.put(600, "嘉義");
	    tmap.put(900, "屏東");
	    tmap.put(800, "高雄");
	    System.out.println("集合內容：" + tmap);
	    System.out.println("集合的元素個數：" + tmap.size());
	    int key = tmap.firstKey();
	    System.out.println("集合的第一個郵遞區號：" + key);
	    System.out.println("集合的第一個地名：" + tmap.get(key));
	    System.out.println("集合的最後一個郵遞區號：" + tmap.lastKey());
	    System.out.println("集合的最後一個地名：" + tmap.get(tmap.lastKey()));
	    System.out.println("郵遞區號大於等於" + 600 + "的元素集合：" + tmap.tailMap(600));
	}
}
