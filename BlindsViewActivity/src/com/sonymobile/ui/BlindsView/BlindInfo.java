package com.sonymobile.ui.BlindsView;

import android.graphics.Rect;

/**
 * Dumb, stateless data holder describing a Blind, as used by BlindsView.
 */
public class BlindInfo {
        private final Rect mBounds;
        private float mRotationX, mRotationY , mRotationZ;
        
        public BlindInfo(int l, int t, int r, int b) {
                mBounds = new Rect(l, t, r, b);
        }
        public void setRotations(float xRotation, float yRotation, float zRotation) {
                mRotationX = xRotation;
                mRotationY = yRotation;
                mRotationZ = zRotation;
        }
        
        public int getHeight() {
                return mBounds .height();
        }
        public int getWidth() {
                return mBounds .width();
        }
        public int getLeft() {
                return mBounds .left ;
        }
        public int getRight() {
                return mBounds .right ;
        }
        public int getTop() {
                return mBounds .top ;
        }
        public int getBottom() {
                return mBounds .bottom ;
        }
        
        
         
        public float getRotationX() {
                return mRotationX ;
        }
         
        public float getRotationY() {
                return mRotationY ;
        }
         
        public float getRotationZ() {
                return mRotationZ ;
        }

}
