package za.ac.nwu.ac.repo.persistence;

import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.dto.TransactionDto;
import za.ac.nwu.ac.domain.persistence.Member;
import za.ac.nwu.ac.domain.persistence.Transaction;


@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {


    @Query(value = "Select" +
            "       TransactionID"+
            "       MemberID"+
            "       MilesType"+
            "       MilesAddded"+
            "       MilesSubtracted"+
            "       DateOF"+
            "   FROM " +
            "ASYS_MEMBER" +
            "WHERE MemberID = :memberID ", nativeQuery = true)
    Transaction getMilesByMemberNativeQuery(Long memberID);

    @Query(value = "UPDATE" +
            "           MilesAdded"+
            "           SET         "+
            "           MileesAdded = 40"+
            "            FROM"+
            "ASYS.Transaction"+
            "WHERE MemberID = :memberID", nativeQuery = true)
    Transaction AddMemberMilesById(Long member);

}
