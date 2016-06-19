package edu.mum.cspro.wap.dictionary.servlet;

import java.io.IOException;
import java.io.PrintWriter; 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson; 

import edu.mum.cspro.wap.dictionary.service.DictionaryService;
import edu.mum.cspro.wap.dictionary.service.impl.DictionaryServiceImpl;

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	final private Gson gson = new Gson();
	final private DictionaryService service = new DictionaryServiceImpl();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");		
		
		PrintWriter out = response.getWriter();		
		String param = request.getParameter("q");
		if(param != null && !param.isEmpty()){		
			out.print(gson.toJson(service.search(param)));		
		}else{
			param = request.getParameter("word");
			if(param != null && !param.isEmpty())
				out.print(gson.toJson(service.searchWord(param)));	
		}
		out.flush();		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

 