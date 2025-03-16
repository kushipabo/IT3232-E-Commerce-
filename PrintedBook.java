class PrintedBook extends Book {
    public PrintedBook(String title, String author) {
        super(title, author);
    }

    @Override
    void displayDetails() {
        System.out.println("Printed Book: " + title + " by " + author);
    }
}
