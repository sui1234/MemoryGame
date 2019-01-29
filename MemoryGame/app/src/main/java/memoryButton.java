import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.AppCompatDrawableManager;
import android.widget.Button;
import android.widget.GridLayout;

import com.example.sui.memorygame.R;

public class memoryButton extends Button {


    protected int row;
    protected int col;
    protected int ImageShowingId;
    protected boolean isFlipped = false;
    protected boolean isMatched = false;

    protected Drawable frontImage;
    protected Drawable backImage;



    public memoryButton(Context context, int r, int c, int ImageShowing) {
        super(context);

        row = r;
        col = c;
        ImageShowingId = ImageShowing;

        //frontImage = context.getDrawable(ImageShowing);
        //noinspection RestrictedApi
        frontImage = AppCompatDrawableManager.get().getDrawable(Context,ImageShowing);
        backImage = AppCompatDrawableManager.get().getDrawable(R.drawable.pinkbackcard);
        Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD_MR1;
        setBackground(backImage);


        GridLayout.LayoutParams tempParams = new GridLayout.LayoutParams(GridLayout.spec(r),GridLayout.spec(c));
        tempParams.width = (int)getResources().getDisplayMetrics().density*50;
        tempParams.width = (int)getResources().getDisplayMetrics().density*50;
        setLayoutParams(tempParams);

    }

    public boolean isMatched() {
        return isMatched;
    }

    public void setMatched(boolean matched) {
        isMatched = matched;
    }
}
