package br.gov.ce.tce.demo.docker.controller;

import br.gov.ce.tce.demo.docker.dto.response.HelloResponseDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping(path = "/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public HelloResponseDTO greeting() {
        HelloResponseDTO resp = new HelloResponseDTO();
        resp.setMessage("Hello there");

        return resp;
    }
}
