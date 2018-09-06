package br.edu.devmedia.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.devmedia.objetos.Cidade;
import br.edu.devmedia.objetos.Estado;
import br.edu.devmedia.objetos.Regiao;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private List<Regiao> regioes;
	private List<Estado> estados;
	private List<Cidade> cidades;
	
	@Override
	public void init() throws ServletException {
		regioes = criarRegioes();
		estados = criarEstados(regioes);
		cidades = criarCidades(estados);
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int acao = Integer.parseInt(request.getParameter("acao"));
		switch (acao) {
		case 1:
			request.setAttribute("lista", regioes);
			break;
		case 2:
			int id = Integer.parseInt(request.getParameter("id"));
			request.setAttribute("lista", getEstados(id));
			break;
		case 3:
			id = Integer.parseInt(request.getParameter("id"));
			request.setAttribute("lista", getCidade(id));
			break;
		}
		
		
		RequestDispatcher dis = request.getRequestDispatcher("conteudo.jsp");
		dis.forward(request, response);
	}

	private List<Regiao> criarRegioes() {
		List<Regiao> regioes = new ArrayList<>();
		
		Regiao norte = new Regiao(1, "Norte");
		regioes.add(norte);
		Regiao nordeste = new Regiao(2, "Nordeste");
		regioes.add(nordeste);
		Regiao sul = new Regiao(3, "Sul");
		regioes.add(sul);
		
		return regioes;
	}
	
	private List<Estado> criarEstados(List<Regiao> regioes) {
		List<Estado> temp = new ArrayList<>();
		for (Regiao regiao : regioes) {
			switch (regiao.getId()) {
			case 1:
				Estado acre = new Estado(1, "Acre", regiao);
				temp.add(acre);
				Estado amazonas = new Estado(2, "Amazonas", regiao);
				temp.add(amazonas);
				break;
			case 2:
				Estado ceara = new Estado(3, "Ceará", regiao);
				temp.add(ceara);
				Estado piaui = new Estado(4, "Piauí", regiao);
				temp.add(piaui);
				break;
			case 3:
				Estado sc = new Estado(5, "Santa Catarina", regiao);
				temp.add(sc);
				Estado rs = new Estado(6, "Rio Grande do Sul", regiao);
				temp.add(rs);
				break;
			}
		}
		return temp;
	}
	
	private List<Cidade> criarCidades(List<Estado> estados) {
		List<Cidade> temp = new ArrayList<>();
		for (Estado estado : estados) {
			switch (estado.getId()) {
			case 1:
				Cidade rioBranco = new Cidade(1, "Rio Branco", estado);
				temp.add(rioBranco);
				Cidade cruzeiroSul = new Cidade(2, "Cruzeiro do Sul", estado);
				temp.add(cruzeiroSul);
				break;
			case 2:
				Cidade manaus = new Cidade(3, "Manaus", estado);
				temp.add(manaus);
				break;
			case 3:
				Cidade fortaleza = new Cidade(4, "Fortaleza", estado);
				temp.add(fortaleza);
				break;
			case 4:
				Cidade terezina = new Cidade(5, "Terezina", estado);
				temp.add(terezina);
				break;
			case 5:
				Cidade floripa = new Cidade(6, "Florianópolis", estado);
				temp.add(floripa);
				break;
			case 6:
				Cidade portoAlegre = new Cidade(7, "Porto Alegre", estado);
				temp.add(portoAlegre);
				break;
			}
		}
		return temp;
	}
	
	private List<Estado> getEstados(int idRegiao) {
		List<Estado> result = new ArrayList<>();
		for (Estado estado : estados) {
			if (estado.getRegiao().getId() == idRegiao) {
				result.add(estado);
			}
		}
		return result;
	}
	
	private List<Cidade> getCidade(int idEstado) {
		List<Cidade> result = new ArrayList<>();
		for (Cidade cidade : cidades) {
			if (cidade.getEstado().getId() == idEstado) {
				result.add(cidade);
			}
		}
		return result;
	}
}
