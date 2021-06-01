package ru.usov.testtmpk.Service;

import org.springframework.stereotype.Service;
import ru.usov.testtmpk.Entity.Tariffs;
import ru.usov.testtmpk.Repo.TariffsRepo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Service
public class TariffService {

    private final TariffsRepo tariffsRepo;

    public TariffService(TariffsRepo tariffsRepo) {
        this.tariffsRepo = tariffsRepo;
    }


    public void addTariffs(Tariffs tariffs) {
        this.tariffsRepo.save(tariffs);
    }

    public void editTariffs(Tariffs tariffs) {
        this.tariffsRepo.save(tariffs);
    }

    public void deleteTariffs(Long id) {
        this.tariffsRepo.deleteById(id);
    }

    public List<Tariffs> tariffsList() {
        List<Tariffs> tariffss = new ArrayList<>();
        tariffss.addAll(tariffsRepo.findAll());
        return tariffss;
    }

    public Tariffs getTariffs(Long id) {
        return tariffsRepo.getById(id);
    }
    
}
