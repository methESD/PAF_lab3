package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Item_m;
import service.item_services;

@WebServlet("/delete_item")
public class delete_item extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public delete_item() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int Code= Integer.parseInt(request.getParameter("Code"));
		String name= request.getParameter("name");
	 	Double price= Double.parseDouble(request.getParameter("price"));
        String desc= request.getParameter("desc");
        
		Item_m y = new Item_m();
		
		  y.setCode(Code);
	      y.setName(name);
	      y.setPrice(price);
	      y.setDesc(desc);
		
		item_services Delete = new item_services();
		Delete.deleteItem(y);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/items.jsp") ;
		dispatcher.forward(request, response);
		doGet(request, response);
}
}