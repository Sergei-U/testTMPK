package ru.usov.testtmpk.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.usov.testtmpk.Entity.Contracts;

/**
 *
 */
@Repository
public interface ContractsRepo extends JpaRepository<Contracts, Long> {
}
