package com.bcarbonesi.cineapp_atc.Model

import android.graphics.Movie
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import kotlin.reflect.jvm.internal.impl.resolve.constants.DoubleValue

//Data Model for TMDB Movie Item
data class TmdbMovie (

    val id: Int,
    val vote_average: DoubleValue,
    val title: String,
    val overview: String,
    val adult: Boolean
)

//Data Model for the Response returned from the TMDB Api
data class TmdbMovieResponse (
    val results: List<TmdbMovie>
)

//A retrofit Network Interface for the Api
interface TmdbApi {
    @GET("movie/popular")
    fun getPopularMovie(): Deferred<Response<TmdbMovieResponse>>

    @GET("movie/{id")
    fun getMovieById(@Path("id") id:Int): Deferred<Response<Movie>>
}