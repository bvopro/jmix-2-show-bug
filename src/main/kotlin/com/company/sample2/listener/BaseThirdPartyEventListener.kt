package com.company.sample2.listener

import com.company.sample2.entity.BaseThirdParty
import io.jmix.core.event.EntityChangedEvent
import io.jmix.core.event.EntityLoadingEvent
import io.jmix.core.event.EntitySavingEvent
import org.slf4j.LoggerFactory
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import org.springframework.transaction.event.TransactionalEventListener

@Component
open class BaseThirdPartyEventListener {

    val logger = LoggerFactory.getLogger(this::class.java)

    @EventListener
    open fun onBaseThirdPartyLoading(event: EntityLoadingEvent<BaseThirdParty>) {
        logger.error("########### onBaseThirdPartyLoading")
    }

    @EventListener
    open fun onBaseThirdPartySaving(event: EntitySavingEvent<BaseThirdParty>) {
        logger.error("########### onBaseThirdPartySaving")
    }

    @EventListener
    open fun onBaseThirdPartyChangedBeforeCommit(event: EntityChangedEvent<BaseThirdParty>) {
        logger.error("########### onBaseThirdPartyChangedBeforeCommit")
    }

    @TransactionalEventListener
    open fun onBaseThirdPartyChangedAfterCommit(event: EntityChangedEvent<BaseThirdParty>) {
        logger.error("########### onBaseThirdPartyChangedAfterCommit")
    }
}
