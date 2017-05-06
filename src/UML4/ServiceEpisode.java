/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML4;

import java.util.ArrayList;

/**
 *
 * @author mybas
 */
public class ServiceEpisode {
    private ArrayList<Visit>visits;
    private ArrayList<Facility>facilities;
    private Patient patient;

    public ServiceEpisode(Patient patient) {
        this.patient = patient;
        this.visits=new ArrayList<>();
        this.facilities=new ArrayList<>();
    }
    
    public void addVisit(Visit visit){
        this.visits.add(visit);
    }
    
    public void addFacility(Facility facility){
        this.facilities.add(facility);
    }
}
