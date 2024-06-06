package com.company.sample2.entity

import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@JmixEntity
@Entity
@Table(name = "NATURAL_PERSON")
open class NaturalPerson : BaseThirdParty() {
    @Column(name = "FIRSTNAME")
    var firstname: String? = null

    @Column(name = "LASTNAME")
    var lastname: String? = null
}
