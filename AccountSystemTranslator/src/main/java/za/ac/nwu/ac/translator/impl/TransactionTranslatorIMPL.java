package za.ac.nwu.ac.translator.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.TransactionDto;
import za.ac.nwu.ac.domain.persistence.Transaction;
import za.ac.nwu.ac.repo.persistence.TransactionRepository;
import za.ac.nwu.ac.translator.TransactionTranslator;

@Component
public class TransactionTranslatorIMPL implements TransactionTranslator {

    private final TransactionRepository transactionRepository;

    public TransactionTranslatorIMPL(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public TransactionDto create(TransactionDto transactionDto) {

        try{
            Transaction transaction = transactionRepository.save(transactionDto.getTransaction());
            return new TransactionDto(transaction);
        }catch (Exception e){
            throw new RuntimeException("Unable to save to db");
        }
    }

    @Override
    public TransactionDto getMilesByMemberNativeQuery(TransactionDto transactionDto) {

        try{
            Transaction transaction = transactionRepository.save(transactionDto.getTransaction());
            return new TransactionDto(transaction);
        }catch (Exception e){
            throw new RuntimeException("Unable to save to db");
        }
    }

    @Override
    public TransactionDto AddMemberMilesById(TransactionDto transactionDto) {

        try{
            Transaction transaction = transactionRepository.save(transactionDto.getTransaction());
            return new TransactionDto(transaction);
        }catch (Exception e){
            throw new RuntimeException("Unable to save to db");
        }
    }

}
