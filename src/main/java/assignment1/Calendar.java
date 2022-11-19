package assignment1;

public class Calendar {

    public int day;
    public int month;
    public int year;

    public void getdate(){
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 31) {
            day = 1; month++;
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) {
            day = 1; month++;
        } else if ((month == 12) && day == 31) {
            day = 1; month++; year++;
        } else if ((month == 2)) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                if (day == 29) {
                    day = 1; month++;
                } else {
                    day = day + 1;
                }
            } else {
                if (day == 28) {
                    day = 1; month++;
                }
            }
        } else {
            day = day + 1;
        }
    }

    public boolean isThirtyDayMonth(){
        if ((month == 4 || month == 6 || month == 9 || month == 11)) {
            return true;
        }

        return  false;
    }

    public void improvement(){

        if(isThirtyDayMonth()){

        }
    }
    public void incrementMonth(){
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 31) {
            day = 1;
            month++;
        }
    }
}
