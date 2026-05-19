package com.example.insurance;

import org.springframework.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository;
    private final InsurancePlanRepository insurancePlanRepository;

    public MemberServiceImpl(MemberRepository memberRepository, InsurancePlanRepository insurancePlanRepository) {
        this.memberRepository = memberRepository;
        this.insurancePlanRepository = insurancePlanRepository;
    }

    @Override
    public Member addMembers(MemberRequest newMember) {
        Member member = new Member();
        member.setDateOfBirth(newMember.dateOfBirth());
        member.setEmailId((newMember.emailId()));
        member.setFirstName(newMember.firstName());
        member.setLastName(newMember.lastName());
        member.setPhoneNumber(newMember.phoneNumber());
        return memberRepository.save(member);
    }

    @Override
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    @Override
    public Member getMemberById(Long id) {
        return memberRepository.findById(id).orElse(null);
    }

    @Override
    public List<InsurancePlan> getAllPlansForMember(Long id) {
        return insurancePlanRepository.findByMemberId(id);
    }

    @Override
    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }
}

/*
Member addMembers(MemberRequest newMember);
    List<Member> getAllMembers();
    Member getMemberById(Long id);
    List<InsurancePlan> getAllPlansForMember(Long id);
    void deleteMember(Long id);
 */