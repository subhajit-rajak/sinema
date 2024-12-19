package com.subhajitrajak.sinema.movieList.presentation

import com.subhajitrajak.sinema.movieList.domain.model.Movie

data class MovieListState(
    val isLoading: Boolean = false,
    val popularMovieListPage: Int = 1,
    val upcomingMovieListPage: Int = 1,
    val isCurrentPopularScreen: Boolean = true,
    val popularMovies: List<Movie> = emptyList(),
    val upcomingMovies: List<Movie> = emptyList()
)
