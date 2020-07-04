package com.example.demo.repo;

import org.springframework.data.jpa.repository.*;
import com.example.demo.model.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {

}
