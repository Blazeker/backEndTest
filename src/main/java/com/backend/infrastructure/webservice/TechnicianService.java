package com.backend.infrastructure.webservice;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TechnicianService {

    @GetMapping
    public ResponseEntity getTechnicianService()
    {
        ResponseEntity responseEntity = new ResponseEntity();
        try {
            System.out.println(responseEntity);
        }
        catch (Exception ex)
        {
            if(responseEntity.getStatus().equals(400))
            {
                throw new IllegalArgumentException("Consulta con argumentos incorrectos", ex);
            }
            if (responseEntity.getStatus().equals(404))
            {
                throw new EntityNotFoundException("Id del servicio no encontrado", ex);
            }
        }

        return responseEntity;
    }
}
