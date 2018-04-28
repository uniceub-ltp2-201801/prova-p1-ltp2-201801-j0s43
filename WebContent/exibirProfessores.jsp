<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="model.Professor" %>
    <% ArrayList<Professor> professor = (ArrayList<Professor>)request.getAttribute("listar"); %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista dos Professores</title>
</head>
<body>
<h1>Lista Professores</h1>

	<% for(int i = 0; i <professor.size(); i++){%>
	
	<tr><a href="?idprofessor="<% professor.get(i).getIdprofessor(); %>><% professor.get(i).getNomeprofessor(); %></tr></a>

<%} %>
</body>
</html>