package com.example.insurance;

import java.util.List;

public interface CoverageTypeService {
    CoverageType addCoverageType(CoverageTypeRequest newCoverageType);
    List<CoverageType> getAllCoverageType();
}

