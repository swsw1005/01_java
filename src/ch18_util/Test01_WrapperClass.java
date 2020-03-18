package ch18_util;

public class Test01_WrapperClass {

    public static void main(String[] args) {

        // boolean Boolean
        // byte Byte
        // char Character
        // short Short
        // int Integer
        // long Long
        // float Float
        // double Double

        Boolean b = new Boolean(true);
        Byte b2 = new Byte("10");
        Character ch = new Character('A');
        Short s = new Short((short) 1);
        Integer i = new Integer(100);
        Long l = new Long(1000000);
        Float f = new Float(12.345);
        Double d = new Double(78.456);
        System.out.println();
        System.out.println("boolean\t" + b);
        System.out.println("byte\t" + b2);
        System.out.println("char\t" + ch);
        System.out.println("short\t" + s);
        System.out.println("int\t" + i);
        System.out.println("long\t" + l);
        System.out.println("floar\t" + f);
        System.out.println("double\t" + d);
        System.out.println();
    }
}