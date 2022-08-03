package com.nivash.jokes.service;

import com.nivash.jokes.bean.Jokes;
import com.nivash.jokes.repository.JokesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public Jokes getOneJoke(String id) {
        return jokesRepo.findById(id).get();
    }

    public Optional<Jokes> randomJoke() {
        List<Jokes> jokes = new ArrayList<>();
        return jokesRepo.findById(String.valueOf((int)Math.floor(Math.random()*500)));
    }
}
