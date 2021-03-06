package com.wyn88.resend.utils;

import android.widget.TextView;
import androidx.annotation.DrawableRes;


/**
 * 重新获取验证码，相关状态封装
 * Created by zxj on 2018/11/29.
 */
public class ResendHelper {

    private TextView textView;

    public ResendHelper(TextView textView) {
        this.textView = textView;
    }

    public void setText(String text) {
        this.textView.setText(text);
    }


    /**
     * 倒计时完成，重新获取验证码（验证码倒计时）
     *
     * @param
     */

    public void resend() {
        textView.setClickable(true);
    }

    public void resend(int textColor) {
        textView.setClickable(true);
        if (textColor != 0) {
            textView.setTextColor(textColor);
        }
    }


    public void resend(int textColor, @DrawableRes int textRes) {
        textView.setClickable(true);
        if (textRes != 0) {
            textView.setBackgroundResource(textRes);
        }
        if (textColor != 0) {
            textView.setTextColor(textColor);
        }
    }


    /**
     * 倒计时过程更新状态
     *
     * @param
     */

    public void resendUpdate() {
        textView.setClickable(false);
    }


    public void resendUpdate(int textColor) {
        textView.setClickable(false);

        if (textColor != 0) {
            textView.setTextColor(textColor);
        }
    }

    public void resendUpdate(int textColor, @DrawableRes int textRes) {
        textView.setClickable(false);
        if (textRes != 0) {
            textView.setBackgroundResource(textRes);
        }
        if (textColor != 0) {
            textView.setTextColor(textColor);
        }
    }


    /**
     * 不可点击状态
     *
     * @param
     */
    public void enable() {
        textView.setClickable(false);
    }


    public void enable(int textColor) {
        textView.setClickable(false);
        if (textColor != 0) {
            textView.setTextColor(textColor);
        }
    }

    public void enable(int textColor, @DrawableRes int textRes) {
        textView.setClickable(false);
        if (textRes != 0) {
            textView.setBackgroundResource(textRes);
        }
        if (textColor != 0) {
            textView.setTextColor(textColor);
        }
    }


    /**
     * 可点击（获取验证码）
     *
     * @param
     */


    public void getCode() {
        textView.setClickable(true);
    }


    public void getCode(int textColor) {
        textView.setClickable(true);
        if (textColor != 0) {
            textView.setTextColor(textColor);
        }
    }


    public void getCode(int textColor, @DrawableRes int textRes) {
        textView.setClickable(true);
        if (textRes != 0) {
            textView.setBackgroundResource(textRes);
        }
        if (textColor != 0) {
            textView.setTextColor(textColor);
        }
    }

}
