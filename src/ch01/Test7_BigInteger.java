package ch01;

import java.math.BigInteger;

class Test7_BigInteger {

   public static void main(String args[]) {

      BigInteger bigNum1 = new BigInteger("92233720781313368547758077777777777");
      BigInteger bigNum11 = bigNum1.add(bigNum1);

      BigInteger bigNum2 = new BigInteger("10101110", 2);

      long mylong = 987654321;
      BigInteger bigNum3 = BigInteger.valueOf(mylong);

      System.out.println("bigNum1 : " + bigNum1);
      System.out.println("bigNum11 : " + bigNum11);

      System.out.println("bigNum2 : " + bigNum2);
      System.out.println("bigNum3 : " + bigNum3);

   }// main end
}// class end