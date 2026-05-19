package com.example.insurance;

import java.util.List;

public class InsurancePlanServiceImpl implements InsurancePlanService {
    private final MemberRepository memberRepository;
    private final InsurancePlanRepository insurancePlanRepository;
    private final ProfileRepository profileRepository;
    private final CoverageTypeRepository coverageTypeRepository;

    public InsurancePlanServiceImpl(MemberRepository memberRepository, InsurancePlanRepository insurancePlanRepository, ProfileRepository profileRepository, CoverageTypeRepository coverageTypeRepository) {
        this.memberRepository = memberRepository;
        this.insurancePlanRepository = insurancePlanRepository;
        this.profileRepository = profileRepository;
        this.coverageTypeRepository = coverageTypeRepository;
    }

    @Override
    public InsurancePlan newInsurancePlan(InsurancePlanRequest newInsurancePlan) {

        return null;
    }

    @Override
    public List<InsurancePlan> getAllInsurancePlan() {
        return List.of();
    }

    @Override
    public InsurancePlan getInsurancePlanById(Long id) {
        return null;
    }

    @Override
    public List<InsurancePlan> getAllActiveInsurancePlan() {
        return List.of();
    }

    @Override
    public List<InsurancePlan> getInsurancePlanByCoverageType(Long coverageTypeId) {
        return List.of();
    }

    @Override
    public InsurancePlan cancelInsurancePlan(Long id) {
        return null;
    }

    @Override
    public void deleteInsurancePlan(Long id) {

    }
}
