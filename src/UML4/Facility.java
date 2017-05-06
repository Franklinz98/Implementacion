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
public class Facility {
    private ArrayList<Visit> visits;
    private ServiceEpisode serviceepisode;

    public Facility(ServiceEpisode serviceepisode) {
        this.serviceepisode = serviceepisode;
        this.visits=new ArrayList<>();
    }
    
    public void addVisit(Visit visit){
        this.visits.add(visit);
    }
}
