package com.driver;

public class Main {
  static class Produt {
      public int product(int x, int y) {
          return x * y;
      }

      public int product(int x, int y, int z) {
          return x * y * z;
      }

      public double product(double x, double y) {
          return x * y;
      }
  }

    public static void main(String[] args) {
        Produt p = new Produt();
        int a = p.product(1,2);
        int b = p.product(1,2,3);
        double c = p.product(1.0 , 2.0);

        System.out.println(a+"\n" +b + "\n" + c);
    }
}
