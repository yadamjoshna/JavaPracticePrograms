public class ObjectReference {
    int a;
    ObjectReference(){
    }
    public static void main(String[] args) {
        ObjectReference ref = new ObjectReference();
        System.out.println("reference value:" + ref.a);
    }
}
