package ma.xproce.controle122.service;

import lombok.AllArgsConstructor;
import ma.xproce.controle122.dao.entities.Computer;
import ma.xproce.controle122.dao.repositories.ComputerRepository;
import ma.xproce.controle122.dto.ComputerDTO;
import ma.xproce.controle122.mapper.ComputerMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ComputerManager implements ComputerService {

    private ComputerRepository computerRepository;
    private ComputerMapper computerMapper;

    @Override
    public ComputerDTO saveComputer(ComputerDTO computerDTO) {
        Computer computer = computerMapper.fromComputerDtoToComputer(computerDTO);
        computer = computerRepository.save(computer);
        computerDTO = computerMapper.fromComputerToComputerDto(computer);
        return computerDTO;
    }

    @Override
    public List<ComputerDTO> getComputerByproce(String proce) {
        List<Computer> computers = computerRepository.findByProce(proce);
        List<ComputerDTO> computerDTOS = new ArrayList<>();
        for (Computer computer : computers) {
            computerDTOS.add(computerMapper.fromComputerToComputerDto(computer));
        }
        return computerDTOS;
    }

    @Override
    public List<ComputerDTO> saveComputers(List<ComputerDTO> computerDTOS) {
        List<Computer> computers = new ArrayList<>();
        for (ComputerDTO computerdto : computerDTOS) {
            computers.add(computerMapper.fromComputerDtoToComputer(computerdto));
        }

        computers = computerRepository.saveAll(computers);

        computerDTOS = new ArrayList<>();
        for (Computer computer : computers) {
            computerDTOS.add(computerMapper.fromComputerToComputerDto(computer));
        }
        return computerDTOS;
    }
}
