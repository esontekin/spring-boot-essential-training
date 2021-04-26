package com.sontekin.roomwebapp.services;

import com.sontekin.roomwebapp.data.StaffMemberRepository;
import com.sontekin.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    private final StaffMemberRepository staffMemberRepository;

    public StaffService(StaffMemberRepository staffMemberRepository) {
        this.staffMemberRepository = staffMemberRepository;
    }

    public List<StaffMember> getAllStaff(){
        return staffMemberRepository.findAll();
    }
}
