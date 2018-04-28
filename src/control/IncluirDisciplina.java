package control;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Conexao;

/**
 * Servlet implementation class IncluirDisciplina
 */
@WebServlet("/incluirDisciplina")
public class IncluirDisciplina extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IncluirDisciplina() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeprofessor = request.getParameter("nomeprofessor");
		String nomedisciplina = request.getParameter("nomedisciplina");
		String cursodisciplina = request.getParameter("cursodisciplina");
		int cargahorariadisciplina = Integer.parseInt(request.getParameter("cargahorariadisciplina"));
	
	
		// Obter uma conexao com o BD
		Connection conexao = Conexao.getConexao();
	
		
		request.setAttribute("nome", nomeprofessor);
		request.setAttribute("nomed", nomedisciplina);
		request.setAttribute("curso", cursodisciplina);
		request.setAttribute("cargah", cargahorariadisciplina);
	
		RequestDispatcher rd = request.getRequestDispatcher("incluirDisciplina.html");
		rd.forward(request, response);
	}

}
