package za.ac.cput.repository.venue;

import za.ac.cput.domain.Venue;
import java.util.Set;

public interface IVenueRepository {

    Venue create(Venue venue);

    Venue read(String venueId);

    Venue update(Venue venue);

    boolean delete(String venueId);

    Set<Venue> getAll();
}
