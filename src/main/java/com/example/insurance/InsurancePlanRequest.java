package com.example.insurance;

import java.time.LocalDate;

public record InsurancePlanRequest(
        Long memberId,
        Long coverageTypeId,
        LocalDate startDate,
        LocalDate endDate,
        Double premiumAmount
) {}
