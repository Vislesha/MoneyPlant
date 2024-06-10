package com.rrekapalli.stockservice.entities;


import com.rrekapalli.moneyplantcore.entities.BaseAuditEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Nationalized;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class Stock extends BaseAuditEntity {
    @Nationalized
    @Column(nullable = false)
    private String stockSymbol;

    @Nationalized
    @Column(nullable = false)
    private String stockName;
}
