package be.vdab.school.leerlingen;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Component
@Qualifier("CSV")
public class CsvLeerlingRepository implements LeerlingRepository {

    @Override
    public List<Leerling> findAll() {
        try (var stream = Files.lines(Path.of("/data/leerlingen.csv"))) {
            return stream
                    .map(regel -> regel.split(","))
                    .map(regelOnderdelen ->
                            new Leerling(Long.parseLong(regelOnderdelen[0]), regelOnderdelen[1], regelOnderdelen[2]))
                    .toList();
        } catch (IOException | ArrayIndexOutOfBoundsException | NumberFormatException ex) {
            throw new IllegalArgumentException("Leerlingenbestand bevat verkeerde data", ex);
        }
    }
}
