package com.company.sample2.listener

import com.company.sample2.entity.Invoice
import io.jmix.core.event.EntityChangedEvent
import io.jmix.core.event.EntityLoadingEvent
import io.jmix.core.event.EntitySavingEvent
import org.slf4j.LoggerFactory
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import org.springframework.transaction.event.TransactionalEventListener

@Component
open class InvoiceEventListener {

    val logger = LoggerFactory.getLogger(this::class.java)
    @EventListener
    open fun onInvoiceLoading(event: EntityLoadingEvent<Invoice>) {
        logger.error("########### onInvoiceLoading")
    }

    @EventListener
    open fun onInvoiceSaving(event: EntitySavingEvent<Invoice>) {
        logger.error("########### onInvoiceSaving")
    }

    @EventListener
    open fun onInvoiceChangedBeforeCommit(event: EntityChangedEvent<Invoice>) {
        logger.error("########### onInvoiceChangedBeforeCommit")
    }

    @TransactionalEventListener
    open fun onInvoiceChangedAfterCommit(event: EntityChangedEvent<Invoice>) {
        logger.error("########### onInvoiceChangedAfterCommit")
    }
}
