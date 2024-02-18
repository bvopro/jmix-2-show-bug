package com.company.sample2.entity

import io.jmix.core.DeletePolicy
import io.jmix.core.annotation.DeletedBy
import io.jmix.core.annotation.DeletedDate
import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.entity.annotation.OnDelete
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
@Table(name = "CASE_", indexes = [
    Index(name = "IDX_CASE__OWNER", columnList = "OWNER_ID")
])
@Entity(name = "Case_")
open class Case {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @Column(name = "REFERENCE")
    var reference: String? = null

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "case")
    var inspections: MutableList<Inspection> = NotInstantiatedList()

    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.UNLINK)
    @JoinColumn(name = "OWNER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var owner: BaseThirdParty? = null

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

    @DeletedBy
    @Column(name = "DELETED_BY")
    var deletedBy: String? = null

    @DeletedDate
    @Column(name = "DELETED_DATE")
    var deletedDate: OffsetDateTime? = null

}
