public class ObjectReference {
    int a=100000;
    int b=1909890988;
    int sum = a+b;
    ObjectReference(){
    }
    public static void main(String[] args) {
        ObjectReference ref = new ObjectReference();
        System.out.println("reference value:" + ref.sum);
    }
}
