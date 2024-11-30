package com.luxoft.bankapp.service.audit;

import com.luxoft.bankapp.service.audit.events.*;

public interface Audit {
    void auditOperation(DepositEvent event);
    void auditOperation(WithdrawEvent event);
    void auditOperation(BalanceEvent event);
}
