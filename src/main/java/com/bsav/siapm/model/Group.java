package com.bsav.siapm.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Group {
    private String id;
    private String period;
    private List<Guideline> guidelines;
}
