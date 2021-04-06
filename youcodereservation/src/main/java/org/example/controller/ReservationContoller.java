package org.example.controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import java.util.List;

import org.example.Dao.ApprenantDao;
import org.example.Dao.ApprenantDaoImpl;
import org.example.Dao.ReservationDaoImpl;
import org.example.Dao.UserDaoImpl;
import org.example.model.Apprenant;
import org.example.model.Reservation;
import org.example.model.Roles;
import org.example.model.Users;
import org.example.service.ReservationService;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ReservationContoller {

	@Autowired
    private ReservationDaoImpl res;

    private ApprenantDao userDaoA = new ApprenantDaoImpl();
	
	@Autowired
    private ReservationService reservationService;

    @Autowired
	private UserService userService;

    @Autowired
    private UserDaoImpl userDao;
	
	@RequestMapping(value = "/home1", method = RequestMethod.GET )
	   public ModelAndView listReservation(ModelAndView theModel,HttpServletRequest req) throws IOException {

        String lastname = (String) req.getSession().getAttribute("prenom");
        if (lastname == null){
            theModel.setViewName("login");
            //System.out.println(req.getSession().getAttribute("prenom"));

        }else {
            List<Reservation> listReservation = reservationService.getAllReservation();
            theModel.addObject("listReservation", listReservation);
            theModel.setViewName("home1");
        }
        return theModel;

	}

	@RequestMapping(value = "checking", method = RequestMethod.GET)
    public ModelAndView listUsers(ModelAndView theModel,HttpServletRequest req) throws IOException{

        String lastname = (String) req.getSession().getAttribute("prenom");
        if (lastname == null){
            theModel.setViewName("login");
            //System.out.println(req.getSession().getAttribute("prenom"));

        }else {
            List<Users> listUsers = null;
            try {
                listUsers = userService.findAll();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            System.out.println(listUsers);
            theModel.addObject("listUsers", listUsers);
            theModel.setViewName("checking");
        }
	    return theModel;

    }

	  @RequestMapping(value = "/reservform", method = RequestMethod.GET)
       public ModelAndView createReservation(ModelAndView theModel,HttpServletRequest req) {

	    String lastname = (String) req.getSession().getAttribute("prenom");
	    if (lastname == null){
	        theModel.setViewName("login");
            //System.out.println(req.getSession().getAttribute("prenom"));

        }else {
            Reservation reservation = new Reservation();
            theModel.addObject("reservation", reservation);
            theModel.setViewName("reservform");

        }return theModel;
       }
	   
	   @RequestMapping(value = "saveReservation", method = RequestMethod.POST)
       public ModelAndView saveReservation(@ModelAttribute Reservation reservation, @RequestParam("date") String date) {
           reservation.setDateReservation(Date.valueOf(date));
           System.out.println(Date.valueOf(date));
           System.out.println(reservation.getDateReservation());

           System.out.println(reservation.getDateReservation());
           reservation.setApprenant((Apprenant) LoginController.user);
		   reservationService.addReservation(reservation);
           return new ModelAndView("redirect:/historiquePersonne");

       }
        @RequestMapping(value = "deleteAppr",method = RequestMethod.POST)
	    public String deleteAppr(HttpServletRequest request){
	    Long id = Long.valueOf(request.getParameter("id"));
	    userDao.dropUser(id);
	    return "redirect:/checking";
	    }


       @RequestMapping(value = "deleteReservation", method = RequestMethod.POST)
       public String deleteReservation(HttpServletRequest request){
	        Long id = Long.valueOf(request.getParameter("id"));
            reservationService.deleteReservation(id);
	        return "redirect:/home1";
       }


    @RequestMapping(value = "AccpterReservation", method = RequestMethod.POST)
    public String accepterReservation(HttpServletRequest request){
        Long id = Long.valueOf(request.getParameter("id"));
        Reservation reservation =reservationService.getReservation(id);
        reservation.setConfirmation(true);
        reservationService.updateReservation(reservation);
        return "redirect:/home1";
    }



    @RequestMapping(value = "/historiquePersonne")
    public String historiquePersonne(ModelAndView theModel,Model model, HttpServletRequest req){
        String lastname = (String) req.getSession().getAttribute("prenom");
        if (lastname == null){
            theModel.setViewName("login");
            System.out.println(req.getSession().getAttribute("prenom"));
            return "redirect:/login";

        }else {
            List<Reservation> list = res.getResByUser(LoginController.user);
            model.addAttribute("listReservation", list);
        }
	    return "historiquePerso";
    }

    @RequestMapping(value ="/Register1", method = RequestMethod.POST)
    public String Register1(@ModelAttribute("users") Apprenant users, Model model,ModelAndView theModel,HttpServletRequest req) {
        //UserDao userDao = new UserDaoImpl();
        String lastname = (String) req.getSession().getAttribute("prenom");
        if (lastname == null){
            theModel.setViewName("login");
            System.out.println(req.getSession().getAttribute("prenom"));
            return "login";

        }else {
            Roles role = new Roles();
            role.setIdRole(2L);
            users.setRoles(role);
            users.setStatus(true);
            userDaoA.createApprenant(users);
            System.out.println("Account Created");
            model.addAttribute("msg", "New Student add successfully ");
            return "register1";
        }
    }
}
