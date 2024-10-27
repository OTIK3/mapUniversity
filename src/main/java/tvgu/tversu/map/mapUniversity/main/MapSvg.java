package tvgu.tversu.map.mapUniversity.main;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "map_svg")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MapSvg {
    @Id
    private Integer id;
    private Integer numberRoom;
    private byte[] mapSvgBytes;
}
