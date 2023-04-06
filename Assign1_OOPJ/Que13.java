class Que13{
    public static void main(String args[]){
    short s = 23;
    String strb=String.valueOf(s);
    System.out.println(strb);

    short key = 123;
    Short s1 = new Short(key);// short instance

    String str = "123";
    short value = Short.parseShort(str);

    System.out.println(value);
   
    }

}