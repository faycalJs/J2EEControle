package ma.xproce.controle122.web;

import lombok.AllArgsConstructor;
import ma.xproce.controle122.dto.ComputerDTO;
import ma.xproce.controle122.service.ComputerService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class ComputerGraphQL {
    private ComputerService computerService;
    @MutationMapping
    public ComputerDTO saveComputer(@Argument ComputerDTO computer){
        return computerService.saveComputer(computer);
    }
    @QueryMapping
    public List<ComputerDTO> getComputerByProce(@Argument String proce){
        return computerService.getComputerByproce(proce);
    }

}
