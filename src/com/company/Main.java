package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

/**
 * calling same method with different
 * parameter to see the use of method overloading
 */
        Math1 math1 = new Calculation();

        //first method with two integer parameter
        double firstSum = math1.sum(10,20);
        System.out.println(firstSum);

        //second same named method with three integer parameter
        firstSum = math1.sum(10,11,5);
        System.out.println(firstSum);

        //third same named method with two double data type parameter
        firstSum = math1.sum(10.25 ,11.666);
        System.out.printf("%.2f",firstSum);
        System.out.printf("\n");

        double multiply = math1.multiply(10,20);
        System.out.printf("%.2f",multiply);

    }
}

 abstract class Math1{

     /**
      * method overloading is done when using same name of the methods but with different parameters
      * @param x
      * @param y
      * @return
      */

     public Math1(){
         super();
         System.out.println("THis is the parent class");
     }
  public double sum(int x, int y){
      return x +y;
        }

  public double sum(int x, int y, int z){
      return x+y+z;
  }

  public double sum(double x, double y){
      return x + y;
  }

     /**
      * this method has to be overridden in the child class
      * @param x
      * @param y
      * @return
      */
  abstract double multiply(int x, int y);

}

class Calculation extends Math1 {

    public Calculation(){
        super();
        System.out.println("This is the child class");
    }
    public double multiply(int x, int y){
        return x * y;
    }

}
