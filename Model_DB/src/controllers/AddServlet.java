package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.AddQuery;
import model.Model;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet(description = "Controller for adding a new model to database", urlPatterns = { "/addModel" })
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//get the data
		String modelName = request.getParameter("modelName");
		String modelAuthor = request.getParameter("modelAuthor");
		String modelDate = request.getParameter("modelDate");
		
		//set up a model object
		Model model = new Model();
		model.setModelName(modelName);
		model.setModelAuthor(modelAuthor);
		model.setModelDate(modelDate);
		
		//set up an addQuery object
		AddQuery aq = new AddQuery("test", "root", "");
		
		//pass model to addQuery to add to db
		aq.doAdd(model);
		
		//pass execution control to ReadServlet
		String url = "/read";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	
	}

}
