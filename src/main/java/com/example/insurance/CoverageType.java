package com.example.insurance;

import jakarta.persistence.*;

@Entity
@Table(name="coverage_type")
public class CoverageType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "insurance_type", nullable = false)
    private InsuranceType insuranceType;

    @Column(name = "description")
    private String description;

    public void setId(Long id) {this.id = id;}
    public Long getId() {return id;}

    public void setInsuranceType(InsuranceType insuranceType) {this.insuranceType = insuranceType;}
    public InsuranceType getInsuranceType() {return insuranceType;}

    public void setDescription(String description) {this.description = description;}
    public String getDescription() {return description;}
}
