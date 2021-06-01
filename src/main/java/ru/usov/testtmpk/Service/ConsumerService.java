package ru.usov.testtmpk.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.usov.testtmpk.Entity.Consumer;
import ru.usov.testtmpk.Repo.ConsumerRepo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Service
public class ConsumerService {

    private final ConsumerRepo consumerRepo;


    public ConsumerService(ConsumerRepo consumerRepo) {
        this.consumerRepo = consumerRepo;
    }

    public void addConsumer(Consumer consumer) {
        this.consumerRepo.save(consumer);
    }

    public void editConsumer(Consumer consumer) {
        this.consumerRepo.save(consumer);
    }

    public void deleteConsumer(Long id) {
        this.consumerRepo.deleteById(id);
    }

    public List<Consumer> consumerList() {
        List<Consumer> consumers = new ArrayList<>();
        consumers.addAll(consumerRepo.findAll());
        return consumers;
    }

    public Consumer getConsumer(Long id) {
        return consumerRepo.getById(id);
    }

}
