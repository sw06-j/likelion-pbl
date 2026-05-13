// StaffPolicy.java
package class4.policy;

public class StaffPolicy implements MemberPolicy {
    @Override public boolean isSubmittable() { return false; }
}