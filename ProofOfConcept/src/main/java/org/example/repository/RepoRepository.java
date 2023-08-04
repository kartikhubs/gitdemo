package org.example.repository;

import org.example.model.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RepoRepository extends JpaRepository< Repo,Integer> {




}
