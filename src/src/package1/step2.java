package package1;

import java.util.Scanner;

public class step2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🦁 아기사자 이름을 입력해주세요.");
        String name = sc.nextLine();

        System.out.println("🎓 전공을 입력해주세요.");
        String major = sc.nextLine();

        System.out.println("📌 기수를 입력해주세요.");
        int generation = sc.nextInt();

        System.out.println("📌 입력값 검증을 진행합니다.");

        Lion lion = new Lion(name, major, generation);
        System.out.println("⏭️ 객체 생성이 완료되었습니다. 아기사자 객체의 상태를 확인합니다.");

        String result = lion.checkValidation();
        System.out.println(result);

        if (result.startsWith("❌")) {
            System.out.println("❌ 잘못된 아기사자 정보입니다.");
        } else {
            System.out.println("👤 이름: " + lion.name + " | 🎓 전공: " + lion.major + " | 📌 기수: " + lion.generation);
        }
    }
}