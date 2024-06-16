package ru.andreymerkulov.trader.instrument;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "Instrument")
@Entity
@NoArgsConstructor
public class Instrument {
    @Id
    String symbol;

    @Column(name = "pricescale")
    float priceScale;

    @Column(name = "minorderqty")
    float minOrderQty;
}
