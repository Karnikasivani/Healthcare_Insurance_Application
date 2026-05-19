package com.example.insurance;

import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl implements ProfileService {
    private final ProfileRepository profileRepository;
    private final MemberRepository memberRepository;

    public ProfileServiceImpl(ProfileRepository profileRepository, MemberRepository memberRepository) {
        this.profileRepository = profileRepository;
        this.memberRepository = memberRepository;
    }

    @Override
    public Profile addProfile(ProfileRequest newProfile) {
        Profile profile = new Profile();
        profile.setAddress(newProfile.address());
        profile.setCity(newProfile.city());
        profile.setState(newProfile.state());
        profile.setZipCode(newProfile.zipCode());
        Member member = memberRepository.findById(newProfile.memberId()).orElse(null);
        profile.setMember(member);
        return profileRepository.save(profile);
    }

    @Override
    public Profile getProfileByMemberId(Long id) {
        return profileRepository.findByMemberId(id);
    }

    @Override
    public Profile updateProfile(Long id, ProfileRequest updateProfile) {
        Profile profile = profileRepository.findById(id).orElse(null);
        profile.setAddress(updateProfile.address());
        profile.setCity(updateProfile.city());
        profile.setState(updateProfile.state());
        profile.setZipCode(updateProfile.zipCode());
        return profileRepository.save(profile);
    }

    @Override
    public void deleteProfile(Long id) {
        profileRepository.deleteById(id);
    }
}

/*
 Profile addProfile(ProfileRequest newProfile);
    Profile getProfileByMemberId(Long id);
    Profile updateProfile(Long id, ProfileRequest updateProfile);
    void deleteProfile(Long id);
 */