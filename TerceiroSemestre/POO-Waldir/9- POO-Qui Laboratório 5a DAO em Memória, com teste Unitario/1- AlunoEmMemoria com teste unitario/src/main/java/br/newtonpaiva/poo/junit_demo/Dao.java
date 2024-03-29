package br.newtonpaiva.poo.junit_demo;

import java.util.List;

public interface Dao<T> {
    
    Aluno get(long id);
    
    List<T> getAll();
    
    void save(T t);
    
    void update(T t);
    
    void delete(T t);
}


