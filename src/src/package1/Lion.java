package package1;

public class Lion {

    public String name;
    public String major;
    public int generation;

    public Lion(String name, String major, int generation) {
        this.name = name;
        this.major = major;
        this.generation = generation;
    }

    public String checkValidation() {
        if (name.isEmpty()) {
            return "❌ 이름이 비어 있습니다.";
        }
        if (major.isEmpty()) {
            return "❌ 전공이 비어 있습니다.";
        }
        if (generation < 1) {
            return "❌ 기수가 1 미만입니다.";
        }
        return "✅ 적절한 아기사자 정보입니다.";
    }
}