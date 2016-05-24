package practice.com.snappyhorizontal;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by vaibhavsharma on 24/05/16.
 * Give a horizontal spacing for elements.
 */
public class HorizontalRecyclerDecoration extends RecyclerView.ItemDecoration {
  private int horizontalSpace;
  private Context context;

  public HorizontalRecyclerDecoration(Context context) {
    this.context = context;
    horizontalSpace = (int) context.getResources().getDimension(R.dimen.horizontal_offset);
  }

  @Override
  public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
    //To prevent last item to get horizontal space.
    if (parent.getChildAdapterPosition(view) != (parent.getAdapter().getItemCount() - 1)) {
      outRect.right = horizontalSpace;
    }
  }
}
