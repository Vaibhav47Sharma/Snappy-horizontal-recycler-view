package practice.com.snappyhorizontal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by vaibhavsharma on 24/05/16.
 */
public class SnappyRecyclerView extends RecyclerView {
  public SnappyRecyclerView(Context context) {
    super(context);
  }

  public SnappyRecyclerView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public SnappyRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
  }
}
