package com.bsav.siapm.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Semester {
    private int id;
    private List<Subject> subjects;
}
