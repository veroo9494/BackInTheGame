package com.carDealership.Application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaleDTO {
    Long id;
    Date saleDate;
    Long sellerId;
    Long customerId;
    Long vehicleId;
}
