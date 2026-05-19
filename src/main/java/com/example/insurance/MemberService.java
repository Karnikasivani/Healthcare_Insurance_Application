package com.example.insurance;

import java.util.List;

public interface MemberService {
    Member addMembers(MemberRequest newMember);
    List<Member> getAllMembers();
    Member getMemberById(Long id);
    List<InsurancePlan> getAllPlansForMember(Long id);
    void deleteMember(Long id);
}

