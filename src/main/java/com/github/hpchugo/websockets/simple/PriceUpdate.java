package com.github.hpchugo.websockets.simple;

import java.math.BigDecimal;

public class PriceUpdate {
    private String symbol;
    private BigDecimal price;

    public PriceUpdate(String symbol, BigDecimal price) {
        this.symbol = symbol;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
