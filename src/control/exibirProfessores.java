package control;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Conexao;
import dao.ExibirpDao;
import model.Professor;

/**
 * Servlet implementation class listarProfessores
 */
@WebServlet("/exibirProfessores")
public class exibirProfessores extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public exibirProfessores() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Professor p = (Professor)request.getAttribute("professor");
		
		//Obter uma conexao com o BD
		Connection conexao = Conexao.getConexao();
		
		//instanciar objeto ClienteDAO
		ExibirpDao ld = new ExibirpDao(conexao);
		
		ArrayList<Professor> professores = ld.getProfessores(p.getIdprofessor());
		
		request.setAttribute("listar", professores);
		RequestDispatcher rd = request.getRequestDispatcher("listar.jsp");
		rd.forward(request, response);
		
		
	}

}
