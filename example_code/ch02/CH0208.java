package ch02;
import java.util.Date;
public class CH0208 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		// 創建日期對像  
		Date date=new Date();  
		// 格式化輸出日期或時間  
		System.out.printf("全部日期和時間信息：%tc%n",date);  
		System.out.printf("年-月-日格式：%tF%n",date);  
		System.out.printf("月/日/年格式：%tD%n",date);  
		System.out.printf("HH:MM:SS PM格式（12時制）：%tr%n",date);  
		System.out.printf("HH:MM:SS格式（24時制）：%tT%n",date);  
		System.out.printf("HH:MM格式（24時制）：%tR",date);  
		System.out.printf("年-月-日 HH:MM:SS格式：%1$tF %1$tT%n",date);  
	}
}
