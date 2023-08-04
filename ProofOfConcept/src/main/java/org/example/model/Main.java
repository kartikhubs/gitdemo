package org.example.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        Repo obj=new Repo ();

        obj.setNode_id ( "hhhh" );
        obj.setNode_name ( "james" );



    }
}