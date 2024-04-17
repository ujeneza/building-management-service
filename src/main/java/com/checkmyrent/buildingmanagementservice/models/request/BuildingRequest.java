package com.checkmyrent.buildingmanagementservice.models.request;
import com.checkmyrent.buildingmanagementservice.models.dto.AddressDto;
import lombok.Data;

import java.util.List;

@Data
public class BuildingRequest {
    private String buildingId;
    private String buildingName;
    private AddressDto address;
    private String buildingType;
    private List<String> apartment;
    private List<String> renters;
    private List<String> contracts;
    private List<String> ownerId;
}
