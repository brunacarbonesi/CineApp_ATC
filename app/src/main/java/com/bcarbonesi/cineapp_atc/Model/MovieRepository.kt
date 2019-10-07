import com.bcarbonesi.cineapp_atc.Model.TmdbApi
import com.bcarbonesi.cineapp_atc.Model.TmdbMovie
import com.bcarbonesi.cineapp_atc.Presenter.BaseRepository

class MovieRepository(private val api : TmdbApi) : BaseRepository() {

    suspend fun getPopularMovies() : MutableList<TmdbMovie>?{

        //safeApiCall is defined in BaseRepository.kt
        val movieResponse = safeApiCall(
            call = {api.getPopularMovie().await()},
            errorMessage = "Error Fetching Popular Movies"
        )

        return movieResponse?.results?.toMutableList();

    }

}