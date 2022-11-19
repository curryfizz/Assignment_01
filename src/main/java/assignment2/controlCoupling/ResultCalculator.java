package assignment2.controlCoupling;

public class ResultCalculator {



    public String getGrade(int totalMarks){
        if(totalMarks<50)
        {
            return "F";
        }
        else if(totalMarks>=50 && totalMarks<60)
        {
            return "D";
        }
        else if(totalMarks>=60 && totalMarks<70)
        {
            return "C";
        }
        else if(totalMarks>=70 && totalMarks<80)
        {
            return "B";
        }
        else if(totalMarks>=80 && totalMarks<90)
        {
            return "A";
        }
        else
        {
            return "A+";
        }
    }

}
