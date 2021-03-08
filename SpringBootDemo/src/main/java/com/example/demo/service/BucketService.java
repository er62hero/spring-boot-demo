package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;
import com.example.demo.model.BucketList;

@Service
public class BucketService {

	// うまく環境変数が取れない用
	// private static final String ACCESS_KEY = "";
	// private static final String SECRET_KEY = "";
	// private static final String SESSION_TOKEN = "";

	public BucketList getBucketList() {
		// 本来は、正しい順序で解決する
		AmazonS3 s3 = AmazonS3ClientBuilder.standard().build();
		// AmazonS3 s3 = AmazonS3ClientBuilder.standard().withCredentials(new
		// EnvironmentVariableCredentialsProvider())
		// .withRegion(Regions.AP_NORTHEAST_1).build();

		// バケット情報を取得
		List<Bucket> bucketList = s3.listBuckets();

		return new BucketList().builder().bucketCount(bucketList.size()).bucketList(bucketList).build();
	}

}
