package assignment2.controlCoupling;

public class ResultPrinter {


    public void printResult(int totalMarks){
        ResultCalculator resultCalculator = new ResultCalculator();
        System.out.println("You received a " + resultCalculator.getGrade(totalMarks));
        //an example of control coupling, here the getGrade method is called from the printResult method
        //the output of this method would depend on the implementation of the getgrade method in the resultcalculator class
    }
}
