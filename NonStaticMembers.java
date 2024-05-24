public class NonStaticMembers
{
    int num;    // nonstatic variable defining
    NonStaticMembers() {      //constructor
        System.out.println("Inside constructor");
    }
    {
        System.out.println("inside nonstatic block");  // nonstatic block
    }
    public static void main(String[] args) {          // main
        System.out.println("inside main method");
        new NonStaticMembers(); // creating multiple objects to show the difference between static and non static members
        new NonStaticMembers();
        new NonStaticMembers();
        new NonStaticMembers();
    }
    static {             // static block
        System.out.println("inside static block");
    }
}