<%@page import="com.pharmacystore.dao.UserDao"%>
<%@page import="com.pharmacystore.daoimpl.UserDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	
	<jsp:useBean id="user" 
	class="com.pharmacystore.pojo.User" scope="page">
	</jsp:useBean>
	
	<jsp:setProperty property="*" name="user"/>
	
	<%
		UserDao daoImpl = new UserDaoImpl();
		if(daoImpl.register(user)) {
			response.sendRedirect("userlogin.jsp?msg = regsuccess");		
		}
		else {
			response.sendRedirect("userregistration.jsp?msg=regerror");
		}
	%>