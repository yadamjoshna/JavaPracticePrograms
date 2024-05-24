public class ThisKeyWord {

    int x;
    ThisKeyWord(){
        System.out.println(this);
        System.out.println(this.x);
    }
    public static void main(String[] args) {
       new ThisKeyWord();
       new ThisKeyWord();



    }
}
