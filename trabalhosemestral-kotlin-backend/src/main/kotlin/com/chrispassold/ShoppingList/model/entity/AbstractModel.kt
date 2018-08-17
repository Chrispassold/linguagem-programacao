package com.chrispassold.ShoppingList.model.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.io.Serializable
import java.util.*
import javax.persistence.*


@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
@JsonIgnoreProperties(
        value = ["createdAt", "updatedAt"],
        allowGetters = true
)
abstract class AbstractModel : Serializable {
    @Id
    @Column(name = COL_ID)
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = COL_CREATED_AT, nullable = false, updatable = false)
    @CreatedDate
    var createdAt: Date? = null

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = COL_UPDATED_AT, nullable = false)
    @LastModifiedDate
    var updatedAt: Date? = null

    companion object {
        const val COL_ID = "id"
        const val COL_CREATED_AT = "created_at"
        const val COL_UPDATED_AT = "updated_at"
    }
}