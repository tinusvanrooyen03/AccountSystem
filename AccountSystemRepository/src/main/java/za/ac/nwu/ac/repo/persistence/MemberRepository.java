package za.ac.nwu.ac.repo.persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.persistence.Member;

@Repository
public interface  MemberRepository extends JpaRepository<Member, Long> {

    @Query(value = "Select" +
            "       MemberID,"+
            "       MemberFirstName"+
            "       MemberLastName"+
            "       Total Miles"+
            "   FROM " +
            "AYS_MEMBER" +
            "WHERE MemberID = :memberID ", nativeQuery = true)
    Member getMemberByIDNativeQuery(Long memberID);

    @Query(value = "Select" +
            "       at"+
            "       FROM"+
            "       Member at"+
            "       Total Miles"+
            "WHERE MemberID = :memberID ", nativeQuery = true)
    Member getMemberByID(Long memberID);

}


