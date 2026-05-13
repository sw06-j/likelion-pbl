package class4.package2;

import java.util.*;
import class4.role.Member;
import class4.role.Lion;
import class4.role.Staff;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 이름을 Key로 사용하여 검색 효율을 높인 Map
        Map<String, Member> memberMap = new HashMap<>();

        while (true) {
            System.out.println("\n========== 🦁 멤버 관리 시스템 (Map) ==========");
            System.out.println("1. 멤버 등록");
            System.out.println("2. 전체 멤버 조회");
            System.out.println("3. 이름으로 검색");
            System.out.println("4. 파트별 조회");
            System.out.println("5. 종료");
            System.out.print("선택: ");

            String menu = sc.nextLine();
            if (menu.equals("5")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (menu) {
                case "1": // 1. 멤버 등록
                    System.out.println("\n— 📝 멤버 등록 —");
                    System.out.print("👤 이름: ");
                    String name = sc.nextLine();

                    if (memberMap.containsKey(name)) {
                        System.out.println("❌ 등록 실패: 이미 존재하는 이름입니다.");
                        break;
                    }

                    System.out.print("역할 선택 (1: 아기사자, 2: 운영진): ");
                    int type = Integer.parseInt(sc.nextLine());
                    System.out.print("🎓 전공: "); String major = sc.nextLine();
                    System.out.print("📌 기수: "); int gen = Integer.parseInt(sc.nextLine());
                    System.out.print("💻 파트: "); String part = sc.nextLine();

                    if (type == 1) {
                        System.out.print("🆔 학번: "); String id = sc.nextLine();
                        memberMap.put(name, new Lion(name, major, gen, part, id));
                    } else {
                        System.out.print("⭐ 직책: "); String pos = sc.nextLine();
                        memberMap.put(name, new Staff(name, major, gen, part, pos));
                    }
                    System.out.println("✅ 등록 완료: " + name);
                    break;

                case "2": // 2. 전체 멤버 조회
                    System.out.println("\n— 📋 전체 멤버 목록 (Map.values) —");
                    if (memberMap.isEmpty()) {
                        System.out.println("등록된 멤버가 없습니다.");
                    } else {
                        int count = 1;
                        for (Member m : memberMap.values()) {
                            String roleLabel = (m instanceof Lion) ? "아기사자" : "운영진";
                            System.out.println(count++ + ". [" + roleLabel + "] " + m.getName() + " - " + m.getGeneration() + "기");
                        }
                        System.out.println("📊 총 " + memberMap.size() + "명");
                    }
                    break;

                case "3": // 3. 이름으로 검색
                    System.out.println("\n— 🔍 이름으로 검색 —");
                    System.out.print("검색할 이름: ");
                    String searchName = sc.nextLine();

                    // Map의 get 메서드를 사용하여 즉시 검색
                    Member foundMember = memberMap.get(searchName);

                    if (foundMember != null) {
                        System.out.println("\n✨ [검색 결과]");
                        System.out.println(foundMember.getDetails());
                    } else {
                        System.out.println("❌ 해당 이름의 멤버를 찾을 수 없습니다.");
                    }
                    break;

                case "4": // 4. 파트별 조회
                    System.out.println("\n— 💻 파트별 조회 —");
                    if (memberMap.isEmpty()) {
                        System.out.println("데이터가 없습니다.");
                        break;
                    }
                    // 현재 등록된 파트 목록 추출 (중복 제거를 위해 Set 사용)
                    Set<String> parts = new HashSet<>();
                    for (Member m : memberMap.values()) parts.add(m.getPart());
                    System.out.println("📂 현재 등록된 파트: " + parts);

                    System.out.print("조회할 파트명: ");
                    String targetPart = sc.nextLine();

                    System.out.println("\n✨ [" + targetPart + " 파트 멤버]");
                    boolean partFound = false;
                    for (Member m : memberMap.values()) {
                        if (m.getPart().equalsIgnoreCase(targetPart)) {
                            String roleLabel = (m instanceof Lion) ? "아기사자" : "운영진";
                            System.out.println("- " + m.getName() + " (" + roleLabel + ")");
                            partFound = true;
                        }
                    }
                    if (!partFound) System.out.println("해당 파트에 소속된 멤버가 없습니다.");
                    break;

                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해 주세요.");
            }
        }
        sc.close();
    }
}