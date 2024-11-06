package seedu.address.model.person.role.referee;

import java.util.List;
import java.util.stream.Collectors;

import seedu.address.model.person.role.Faculty;
import seedu.address.model.person.role.Role;
import seedu.address.model.person.role.athlete.Sport;
import seedu.address.model.person.role.athlete.SportString;

/**
 * Represents a {@code Referee} in the address book.
 * Holds the {@link Faculty} and {@link Sport}s that the {@code Referee} is associated with.
 */
public class Referee extends Role {
    private final Faculty faculty;
    private final List<Sport> sports;

    /**
     * Creates a {@code Referee} object with the given {@link Faculty} and {@link Sport}.
     *
     * @param faculty  {@code Referee}'s home {@link Faculty}.
     * @param sports   {@code Referee}'s participating {@link Sport}s in a {@link List}.
     */
    public Referee(Faculty faculty, List<Sport> sports) {
        super("Athlete - " + faculty + " - " + sports.stream().map(SportString::getSportString)
                .collect(Collectors.joining(", ")));
        this.faculty = faculty;
        this.sports = sports;
    }
}
