import java.util.Scanner;

public class Main {

    static int pozitif(int x,int y) {
        if (x>y){
            return x;
        }
        else {
            System.out.print(x+ " ");
            return pozitif(x+5,y);
        }



    }

    static int negatif(int x){
        if (x<=0){
            return x;
        }
        else {
            System.out.print(x+ " ");
            return negatif(x-5);
        }
    }

    public static void main(String[] args) {
        int x;
        Scanner klavye=new Scanner(System.in);


        while (true){
            System.out.print("Sayi Giriniz: ");
            x= klavye.nextInt();

            pozitif(negatif(x),x);

            if (x==0){
                break;
            }
            break;
        }


    }
}