package com.example.insurance;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class ProfileController {
    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @PostMapping
    public ResponseEntity<Profile> addProfile(@RequestBody ProfileRequest newProfile) {
        return new ResponseEntity<>(profileService.addProfile(newProfile), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Profile> getProfileByMemberId(@PathVariable Long id) {
        return ResponseEntity.ok(profileService.getProfileByMemberId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Profile> updateProfile(@PathVariable Long id, @RequestBody ProfileRequest updateProfile) {
        return ResponseEntity.ok(profileService.updateProfile(id,updateProfile));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProfile(@PathVariable Long id){
        profileService.deleteProfile(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
