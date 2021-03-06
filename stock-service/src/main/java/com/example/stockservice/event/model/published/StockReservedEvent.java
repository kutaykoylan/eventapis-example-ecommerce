package com.example.stockservice.event.model.published;

import com.example.stockservice.event.model.received.ReserveStockEvent;
import com.kloia.eventapis.common.EventType;
import com.kloia.eventapis.common.PublishedEvent;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.validation.constraints.NotNull;

@Data
@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class StockReservedEvent extends PublishedEvent {

    @NotNull
    private String orderId;

    @NotNull
    private long numberOfItemsSold;

    private EventType eventType = EventType.EVENT;

    public String getOrderId() {
        return orderId;
    }

    public long getNumberOfItemsSold() {
        return numberOfItemsSold;
    }

    @Override
    public EventType getEventType() {
        return eventType;
    }
}
