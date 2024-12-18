package ma.xproce.controle122.service;

import ma.xproce.controle122.dto.ComputerDTO;

import java.util.List;

public interface ComputerService {
    public ComputerDTO saveComputer(ComputerDTO computerDTO);
    public List<ComputerDTO> getComputerByproce(String proce);
    public List<ComputerDTO> saveComputers(List<ComputerDTO> computerDTOS);
}
