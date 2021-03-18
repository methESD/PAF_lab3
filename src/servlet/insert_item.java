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

@WebServlet("/insert_item")
public class insert_item extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public insert_item() {
        super();
        
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 	int code =Integer.parseInt(request.getParameter("code"));
	 	String name= request.getParameter("name");
	 	Double price= Double.parseDouble(request.getParameter("price"));
        String desc= request.getParameter("desc");
             
        Item_m b = new Item_m();
       
       
        b.setCode(code);
        b.setName(name);
        b.setPrice(price);
        b.setDesc(desc);
               
        item_services item_m = new item_services();
        item_m.insertItem(b);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/items.jsp") ;
        dispatcher.forward(request, response);
        doGet(request, response);
       
	}
	

}
