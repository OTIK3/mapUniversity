package tvgu.tversu.map.mapUniversity.controller;

import jakarta.servlet.http.HttpServletResponse;
import jdk.jshell.Snippet;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tvgu.tversu.map.mapUniversity.service.MainService;

import java.io.File;
import java.nio.file.Files;

@RestController()
@RequestMapping("/v1/map")
public class MainController {
    @Autowired
    private MainService service;

    @PostMapping("/number")
    public ResponseEntity<byte[]> getWayBySvg(@RequestBody Integer numberRoom){
        return new ResponseEntity<>(service.getSvgBytes(numberRoom), HttpStatus.OK);
    }

    @GetMapping("/svg")
    @SneakyThrows
    public void getSvgImage(HttpServletResponse response){
        var imageUrl = "testPng" + ".svg";
        File file = new File("testPng.svg");
        response.setContentType("image/svg+xml");
        response.setHeader("Content-Disposition", "inline; filename=\"" + imageUrl);
        response.getOutputStream().write(Files.readAllBytes(file.toPath()));
    }
}
