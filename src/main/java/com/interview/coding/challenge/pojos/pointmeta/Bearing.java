package com.interview.coding.challenge.pojos.pointmeta;

import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Bearing{
	private int value;
	private String unitCode;
}
