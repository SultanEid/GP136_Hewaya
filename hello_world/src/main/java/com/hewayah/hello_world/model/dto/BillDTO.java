package com.hewayah.hello_world.model.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class BillDTO {

    private Integer billId;

    private Date time;

    private Integer eventId;

    private boolean isPay;

    private LocalDateTime dateCreate;

    private LocalDateTime dateUpdate;

    private Integer hobbyistId;

    private Integer serviceProviderId;

    private Integer bookingId;
}