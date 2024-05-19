package com.rrekapalli.moneyplantcore.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;
import org.hibernate.annotations.Nationalized;

import java.io.Serializable;
import java.sql.Timestamp;

@MappedSuperclass
@FieldNameConstants
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class BaseAuditEntity extends BaseEntity implements Serializable {
    @Nationalized
    @Column(nullable = false, length = 36)
    private String createdBy;

    @Nationalized
    @Column(nullable = false, length = 36)
    private String modifiedBy;

    @Nationalized
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Timestamp createdOn;

    @Nationalized
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Timestamp modifiedOn;

    /**
     * Sets createdAt before insert
     */
    @PrePersist
    public void setCreationDate() {
        long now = System.currentTimeMillis();
        this.createdOn = new Timestamp(now);
        this.modifiedOn = new Timestamp(now);
        createdBy = "System   User";
        modifiedBy = "System  User";
    }

    @PreUpdate
    public void setModifiedDate() {
        long now = System.currentTimeMillis();
        this.modifiedOn = new Timestamp(now);
        modifiedBy = "System  User Update";
    }
}
