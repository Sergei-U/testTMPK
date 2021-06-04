package ru.usov.testtmpk.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.usov.testtmpk.Entity.Address;
import ru.usov.testtmpk.Service.AddressService;

import java.util.List;
import java.util.Map;

/**
 *
 */
@RestController
@RequestMapping(value = "/address")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;


    @PostMapping
    public ModelAndView add(@RequestParam String city,
                            @RequestParam String street,
                            @RequestParam int houseNumber,
                            @RequestParam int apartmentNumber,
                            Map<String, Object> model) {
        Address address = new Address(
                city,
                street,
                houseNumber,
                apartmentNumber);
        addressService.addAddress(address);
        List<Address> addresses = addressService.addressList();
        model.put("address", addresses);
        return new ModelAndView("address", model);
    }

    @RequestMapping("/addressupdate/{id}")
    public ModelAndView update(@PathVariable("id") Long id,
                               @RequestParam String city,
                               @RequestParam String street,
                               @RequestParam int houseNumber,
                               @RequestParam int apartmentNumber,
                               Map<String, Object> model) {
        Address address = addressService.getAddress(id);
        Address updateAddress = new Address(
                city,
                street,
                houseNumber,
                apartmentNumber);
        addressService.editAddress(updateAddress);
        model.put("addressupdate", address);
        model.put("isUpdate", true);
        return new ModelAndView("addressupdate", model);
    }

    @RequestMapping("/delete/{id}")
    public ModelAndView deleteAddress(@PathVariable("id") Long id, Map<String, Object> model) {
        addressService.deleteAddress(id);
        return addressList(model);
    }

    @GetMapping
    public ModelAndView addressList(Map<String, Object> model) {
        List<Address> addresses = addressService.addressList();
        model.put("address", addresses);
        return new ModelAndView("address", model);
    }
}
