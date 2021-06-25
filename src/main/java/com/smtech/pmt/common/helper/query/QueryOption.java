package com.smtech.pmt.common.helper.query;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QueryOption {

    private String             applId;
    private int                page;
    private int                count;
    private String             searchValue;
    private String             sortBy;
    private List<SearchOption> searchOptions;
    private List<String>       selectFields;

}
