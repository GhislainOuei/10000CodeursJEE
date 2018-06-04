package com.objis.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

 
@WebServlet(description = "permet de gerer l'inscription a 10000 Codeur", urlPatterns = { "/inscription" })
public class AddCodeur extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AddCodeur() {
        super();
        // TODO Auto-generated constructor stub
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		RequestDispatcher vue = request.getRequestDispatcher("/WEB-INF/inscription.jsp");
		vue.forward(request, response);
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setAttribute("erreur", false);
		 //definitiion d'une expression regulier (model)
		 String patternDate = "^\\d{1,2}\\/\\d{1,2}\\/\\{4}$";
		 Pattern p = Pattern.com(patternDate);
		 String nom = request.getParameter("nom");
		 System.out.println("nom: "+nom);
		 if(nom.length() == 0) {
			 request.setAttribute("erreur", true);
			 request.setAttribute("erreur_nom", true);
			 System.out.println("erreur sur le nom");
		 }
		 
		 String prenom = request.getParameter("prenom");
		 if(prenom.length() == 0) {
			 request.setAttribute("erreur", true);
			 request.setAttribute("erreur_nom", true);
			 System.out.println("erreur sur le prenom");
		 }
		 
//		 if(nom.length() == 0) {
//			 request.setAttribute("erreur", true);
//			 request.setAttribute("erreur_nom", true);
//			 System.out.println("erreur sur le nom");
//		 }
//		 
//		 if(nom.length() == 0) {
//			 request.setAttribute("erreur", true);
//			 request.setAttribute("erreur_nom", true);
//			 System.out.println("erreur sur le nom");
//		 }
//		 
		 System.out.println("***************fin requete*************");
		doGet(request, response);
	}

}
