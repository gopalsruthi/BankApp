package bank.controller;


import bank.entity.Bank;
import bank.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
public class BankController {

    @Autowired
    BankService service;

    @GetMapping
    public Iterable findAll(){
        return service.byAll();
    }

    @GetMapping("/id/{id}")
    public Bank findById(@PathVariable Long id){
        return service.byId(id);
    }

    @GetMapping("/name/{name}")
    public Bank findByName(@PathVariable String name){
        return service.byName(name);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Bank create(@RequestBody Bank bank){
        return service.creating(bank);
    }
}
