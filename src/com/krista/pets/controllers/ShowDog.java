package com.krista.pets.controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.krista.pets.models.Animal;


public class ShowDog extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String breed = request.getParameter("breed");
		String weight = request.getParameter("weight");
		//create model
		Animal dog = new Animal(name, breed, weight);
		//set model for view
		request.setAttribute("Dog", dog);
		//Let view handle the request
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/dog.jsp");
		view.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
