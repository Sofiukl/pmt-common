package com.smtech.pmt.common.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class GenericResponseMessage<T> {
	private List<T>	result;
	private String	message;
	private Boolean	error;
	private String	details;
	private int		totalRecords;
}
