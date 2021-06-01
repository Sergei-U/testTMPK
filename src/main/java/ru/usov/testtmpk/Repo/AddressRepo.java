package ru.usov.testtmpk.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.usov.testtmpk.Entity.Address;

import java.util.List;
import java.util.Optional;

/**
 *
 */
@Repository
public interface AddressRepo extends JpaRepository<Address, Long> {



    @Override
    Optional<Address> findById(Long aLong);

    @Override
    List<Address> findAll();
}
