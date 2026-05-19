package com.example.insurance;

import java.time.LocalDate;

public record MemberRequest(
        String firstName,
        String lastName,
        LocalDate dateOfBirth,
        String emailId,
        Long phoneNumber
) {}
