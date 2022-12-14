package ai.cloudcnctr.platformone.domain.use_case.get_crypto

import ai.cloudcnctr.platformone.common.Resource
import ai.cloudcnctr.platformone.data.remote.dto.toCryptoDetail
import ai.cloudcnctr.platformone.data.repository.CryptoRepository
import ai.cloudcnctr.platformone.domain.model.CryptoDetail
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

/**
 * Created by Das on 2022-07-11.
 */
class GetCryptoUseCase @Inject constructor(
    private val repository: CryptoRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CryptoDetail>> = flow {
        try {
            emit(Resource.Loading())
            val crypto = repository.getCryptoById(coinId).toCryptoDetail()
            emit(Resource.Success(crypto))

        } catch(e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch(e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check internet connection"))
        }
    }

}