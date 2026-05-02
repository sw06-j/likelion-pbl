import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name;
        int count = 5;

        while(true) {
            System.out.print("아기사자 수를 입력 : ");
            count = sc.nextInt();
            sc.nextLine();
            name = new String[count];
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

        System.out.println("[아기사자 명단 출력]");

        for(int i = 0;i<count;i++) {
            System.out.println((i + 1) + "번 아기사자 : " + name[i]);
        }

    }
}
