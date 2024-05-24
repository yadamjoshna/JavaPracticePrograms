public class StaticMethod {
    public static void main(String[] args) {
        StaticMethod.method1();
        System.out.println("static method");
    }
    static void method1(){
        System.out.println("Method 1");
    }
    static {
        System.out.println("static block");
        StaticMethod.method1();
    }

}

