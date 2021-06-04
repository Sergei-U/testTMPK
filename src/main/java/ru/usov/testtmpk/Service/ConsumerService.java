package ru.usov.testtmpk.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.usov.testtmpk.Entity.Consumer;
import ru.usov.testtmpk.Repo.ConsumerRepo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Service
@RequiredArgsConstructor
public class ConsumerService {

    private final ConsumerRepo consumerRepo;



    public void editConsumer(Consumer consumer) {
        this.consumerRepo.save(consumer);
    }

    public void deleteConsumer(Long id) {
        this.consumerRepo.deleteById(id);
    }

    public List<Consumer> consumerList() {
        List<Consumer> consumers = new ArrayList<>(consumerRepo.findAll());
        return consumers;
    }

    public Consumer getConsumer(Long id) {
        return consumerRepo.getById(id);
    }

    public void addConsumer(Consumer consumer) { this.consumerRepo.save(consumer);
    }
}
