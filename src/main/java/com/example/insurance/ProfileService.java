package com.example.insurance;

public interface ProfileService {
    Profile addProfile(ProfileRequest newProfile);
    Profile getProfileByMemberId(Long id);
    Profile updateProfile(Long id, ProfileRequest updateProfile);
    void deleteProfile(Long id);
}
