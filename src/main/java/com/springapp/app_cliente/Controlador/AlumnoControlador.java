package com.springapp.app_cliente.Controlador;

import com.springapp.app_cliente.Entidad.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class AlumnoControlador {

    @Autowired
    private RestTemplate restTemplate;


    //NO ENTENDER
    @GetMapping("/alumnos")
    public String listarAlumnos(Model model){
        List<Alumno> alumnos = restTemplate.getForObject("http://localhost:8080/api/alumnos", List.class);
        model.addAttribute("alumnos", alumnos);
        return "/Alumnos/alumno";
    }
}
