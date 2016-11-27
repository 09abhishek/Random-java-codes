package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Check_sunday_Saturday {
	
    private static final DateFormat sdf = new SimpleDateFormat("EEEEEEE");
      	
    public boolean check()
    	{
    	  	
    	
        Date date = new Date();

        String current_day=sdf.format(date);
        String sunday="Sunday";
        String saturday="Saturday";
        if(current_day.equals(sunday)&&current_day.equals(saturday))	
        {
        	return true;
        }
        else{
        return false;
        }
       }
    public boolean check_custom_day() throws ParseException
    {
    	Date date=new Date();
    String input_date="26/11/2016";
    SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
    Date dt1=format1.parse(input_date);
    DateFormat format2=new SimpleDateFormat("EEEE"); 
    String finalDay=format2.format(dt1);
   // System.out.println(finalDay);
    //return(finalDay);
    
    String current_day=finalDay;
    String sunday="Sunday";
    String saturday="Saturday";
    if(current_day.equals(sunday)&&current_day.equals(saturday))	
    {
    	return true;
    }
    else{
    	return false;
    }
    
    
    
    }
    
    public static void main(String[] args) throws ParseException {
    	Check_sunday_Saturday d=new  Check_sunday_Saturday();
    				boolean s=d.check();
    				boolean g=d.check_custom_day();
    System.out.println(s);
    System.out.println(g);
    }

}

