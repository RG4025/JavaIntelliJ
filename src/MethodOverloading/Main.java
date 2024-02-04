package MethodOverloading;

public class Main {

    public void sum(){
        System.out.println(" sum is 34");
//        return false;
    }

    public int sum(int a, int b){
        return  a + b;
    }

    public Float sum(Float c, Float d){
        Float sum = c + d;
        return  sum;
    }

    public static void main(String[] args) {

        Main obj = new Main();
        System.out.println(obj.sum(4,6));

        double sum = obj.sum((int) 2.4, (int) 6.5);


        System.out.println(sum);
        obj.sum();

    }
}
