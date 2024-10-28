package tvgu.tversu.map.mapUniversity.controller;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tvgu.tversu.map.mapUniversity.service.MainService;

import java.io.File;
import java.nio.file.Files;

@RestController()
@RequestMapping("/v1/map")
@RequiredArgsConstructor
@Slf4j
public class MainController {

    private final MainService service;

    @PostMapping("/get/{number}")
    public ResponseEntity<byte[]> getWayBySvg(@PathVariable("number") Integer numberRoom){
        log.info("Получение карты svg по {}", numberRoom);
        return new ResponseEntity<>(service.getSvgBytes(numberRoom), HttpStatus.OK);
    }

    @PutMapping("/insertSvg")
    public HttpStatus insertSvg(@RequestBody String path){
        log.info("Внесение svg по path = {}", path);
        return service.insertSvg(path) != null? HttpStatus.OK : HttpStatus.BAD_REQUEST;
    }
}
