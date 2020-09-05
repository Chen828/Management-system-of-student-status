package util;
import java.sql.Timestamp;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Date_String {
	
	public static Timestamp toTimestamp(String s)throws Exception
	{
		if(s.equals("")) return null;
		SimpleDateFormat d=new SimpleDateFormat("yyyy-MM-dd");
		Date t1=d.parse(s,new ParsePosition(0));
		if(t1==null){
			throw new Exception("时间格式错误！格式应为yyyy-MM-dd");
		}
		return new Timestamp(t1.getTime());
		
	}
	/**  
     * 获取现在时间  
     *  
     * @return返回字符串格式 yyyyMMddHHmmss 
     */ 
	 public static String getStringDate() {   
	       Date currentTime = new Date();   
	       SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");   
	       String dateString = formatter.format(currentTime);   
	       //System.out.println("TIME:::"+dateString);   
	       return dateString;   
	 }
	 public static String getStringDate1() {   
	       Date currentTime = new Date();   
	       SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");   
	       String dateString = formatter.format(currentTime);   
	       //System.out.println("TIME:::"+dateString);   
	       return dateString;   
	 }
	 /**  
	     * java时间date1  
	     *  
	     * @return返回字符串格式 yyyy-MM-dd HH:mm:ss   
	     */ 
	 public static String getStringDate(Date date1) {   
	       if(date1==null)return "";
		 	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   
	       String dateString = formatter.format(date1);   
	       //System.out.println("TIME:::"+dateString);   
	       return dateString;   
	 }  
	 public static String getStringDate1(Date date1) {   
	       if(date1==null)return "";
		 	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");   
	       String dateString = formatter.format(date1);   
	       //System.out.println("TIME:::"+dateString);   
	       return dateString;   
	 }  
}
