package be.vdab.school;

import be.vdab.school.leerlingen.LeerlingRepository;
import be.vdab.school.lessen.LesRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    private final LeerlingRepository leerlingRepository;
    private final LesRepository lesRepository;

    public MyRunner(@Qualifier("PROPERTIES") LeerlingRepository leerlingRepository, LesRepository lesRepository) {
        this.leerlingRepository = leerlingRepository;
        this.lesRepository = lesRepository;
    }

    @Override
    public void run(String... args) {
        try {
            leerlingRepository.findAll()
                    .forEach(leerling -> System.out.println(leerling.getVoornaam()));
            System.out.println();
            lesRepository.findAll()
                    .forEach(les -> System.out.println(les.getNaam()));
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace(System.err);
        }
    }
}
