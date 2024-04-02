package ch02;
import java.util.Date;
import java.util.Locale;
public class CH0210 {

	public static void main(String[] args) {
		// TODO 笆玻ネよ猭 Stub
		// 承ら戳癸钩  
		Date date=new Date();  
		System.out.printf("2计24玡干02:%tH%n",date);  
		System.out.printf("2计12玡干02:%tI%n",date);  
		System.out.printf("2计24:%tk%n",date);  
		System.out.printf("2计12:%tl%n",date);  
		System.out.printf("2计だ牧玡干02:%tM%n",date);  
		System.out.printf("2计玡干02:%tS%n",date);  
		System.out.printf("3计睝玡干03:%tL%n",date);  
		System.out.printf("9计睝计玡干09:%tN%n",date);  
		String str=String.format(Locale.US,"糶ダと┪と夹癘(璣)%tp",date);  
    	// 块才﹃跑秖strず甧  
		System.out.println(str);  
		System.out.printf ("糶ダと┪と夹癘い%tp%n",date);  
		System.out.printf("癸GMTRFC822跋熬簿秖:%tz%n",date);  
		System.out.printf("跋罽糶才﹃:%tZ%n",date);  
	}
}
