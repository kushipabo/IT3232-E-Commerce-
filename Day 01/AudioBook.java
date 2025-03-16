class AudioBook extends Book {
    public AudioBook(String title, String author) {
        super(title, author);
    }

    @Override
    void displayDetails() {
        System.out.println("Audio Book: " + title + " by " + author);
    }
}
