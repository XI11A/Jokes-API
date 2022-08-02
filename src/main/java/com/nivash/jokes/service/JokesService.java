package com.nivash.jokes.service;

import com.nivash.jokes.bean.Jokes;
import com.nivash.jokes.repository.JokesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JokesService {
    @Autowired
    public JokesRepository jokesRepo;

    public List<Jokes> getAllJokes(){
        List<Jokes> jokes =new ArrayList<>();
        jokesRepo.findAll().forEach(jokes::add);
        return jokes;
    }

    public void addJoke(Jokes jokes){
        jokesRepo.save(jokes);
    }

    public void updateJoke(String id,Jokes joke){
        jokesRepo.save(joke);
    }
    public void deleteJoke(String id){
        jokesRepo.deleteById(id);
    }

//    public Jokes getOneJoke(){
//        List<Jokes> jokes = new ArrayList<>();
//        jokesRepo.
//        for (Jokes joke:jokesRepo){
//            if (joke.getId()==id){
//                return joke;
//            }
//        }
//        return null;
//    }
}
