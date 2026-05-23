package com.example.insurance;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.example.insurance.PlanStatus.*;

@Service
public class InsurancePlanServiceImpl implements InsurancePlanService {
    private final MemberRepository memberRepository;
    private final InsurancePlanRepository insurancePlanRepository;
    private final CoverageTypeRepository coverageTypeRepository;

    public InsurancePlanServiceImpl(MemberRepository memberRepository, InsurancePlanRepository insurancePlanRepository, CoverageTypeRepository coverageTypeRepository) {
        this.memberRepository = memberRepository;
        this.insurancePlanRepository = insurancePlanRepository;
        this.coverageTypeRepository = coverageTypeRepository;
    }

    @Override
    public InsurancePlan newInsurancePlan(InsurancePlanRequest request) {
        Long memberId = request.memberId();
        Long covergeTypeId = request.coverageTypeId();
        Member member = memberRepository.findById(request.memberId()).orElse(null);
        CoverageType coverageType = coverageTypeRepository.findById(request.coverageTypeId()).orElse(null);
        InsurancePlan insurancePlan = new InsurancePlan();
        insurancePlan.setMember(member);
        insurancePlan.setCoverageType(coverageType);
        insurancePlan.setPlanStatus(ACTIVE);
        insurancePlan.setEndDate(request.endDate());
        insurancePlan.setStartDate(request.startDate());
        insurancePlan.setPremiumAmount(request.premiumAmount());
        return insurancePlanRepository.save(insurancePlan);
    }

    @Override
    public List<InsurancePlan> getAllInsurancePlan() {
        return insurancePlanRepository.findAll();
    }

    @Override
    public InsurancePlan getInsurancePlanById(Long id) {
        return insurancePlanRepository.findById(id).orElse(null);
    }

    @Override
    public List<InsurancePlan> getAllActiveInsurancePlan() {
        return insurancePlanRepository.findByPlanStatus(PlanStatus.ACTIVE);
    }

    @Override
    public List<InsurancePlan> getInsurancePlanByCoverageType(Long coverageTypeId) {
        return insurancePlanRepository.findByCoverageTypeId(coverageTypeId);
    }

    @Override
    public InsurancePlan cancelInsurancePlan(Long id) {
        InsurancePlan plan = insurancePlanRepository.findById(id).orElse(null);
        plan.setPlanStatus(PlanStatus.CANCELLED);
        return insurancePlanRepository.save(plan);
    }

    @Override
    public void deleteInsurancePlan(Long id) {
        insurancePlanRepository.deleteById(id);
    }
}
