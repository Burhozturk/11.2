import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mydate
{
    private int year;
    private int month;
    private int day;


    public Mydate()
    {
        this.day= Calendar.DAY_OF_MONTH;
        this.month=Calendar.MONTH;
        this.year=Calendar.YEAR;
        System.out.println("Day"+day+"Month"+month+"Year"+year);
    }

    public Mydate(Mydate object)
    {
        String myDate="1970/01/01 12:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        try
        {
            Date dateFrom1970 = sdf.parse(myDate);
            long elapsedTimeFrom1970_01_01_12_00_00=dateFrom1970.getTime();
            long elapsedTimeFromToday=System.currentTimeMillis();
            long elapsedTimeSumFrom1970ToToday=elapsedTimeFromToday-elapsedTimeFrom1970_01_01_12_00_00;
            System.out.println("Elapsed milliseconds from 1970/01/01 midnight to today"+elapsedTimeSumFrom1970ToToday);


        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }

    }

    public Mydate(int year,int month,int day)
    {
        this.year=year;
        this.month=month;
        this.day=day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime)
    {
        Date date=new Date();

        System.out.println(date.setTime(elapsedTime));

    }

}
