package com.smtech.pmt.common.helper.query;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class QueryOptionBuilder {

    public static final String STARTING_PAGE   = "0";
    public static final String MAX_COUNT       = "10000";
    public static final String DEFAULT_SORT_BY = "date";

    public Optional<QueryOption> getDefaultQueryOption(String applId, Optional<String> page, Optional<String> count, final String searchValue, final List<String> searchBys,
            List<String> selectFields) {

        String pageNo = page.orElse(STARTING_PAGE);
        String offset = count.orElse(MAX_COUNT);

        List<SearchOption> searchOptions = new ArrayList<>();
        searchBys.stream().forEach(searchBy -> {
            SearchOption searchByOption = SearchOption.builder().searchBy(searchBy).searchOperator("CONTAINING").build();
            searchOptions.add(searchByOption);
        });

        return Optional.of(QueryOption.builder().applId(applId).page(Integer.parseInt(pageNo)).count(Integer.parseInt(offset)).searchValue(searchValue).searchOptions(searchOptions)
                .sortBy(DEFAULT_SORT_BY).selectFields(selectFields).build());
    }
}
