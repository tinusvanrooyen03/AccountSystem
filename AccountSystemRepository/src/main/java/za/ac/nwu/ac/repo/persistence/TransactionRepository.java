package za.ac.nwu.ac.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.nwu.ac.domain.persistence.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
