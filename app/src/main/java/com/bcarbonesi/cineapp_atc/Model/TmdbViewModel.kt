import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bcarbonesi.cineapp_atc.Model.ApiFactory
import com.bcarbonesi.cineapp_atc.Model.TmdbMovie
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class TmdbViewModel : ViewModel() {

    private val parentJob = Job()

    private val coroutineContext: CoroutineContext
        get() = parentJob + Dispatchers.Default

    private val scope = CoroutineScope(coroutineContext)

    private val repository: MovieRepository = MovieRepository(ApiFactory.tmdbApi)


    val popularMoviesLiveData = MutableLiveData<MutableList<TmdbMovie>>()

    fun fetchMovies() {
        scope.launch {
            val popularMovies = repository.getPopularMovies()
            popularMoviesLiveData.postValue(popularMovies)
        }
    }


    fun cancelAllRequests() = coroutineContext.cancel()

}