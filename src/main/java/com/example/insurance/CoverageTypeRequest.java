package com.example.insurance;

public record CoverageTypeRequest (
        InsuranceType insuranceType,
        String description
){ }
