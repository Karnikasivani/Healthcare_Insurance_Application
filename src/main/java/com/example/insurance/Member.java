package com.example.insurance;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "member_table")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "dateOfBirth")
    private LocalDate dateOfBirth;

    @Column(name = "emailId", unique = true)
    private String emailId;

    @Column(name = "phoneNumber")
    private Long phoneNumber;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String  getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String  getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public LocalDate getDateOfBirth() {return dateOfBirth;}
    public void setDateOfBirth(LocalDate dateOfBirth) {this.dateOfBirth = dateOfBirth;}

    public String getEmailId() {return emailId;}
    public void setEmailId(String emailId) {this.emailId = emailId;}

    public Long getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(Long phoneNumber) {this.phoneNumber = phoneNumber;}
}
