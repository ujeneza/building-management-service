package com.checkmyrent.buildingmanagementservice.models.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class BuildingDto implements Serializable {
    private long id;
    private String buildingId;
    private String buildingName;
    private AddressDto address;
    private String buildingType;
    private List<String> apartment;
    private List<String> renters;
    private List<String> contracts;
    private String ownerId;
}
