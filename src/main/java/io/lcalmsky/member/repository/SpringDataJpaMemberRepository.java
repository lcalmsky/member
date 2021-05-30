package io.lcalmsky.member.repository;

import io.lcalmsky.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends MemberRepository, JpaRepository<Member, Long> {
    @Override
    Optional<Member> findByName(String name);
}
