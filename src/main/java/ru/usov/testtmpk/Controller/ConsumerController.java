package ru.usov.testtmpk.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.usov.testtmpk.Entity.Consumer;
import ru.usov.testtmpk.Repo.ConsumerRepo;
import ru.usov.testtmpk.Service.ConsumerService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 *
 */
@Controller
public class ConsumerController {

    private final ConsumerService consumerService;

    public ModelAndView add(@RequestParam String name,
                            @RequestParam BigDecimal balance,
                            Map<String, Object> model){
        Consumer consumer = new Consumer(name, balance);
        consumerService.addConsumer(consumer);
        List<Consumer> consumers = consumerService.consumerList();
        model.put("consumer", consumers);
        return new ModelAndView("consumer", model);
    }
}
