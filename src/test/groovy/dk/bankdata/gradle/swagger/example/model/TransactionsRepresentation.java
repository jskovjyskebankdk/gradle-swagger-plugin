package dk.bankdata.gradle.swagger.example.model;

import dk.nykredit.jackson.dataformat.hal.HALLink;
import dk.nykredit.jackson.dataformat.hal.annotation.EmbeddedResource;
import dk.nykredit.jackson.dataformat.hal.annotation.Link;
import dk.nykredit.jackson.dataformat.hal.annotation.Resource;

import java.util.Collection;
import java.util.Collections;

/**
 * Represents a set of transactions as returned by the REST service.
 */
@Resource
public class TransactionsRepresentation {
    @EmbeddedResource("transactions")
    private Collection<TransactionRepresentation> transactions;

    @Link
    private HALLink self;

    public Collection<TransactionRepresentation> getTransactions() {
        return Collections.unmodifiableCollection(transactions);
    }

    public HALLink getSelf() {
        return self;
    }
}
