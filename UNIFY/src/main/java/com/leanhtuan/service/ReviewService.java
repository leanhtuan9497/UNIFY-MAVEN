package com.leanhtuan.service;

import java.util.ArrayList;
import java.util.List;

import com.leanhtuan.model.Review;

public interface ReviewService {
	ArrayList<Review> getAll(int productID);
}
