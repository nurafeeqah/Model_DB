package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Model;
import dbHelpers.UpdateQuery;

/**
 * Servlet implementation class UpdateModelServlet
 */
@WebServlet(description = "Controll which starts the actual book update to the db", urlPatterns = { "/updateModel" })
public class UpdateModelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateModelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//get form data and set up a model object
		int modelID = Integer.parseInt(request.getParameter("modelID")); 
		String modelName = request.getParameter("modelName");
		String modelAuthor = request.getParameter("modelAuthor");
		String modelDate = request.getParameter("modelDate");
		
		Model model = new Model();
		model.setModelID(modelID);
		model.setModelName(modelName);
		model.setModelAuthor(modelAuthor);
		model.setModelDate(modelDate);
		
		//create updateQuery object and use it to update the book
		UpdateQuery uq = new UpdateQuery("test", "root", "");
		uq.doUpdate(model);
		
		//pass control to the ReadServlet
		String url = "/read";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
	}

}
