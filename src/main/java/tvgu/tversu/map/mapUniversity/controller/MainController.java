package tvgu.tversu.map.mapUniversity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tvgu.tversu.map.mapUniversity.service.MainService;

@RestController("/URL")
public class MainController {
    @Autowired
    private MainService service;

    @PostMapping
    public ResponseEntity<byte[]> getWayBySvg(@RequestBody Integer numberRoom){
        return new ResponseEntity<>(service.)
    }
}
