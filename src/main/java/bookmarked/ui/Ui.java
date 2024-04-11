package bookmarked.ui;

public class Ui {
    static final String LINE_BREAK = "_____________________________________________\n"
            + "_____________________________________________";

    static final String SMALLER_LINE_BREAK = "_____________________________________________\n";


    public static void greetings() {
        System.out.println(LINE_BREAK);
        System.out.println("\nWelcome to BookMarked, a one-stop app for all your librarian needs!");
        System.out.println("To get started, you can type 'help' to see a list of commands!\n");
        System.out.println(LINE_BREAK + "\n");
    }

    public static void setLineBreak() {
        System.out.println("\n" + LINE_BREAK + "\n");
    }

    public static void setSmallerLineBreak() {
        System.out.println("\n" + SMALLER_LINE_BREAK);
    }
    
    public static void printHelpMessage() {
        System.out.println("These are the current available features and the format that you need");
        System.out.println("to follow to use it in using this software:");
        System.out.println("1. To add books");
        System.out.println("   add NAME_OF_BOOK (optional)/quantity NUMBER_OF_COPIES");
        System.out.println("2. To delete current existing book");
        System.out.println("   delete NUMBER_ACCORDING_TO_LIST");
        System.out.println("3. To mark book as borrowed");
        System.out.println("   borrow NAME_OF_BOOK by USER_NAME");
        System.out.println("4. To extend the due date of a borrowed book by a week:");
        System.out.println("   extend NAME_OF_BOOK");
        System.out.println("5. To unmark book as returned");
        System.out.println("   return NAME_OF_BOOK");
        System.out.println("6. To list all the books added");
        System.out.println("   list /sortby default");
        System.out.println("7. To list all the books added in alphabetical order");
        System.out.println("   list /sortby alphabetical");
        System.out.println("8. To list all the borrowed books by return date");
        System.out.println("   list /sortby returndate");
        System.out.println("9. To list all the users and their borrowed books");
        System.out.println("   list /sortby user");
        System.out.println("10. To edit the details of the existing book");
        System.out.println("   edit NUMBER_ACCORDING_TO_LIST /WHAT_TO_EDIT DESCRIPTION");
        System.out.println("   example: edit 1 /title book");
        System.out.println("11.To find a specific user and their borrowed books:");
        System.out.println("   finduser USERNAME");

    }

    public static void printUnknownCommand() {
        System.out.println("Unknown command; please type help to see what commands you can use.");
    }

    public static void printEmptyListMessage() {
        System.out.println("The list is empty, try adding a book first.");
    }

    public static void printEmptyArgumentsMessage() {
        System.out.println("Please type in the correct arguments.");
    }

    public static void printOutOfBoundsMessage() {
        System.out.println("Please enter a book index that exists on the current list.");
    }

    public static void printBookNotFoundExceptionMessage() {
        System.out.println("Book not found.");
    }

    public static void printBookNotBorrowedExceptionMessage() {
        System.out.println("Book not borrowed.");
    }

    public static void printNotNumberMessage() {
        System.out.println("Please enter the number index of the book.");
    }

    public static void printIncorrectInputFormat() {
        System.out.println("Please enter in the format as mentioned in help.");
    }

    public static void printNoEditChangeException() {
        System.out.println("Please specify what to edit using '/'.");
    }

    public static void printEditedBookConfirmation(int bookNumberToEdit) {
        System.out.println("Edited Book: " + bookNumberToEdit);
    }

    public static void printWrongInputFormat() {
        System.out.println("Please input command in the correct format.");
    }

    public static void printWrongQuantityFormat() {
        System.out.println("Please ensure that you input the proper arguments: \n" +
                "a whole number after '/quantity'.");
    }

    public static void printBlankAddQuantity() {
        System.out.println("Please input how many books you want to add after '/quantity'.");
    }

    public static void printNegativeAddQuantityMessage() {
        System.out.println("You must add at least 1 copy of a book. Please input a number greater than 0.");
    }

    public static void printMaxDeleteNumberMessage() {
        System.out.println("You can only hold and delete up to 1000 copies of a book in total.\n" +
                "Please delete fewer copies instead.");
    }

    public static void printNegativeDeleteQuantityMessage() {
        System.out.println("You must delete at least 1 copy of a book. Please input a number greater than 0.");
    }

    public static void printBlankDeleteQuantity() {
        System.out.println("Please input how many books you want to delete after '/quantity'.");
    }

    public static void printMaxNumberMessage() {
        System.out.println("You can only hold up to 1000 copies of a book in total.\n" +
                "Please add fewer copies instead.");
    }
    public static void printDeletingTooManyBooksMessage(int numberInInventory, int quantityToDelete, String bookTitle) {
        System.out.println("You tried to delete " + quantityToDelete + " copies of " + bookTitle + ".\n"
                + "However, there are currently only " + numberInInventory + " copies in the inventory.");
    }
    public static void printEmptyUserListMessage() {
        System.out.println("The user list is empty, please add a user through the borrow function first");
    }

    public static void printDeleteFewerBooksMessage() {
        System.out.println("Please delete fewer copies instead.");
    }

    public static void printDeleteStatement(int quantity, String bookTitle, int numberInventory, int numberTotal) {
        System.out.println("Deleted " + quantity + " copies of " + bookTitle + "!");
        System.out.println("There are now " + numberInventory + " copies in the library's inventory, and "
                + numberTotal + " copies in total.");
    }


    public static void exitProgramme() {
        System.out.println("Bye!");
    }
}
