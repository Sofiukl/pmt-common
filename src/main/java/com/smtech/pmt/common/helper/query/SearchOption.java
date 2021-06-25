package com.smtech.pmt.common.helper.query;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class SearchOption {

    private String searchBy;
    private String searchOperator;
    
}
