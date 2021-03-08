package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BucketList;
import com.example.demo.service.BucketService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BucketController {
	private final BucketService bucketService;

	@RequestMapping(path = "buckets", method = RequestMethod.GET)
	public BucketList getBucketList() {
		return this.bucketService.getBucketList();
	}

}
