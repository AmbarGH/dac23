class Que8{
    public static void main(String args[]){
    byte b= 123;
    String strb=String.valueOf(b);
    System.out.println(strb);

    byte key = 123;
    Byte b1 = new Byte(key);// byte instance

    String str = "123";
    byte value = Byte.parseByte(str);

    System.out.println(value);
   
    }

}