class Que9{
    public static void main(String args[]){
    byte key = 123;
    Byte b1 = new Byte(key);

    byte num1 = b1.byteValue();
    System.out.println("num 1:"+num1);

    short num2 = b1.shortValue();
    System.out.println("num 1:"+num2);

    int num3 = b1.intValue();
    System.out.println("num 1:"+num3);

    float num4 = b1.floatValue();
    System.out.println("num 1:"+num4);

    double num5 = b1.doubleValue();
    System.out.println("num 1:"+num5);
}
} 