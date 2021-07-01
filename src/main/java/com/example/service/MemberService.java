package com.example.service;

import com.example.domain.Member;
import com.example.repository.MemberRepository;
import com.example.repository.MemoryMemberRepository;

import java.util.Optional;

public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    public Long join(Member member) {

        validatDuplicateMember(member);  // 중복 회원 검증
        memberRepository.save(member);
        return member.getId();
    }

    private void validatDuplicateMember(Member member) {
        // 같은 이름의 회원 가입 불가
        memberRepository.findByName(member.getName())
            .ifPresent(m -> {
                new IllegalArgumentException("이미 존재하는 회원입니다.");
                });
    }


}
