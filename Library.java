class Library {
    public static void main(String[] args) {
        Book book1 = new PrintedBook("Java Basics", "John Doe");
        Book book2 = new EBook("Python Guide", "Jane Smith");
        Book book3 = new AudioBook("C++ Mastery", "Alice Brown");

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}
