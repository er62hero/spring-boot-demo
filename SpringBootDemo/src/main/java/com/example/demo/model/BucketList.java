package com.example.demo.model;

import java.util.List;

import com.amazonaws.services.s3.model.Bucket;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class BucketList {
	private int bucketCount;
	private List<Bucket> bucketList;

}
