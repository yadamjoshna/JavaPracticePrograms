public class NonStaticMembers
{
    int num;
    NonStaticMembers() {      //constructor
        System.out.println("Inside constructor");
    }
    {
        System.out.println("inside nonstatic block");  // nonstatic block
    }

    public static void main(String[] args) {          // main
      new NonStaticMembers();
        System.out.println("inside main method");

    }
}

