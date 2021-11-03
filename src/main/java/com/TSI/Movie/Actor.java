package com.TSI.Movie;
import javax.persistence.*;
@Entity
@Table(name = "actor")
public class Actor {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    @Column(name = "actor_id")
    private int actorId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;


    public Actor(int actorId,String firstName,String lastName){
        this.actorId = actorId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Actor(){

    }
    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
