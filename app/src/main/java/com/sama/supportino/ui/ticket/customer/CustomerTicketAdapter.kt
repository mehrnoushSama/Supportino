package com.sama.supportino.ui.ticket.customer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.sama.supportino.R
import com.sama.supportino.model.Ticket

class CustomerTicketAdapter(private val tickets: List<Ticket>) :
    RecyclerView.Adapter<CustomerTicketViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomerTicketViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.customer_ticket_item, parent, false)

        return CustomerTicketViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomerTicketViewHolder, position: Int) {
        val currentItem = tickets[position]

        holder.title.text = currentItem.title
        holder.description.text = currentItem.description
        holder.date.text = currentItem.createDate

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}

class CustomerTicketViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val title: AppCompatTextView = itemView.findViewById(R.id.title_txt)
    val description: AppCompatTextView = itemView.findViewById(R.id.description_txt)
    val date: AppCompatTextView = itemView.findViewById(R.id.date_txt)
    val status: AppCompatTextView = itemView.findViewById(R.id.status_ticket_txt)

}