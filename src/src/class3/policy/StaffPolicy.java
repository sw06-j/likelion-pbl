// StaffPolicy.java
package class3.policy;
public class StaffPolicy implements MemberPolicy {
    @Override public boolean isSubmittable() { return false; }
}