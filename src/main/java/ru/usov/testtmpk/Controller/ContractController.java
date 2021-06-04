package ru.usov.testtmpk.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.usov.testtmpk.Entity.Contracts;
import ru.usov.testtmpk.Entity.Tariffs;
import ru.usov.testtmpk.Service.ContractService;

import java.util.List;
import java.util.Map;

/**
 *
 */
@RestController
@RequestMapping(value = "/contract")
@RequiredArgsConstructor
public class ContractController {

    private final ContractService contractService;

    @GetMapping
    public ModelAndView contractList(Map<String, Object> model) {
        List<Contracts> contracts = contractService.contractsList();
        model.put("contract", contracts);
        return new ModelAndView("contract", model);
    }

    @RequestMapping("/delete/{id}")
    public ModelAndView deleteContract(@PathVariable("id") Long id, Map<String, Object> model) {
        contractService.deleteContracts(id);
        return contractList(model);
    }

    @PostMapping
    public ModelAndView add(@RequestParam Tariffs tariff, Map<String, Object> model) {
        Contracts contracts = new Contracts(tariff);
        contractService.addContracts(contracts);
        model.put("contract", contracts);
        return new ModelAndView("contract", model);
    }
}
