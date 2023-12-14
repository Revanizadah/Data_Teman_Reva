package com.norand.datateman

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.norand.datateman.databinding.MyFriendItemBinding
import kotlinx.android.extensions.LayoutContainer

class MyFriendAdapter (private val context: Context, private val items: ArrayList<MyFriend>):
RecyclerView.Adapter<MyFriendAdapter.ViewHolder>(){
//    class ViewHolder(override val containerView: View):
//    RecyclerView.ViewHolder(containerView), LayoutContainer{
//        fun bindItem(item: MyFriend) {
//            txt_friendName.text= item.nama
//            txt_FriendEmail.text= item.email
//            txt_friendTlp.text= item.telp
//        }
//    }

    class ViewHolder(private var binding: MyFriendItemBinding) :
        RecyclerView.ViewHolder(binding.root), LayoutContainer {

        override val containerView: View?
            get() = binding.root

        fun bindItem(item: MyFriend) {
            binding.txtFriendName.text = item.nama
            binding.txtFriendEmail.text = item.email
            binding.txtFriendTlp.text = item.telp
        }
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items.get(position))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = MyFriendItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }
}

