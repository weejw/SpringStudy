package wee.weejiwon.SpringStudy.repository;

import org.springframework.stereotype.Repository;
import wee.weejiwon.SpringStudy.domain.Member;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String Name);
    List<Member> findAll();
}
