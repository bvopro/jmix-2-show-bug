package com.company.sample2.entity

import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@JmixEntity
@Entity
@Table(name = "LEGAL_PERSON")
open class LegalPerson : BaseThirdParty() {
    @InstanceName
    @Column(name = "NAME")
    var name: String? = null
}
