package tvgu.tversu.map.mapUniversity.main;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "map_svg")
@NoArgsConstructor
@Getter
@Setter
public class MapSvg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer numberRoom;
    private byte[] mapSvgBytes;

    @Override
    public String toString() {
        return "MapSvg{" +
                "numberRoom=" + numberRoom +
                ", id=" + id +
                '}';
    }
}
