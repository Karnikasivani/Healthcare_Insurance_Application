package com.example.insurance;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface InsurancePlanService {
    InsurancePlan newInsurancePlan(InsurancePlanRequest newInsurancePlan);
    List<InsurancePlan> getAllInsurancePlan();
    InsurancePlan getInsurancePlanById(Long id);
    List<InsurancePlan> getAllActiveInsurancePlan();
    List<InsurancePlan> getInsurancePlanByCoverageType(Long coverageTypeId);
    InsurancePlan cancelInsurancePlan(Long id);
    void deleteInsurancePlan(Long id);
}


