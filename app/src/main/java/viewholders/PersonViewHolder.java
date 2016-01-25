package viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.example.jianyang.reclycerviewdemo.R;

/**
 * Created by jianyang on 1/24/16.
 */
public class PersonViewHolder extends RecyclerView.ViewHolder implements OnClickListener
{

	public View     rootView;
	public TextView tvName;
	public TextView tvAge;
	public int position;

	public PersonViewHolder(View itemView)
	{
		super(itemView);
		rootView = itemView.findViewById(R.id.recycler_view_demo);
		tvName = (TextView)itemView.findViewById(R.id.recycler_view_test_item_person_name_tv);
		tvAge = (TextView)itemView.findViewById(R.id.recycler_view_test_item_person_age_tv);

	}


	@Override
	public void onClick(View view)
	{


	}


}
