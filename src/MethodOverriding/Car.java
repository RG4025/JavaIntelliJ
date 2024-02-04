package MethodOverriding;

public class Car extends  Vehicle{

    Car(){
        super(0);
    }

    Car(int num){
        super(num);
    }

    public  void service(){
        super.service();
        System.out.println("The method Of parent is overrides in the child class!");
    }

    public  void main(){
        System.out.println("Second method");
        super.main();
    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.service();
        obj.main();
        int tyres = obj.noOfTires;
        System.out.println(tyres);


        Car obj2 =  new Car(34);
        int newTyres = obj2.noOfTires;
        System.out.println(newTyres);
    }
}
