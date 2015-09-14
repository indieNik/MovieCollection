package com.psl.movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Movie implements Comparable<Movie>, Comparator<Movie> {
	String name, language, releaseDate, director, producer, duration;

	public Movie() {
		// TODO Auto-generated constructor stub
	}
	
	public Movie(String name, String language, String releaseDate,
			String director, String producer, String duration) {
		this.name = name;
		this.language = language;
		this.releaseDate = releaseDate;
		this.director = director;
		this.producer = producer;
		this.duration = duration;
	}

	
	@Override
	public String toString() {
		return "\n" + name + ", " + language
				+ ", " + releaseDate + ", " + director
				+ ", " + producer + ", " + duration;
	}

	@Override
	public int compareTo(Movie obj) {
		return this.language.compareToIgnoreCase(obj.language);
	}

	@Override
	public int compare(Movie m1, Movie m2) {
		return m1.director.compareToIgnoreCase(m2.director);
	}
}
