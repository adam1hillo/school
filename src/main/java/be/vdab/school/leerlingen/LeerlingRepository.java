package be.vdab.school.leerlingen;

import org.springframework.stereotype.Component;

@Component
public class LeerlingRepository {
    public LeerlingRepository() {
        System.out.println("LeerlingRepository constructor");
    }
}
