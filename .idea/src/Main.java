import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name;

        while(1) {
            System.out.print("아기사자 수를 입력 : ");
            int count = sc.nextInt();
            sc.nextLine();
            if(count > 4){
                break;
            }else{
                System.out.println("[5명 이상 입력하세요.]");
            }
        }

        for(int i = 0;i<count;i++){
            System.out.print((i + 1) + "번 아기사자 이름 입력 : ");
            name[i] = sc.nextLine();
        }

        for(int i = 0;i<count;i++) {
            System.out.println((i + 1) + "번 아기사자 : " + name[i]);
        }

        System.out.println("Hello, LikeLion!3");
    }
}