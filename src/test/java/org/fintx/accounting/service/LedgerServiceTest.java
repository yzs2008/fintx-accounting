/**
 *  Copyright 2017 FinTx
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fintx.accounting.service;

import static org.junit.Assert.*;

import org.fintx.accounting.entity.Voucher;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * @author bluecreator(qiang.x.wang@gmail.com)
 *
 */
public class LedgerServiceTest {
    @Autowired
    LedgerService ledgerService;

    /**
     * Test method for
     * {@link org.fintx.accounting.service.LedgerService#createInnerAccount(java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
     */
    @Test
    public void testCreateInnerAccount() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link org.fintx.accounting.service.LedgerService#createCustomerAccount(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
     */
    @Test
    public void testCreateCustomerAccount() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link org.fintx.accounting.service.LedgerService#post(org.fintx.accounting.service.Transaction)}.
     */
    @Test
    public void testPostTransaction() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link org.fintx.accounting.service.LedgerService#cancel(java.lang.String)}.
     */
    @Test
    public void testCancel() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link org.fintx.accounting.service.LedgerService#flush(java.lang.String, java.lang.String)}.
     */
    @Test
    public void testFlush() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link org.fintx.accounting.service.LedgerService#post(org.fintx.accounting.service.Operation)}.
     */
    @Test
    public void testPostOperation() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link org.fintx.accounting.service.LedgerService#auditAccount(java.lang.String)}.
     */
    @Test
    public void testAuditAccount() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link org.fintx.accounting.service.LedgerService#auditTransaction(java.lang.String, java.lang.String)}.
     */
    @Test
    public void testAuditTransaction() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link org.fintx.accounting.service.LedgerService#auditOperation(java.lang.String, java.lang.String)}.
     */
    @Test
    public void testAuditOperation() {
        fail("Not yet implemented");
    }

    @Test
    public void test() {
        Voucher vou = null;
        String accountsNo = null;
        String organizationNo = null;
        String custNo = null;
        String productNo = null;
        String transactionDate = null;
        String accountNo1 = null;
        String accountNo2 = null;
        String accountNo = ledgerService.createCustomerAccount(accountsNo, organizationNo, custNo, productNo, transactionDate);
        Transaction.Builder builder = Transaction.builder();
        builder.associate(vou);
        builder.credit(accountNo, new BigDecimal("100.00"));
        builder.debit(accountNo1, new BigDecimal("50.00"));
        builder.debit(accountNo2, new BigDecimal("50.00"));
        Transaction trans = builder.build();
        ledgerService.post(trans);
    }

}
