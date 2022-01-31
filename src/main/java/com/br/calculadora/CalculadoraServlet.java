package com.br.calculadora;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.br.model.calcular;


/**
* Servlet implementation class CalculadoraServlet
*/
@WebServlet("/CalculadoraServlet")
public class CalculadoraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalculadoraServlet () {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if ((request.getParameter("valor1") != null) && (request.getParameter("valor2") != null)) {

			int valor1 = Integer.parseInt(request.getParameter("valor1"));
			int valor2 = Integer.parseInt(request.getParameter("valor2"));

			String operacao = request.getParameter("cmd");
			calcular cal = new calcular(valor1, valor2);
			int resultado = 0;

			switch (operacao) {

			case "+":
				resultado = cal.somar();

				break;

			case "-":
				resultado = cal.subtrair();
				break;

			case "*":
				resultado = cal.multiplicar();
				break;

			case "/":
				resultado = cal.dividir();
				break;

			}

			request.setAttribute("res", resultado);

			request.getRequestDispatcher("/").forward(request, response);

		}

	
	}

	
}
