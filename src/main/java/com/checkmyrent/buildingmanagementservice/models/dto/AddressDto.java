package com.checkmyrent.buildingmanagementservice.models.dto;

import lombok.Data;

@Data
public class AddressDto {
    private long id;
    private String addressId;
    private String city;
    private String country;
    private String streetName;
    private String postalCode;
    private String type;
    private BuildingDto buildingDetails;
}
