
package com.jsp.MovieProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.MovieProject.entity.Movie;
import com.jsp.MovieProject.repo.movieRepo;

@Controller
public class MovieController {

    @Autowired
    private movieRepo repo;

    @GetMapping("/")
    public String homePage() {

        return "home";
    }

    @GetMapping("/register")
    public String registerPage() {

        return "register";
    }

    @PostMapping("/save")
    public String saveMovie(@ModelAttribute Movie movie) {

        repo.save(movie);

        return "redirect:/dis";
    }
 

    @GetMapping("/dis")
    public ModelAndView displayAllData(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            ModelAndView mav) {

        PageRequest pageable =
                PageRequest.of(page, size, Sort.by("movieName").ascending());

        org.springframework.data.domain.Page<Movie> pages =
                repo.findAll(pageable);

        mav.addObject("list", pages.getContent());

        mav.addObject("currentPage", page);

        mav.addObject("totalPages", pages.getTotalPages());

        mav.setViewName("display");

        return mav;
    }

    @GetMapping("/search")
    public ModelAndView searchMovie(@RequestParam String keyword,
                                    ModelAndView mav) {

        List<Movie> list =
                repo.findByMovieNameContainingIgnoreCase(keyword);

        mav.addObject("list", list);

        mav.setViewName("display");

        return mav;
    }

    @GetMapping("/delete/{id}")
    public String deleteMovie(@PathVariable int id) {

        repo.deleteById(id);

        return "redirect:/dis";
    }


    @GetMapping("/edit/{id}")
    public ModelAndView editMovie(@PathVariable int id,
                                  ModelAndView mav) {

        Movie movie = repo.findById(id).get();

        mav.addObject("movie", movie);

        mav.setViewName("update");

        return mav;
    }

    @PostMapping("/updateMovie")
    public String updateMovie(@ModelAttribute Movie movie) {

        repo.save(movie);

        return "redirect:/dis";
    }
    @GetMapping("/pagination")
    public String pagination(@RequestParam  int id,Model model) {
    	System.out.println("id: "+id);
    	PageRequest pagerequest = PageRequest.of(id, 4);
    	Page<Movie> page =repo.findAll(pagerequest);
    	List<Movie> list = page.getContent();
    	model.addAttribute("movie",list);
    	return "pagination";
    	
    }

}

