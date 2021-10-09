package za.ac.nwu.ac.logic.flow.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.MemberDto;
import za.ac.nwu.ac.domain.dto.TransactionDto;
import za.ac.nwu.ac.domain.persistence.Transaction;
import za.ac.nwu.ac.translator.MemberTranslator;
import za.ac.nwu.ac.translator.TransactionTranslator;

import javax.transaction.Transactional;


@Transactional
@Component("createTransactionFlowName")
public class CreateTransactionFlowImpl {

    private final TransactionTranslator transactionTranslator;

    public CreateTransactionFlowImpl(TransactionTranslator transactionTranslator){
        this.transactionTranslator = transactionTranslator;
    }

    public TransactionDto create(TransactionDto transaction){
        return transactionTranslator.create(transaction);
    }
}
