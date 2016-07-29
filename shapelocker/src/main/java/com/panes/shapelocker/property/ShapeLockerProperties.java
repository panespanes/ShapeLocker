package com.panes.shapelocker.property;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.panes.shapelocker.R;
import com.panes.shapelocker.exception.ShapeLockerException;
import com.panes.shapelocker.view.ShapeLocker;

/**
 * Created by panes on 2016/6
 */
public class ShapeLockerProperties {
    private static ShapeLockerProperties instance;
    private static Context mContext;



    private Bitmap mBitmapBtnDefault;
    private Bitmap mBitmapBtnTouched;
    private Bitmap mBitmapCircleDefault;
    private Bitmap mBitmapCircleGreen ;
    private Bitmap mBitmapCircleRed ;
    private Bitmap mBitmapArrowGreenUp ;
    private Bitmap mBitmapArrowRedUp;

    public static ShapeLockerProperties with(Context context){
        // always modify the CONTEXT field.
        if (context == null){
            throw new ShapeLockerException("context should not be null.");
        }
        mContext = context;
        if (instance == null){
            instance = new ShapeLockerProperties();
        }
        return instance;
    }

    public ShapeLockerProperties loadLightTheme(){
        mBitmapBtnDefault = parseBitmap(R.drawable.btn_code_lock_default_holo);
        ShapeLocker.mBitmapBtnDefault = mBitmapBtnDefault;
        mBitmapBtnTouched = parseBitmap(R.drawable.btn_code_lock_touched_holo);
        ShapeLocker.mBitmapBtnTouched = mBitmapBtnDefault;
        mBitmapCircleDefault = parseBitmap(R.drawable.indicator_code_lock_point_area_default_holo);
        ShapeLocker.mBitmapCircleDefault = mBitmapBtnDefault;
        mBitmapCircleGreen = parseBitmap(R.drawable.indicator_code_lock_point_area_green_holo);
        mBitmapCircleRed = parseBitmap(R.drawable.indicator_code_lock_point_area_red_holo);
        ShapeLocker.mBitmapCircleGreen = mBitmapCircleGreen;
        ShapeLocker.mBitmapCircleRed = mBitmapBtnDefault;
        mBitmapArrowGreenUp = parseBitmap(R.drawable.indicator_code_lock_drag_direction_green_up_holo);
        mBitmapArrowRedUp = parseBitmap(R.drawable.indicator_code_lock_drag_direction_red_up_holo);
        ShapeLocker.mBitmapArrowGreenUp = mBitmapBtnDefault;
        ShapeLocker.mBitmapArrowRedUp = mBitmapBtnDefault;
        return instance;
    }

    public ShapeLockerProperties loadDarkTheme(){
        mBitmapBtnDefault = parseBitmap(R.drawable.btn_code_lock_default_holo);
        ShapeLocker.mBitmapBtnDefault = mBitmapBtnDefault;
        mBitmapBtnTouched = parseBitmap(R.drawable.btn_code_lock_touched_holo);
        ShapeLocker.mBitmapBtnTouched = mBitmapBtnTouched;
        mBitmapCircleDefault = parseBitmap(R.drawable.indicator_code_lock_point_area_default_holo);
        ShapeLocker.mBitmapCircleDefault = mBitmapCircleDefault;
        mBitmapCircleGreen = parseBitmap(R.drawable.indicator_code_lock_point_area_green_holo);
        mBitmapCircleRed = parseBitmap(R.drawable.indicator_code_lock_point_area_red_holo);
        ShapeLocker.mBitmapCircleGreen = mBitmapCircleGreen;
        ShapeLocker.mBitmapCircleRed = mBitmapCircleRed;
        mBitmapArrowGreenUp = parseBitmap(R.drawable.indicator_code_lock_drag_direction_green_up_holo);
        mBitmapArrowRedUp = parseBitmap(R.drawable.indicator_code_lock_drag_direction_red_up_holo);
        ShapeLocker.mBitmapArrowGreenUp = mBitmapArrowGreenUp;
        ShapeLocker.mBitmapArrowRedUp = mBitmapArrowRedUp;
        return instance;
    }


    /**
     * parse form resId to bitmap
     * @param resId
     * @return
     */
    private final Bitmap parseBitmap(int resId){
        return BitmapFactory.decodeResource(mContext.getResources(), resId);
    }

    public Bitmap getmBitmapBtnDefault() {
        return mBitmapBtnDefault;
    }

    public void setmBitmapBtnDefault(Bitmap mBitmapBtnDefault) {
        this.mBitmapBtnDefault = mBitmapBtnDefault;
    }

    public Bitmap getmBitmapBtnTouched() {
        return mBitmapBtnTouched;
    }

    public void setmBitmapBtnTouched(Bitmap mBitmapBtnTouched) {
        this.mBitmapBtnTouched = mBitmapBtnTouched;
    }

    public Bitmap getmBitmapCircleDefault() {
        return mBitmapCircleDefault;
    }

    public void setmBitmapCircleDefault(Bitmap mBitmapCircleDefault) {
        this.mBitmapCircleDefault = mBitmapCircleDefault;
    }

    public Bitmap getmBitmapCircleGreen() {
        return mBitmapCircleGreen;
    }

    public void setmBitmapCircleGreen(Bitmap mBitmapCircleGreen) {
        this.mBitmapCircleGreen = mBitmapCircleGreen;
    }

    public Bitmap getmBitmapCircleRed() {
        return mBitmapCircleRed;
    }

    public void setmBitmapCircleRed(Bitmap mBitmapCircleRed) {
        this.mBitmapCircleRed = mBitmapCircleRed;
    }

    public Bitmap getmBitmapArrowGreenUp() {
        return mBitmapArrowGreenUp;
    }

    public void setmBitmapArrowGreenUp(Bitmap mBitmapArrowGreenUp) {
        this.mBitmapArrowGreenUp = mBitmapArrowGreenUp;
    }

    public Bitmap getmBitmapArrowRedUp() {
        return mBitmapArrowRedUp;
    }

    public void setmBitmapArrowRedUp(Bitmap mBitmapArrowRedUp) {
        this.mBitmapArrowRedUp = mBitmapArrowRedUp;
    }
}
