package com.leanhtuan.service.impl;

import java.util.ArrayList;

import com.leanhtuan.dao.ReviewDao;
import com.leanhtuan.dao.impl.ReviewDaoImpl;
import com.leanhtuan.model.Review;
import com.leanhtuan.service.ReviewService;

public class ReviewServiceImpl implements ReviewService {

	ReviewDao reviewDao = new ReviewDaoImpl();
	@Override
	public ArrayList<Review> getAll(int productID) {
		// TODO Auto-generated method stub
		return reviewDao.getListReviewByProduct(productID);
	}
	
}
