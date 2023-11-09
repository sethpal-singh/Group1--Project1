package com.scaler.greivance.dto;

import com.scaler.greivance.model.Grievance;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class AdminCategoryDTO {
    long id;
    String name;
    String description;
    List<Long> grievances = new ArrayList<>();
}
