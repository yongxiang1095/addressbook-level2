package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.ArrayList;
import java.util.List;


/**
 * Lists all persons in the address book sorted by name to the user.
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Displays all persons in the address book as a list sorted alphabetically by name with index numbers.\n"
            + "Example: " + COMMAND_WORD;

    @Override
    public CommandResult execute() {
        List<ReadOnlyPerson> allPersonsSorted = addressBook.getAllPersons().sortedListView();
        return new CommandResult(getMessageForPersonListShownSummary(allPersonsSorted), allPersonsSorted);
    }
}
