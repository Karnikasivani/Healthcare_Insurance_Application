package com.example.insurance;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("insuranceplan")
public class InsurancePlanController {
    private final InsurancePlanService insurancePlanService;

    public InsurancePlanController(InsurancePlanService insurancePlanService) {
        this.insurancePlanService = insurancePlanService;
    }

    @PostMapping
    public ResponseEntity<InsurancePlan> newInsurancePlan(@RequestBody InsurancePlanRequest request) {
        return new ResponseEntity<>(insurancePlanService.newInsurancePlan(request), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<InsurancePlan>> getAllInsurancePlan() {
        return ResponseEntity.ok(insurancePlanService.getAllInsurancePlan());
    }

    @GetMapping("/{id}")
    public ResponseEntity<InsurancePlan> getInsurancePlanById(@PathVariable Long id) {
        return ResponseEntity.ok((insurancePlanService.getInsurancePlanById(id)));
    }

    @GetMapping("/getactive")
    public ResponseEntity<List<InsurancePlan>> getAllActiveInsurancePlan() {
        return ResponseEntity.ok(insurancePlanService.getAllActiveInsurancePlan());
    }

    @GetMapping("/{coveragetypeid}")
    public ResponseEntity<List<InsurancePlan> >getInsurancePlanByCoverageType(@PathVariable Long coverageTypeId) {
        return ResponseEntity.ok(insurancePlanService.getInsurancePlanByCoverageType(coverageTypeId));
    }

    @PutMapping("/{id}/cancel")
    public ResponseEntity<InsurancePlan> cancelInsurancePlan(@PathVariable Long id) {
        return ResponseEntity.ok(insurancePlanService.cancelInsurancePlan(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInsurancePlan(@PathVariable Long id) {
        insurancePlanService.deleteInsurancePlan(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
