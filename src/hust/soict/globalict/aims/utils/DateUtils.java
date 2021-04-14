package hust.soict.globalict.aims.utils;

public class DateUtils {
    public boolean CompareTwoDate(MyDate date1, MyDate date2){
        if (date1.getYear() < date2.getYear()){
            return true;
        }
        else if(date1.getYear() > date2.getYear()){
            return false;
        }
        else{
            if (date1.getMonth() < date2.getMonth()){
                return true;
            }
            else if(date1.getMonth() > date2.getMonth()){
                return false;
            }
            else{
                if (date1.getDay() < date2.getDay()){
                    return true;
                }
                else if(date1.getDay() > date2.getDay()){
                    return false;
                }
                else{
                    return true;
                    // System.out.println(date1 + " = " + date2);
                }
            }
        }
    }

    public void SortingDates(MyDate[] dates){
        for (int i = 0; i < dates.length; i++){
            for (int j = 0; j < dates.length; j++){
                if (CompareTwoDate(dates[i], dates[j])){
                    MyDate tmp = dates[i];
                    dates[i].setDay(dates[j].getDay());
                    dates[i].setMonth(dates[j].getMonth());
                    dates[i].setYear(dates[j].getYear());
                    dates[j].setDay(tmp.getDay());
                    dates[j].setMonth(tmp.getMonth());
                    dates[j].setYear(tmp.getYear());
                }
            }
        }
    }
}
