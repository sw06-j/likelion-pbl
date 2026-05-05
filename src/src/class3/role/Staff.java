package class3.role;

import class3.policy.*;

public class Staff extends Member {
    private String position;

    public Staff(String name, String major, int generation, String part, String position) {
        super(name, major, generation, part);
        this.position = position;
    }

    @Override
    public MemberPolicy getPolicy() {
        return new StaffPolicy(); // 자신에게 맞는 정책 반환
    }

    @Override
    public String getDetails() {
        return String.format("👤 이름: %s | 🎓 전공: %s | 📌 기수: %d | 💻 파트: %s\n⭐ 직책: %s",
                getName(), getMajor(), getGeneration(), getPart(), position);
    }
}