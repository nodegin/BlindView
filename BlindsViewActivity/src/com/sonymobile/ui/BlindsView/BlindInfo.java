package com.sonymobile.ui.BlindsView;

import android.graphics.Rect;

/**
 * Dumb, stateless data holder describing a Blind, as used by BlindsView.
 */
public class BlindInfo {
        private final Rect mBounds;
        private float mRotationX, mRotationY , mRotationZ;
        private float mScale = 1f;
        private boolean affected = false;
        private float yOffset = 0;
        
        /**
		 * @return the offset
		 */
		public float getYOffset() {
			return yOffset;
		}
		/**
		 * @param offset the offset to set
		 */
		public void setYOffset(float offset) {
			this.yOffset = offset;
		}
		/**
		 * @return the affected
		 */
		public boolean isAffected() {
			return affected;
		}
		/**
		 * @param affected the affected to set
		 */
		public void setAffected(boolean affected) {
			this.affected = affected;
		}
		public BlindInfo(int l, int t, int r, int b) {
                mBounds = new Rect(l, t, r, b);
        }
        public void setRotations(float xRotation, float yRotation, float zRotation) {
                mRotationX = xRotation;
                mRotationY = yRotation;
                mRotationZ = zRotation;
        }
        
        public void setScale(float s) {
                mScale = s;
        }
         
        public float getScale() {
                return mScale ;
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
