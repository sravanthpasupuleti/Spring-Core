package service;

import repository.Repository;
import repository.Repositoryimpl;

public class Serviceimpl implements Service{

    Repository repo;

    public Serviceimpl(String n){
        this.repo = new Repositoryimpl(n);
    }
}
