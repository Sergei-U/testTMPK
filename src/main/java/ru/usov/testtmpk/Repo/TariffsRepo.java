package ru.usov.testtmpk.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.usov.testtmpk.Entity.Tariffs;

/**
 *
 */
@Repository
public interface TariffsRepo extends JpaRepository<Tariffs, Long> {
}
