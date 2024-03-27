package com.company.sample2.listener

import com.company.sample2.entity.Case
import com.company.sample2.entity.User
import io.jmix.core.DataManager
import io.jmix.core.event.EntityChangedEvent
import io.jmix.core.event.EntityLoadingEvent
import io.jmix.core.event.EntitySavingEvent
import io.jmix.core.querycondition.JpqlCondition
import io.jmix.core.querycondition.PropertyCondition
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import org.springframework.transaction.event.TransactionalEventListener

@Component
open class CaseEventListener {

    val logger = LoggerFactory.getLogger(this::class.java)

    @Autowired
    lateinit var dataManager: DataManager

    @EventListener
    open fun onCaseLoading(event: EntityLoadingEvent<Case>) {
        logger.error("########### onCaseLoading")
        dataManager.load(User::class.java).all().list()
        dataManager.load(User::class.java).condition(PropertyCondition.equal("username", "UNKNOWN")).list()
        dataManager.load(User::class.java).condition(PropertyCondition.equal("username", "")).list()
        dataManager.load(User::class.java).condition(JpqlCondition.create("e.username = ''", null)).list()
    }

    @EventListener
    open fun onCaseSaving(event: EntitySavingEvent<Case>) {
        logger.error("########### onCaseSaving")
    }

    @EventListener
    open fun onCaseChangedBeforeCommit(event: EntityChangedEvent<Case>) {
        logger.error("########### onCaseChangedBeforeCommit")
    }

    @TransactionalEventListener
    open fun onCaseChangedAfterCommit(event: EntityChangedEvent<Case>) {
        logger.error("########### onCaseChangedAfterCommit")
    }
}
