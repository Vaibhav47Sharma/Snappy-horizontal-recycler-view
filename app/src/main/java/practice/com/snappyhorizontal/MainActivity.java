package practice.com.snappyhorizontal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    SnappyRecyclerView recyclerView = (SnappyRecyclerView) findViewById(R.id.recycler_view);

  }
}
