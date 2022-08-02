package com.nivash.jokes.controller;

import com.nivash.jokes.bean.Jokes;
import com.nivash.jokes.exception.JokesNotFoundException;
import com.nivash.jokes.service.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JokesController {

    @Autowired
    public JokesService jokesService;

    @RequestMapping("/jokes")
    public List<Jokes> getAllJokes(){
        return jokesService.getAllJokes();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/jokes")
    public void addJoke(@RequestBody Jokes joke){
        jokesService.addJoke(joke);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/jokes/{id}")
    public void updateJoke(@PathVariable String id, @RequestBody Jokes joke){
        jokesService.updateJoke(id , joke);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/jokes/{id}")
    public void deleteJoke(@PathVariable String id){
        jokesService.deleteJoke(id);
    }
//    @GetMapping("/jokes/{id}")
//    public Jokes getOneJoke(@PathVariable int id){
//        Jokes joke = jokesService.(id);
//        System.out.println(joke);
//        return jokeMethod(joke,id);
//    }

}
