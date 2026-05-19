package com.example.insurance;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InsurancePlanRepository extends JpaRepository<InsurancePlan, Long> {
    List<InsurancePlan> findByMemberId(Long id);
    List<InsurancePlan> findByPlanStatus(PlanStatus planStatus);
    List<InsurancePlan> findByCoverageTypeId(Long coverageTypeId);
}
