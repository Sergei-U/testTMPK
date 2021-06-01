package ru.usov.testtmpk.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.usov.testtmpk.Entity.Consumer;

/**
 *
 */
@Repository
public interface ConsumerRepo extends JpaRepository<Consumer, Long> {
}
