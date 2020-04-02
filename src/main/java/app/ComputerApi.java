package app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@EnableWebMvc
public class ComputerApi {

    private List<Computer> computers;


    public ComputerApi() {

        Computer computer1 = new Computer("DDR1", 1000, 10);
        Computer computer2 = new Computer("DDR2", 2000, 20);
        computers = new ArrayList<>();
        computers.add(computer1);
        computers.add(computer2);
    }

    @PostMapping("/api/computers")
    public void addComputer(@RequestBody Computer computer) {
        computers.add(computer);
    }

    @GetMapping("/api/computers")
    public List<Computer> getComputer() {
        return computers;
    }

}
