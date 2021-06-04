package ru.usov.testtmpk.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.usov.testtmpk.Entity.Contracts;
import ru.usov.testtmpk.Repo.ContractsRepo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Service
@RequiredArgsConstructor
public class ContractService {

    private final ContractsRepo contractsRepo;



    public void addContracts(Contracts contracts) {
        this.contractsRepo.save(contracts);
    }

    public void editContracts(Contracts contracts) {
        this.contractsRepo.save(contracts);
    }

    public void deleteContracts(Long id) {
        this.contractsRepo.deleteById(id);
    }

    public List<Contracts> contractsList() {
        List<Contracts> contractss = new ArrayList<>(contractsRepo.findAll());
        return contractss;
    }

    public Contracts getContracts(Long id) {
        return contractsRepo.getById(id);
    }


}
