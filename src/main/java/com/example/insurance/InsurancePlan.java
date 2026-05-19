package com.example.insurance;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "insurance_plan")
public class InsurancePlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "coverage_type_id")
    private CoverageType coverageType;

    @Column(name = "startDate")
    private LocalDate startDate;

    @Column(name = "endDate")
    private LocalDate endDate;

    @Column(name = "premium_amount")
    private Double premiumAmount;

    @Enumerated(EnumType.STRING)
    @Column(name = "plan_status", nullable = false)
    private PlanStatus planStatus;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public Member getMember() {return  member;}
    public void setMember(Member member) {this.member = member;}

    public CoverageType getCoverageType() {return coverageType;}
    public void setCoverageType(CoverageType coverageType) {this.coverageType = coverageType;}

    public LocalDate getStartDate() {return startDate;}
    public void setStartDate(LocalDate startDate) {this.startDate = startDate;}

    public LocalDate getEndDate() {return endDate;}
    public void setEndDate(LocalDate endDate) {this.endDate = endDate;}

    public Double getPremiumAmount() {return premiumAmount;}
    public void setPremiumAmount(Double premiumAmount) {this.premiumAmount = premiumAmount;}

    public PlanStatus getPlanStatus(){return planStatus;}
    public void setPlanStatus(PlanStatus planStatus) {this.planStatus = planStatus;}
}
