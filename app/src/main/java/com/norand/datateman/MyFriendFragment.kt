package com.norand.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friend.*

class MyFriendFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman = ArrayList()
        listTeman.add(MyFriend("Revani","revani@gmail.com","08983874873874"))
        listTeman.add(MyFriend("Zadah","zadah@gmail.com","048928492893"))
        listTeman.add(MyFriend("Pratiwi","pratiwi@gmail.com","08923827323"))
        listTeman.add(MyFriend("Revani Zadah","revanizadah@gmail.com","089897867756"))
        listTeman.add(MyFriend("Revani Zadah Pratiwi","revanizadahpratiwi@gmail.com","02398394378478"))
        listTeman.add(MyFriend("Revanii","revanii@gmail.com","08983874873874"))
        listTeman.add(MyFriend("Zadahh","zadahh@gmail.com","048928443492893"))
        listTeman.add(MyFriend("Pratiwii","pratiwii@gmail.com","0892382437323"))
        listTeman.add(MyFriend("Revani Zadahh","revanizadahh@gmail.com","089897867756"))
        listTeman.add(MyFriend("Revani Zadah Pratiwii","revanizadahpratiwii@gmail.com","02398394374348478"))
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    private fun tampilTeman() {
        rv_listMyFriend.layoutManager=LinearLayoutManager(activity)
        rv_listMyFriend.adapter=MyFriendAdapter(requireActivity(), listTeman)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friend,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}