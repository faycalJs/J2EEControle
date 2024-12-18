package ma.xproce.controle122;

import lombok.Builder;
import ma.xproce.controle122.dto.ComputerDTO;
import ma.xproce.controle122.service.ComputerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Controle122Application {

    public static void main(String[] args) {
        SpringApplication.run(Controle122Application.class, args);
    }
    @Bean
    CommandLineRunner start(ComputerService computerService){
        return  args -> {
            List<ComputerDTO>computerDTOS =    List.of(
                    ComputerDTO.builder().proce("model1").Ram("red").hardDrive("sdf64w6e").price(12345.5).build(),
                    ComputerDTO.builder().proce("model2").Ram("ef6e+6").hardDrive("green").price(65489.3).build(),
                    ComputerDTO.builder().proce("model3").Ram("ef64we8").hardDrive("yellow").price(89789.2).build(),
                    ComputerDTO.builder().proce("model4").Ram("wrdqwqw").hardDrive("black").price(67489.2).build()
            );


            for (ComputerDTO computerDTO : computerDTOS)
            {
                computerService.saveComputer(computerDTO);
            }
        };
    }

}
