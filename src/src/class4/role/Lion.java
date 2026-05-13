package class4.role;

import class4.policy.LionPolicy;
import class4.policy.MemberPolicy;

public class Lion extends Member {
    private String studentId;

    public Lion(String name, String major, int generation, String part, String studentId) {
        super(name, major, generation, part);
        this.studentId = studentId;
    }

    @Override
    public MemberPolicy getPolicy() {
        return new LionPolicy();
    }

    @Override
    public String getDetails() {
        return String.format("👤 이름: %s | 🎓 전공: %s | 📌 기수: %d | 💻 파트: %s\n🆔 학번: %s",
                getName(), getMajor(), getGeneration(), getPart(), studentId);
    }
}