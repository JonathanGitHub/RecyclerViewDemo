package adapters;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.jianyang.reclycerviewdemo.R;

import java.util.List;

import models.Person;
import viewholders.PersonViewHolder;

/**
 * Created by jianyang on 1/24/16.
 */
public class PersonAdapter extends RecyclerView.Adapter
{
	private List<Person> mPersonList;

	public PersonAdapter(List<Person> personList)
	{
		mPersonList = personList;
	}

	@Override
	public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
	{

		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_test_item_person, null);
		LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
	    view.setLayoutParams(lp);

		return new PersonViewHolder(view);
	}

	@Override
	public void onBindViewHolder(ViewHolder holder, int i)
	{

		PersonViewHolder viewHolder = (PersonViewHolder)holder;
//		viewHolder.position = i;
		viewHolder.tvAge.setText(mPersonList.get(i).getAge());
		viewHolder.tvName.setText(mPersonList.get(i).getName() + "岁");


	}

	@Override
	public int getItemCount()
	{
		return mPersonList.size();
	}
}
