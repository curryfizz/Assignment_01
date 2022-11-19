package assignment2.StampCoupling;

import java.util.ArrayList;

public class classB {

    private int[] vals = {1,2,3,4};
    classA classA = new classA();
    String couplingTest;

    public void showCoupling(){
        classA.showCouplingExample(vals, couplingTest);
    }
}
