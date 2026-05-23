package com.example.insurance;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping()
    public ResponseEntity<Member> addMembers(@RequestBody MemberRequest newMember) {
        return new ResponseEntity<>(memberService.addMembers(newMember), HttpStatus.CREATED);
    }

    @GetMapping("getallmembers")
    public ResponseEntity<List<Member>> getAllMembers() {
        return ResponseEntity.ok(memberService.getAllMembers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Member> getMemberById(@PathVariable Long id) {
        return ResponseEntity.ok(memberService.getMemberById(id));
    }

    @GetMapping("/{id}/getallplansformember")
    public ResponseEntity<List<InsurancePlan> >getAllPlansForMember(@PathVariable Long id) {
        return ResponseEntity.ok(memberService.getAllPlansForMember(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMember(@PathVariable Long id) {
        memberService.deleteMember(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}

