package Collections;
import java.util.List;
public class Library {

    private List<Member>  memberList;

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    public void addMember(Member member){
        memberList.add(member);
    }
    public void removeMember(Member member){
        memberList.remove(member);
    }

    public Member  getMember(int id){
        boolean flag =false;
        Member searchedMember = new Member();
        for(Member member:memberList){
            if(member.getMemberId()==id){
                searchedMember = member;
                flag = true;
            }
        }
        if(flag){
            return searchedMember;
        }
        else{
            return null;
        }
    }
}
