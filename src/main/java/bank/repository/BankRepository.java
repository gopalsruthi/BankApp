package bank.repository;

import bank.entity.Bank;
import org.springframework.data.repository.CrudRepository;

public interface BankRepository extends CrudRepository<Bank, Long> {

    Bank findById(long id);
    Bank findByName(String empName);
}



