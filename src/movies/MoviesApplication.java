package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    public static Movie[] addMovie(Movie[] movieArray, Movie newMovie) {
        movieArray = Arrays.copyOf(movieArray, movieArray.length + 1);
        movieArray[movieArray.length - 1] = newMovie;
        return movieArray;
    }

    public static void main(String[] args) {
        Input input = new Input();
        Movie[] movies = MoviesArray.findAll();
        int option;

        System.out.println("\nJAVA MOVIE DATABASE:\n");

        do {
//
            System.out.println("*----------------------------------------------------*");
            System.out.printf("|%-26s %25s|","","");
            System.out.printf("\n|\t%-44s %4s|"," What would you like to do?","");
            System.out.printf("\n|%-26s %25s|","","");
            System.out.printf("\n|\t%-44s %4s|"," 1 - view all movies","");
            System.out.printf("\n|\t%-44s %4s|"," 2 - view movies in the animated category","");
            System.out.printf("\n|\t%-44s %4s|"," 3 - view movies in the drama category","");
            System.out.printf("\n|\t%-44s %4s|"," 4 - view movies in the horror category","");
            System.out.printf("\n|\t%-44s %4s|"," 5 - view movies in the scifi category","");
            System.out.printf("\n|\t%-44s %4s|"," 6 - view movies in the comedy category","");
            System.out.printf("\n|\t%-44s %4s|"," 7 - view movies in the musicals category","");
            System.out.printf("\n|\t%-44s %4s|"," 8 - add a new movie","");
            System.out.printf("\n|\t%-44s %4s|"," 0 - exit","");
            System.out.printf("\n|%-26s %25s|","","");
            System.out.println("\n*----------------------------------------------------*\n");
            option = input.getInt(0, 8, "Enter your choice: ");

//            System.out.printf("\n|\t0 - exit%-50s|\n","");

            switch (option) {
                case 0:
                    break;
                case 1:
                    System.out.println();
                    for (Movie movie : movies) {
                        System.out.println(movie.getName() + " - " + movie.getCategory());
                    }
                    break;
                case 2:
                    System.out.println("\nAnimated movies:\n*----------------------------------------------------*");
                    for (Movie movie : movies) {
                        if (movie.getCategory().equalsIgnoreCase("animated")) {
                            System.out.println("\t" + movie.getName());
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nDramas:\n*----------------------------------------------------*");
                    for (Movie movie : movies) {
                        if (movie.getCategory().equalsIgnoreCase("drama")) {
                            System.out.println("\t" + movie.getName());
                        }
                    }
                    break;
                case 4:
                    System.out.println("\nHorrors:\n*----------------------------------------------------*");
                    for (Movie movie : movies) {
                        if (movie.getCategory().equalsIgnoreCase("horror")) {
                            System.out.println("\t" + movie.getName());
                        }
                    }
                    break;
                case 5:
                    System.out.println("\nSciFis:\n*----------------------------------------------------*");
                    for (Movie movie : movies) {
                        if (movie.getCategory().equalsIgnoreCase("scifi")) {
                            System.out.println("\t" + movie.getName());
                        }
                    }
                    break;
                case 6:
                    System.out.println("\nComedies:\n*----------------------------------------------------*");
                    for (Movie movie : movies) {
                        if (movie.getCategory().equalsIgnoreCase("comedy")) {
                            System.out.println("\t" + movie.getName());
                        }
                    }
                    break;
                case 7:
                    System.out.println("\nMusicals:\n*----------------------------------------------------*");
                    for (Movie movie : movies) {
                        if (movie.getCategory().equalsIgnoreCase("musical")) {
                            System.out.println("\t" + movie.getName());
                        }
                    }
                    break;
                case 8:
                    System.out.println("\nAdd a new movie:\n*----------------------------------------------------*\n");
                    String title = input.getString("Title: ");
                    String category = input.getString("Category\n(animated/drama/horror/scifi/comedy/musical): ").toLowerCase();
                    Movie add = new Movie(title, category);
                    movies = addMovie(movies,add);
                    System.out.println("\n" +title + " - added to database.");
                    break;
            }
            System.out.println();
        } while (option != 0);
    }
}
