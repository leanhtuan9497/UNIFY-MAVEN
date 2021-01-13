package com.leanhtuan.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.leanhtuan.model.Category;
import com.leanhtuan.model.Product;
import com.leanhtuan.model.Review;
import com.leanhtuan.service.CategoryService;
import com.leanhtuan.service.ProductService;
import com.leanhtuan.service.ReviewService;
import com.leanhtuan.service.impl.CategoryServiceImpl;
import com.leanhtuan.service.impl.ProductServiceImpl;
import com.leanhtuan.service.impl.ReviewServiceImpl;
@WebServlet(urlPatterns="/product/detail")
public class ProductDetailController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ProductService productService = new ProductServiceImpl();
	CategoryService categoryService = new CategoryServiceImpl();
	ReviewService reviewService = new ReviewServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		Product product = productService.get(Integer.parseInt(id));
		List<Category> categories = categoryService.getAll();
		ArrayList<Review> reviews = reviewService.getAll(Integer.parseInt(id)) ;
		req.setAttribute("categories", categories);

		req.setAttribute("product", product);
		req.setAttribute("reviews", reviews);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/client/view/product-detail.jsp");
		dispatcher.forward(req, resp);
	}

}
