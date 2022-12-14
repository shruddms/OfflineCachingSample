package com.kyungeun.offlinecachingsample.data.repository

import com.kyungeun.offlinecachingsample.data.model.Product
import com.kyungeun.offlinecachingsample.util.Resource
import kotlinx.coroutines.flow.Flow

interface ProductRepository {

    fun getProducts(): Flow<Resource<List<Product>>>

    fun getProduct(id: Int): Flow<Resource<Product>>

    suspend fun deleteAllProducts(): Resource<Unit>
}