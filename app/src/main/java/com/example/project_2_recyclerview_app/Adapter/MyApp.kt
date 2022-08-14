package com.example.project_2_recyclerview_app.Adapter

    import android.content.Context
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import android.widget.ImageView
    import android.widget.TextView
    import androidx.recyclerview.widget.RecyclerView
    import com.example.project_2_recyclerview_app.R
    import com.example.project_2_recyclerview_app.model.App

     class MyApp (private val dataset: List<App>, private val context: Context) :
        RecyclerView.Adapter<MyApp.ViewHolder>() {

        class ViewHolder(private val view : View) : RecyclerView.ViewHolder(view){
            val textView : TextView = view.findViewById(R.id.i_title)
            val imageView : ImageView = view.findViewById(R.id.i_image)
        }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            // create a new view
            val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_layout, parent, false)

            return ViewHolder(adapterLayout)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            // save the position of them (which item i'm dealing with)
            val item = dataset[position]
            holder.textView.text = context.resources.getString(item.AppStringId)
            holder.imageView.setImageResource(item.AppImageId)
        }

         override fun getItemCount() = dataset.size
         }

