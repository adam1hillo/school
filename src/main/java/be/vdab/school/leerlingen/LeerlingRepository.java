package be.vdab.school.leerlingen;

import java.util.List;

public interface LeerlingRepository {
    List<Leerling> findAll();
}
