/*
package class3;

import class3.role.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========== 🦁 아기사자 정보 입력 ==========");
        System.out.print("👤 이름: "); String lName = sc.nextLine();
        System.out.print("🎓 전공: "); String lMajor = sc.nextLine();
        System.out.print("📌 기수: "); int lGen = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        System.out.print("💻 파트 (백엔드/프론트엔드/기획/디자인): "); String lPart = sc.nextLine();
        System.out.print("🆔 학번: "); String lId = sc.nextLine();

        Member lion = new Lion(lName, lMajor, lGen, lPart, lId);

        System.out.println("\n========== 👨‍🏫 운영진 정보 입력 ==========");
        System.out.print("👤 이름: "); String sName = sc.nextLine();
        System.out.print("🎓 전공: "); String sMajor = sc.nextLine();
        System.out.print("📌 기수: "); int sGen = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        System.out.print("💻 파트 (백엔드/프론트엔드/기획/디자인): "); String sPart = sc.nextLine();
        System.out.print("⭐ 직책 (대표/부대표/파트장/멘토): "); String sPos = sc.nextLine();

        Member staff = new Staff(sName, sMajor, sGen, sPart, sPos);

        Member[] members = { lion, staff };

        System.out.println("\n========== 📋 결과 출력 ==========");
        for (Member m : members) {
            System.out.println(m.getDetails());

            String canSubmit = m.canSubmitAssignment() ? "✅ 가능" : "❌ 불가능";
            System.out.println("📝 과제 제출 가능 여부: " + canSubmit);

            System.out.println("--------------------------------------");
        }

        sc.close();
    }
}

 */