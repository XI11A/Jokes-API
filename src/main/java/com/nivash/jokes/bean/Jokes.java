package com.nivash.jokes.bean;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Jokes")
public class Jokes {

    @Id
    private int id;
    private String setup;
    private String punchline;

    public Jokes() {
    }

    public Jokes(int id, String setup, String punchline) {
        this.id = id;
        this.setup = setup;
        this.punchline = punchline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }
}
