class Que14{
    public static void main(String args[]){
    short key = 13;
    Short c1 = new Short(key);

    short num1 = c1.shortValue();
    System.out.println("num 1:"+num1);

    long num2 = c1.longValue();
    System.out.println("num 1:"+num2);

    int num3 = c1.intValue();
    System.out.println("num 1:"+num3);

    float num4 = c1.floatValue();
    System.out.println("num 1:"+num4);

    double num5 = c1.doubleValue();
    System.out.println("num 1:"+num5);
}
} 