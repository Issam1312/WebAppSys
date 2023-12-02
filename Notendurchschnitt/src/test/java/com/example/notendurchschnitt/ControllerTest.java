package com.example.notendurchschnitt;

import com.example.controller.NotendurchschnittController;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ControllerTest {

    @Autowired
    private NotendurchschnittController notendurchschnittController ;

    @Test
    void testController() {

        List<Integer> noten = new ArrayList<>(Arrays.asList(1, 5, 3, 1, 5));

        assertThat(notendurchschnittController.notendurchnittAusgeben(noten)).isEqualTo(3);


    }

}
