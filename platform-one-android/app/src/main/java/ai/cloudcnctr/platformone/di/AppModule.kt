package ai.cloudcnctr.platformone.di

import ai.cloudcnctr.platformone.common.Constants
import ai.cloudcnctr.platformone.data.remote.dto.CryptoEndpointApi
import ai.cloudcnctr.platformone.data.repository.CryptoRepository
import ai.cloudcnctr.platformone.data.repository.CryptoRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by Das on 2022-07-11.
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun providesCryptoEndpointApi(): CryptoEndpointApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CryptoEndpointApi::class.java)
    }

    @Provides
    @Singleton
    fun providesCryptoRepository(api: CryptoEndpointApi): CryptoRepository {
        return CryptoRepositoryImpl(api)
    }

}