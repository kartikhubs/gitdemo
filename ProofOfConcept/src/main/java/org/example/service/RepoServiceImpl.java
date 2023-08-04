package org.example.service;

import org.example.controller.RepoController;
import org.example.model.Repo;
import org.example.repository.RepoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepoServiceImpl implements RepoService{
    Logger logger = LoggerFactory.getLogger( RepoServiceImpl.class);
    @Autowired
    private RepoRepository repoRepository;

    @Autowired
    public RepoServiceImpl(RepoRepository repoRepository){
        this.repoRepository=repoRepository;
    }
    @Override
    public List < Repo > getAllRepos() {
        logger.info ("HEEEE");
        return this.repoRepository.findAll ();
    }
}
