package com.company.sample2.listener

import com.company.sample2.entity.Inspection
import io.jmix.core.event.EntityChangedEvent
import io.jmix.core.event.EntityLoadingEvent
import io.jmix.core.event.EntitySavingEvent
import org.slf4j.LoggerFactory
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import org.springframework.transaction.event.TransactionalEventListener

@Component
open class InspectionEventListener {

    val logger = LoggerFactory.getLogger(this::class.java)

    @EventListener
    open fun onInspectionLoading(event: EntityLoadingEvent<Inspection>) {
        logger.error("########### onInspectionLoading")
    }

    @EventListener
    open fun onInspectionSaving(event: EntitySavingEvent<Inspection>) {
        logger.error("########### onInspectionSaving")
    }

    @EventListener
    open fun onInspectionChangedBeforeCommit(event: EntityChangedEvent<Inspection>) {
        logger.error("########### onInspectionChangedBeforeCommit")
    }

    @TransactionalEventListener
    open fun onInspectionChangedAfterCommit(event: EntityChangedEvent<Inspection>) {
        logger.error("########### onInspectionChangedAfterCommit")
    }
}
