package assignment2.StampCoupling;

public class classA {

    public void showCouplingExample(int[] arr, String value){
        System.out.println(arr[0]);
        System.out.println(value.length());
        //here the showCouplingExample method only prints the first element in the array and the length of the value string and yet it recieves the entire array and string as input
        //examples of stamp coupling
    }
}
