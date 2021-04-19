package com.simone1040.designPattern.BuilderPattern.spring_boot.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Builder
@Getter
public class SpringBook {
    @NonNull
    private int id;
    @NonNull
    private String title;
    private int page = 0;
    @NonNull
    private String author;
}
