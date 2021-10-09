package za.ac.nwu.ac.logic.flow.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.TransactionDto;
import za.ac.nwu.ac.logic.flow.FetchMemberFlow;
import za.ac.nwu.ac.logic.flow.FetchTransactionFlow;
import za.ac.nwu.ac.translator.TransactionTranslator;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Component
public class FetchTransactionIMPL implements FetchTransactionFlow{
    private final TransactionTranslator transactionTranslator;

    @Autowired
    public FetchTransactionIMPL(TransactionTranslator transactionTranslator) {
        this.transactionTranslator = transactionTranslator;
    }


    @Override
    public List<TransactionDto> getAllTransactions() {
        return transactionTranslator.getTansactions();
    }
}
