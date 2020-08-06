package dimigo.Ex;

        import java.util.Scanner;


public class rerode {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] strlist = new String[num];

        for(int i = 0 ; i < num ; i ++ ){
            String str = scanner.next();
            strlist[i] = str;
        }

        for(int i = num-1 ; i > -1 ; i --){
            System.out.print(strlist[i]+" ");
        }

    }
}