package controllers;

import DAO.DataDictionary;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleDictionary {
    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @PostMapping("/result")
    public ModelAndView displayResult(@RequestParam String word ){
        ModelAndView modelAndView = null;
        if(DataDictionary.isAvailableInDictionary(word)){
            modelAndView = new ModelAndView("result");
            modelAndView.addObject("mean",DataDictionary.displayMeanOfWord(word));
            modelAndView.addObject("word",word);
        } else
        {
            modelAndView = new ModelAndView("not-found");
        }
        return modelAndView;
    }
}
