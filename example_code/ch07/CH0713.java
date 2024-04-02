package ch07;
enum WeekDay {
	  Sun("Sunday","星期日"),
	  Mon("Monday","星期一"),
	  Tue("Tuesday","星期二"),
	  Wed("Wednesday","星期三"),
	  Thu("Thursday","星期四"),
	  Fri("Friday","星期五"),
	  Sat("Saturday","星期六");
	  private WeekDay(String day, String chinese){
	    this.day = day;
	    this.chinese = chinese;
	    //System.out.println("WeekDay() 方法被呼叫");   可以試試加入此行
	  }
	  private String day;
	  private String chinese;
	  public static WeekDay getWeek(int i){
		  switch(i){
		      case 0:
		        return Sun;
		      case 1:
		        return Mon;
		      case 2:
		        return Tue;
		      case 3:
		        return Wed;
		      case 4:
		        return Thu;
		      case 5:
		        return Fri;
		      case 6:
		        return Sat;
		      default:
		        return null;
		    }
	  }
	  public String getDay(){
	    return this.day;
	  }
	  public String getChinese(){
	    return this.chinese;
	  }
}
public class CH0713 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
	    WeekDay weekDay = WeekDay.getWeek(0);
	    System.out.println(weekDay.getDay());
	    System.out.println(weekDay.getChinese());
	}
}
