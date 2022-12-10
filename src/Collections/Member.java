package Collections;

public class Member {
    //Create a Member class with fields like memberId, memberName and Address. Another class as Library:
    //library will have collection of Members and features like add a member, delete a member, or search for a
    //member based on memberId. Lastly create a tester class with main method where you can test below
    //functionalities: "Add new member", "Remove a member", "Search for a member"
    private int memberId;
    private String memberName;
    private String address;

    public Member(int memberId, String memberName, String address) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.address = address;
    }
    public Member(){

    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
