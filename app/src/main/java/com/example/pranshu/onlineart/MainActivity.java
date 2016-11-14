package com.example.pranshu.onlineart;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;

import com.example.pranshu.onlineart.R;
import com.example.pranshu.onlineart.adapters.ProductAdapter;
import com.example.pranshu.onlineart.model.ItemObjects;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

	private StaggeredGridLayoutManager gaggeredGridLayoutManager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_main_page_alt);

		RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
		recyclerView.setHasFixedSize(true);
		recyclerView.setNestedScrollingEnabled(false);

		gaggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager
				.VERTICAL);
		recyclerView.setLayoutManager(gaggeredGridLayoutManager);

		List<ItemObjects> gaggeredList = getListItemData();

		ProductAdapter rcAdapter = new ProductAdapter(MainActivity.this, gaggeredList);
		recyclerView.setAdapter(rcAdapter);
	}


	private List<ItemObjects> getListItemData() {
		List<ItemObjects> listViewItems = new ArrayList<ItemObjects>();
		listViewItems.add(new ItemObjects("Alkane", R.mipmap.ic_launcher));
		listViewItems.add(new ItemObjects("Ethane", R.drawable.com_facebook_button_icon));
		listViewItems.add(new ItemObjects("Alkyne", R.mipmap.ic_launcher));
		listViewItems.add(new ItemObjects("Benzene", R.drawable.com_facebook_button_icon));
		listViewItems.add(new ItemObjects("Amide", R.mipmap.ic_launcher));
		listViewItems.add(new ItemObjects("Amino Acid", R.drawable.com_facebook_button_icon));
		listViewItems.add(new ItemObjects("Phenol", R.drawable.com_facebook_button_icon));
		listViewItems.add(new ItemObjects("Carbonxylic", R.drawable.com_facebook_button_icon));
		listViewItems.add(new ItemObjects("Nitril", R.drawable.com_facebook_button_icon));
		listViewItems.add(new ItemObjects("Ether",R.mipmap.ic_launcher));
		listViewItems.add(new ItemObjects("Ester", R.drawable.com_facebook_button_icon));
		listViewItems.add(new ItemObjects("Alcohol", R.drawable.com_facebook_button_icon));

		return listViewItems;
	}
}