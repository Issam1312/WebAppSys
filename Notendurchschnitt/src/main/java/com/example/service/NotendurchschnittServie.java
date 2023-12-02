package com.example.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotendurchschnittServie {

    private List<Integer> noten;


    public List<Integer> getNoten() {

        return this.noten;
    }

    public void addNote(int note) {

        noten.add(note);

    }

    public void setNoten(List<Integer> noten) {

        this.noten = noten;

    }

    public double durchschnittBerechnen() {

        double notendurchschnitt;
        int summeNoten =0;

        for (int i = 0; i < noten.size(); i++){
            summeNoten = summeNoten + noten.get(i);
        }

        notendurchschnitt = (double) summeNoten /noten.size();

        return notendurchschnitt;
    }

}
