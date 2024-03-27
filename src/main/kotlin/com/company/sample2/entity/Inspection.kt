package com.company.sample2.entity

import io.jmix.core.DeletePolicy
import io.jmix.core.annotation.DeletedBy
import io.jmix.core.annotation.DeletedDate
import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.entity.annotation.OnDeleteInverse
import io.jmix.core.metamodel.annotation.Composition
import io.jmix.core.metamodel.annotation.JmixEntity
import io.jmix.data.impl.lazyloading.NotInstantiatedList
import jakarta.persistence.*
import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import java.time.OffsetDateTime
import java.util.*

@JmixEntity
@Table(name = "INSPECTION", indexes = [
    Index(name = "IDX_INSPECTION_CASE", columnList = "CASE_ID"),
    Index(name = "IDX_INSPECTION_AGENT", columnList = "AGENT_ID")
])
@Entity
open class Inspection {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @Column(name = "INSPECTION_DATE")
    var inspectionDate: OffsetDateTime? = null

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "AGENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var agent: NaturalPerson? = null

    @Composition
    @OneToMany(mappedBy = "inspection")
    var invoice: MutableList<Invoice> = NotInstantiatedList()

    @Column(name = "VERSION", nullable = false)
    @Version
    var version: Int? = null

    @CreatedBy
    @Column(name = "CREATED_BY")
    var createdBy: String? = null

    @CreatedDate
    @Column(name = "CREATED_DATE")
    var createdDate: OffsetDateTime? = null

    @LastModifiedBy
    @Column(name = "LAST_MODIFIED_BY")
    var lastModifiedBy: String? = null

    @LastModifiedDate
    @Column(name = "LAST_MODIFIED_DATE")
    var lastModifiedDate: OffsetDateTime? = null

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "CASE_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    var case: Case? = null

    @DeletedBy
    @Column(name = "DELETED_BY")
    var deletedBy: String? = null

    @DeletedDate
    @Column(name = "DELETED_DATE")
    var deletedDate: OffsetDateTime? = null
}
