package com.nivash.jokes.repository;

import com.nivash.jokes.bean.Jokes;
import org.springframework.data.repository.CrudRepository;

public interface JokesRepository extends CrudRepository<Jokes, String> {
}
