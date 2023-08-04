package org.example.model;

import javax.persistence.*;




@Entity
@Table(name="repotable")
public class Repo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="node_id")
    private String node_id;
    @Column(name = "node_name")
    private String node_name;

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public String getNode_name() {
        return node_name;
    }

    public void setNode_name(String node_name) {
        this.node_name = node_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Repo(Integer id,String node_id , String node_name) {
        this.id=id;
        this.node_id = node_id;
        this.node_name = node_name;
    }

    public Repo() {
    }
}
