package com.sontekin.roomwebapp.data;

import com.sontekin.roomwebapp.models.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffMemberRepository extends JpaRepository<StaffMember, String> {
}
