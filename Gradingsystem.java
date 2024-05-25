public class Gradingsystem
{
    public static void main(String[] args) {

            int maths= 34;
            int physics =39;
            int chem =50;
            int average = (maths+physics+chem)/3;

            if(maths<35||physics<35||chem<35){
                System.out.println("Fail");
            }

            else if(average<60){
                System.out.println("Grade C");
            }
            else if(average<70){
                System.out.println("Grade B");
            }
            else{
                System.out.println("Grade A");

            }
        }
    }

