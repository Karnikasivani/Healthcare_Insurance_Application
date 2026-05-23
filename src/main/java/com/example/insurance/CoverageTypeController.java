package com.example.insurance;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("coverage-types")
public class CoverageTypeController {
    private final CoverageTypeService coverageTypeService;

    public CoverageTypeController(CoverageTypeService coverageTypeService) {
        this.coverageTypeService = coverageTypeService;
    }

    @PostMapping
    public ResponseEntity<CoverageType> addCoverageType(@RequestBody CoverageTypeRequest newCoverageType) {
        return new ResponseEntity<>(coverageTypeService.addCoverageType(newCoverageType), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<CoverageType>> getAllCoverageType() {
        return ResponseEntity.ok(coverageTypeService.getAllCoverageType());
    }
}
