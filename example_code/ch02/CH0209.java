package ch02;
import java.util.Date;
import java.util.Locale;
public class CH0209 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		// 創建日期對像  
		Date date=new Date();  
		// 格式化日期字符串  
		String str=String.format(Locale.US,"英文月份簡稱：%tb",date);  
		// 輸出字符串內容  
		System.out.println(str);  
		System.out.printf("本地月份簡稱：%tb%n",date);  
		str=String.format(Locale.US,"英文月份全稱：%tB",date);  
		System.out.println(str);  
		System.out.printf("本地月份全稱：%tB%n",date);  
		str=String.format(Locale.US,"英文星期的簡稱：%ta",date);  
		System.out.println(str);  
		System.out.printf("本地星期的簡稱：%tA%n",date);  
		System.out.printf("年的前兩位數字（前補0至2位）：%tC%n",date);  
		System.out.printf("年的後兩位數字（前補0至2位）：%ty%n",date);  
		System.out.printf("一年中的天數（即年的第幾天）：%tj%n",date);  
		System.out.printf("兩位數字的月份（前補0至2位）：%tm%n",date);  
		System.out.printf("兩位數字的日（前補0至2位）：%td%n",date);  
		System.out.printf("月份的日：%te",date);  
	}
}
