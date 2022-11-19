package assignment2.indipendence;

public class Human {

    public String gender;
    public String name;
    public Integer age;
    public Integer NID;

    public Human(String gender, String name, Integer age, Integer NID){
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.NID = NID;
    }

    public void talk(){
        System.out.println("Can't talk right now. Assignment kortesi ;-;");
    }
}
