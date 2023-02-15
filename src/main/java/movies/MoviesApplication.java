
package movies;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Movie[] movies = MoviesArray.findAll();

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the scifi category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the action category");
            System.out.println("6 - add a new movie");

            int choice = input.nextInt();
            if (choice == 0) {
                System.out.println("Goodbye!");
                break;
            } else if (choice == 1) {
                for (Movie movie : movies) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
            } else if (choice >= 2 && choice <= 5) {
                String category = "";
                if (choice == 2) {
                    category = "scifi";
                } else if (choice == 3) {
                    category = "drama";
                } else if (choice == 4) {
                    category = "horror";
                } else if (choice == 5) {
                    category = "action";
                }

                for (Movie movie : movies) {
                    if (movie.getCategory().equals(category)) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
            } else if (choice == 6) {
                System.out.println("Enter the name of the movie:");
                String name = input.next();
                System.out.println("Enter the category of the movie:");
                String category = input.next();

                Movie newMovie = new Movie(name, category);

                Movie[] newMovies = new Movie[movies.length + 1];
                for (int i = 0; i < movies.length; i++) {
                    newMovies[i] = movies[i];
                }
                newMovies[movies.length] = newMovie;

                movies = newMovies;
                System.out.println("Movie added successfully!");
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

    }
}
