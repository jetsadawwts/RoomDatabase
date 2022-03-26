package com.jetsada.roomdatabase

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.jetsada.roomdatabase.model.User
import com.jetsada.roomdatabase.view.ListFragmentDirections
import kotlinx.android.synthetic.main.item_list.view.*

class ListAdapter: RecyclerView.Adapter<ListAdapter.ListViewHolder>() {


    private var userList = emptyList<User>()

    fun setDataList(user: List<User>){
        this.userList = user
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return  ListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false))
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val currentItem = userList[position]
        holder.bind(currentItem)

        holder.itemView.setOnClickListener {
            val action = ListFragmentDirections.actionListFragmentToUpdateFragment(currentItem)
            holder.itemView.findNavController().navigate(action)
        }


    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            fun bind(user: User) {
                with(itemView) {
                    id_txt.text = user.id.toString()
                    firstName_txt.text = user.fristname.toString()
                    lastName_txt.text = user.lastname.toString()
                    age_txt.text = user.age.toString()
                }
            }
    }



}