public class StaticMethod {
    public static void main(String[] args) {
        System.out.println("static method");
        StaticMethod.method1();
    }
    static void method1(){
        System.out.println("Method 1");
    }
}

