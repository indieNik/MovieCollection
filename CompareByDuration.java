package com.psl.movie;

import java.util.Comparator;

public class CompareByDuration implements Comparator<Movie>{

	@Override
	public int compare(Movie m1, Movie m2) {
		
		return m1.duration.compareToIgnoreCase(m2.duration);
	}
}
