package com.example.insurance;

import jakarta.persistence.*;

@Entity
@Table(name = "profile_table")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zipCode")
    private Long zipCode;

    @OneToOne
    @JoinColumn(name = "member_id")
    private Member member;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String  getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    public String  getCity() {return city;}
    public void setCity(String city) {this.city = this.city;}

    public String  getState() {return state;}
    public void setState(String state) {this.state = this.state;}

    public Long getZipCode() {return zipCode;}
    public void setZipCode(Long zipCode) {this.zipCode = zipCode;}

    public Member getMember() {return  member;}
    public void setMember(Member member) {this.member = member;}
}