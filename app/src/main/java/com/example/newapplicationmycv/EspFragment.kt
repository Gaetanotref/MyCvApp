package com.example.newapplicationmycv

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EspFragment : Fragment(R.layout.fragment_esperienze) {
    private lateinit var adapter: MyAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var expArrayList: ArrayList<Experience>

    private lateinit var title: Array<String>
    private lateinit var text_view: Array<String>
    private lateinit var data: Array<String>


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recycle_view)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = MyAdapter(expArrayList)
        recyclerView.adapter = adapter

    }

            private fun dataInitialize() {
                expArrayList = arrayListOf<Experience>()

                title = arrayOf(
                    getString(R.string.title1),
                    getString(R.string.title2),
                    getString(R.string.title3),
                    getString(R.string.title4),
                    getString(R.string.title5),
                    getString(R.string.title6),
                    getString(R.string.title7),
                    getString(R.string.title8)

                )
                text_view = arrayOf(
                    getString(R.string.subTitle1),
                    getString(R.string.subTitle2),
                    getString(R.string.subTitle3),
                    getString(R.string.subTitle4),
                    getString(R.string.subTitle5),
                    getString(R.string.subTitle6),
                    getString(R.string.subTitle7),
                    getString(R.string.subTitle8)

                )
                data = arrayOf(
                    getString(R.string.data1),
                    getString(R.string.data2),
                    getString(R.string.data3),
                    getString(R.string.data4),
                    getString(R.string.data5),
                    getString(R.string.data6),
                    getString(R.string.data7),
                    getString(R.string.data8)

                )
                for (i in title.indices) {
                    val experience = Experience(title[i], text_view[i], data[i])
                    expArrayList.add(experience)
                }
            }
        }