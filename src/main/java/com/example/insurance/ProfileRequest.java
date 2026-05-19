package com.example.insurance;

public record ProfileRequest(
        String address,
        String city,
        String state,
        Long zipCode,
        Long memberId
) {}
