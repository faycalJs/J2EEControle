package ma.xproce.controle122.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Computer {
    @Id
    @GeneratedValue
    Long id_Pc;
    String proce;
    String Ram;
    String hardDrive;
    double price;
    String macAddress;

}
