package com.moneyplant.moneyplantcore.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Nationalized;

import java.io.Serializable;

@MappedSuperclass
@FieldNameConstants
@Getter
@Setter
@AllArgsConstructor
public abstract class BaseEntity implements Serializable {
    public BaseEntity() {}

    @Nationalized
    @Id
    @GenericGenerator(name = "generator", strategy = "uuid2", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(updatable = false, nullable = false, length = 36)
    protected String id;
}
