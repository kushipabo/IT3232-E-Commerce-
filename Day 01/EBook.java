class EBook extends Book {
    public EBook(String title, String author) {
        super(title, author);
    }

    @Override
    void displayDetails() {
        System.out.println("E-Book: " + title + " by " + author);
    }
}