package com.sama.supportino.model

class Ticket(
     val id: Int,
     val title: String,
     val description: String,
     val createDate: String,
     val customerId: Int,
     val customer: String,
     val operatorId: Int,
     val operator: String,
     val status: String
) {
}