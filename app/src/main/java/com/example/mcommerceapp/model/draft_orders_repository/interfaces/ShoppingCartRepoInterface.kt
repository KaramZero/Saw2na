package com.example.mcommerceapp.model.draft_orders_repository.interfaces

import draft_orders.DraftOrder

interface ShoppingCartRepoInterface {
    suspend fun updateOrder(orderID: String, order: DraftOrder): DraftOrder
    suspend fun getAllOrders(userID: String): ArrayList<DraftOrder>
    suspend fun deleteOrderByID(orderID: Long)
}