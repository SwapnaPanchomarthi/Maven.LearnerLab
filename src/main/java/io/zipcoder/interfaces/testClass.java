package io.zipcoder.interfaces;

public class testClass {


    public static void main(String[] args) {
    //  testLambda  add = (int a, int b)-> a+b;
      //testLambda hello=(String c, int t)-> System.out.println("tst");
      Thread myThread = new Thread(new Runnable() {
          public void run() {
              System.out.println("Hello world");

          }
      });
      myThread.run();
    }
}

interface testLambda{
    int add1(int c, int d);
    String string(String s1, int k);
}