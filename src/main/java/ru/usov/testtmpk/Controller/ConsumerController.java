package ru.usov.testtmpk.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.usov.testtmpk.Entity.Consumer;
import ru.usov.testtmpk.Service.ConsumerService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 *
 */
@RestController
@RequestMapping(value = "/consumer")
@RequiredArgsConstructor
public class ConsumerController {

    private final ConsumerService consumerService;


    @PostMapping
    public ModelAndView add(@RequestParam String name,
                            @RequestParam BigDecimal balance,
                            Map<String, Object> model){
        Consumer consumer = new Consumer(
                name,
                balance);
        consumerService.addConsumer(consumer);
        List<Consumer> consumers = consumerService.consumerList();
        model.put("consumer", consumers);
        return new ModelAndView("consumer", model);
    }

    @GetMapping
    public ModelAndView update(@PathVariable("id")Long id,
                               @RequestParam String name,
                               @RequestParam BigDecimal balance,
                               Map<String, Object> model) {
        Consumer consumer = consumerService.getConsumer(id);
        Consumer updateConsumer = new Consumer(
                name,
                balance);
        consumerService.editConsumer(updateConsumer);
        model.put("consumer", consumer);
        model.put("isUpdate", true);
        return new ModelAndView("consumer", model);}


    @RequestMapping("/delete/{id}")
    public ModelAndView deleteConsumer(@PathVariable("id") Long id, Map<String, Object> model) {
        consumerService.deleteConsumer(id);
        return consumerList(model);
    }

    @GetMapping
    public ModelAndView consumerList(Map<String, Object> model) {
        List<Consumer> consumers=consumerService.consumerList();
        model.put("consumer", consumers);
        return new ModelAndView("consumer", model);
    }

    @RequestMapping("/addcontract/{id}")
    public ModelAndView addContractToConsumer(Map<String, Object> model) {
        return new ModelAndView("consumer", model);
    }
}
