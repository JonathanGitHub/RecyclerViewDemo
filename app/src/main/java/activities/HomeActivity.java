package activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.example.jianyang.reclycerviewdemo.R;

import java.util.ArrayList;
import java.util.List;

import adapters.PersonAdapter;
import models.Person;


public class HomeActivity extends ActionBarActivity
{
	private RecyclerView mRecyclerView;
	private PersonAdapter mPersonAdapter;

	private List<Person> mPersonList = new ArrayList<>();

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view_demo);
		mRecyclerView.setHasFixedSize(true);

		RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
		mRecyclerView.setLayoutManager(layoutManager);

		//TODO Init Data
		initData();
		mPersonAdapter = new PersonAdapter(mPersonList);
		//mPersonAdapter
		mRecyclerView.setAdapter(mPersonAdapter);


	}

	private void initData() {
		for (int i = 0; i < 30; i++) {
			mPersonList.add(new Person("Jonathan" + i, i + ""));
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_home, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings)
		{
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
