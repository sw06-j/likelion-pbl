package class4.package1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import class4.role.Member;
import class4.role.Lion;
import class4.role.Staff;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Member> memberList = new ArrayList<>();

        while (true) {
            System.out.println("\n========== 🦁 멤버 관리 시스템 ==========");
            System.out.println("1. 멤버 등록");
            System.out.println("2. 전체 멤버 조회");
            System.out.println("3. 이름으로 검색");
            System.out.println("4. 종료");
            System.out.print("선택: ");
            String menu = sc.nextLine();

            if (menu.equals("4")) break;

            switch (menu) {
                case "1":
                    System.out.println("\n— 📝 멤버 등록 —");
                    System.out.print("역할 선택 (1: 아기사자, 2: 운영진): ");
                    int type = Integer.parseInt(sc.nextLine());
                    System.out.print("👤 이름: ");
                    String name = sc.nextLine();

                    // 중복 체크
                    boolean exists = false;
                    for (Member m : memberList) {
                        if (m.getName().equals(name)) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("❌ 등록 실패: 이미 존재하는 이름입니다.");
                    } else {
                        System.out.print("🎓 전공: "); String major = sc.nextLine();
                        System.out.print("📌 기수: "); int gen = Integer.parseInt(sc.nextLine());
                        System.out.print("💻 파트: "); String part = sc.nextLine();

                        if (type == 1) {
                            System.out.print("🆔 학번: "); String id = sc.nextLine();
                            memberList.add(new Lion(name, major, gen, part, id));
                        } else {
                            System.out.print("⭐ 직책: "); String pos = sc.nextLine();
                            memberList.add(new Staff(name, major, gen, part, pos));
                        }
                        System.out.println("✅ 등록 완료: " + name);
                    }
                    break;

                case "2":
                    System.out.println("\n— 📋 전체 멤버 목록 —");
                    for (int i = 0; i < memberList.size(); i++) {
                        Member m = memberList.get(i);
                        String roleLabel = (m instanceof Lion) ? "아기사자" : "운영진";
                        System.out.println((i + 1) + ". [" + roleLabel + "] " + m.getName() + " - " + m.getGeneration() + "기");
                    }
                    System.out.println("📊 총 " + memberList.size() + "명");
                    break;

                case "3":
                    System.out.print("🔍 검색할 이름: ");
                    String searchName = sc.nextLine();
                    boolean found = false;
                    for (Member m : memberList) {
                        if (m.getName().equals(searchName)) {
                            System.out.println("\n✨ [검색 결과]");
                            System.out.println(m.getDetails());
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("검색 결과가 없습니다.");
                    break;
            }
        }
        sc.close();
    }
}