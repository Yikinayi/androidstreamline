package yzx.util.streamline

import android.animation.Animator
import android.animation.ValueAnimator


fun Animator?.release() {
    this?.removeAllListeners()
    if (this is ValueAnimator)
        this.removeAllUpdateListeners()
    this?.cancel()
}