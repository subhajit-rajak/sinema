package com.subhajitrajak.sinema.movieList.domain.repository

import com.subhajitrajak.sinema.movieList.domain.model.Movie
import com.subhajitrajak.sinema.movieList.util.Resource
import kotlinx.coroutines.flow.Flow

interface MovieListRepository {
    suspend fun getMovieList(
        forceFetchFromRemote: Boolean,
        category: String,
        page: Int
    ) : Flow<Resource<List<Movie>>>

    suspend fun getMovie(id: Int) : Flow<Resource<Movie>>
}