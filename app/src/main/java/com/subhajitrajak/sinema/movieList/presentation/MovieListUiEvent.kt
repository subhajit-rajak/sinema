package com.subhajitrajak.sinema.movieList.presentation

sealed interface MovieListUiEvent {
    data class Paginate(val category: String): MovieListUiEvent
    object Navigate: MovieListUiEvent
}