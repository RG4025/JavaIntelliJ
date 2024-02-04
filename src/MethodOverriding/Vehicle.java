package MethodOverriding;

public class Vehicle {

    int noOfTires;

    Vehicle(){
        this.noOfTires =0;
    }

    Vehicle(int num){
        this.noOfTires = num;
    }

    public  void service(){
        System.out.println("It is a parent service - Vehicle.");
    }

    public void main(){
        System.out.println("First Method");
    }
}
