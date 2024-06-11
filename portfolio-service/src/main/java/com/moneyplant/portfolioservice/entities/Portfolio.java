package com.moneyplant.portfolioservice.entities;

import com.moneyplant.moneyplantcore.entities.BaseAuditEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import org.hibernate.annotations.Nationalized;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class Portfolio extends BaseAuditEntity {
    @Nationalized
    @Column(nullable = false)
    private String name;

    @Nationalized
    @Column(nullable = false)
    private String description;
}
