package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import com.example.service.NotendurchschnittServie;
import org.springframework.stereotype.Service;

import java.util.List;

@Controller
public class NotendurchschnittController {

    @Autowired
    public NotendurchschnittServie notendurchschnittServie;

    public double notendurchnittAusgeben(List<Integer> noten){

        notendurchschnittServie.setNoten(noten);

        return notendurchschnittServie.durchschnittBerechnen();







    }



}
