package tvgu.tversu.map.mapUniversity.service;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tvgu.tversu.map.mapUniversity.main.MapSvg;
import tvgu.tversu.map.mapUniversity.repo.MainRepository;

import java.nio.file.Files;
import java.nio.file.Path;

@Service
@RequiredArgsConstructor
@Slf4j
public class MainService {

    private final MainRepository repository;

    public byte[] getSvgBytes(Integer numberRoom){
        return repository.findById(numberRoom).get().getMapSvgBytes();
    }

    @SneakyThrows
    public byte[] insertSvg(String path){
        var map = new MapSvg();
        map.setMapSvgBytes(Files.readAllBytes(Path.of(path)));
        map.setNumberRoom(666);
        log.info("Внесение svg в бд по такой сущности {}", map);
        return repository.save(map).getMapSvgBytes();
    }
}
