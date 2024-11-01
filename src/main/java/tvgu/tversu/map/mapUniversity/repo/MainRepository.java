package tvgu.tversu.map.mapUniversity.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tvgu.tversu.map.mapUniversity.model.MapSvg;

@Repository
public interface MainRepository extends CrudRepository<MapSvg, Integer> {
}
