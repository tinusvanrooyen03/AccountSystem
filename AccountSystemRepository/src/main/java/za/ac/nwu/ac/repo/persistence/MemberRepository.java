package za.ac.nwu.ac.repo.persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.persistence.Member;

@Repository
public interface  MemberRepository extends JpaRepository<Member, Long> {

}


