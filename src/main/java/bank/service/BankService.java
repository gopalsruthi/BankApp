package bank.service;


import bank.entity.Bank;
import bank.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {

    @Autowired
    BankRepository bankrepo;

    public Iterable byAll(){
        return bankrepo.findAll();
    }

    public Bank byId(long id){ return bankrepo.findById(id); }

    public Bank byName(String name){ return bankrepo.findByName(name);}

    public Bank creating(Bank bank){ return bankrepo.save(bank);}


}
