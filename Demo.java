package com.psl.movie;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public ArrayList<Movie> createMovieList(Movie... a) {
		ArrayList<Movie> movies = new ArrayList<Movie>();
		for (Movie movie : a) {
			movies.add(movie);
		}
		return movies;
	}

	public void sortByLanguage(ArrayList<Movie> movieList) {
		Collections.sort(movieList); //Comparable uses compareTo Method 
	}

	public void sortByDirector(ArrayList<Movie> movieList) {
		Collections.sort(movieList, new Movie()); // Comparator uses compare Method
	}
	
	public void sortByDuration(ArrayList<Movie> movieList) {
		Collections.sort(movieList, new CompareByDuration());
	}

	public void SortByLanguageAndReleaseDate(ArrayList<Movie> movieList) {
		Collections.sort(movieList, new CompareByLanguageAndReleaseDate());
	}

	
	public static void main(String[] args) {

		Demo d = new Demo();

		Movie m1 = new Movie("Ajnabi", "Hindi", "7/11/2016", "Nikhil", "Patil", "2.5 hrs");
		Movie m2 = new Movie("ABCD", "English", "4/5/2015", "Ritesh", "KumarTheProduer", "1.45 hrs");
		Movie m3 = new Movie("Dammu", "Telugu", "3/7/2099", "Chinmay", "Hegde", "3 hrs");
		Movie m4 = new Movie("Dammu", "Telugu", "4/7/2099", "Chinmay", "Hegde", "3 hrs");

		ArrayList<Movie> list = d.createMovieList(m1, m2, m3, m4);
		
		System.out.println("Original List:\n" + list);
		System.out.println("\n\nSorted By Language:\n");
		d.sortByLanguage(list);
		System.out.println(list);
		
		System.out.println("\n\nSorted By Director:\n");
		d.sortByDirector(list);
		System.out.println(list);
		
		System.out.println("\n\nSorted By Duration:\n");
		d.sortByDuration(list);
		System.out.println(list);
		
		System.out.println("\n\nSorted By Language and Release Date:\n");
		d.SortByLanguageAndReleaseDate(list);
		System.out.println(list);
	}
}
