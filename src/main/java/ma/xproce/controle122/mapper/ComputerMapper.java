package ma.xproce.controle122.mapper;

import ma.xproce.controle122.dao.entities.Computer;
import ma.xproce.controle122.dto.ComputerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Computer fromComputerDtoToComputer(ComputerDTO computerDTO){
        return mapper.map(computerDTO, Computer.class);
    }
    public ComputerDTO fromComputerToComputerDto(Computer computer){
        return mapper.map(computer, ComputerDTO.class);
    }


}
