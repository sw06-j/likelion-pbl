package class3.role;

import class3.policy.*;

public class Lion extends Member {
    private String studentId;

    public Lion(String name, String major, int generation, String part, String studentId) {
        super(name, major, generation, part);
        this.studentId = studentId;
    }

    @Override
    public MemberPolicy getPolicy() {
        return new LionPolicy(); // 자신에게 맞는 정책 반환
    }

    @Override
    public String getDetails() {
        return String.format("👤 이름: %s | 🎓 전공: %s | 📌 기수: %d | 💻 파트: %s\n🆔 학번: %s",
                getName(), getMajor(), getGeneration(), getPart(), studentId);
    }
}