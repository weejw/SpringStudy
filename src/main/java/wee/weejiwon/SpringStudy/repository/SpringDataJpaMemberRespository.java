package wee.weejiwon.SpringStudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wee.weejiwon.SpringStudy.domain.Member;


import java.util.Optional;

public interface SpringDataJpaMemberRespository extends JpaRepository<Member, Long>, MemberRepository {
    @Override
    Optional<Member> findByName(String name);
}

