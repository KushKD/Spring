package controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataAccessException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class DatabaseErrorHandler {
	
	@ExceptionHandler(DataAccessException.class)
	public String handleDatabaseException() {
		return "error";
	}
	
	 @ExceptionHandler(Exception.class)
	  public ModelAndView handleError(HttpServletRequest req, Exception ex) {
	   // logger.error("Request: " + req.getRequestURL() + " raised " + ex);

	    ModelAndView mav = new ModelAndView();
	    mav.addObject("exception", ex.getLocalizedMessage());
	    mav.addObject("url", req.getRequestURL());
	    mav.setViewName("error");
	    return mav;
	  }
	 
	 @ExceptionHandler(AccessDeniedException.class)
	  public String handleAccessDeinedError(HttpServletRequest req, Exception ex) {
	  
	    return "denied";
	  }
	

}
