package com.example.repository;

import com.example.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    // JPQL: select m from Member where m.name = ?
    // 이미 MemberRepository에 정의되어 있는데 여기에 또 할 필요가 있나??
    @Override
    Optional<Member> findByName(String name);
}
