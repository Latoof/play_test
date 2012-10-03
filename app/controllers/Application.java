package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
	  String message;
	  
	  /* Si une session est en cours, on va afficher un message de bienvenue */
	  String username = session("username");
	  if ( username != null ) {
		  message = "Bienvenue, "+username+". You are connected !";
	  }
	  else {
		  message = "Vous n'etes pas connecte";
	  }
    return ok(index.render(message));
    
  }
  
  public static Result mmm() {
	  return ok(index.render("LOL"));
  }
  
  public static Result testid( Long id ) {
	  return Results.ok(index.render("My id : "+id));
  }
  
  /* On cree une session pour l'user */
  public static Result connecter( String username ) {
	  session("username",username);
	  
	  /* Redirection vers l'index */
	  return index();
	  
	  
  }
  
}