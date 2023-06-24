package com.example.servermanager.servermanager.resource;

import com.example.servermanager.servermanager.model.Response;
import com.example.servermanager.servermanager.service.implementation.ServerServiceImpl;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static java.time.LocalDateTime.now;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping(path = "/server")
@RequiredArgsConstructor
public class ServerResource {
   private final ServerServiceImpl serverService;

   @GetMapping(path = "/list")
   public ResponseEntity<Response> getServers() {
       return ResponseEntity.ok(
               Response.builder()
                       .timestamp(now())
                       .data(Map.of("servers", serverService.list(30)))
                       .message("Servers retrieved")
                       .status(OK)
                       .statusCode(OK.value())
                       .build()
       );
   }
}
