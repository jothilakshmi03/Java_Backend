 // Simple Console-Based Java Library Management System

import java.util.*;
import java.time.*;

    class Book {
        int id;
        String title, author;
        int quantity;

        Book(int id, String title, String author, int quantity) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.quantity = quantity;
        }
    }

    class Member {
        int id;
        String name;
        List<Integer> borrowedBookIds = new ArrayList<>();

        Member(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public class LibraryManagementSystem {
        static Scanner sc = new Scanner(System.in);
        static Map<Integer, Book> books = new HashMap<>();
        static Map<Integer, Member> members = new HashMap<>();

        public static void main(String[] args) {
            int choice;
            do {
                System.out.println("\nLibrary Management System");
                System.out.println("1. Add Book\n2. Register Member\n3. Issue Book\n4. Return Book\n5. View All Books\n6. View Member Borrowed Books\n0. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1 -> addBook();
                    case 2 -> registerMember();
                    case 3 -> issueBook();
                    case 4 -> returnBook();
                    case 5 -> viewBooks();
                    case 6 -> viewMemberBooks();
                    case 0 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choice!");
                }
            } while (choice != 0);
        }

        static void addBook() {
            System.out.print("Book ID: ");
            int id = sc.nextInt(); sc.nextLine();
            System.out.print("Title: ");
            String title = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("Quantity: ");
            int qty = sc.nextInt();
            books.put(id, new Book(id, title, author, qty));
            System.out.println("Book added.");
        }

        static void registerMember() {
            System.out.print("Member ID: ");
            int id = sc.nextInt(); sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            members.put(id, new Member(id, name));
            System.out.println("Member registered.");
        }

        static void issueBook() {
            System.out.print("Enter Member ID: ");
            int mid = sc.nextInt();
            if (!members.containsKey(mid)) {
                System.out.println("Member not found.");
                return;
            }
            System.out.print("Enter Book ID: ");
            int bid = sc.nextInt();
            if (!books.containsKey(bid)) {
                System.out.println("Book not found.");
                return;
            }
            Book book = books.get(bid);
            if (book.quantity <= 0) {
                System.out.println("Book not available.");
                return;
            }
            book.quantity--;
            members.get(mid).borrowedBookIds.add(bid);
            System.out.println("Book issued.");
        }

        static void returnBook() {
            System.out.print("Enter Member ID: ");
            int mid = sc.nextInt();
            if (!members.containsKey(mid)) {
                System.out.println("Member not found.");
                return;
            }
            System.out.print("Enter Book ID to return: ");
            int bid = sc.nextInt();
            Member m = members.get(mid);
            if (!m.borrowedBookIds.contains(bid)) {
                System.out.println("Book not borrowed by member.");
                return;
            }
            m.borrowedBookIds.remove(Integer.valueOf(bid));
            books.get(bid).quantity++;
            System.out.println("Book returned.");
        }

        static void viewBooks() {
            System.out.println("\nAll Books:");
            for (Book b : books.values()) {
                System.out.println(b.id + ": " + b.title + " by " + b.author + " | Qty: " + b.quantity);
            }
        }

        static void viewMemberBooks() {
            System.out.print("Enter Member ID: ");
            int mid = sc.nextInt();
            if (!members.containsKey(mid)) {
                System.out.println("Member not found.");
                return;
            }
            Member m = members.get(mid);
            System.out.println("Books borrowed by " + m.name + ":");
            for (int bid : m.borrowedBookIds) {
                Book b = books.get(bid);
                System.out.println(b.id + ": " + b.title);
            }
        }
    }

