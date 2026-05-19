package com.example.insurance;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoverageTypeServiceImpl implements CoverageTypeService{
    private final CoverageTypeRepository coverageTypeRepository;

    public CoverageTypeServiceImpl(CoverageTypeRepository coverageTypeRepository) {
        this.coverageTypeRepository = coverageTypeRepository;
    }

    @Override
    public CoverageType addCoverageType(CoverageTypeRequest newCoverageType) {
        CoverageType coverageType = new CoverageType();
        coverageType.setInsuranceType(newCoverageType.insuranceType());
        coverageType.setDescription(newCoverageType.description());
        return coverageTypeRepository.save(coverageType);
    }

    @Override
    public List<CoverageType> getAllCoverageType() {
        return coverageTypeRepository.findAll();
    }
}
