package org.example.controller;

import org.example.model.Repo;
import org.example.service.RepoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class RepoController {


    Logger logger = LoggerFactory.getLogger(RepoController.class);
    @Autowired
    private RepoService repoService;



    @QueryMapping("repos")
    public List < Repo > getRepoList(){
        return repoService.getAllRepos ();
    }

    {
        logger.info ( "HELLLO" );
    }


}
