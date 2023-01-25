/**
 * @author wkc
 * @version jdk17.0.5
 */
/*
    注释  decimal
 */
//简单注释

public class Test {
    
     float y ;
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println("汪楷淳\n♂\t123!");
        long a = 1;
        a = a +1 ;
        System.out.println(a);
        int i = (int)1.9; int j = 100;
        byte b=(byte )j;
        System.out.println(b);
        System.out.println(i);
        char c = 97;
        System.out.println(c);
        String s = "a"+"b";
        System.out.println(s);


        Test t =new Test();
        t.info();
        System.out.println(t.y);
    }
    public void info() {
        System.out.println(y);
    }

}
