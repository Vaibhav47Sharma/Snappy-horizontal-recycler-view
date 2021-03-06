package practice.com.snappyhorizontal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    SnappyRecyclerView recyclerView = (SnappyRecyclerView) findViewById(R.id.recycler_view);
    List<String> itemList = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
      itemList.add("Hi there number " + (i+1));
    }

    SnappyRecyclerAdapter snappyRecyclerAdapter = new SnappyRecyclerAdapter(this, itemList);
    HorizontalySnappingLayoutManager linearLayoutManager = new HorizontalySnappingLayoutManager(this);
    recyclerView.setLayoutManager(linearLayoutManager);
    recyclerView.addItemDecoration(new HorizontalRecyclerDecoration(this));
    recyclerView.setAdapter(snappyRecyclerAdapter);
  }
}
