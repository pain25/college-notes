import java.util.Random;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        ADMISSION A1= new ADMISSION();
        A1.ReadDate();
        A1.Display();
        A1.DrawNos();



    }
}
class ADMISSION{

    private int[] AD_NO ;
    private String[] name;
    private String[] Class;
    private float[] fees;


    void ReadDate(){
        Scanner sc= new Scanner(System.in);
        System.out.print("how many number of students details you want to add:");
        int number= sc.nextInt();
        AD_NO=new int[number];
        name=new String[number];
        Class= new String[number];
        fees= new float[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter the admission number of student "+(i+1));
            AD_NO[i]=sc.nextInt();
            System.out.println("Enter the name of the student ");
            name[i]=sc.next();
            System.out.println("Enter the class of the students");
            Class[i]=sc.next();
            System.out.println("Enter the fees");
            fees[i]= sc.nextFloat();
            System.out.println();

        }
    }
    void Display(){
        System.out.println("Display....");
        System.out.println();
        for (int i = 0; i <AD_NO.length ; i++) {

            System.out.println("name: "+name[i]);
            System.out.println("Admission of student is:"+AD_NO[i]);
            System.out.println("Class of student is:"+Class[i]);
            System.out.println("fees of student is:"+fees[i]+"/-");
            System.out.println();

        }

    }
    void  DrawNos(){
        System.out.println("The random picks are:");

        for (int i = 0; i <=1; i++) {
            int rnd= new Random().nextInt(AD_NO.length);

            System.out.println("name: "+name[rnd]);
            System.out.println("Admission of student is:"+AD_NO[rnd]);
            System.out.println("Class of student is:"+Class[rnd]);
            System.out.println("fees of student is:"+fees[rnd]+"/-");
            System.out.println();

        }

    }
}


