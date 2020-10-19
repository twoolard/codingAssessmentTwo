package com.interview.coding.challenge.pojos.pointmeta;

import lombok.*;

import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PointGeometry {
	private String type;
	private String id;
	private List<String> coordinates;
}
