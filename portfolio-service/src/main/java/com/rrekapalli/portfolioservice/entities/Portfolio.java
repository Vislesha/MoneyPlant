package com.rrekapalli.portfolioservice.entities;

import com.rrekapalli.moneyplantcore.entities.BaseAuditEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import org.hibernate.annotations.Nationalized;

@Entity
@Data
public class Portfolio extends BaseAuditEntity {
    @Nationalized
    @Column(nullable = false)
    private String name;

    @Nationalized
    @Column(nullable = false)
    private String description;
}
