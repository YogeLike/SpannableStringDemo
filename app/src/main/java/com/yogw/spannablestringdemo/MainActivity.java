package com.yogw.spannablestringdemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Color;
import android.graphics.EmbossMaskFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.DynamicDrawableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.IconMarginSpan;
import android.text.style.ImageSpan;
import android.text.style.MaskFilterSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/*
        ForegroundColorSpan : 文本颜色
        BackgroundColorSpan : 文本背景色
        StrikethroughSpan : 删除线
        UnderlineSpan : 下划线
        AbsoluteSizeSpan : 文本字体（绝对大小）
        RelativeSizeSpan : 相对大小（文本字体）
        ScaleXSpan : 基于x轴缩放
        TypefaceSpan : 文本字体
        StyleSpan : 字体样式：粗体、斜体等
        TextAppearanceSpan : 文本外貌（包括字体、大小、样式和颜色）--前面几种的集合
        SubscriptSpan : 下标（数学公式会用到）
        SuperscriptSpan : 上标（数学公式会用到）
        URLSpan : 文本超链接
        ClickableSpan : 点击事件
        ImageSpan : 图片
        IconMarginSpan,DrawableMarginSpan  : 带偏移图片
        MaskFilterSpan : 修饰效果，如模糊(BlurMaskFilter)浮雕

*/


public class MainActivity extends AppCompatActivity {


    private TextView tv_01;
    private TextView tv_02;
    private TextView tv_03;
    private TextView tv_04;
    private TextView tv_05;
    private TextView tv_06;
    private TextView tv_07;
    private TextView tv_08;
    private TextView tv_09;
    private TextView tv_10;
    private TextView tv_11;
    private TextView tv_12;
    private TextView tv_13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_01 = findViewById(R.id.tv_01);
        tv_02 = findViewById(R.id.tv_02);
        tv_03 = findViewById(R.id.tv_03);
        tv_04 = findViewById(R.id.tv_04);
        tv_05 = findViewById(R.id.tv_05);
        tv_06 = findViewById(R.id.tv_06);
        tv_07 = findViewById(R.id.tv_07);
        tv_08 = findViewById(R.id.tv_08);
        tv_09 = findViewById(R.id.tv_09);
        tv_10 = findViewById(R.id.tv_10);
        tv_11 = findViewById(R.id.tv_11);
        tv_12 = findViewById(R.id.tv_12);
        tv_13 = findViewById(R.id.tv_13);

        //文字颜色，背景颜色
        SpannableString spannableString01 = new SpannableString("文本颜色为紫色，背景色为蓝色");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#EE38FB"));
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(Color.parseColor("#40C3FF"));
        spannableString01.setSpan(foregroundColorSpan, 5, 7, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString01.setSpan(backgroundColorSpan, 12, 14, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_01.setText(spannableString01);


        //文本删除线，下划线
        SpannableString spannableString02 = new SpannableString("文本删除线，下划线");
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        UnderlineSpan underlineSpan = new UnderlineSpan();
        spannableString02.setSpan(strikethroughSpan, 2, 5, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString02.setSpan(underlineSpan, 6, 9, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_02.setText(spannableString02);


        //文本绝对大小，相对大小
        SpannableString spannableString03 = new SpannableString("文本绝对大小，相对大小");
        AbsoluteSizeSpan absoluteSizeSpan01 = new AbsoluteSizeSpan(14, true);
        AbsoluteSizeSpan absoluteSizeSpan02 = new AbsoluteSizeSpan(11, true);
        AbsoluteSizeSpan absoluteSizeSpan03 = new AbsoluteSizeSpan(6, true);
        RelativeSizeSpan relativeSizeSpan01 = new RelativeSizeSpan(1.2f);
        RelativeSizeSpan relativeSizeSpan02 = new RelativeSizeSpan(0.8f);
        RelativeSizeSpan relativeSizeSpan03 = new RelativeSizeSpan(1.0f);
        spannableString03.setSpan(absoluteSizeSpan01, 2, 3, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString03.setSpan(absoluteSizeSpan02, 3, 4, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString03.setSpan(absoluteSizeSpan03, 4, 6, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString03.setSpan(relativeSizeSpan01, 7, 8, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString03.setSpan(relativeSizeSpan02, 8, 9, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString03.setSpan(relativeSizeSpan03, 9, 10, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_03.setText(spannableString03);

        //X轴缩放
        SpannableString spannableString04 = new SpannableString("基于X轴缩放");
        ScaleXSpan scaleXSpan = new ScaleXSpan(2.4f);
        spannableString04.setSpan(scaleXSpan, 2, spannableString04.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_04.setText(spannableString04);

        //字体设置
        SpannableString spannableString05 = new SpannableString("字体：monospace，字体：serif，\n字体：sans-serif");
        TypefaceSpan typefaceSpan01 = new TypefaceSpan("monospace");
        TypefaceSpan typefaceSpan02 = new TypefaceSpan("serif");
        TypefaceSpan typefaceSpan03 = new TypefaceSpan("sans-serif");
        spannableString05.setSpan(typefaceSpan01, 3, 11, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString05.setSpan(typefaceSpan02, 16, 21, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString05.setSpan(typefaceSpan03, 26, spannableString05.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_05.setText(spannableString05);


        SpannableString spannableString06 = new SpannableString("粗体，斜体，粗斜体");
        StyleSpan styleSpan01 = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan02 = new StyleSpan(Typeface.ITALIC);
        StyleSpan styleSpan03 = new StyleSpan(Typeface.BOLD_ITALIC);
        spannableString06.setSpan(styleSpan01, 0, 2, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString06.setSpan(styleSpan02, 3, 5, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString06.setSpan(styleSpan03, 6, 9, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_06.setText(spannableString06);

        //上标，下标
        SpannableString spannableString07 = new SpannableString("上标：X2，下标: H2O");
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        spannableString07.setSpan(superscriptSpan, 4, 5, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString07.setSpan(subscriptSpan, 11, 12, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_07.setText(spannableString07);

        //文字链接
        SpannableString spannableString08 = new SpannableString("文字超链接:我的博客");
        URLSpan urlSpan = new URLSpan("http://blog.csdn.net/wyg1230");
        spannableString08.setSpan(urlSpan, 6, 10, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_08.setMovementMethod(LinkMovementMethod.getInstance());
        tv_08.setText(spannableString08);

        //可点击
        SpannableString spannableString09 = new SpannableString("点击事件：请点击这一部分");
        ClickableSpan clickableSpan = new MyClickableSpan();
        spannableString09.setSpan(clickableSpan, 5, 12, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_09.setMovementMethod(LinkMovementMethod.getInstance());
        tv_09.setText(spannableString09);

        //图片
        SpannableString spannableString10 = new SpannableString("ImageSpan..");
        ImageSpan imageSpan = new ImageSpan(this, R.drawable.pic);
        spannableString10.setSpan(imageSpan, 9, 11, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_10.setText(spannableString10);


        //偏移图片      IconMarginSpan,DrawableMarginSpan 这两个没啥区别，一个传Bitmap ，一个传Drawable
        SpannableString spannableString11 = new SpannableString("IconMarginSpan..");
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.pic);
        IconMarginSpan iconMarginSpan = new IconMarginSpan(bitmap, 100);
        spannableString11.setSpan(iconMarginSpan, 0, 2, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);//只能以0开始
        tv_11.setText(spannableString11);

        //可以指定对齐方式的图片
        SpannableString spannableString12 = new SpannableString("DynamicDrawableSpan..");
        DynamicDrawableSpan drawableSpan = new DynamicDrawableSpan(DynamicDrawableSpan.ALIGN_BASELINE) {
            @Override
            public Drawable getDrawable() {
                Drawable d = getResources().getDrawable(R.drawable.pic);
                d.setBounds(0, 0, 200, 150);
                return d;
            }
        };
        spannableString12.setSpan(drawableSpan, spannableString12.length() - 3, spannableString12.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_12.setText(spannableString12);


        //BlurMaskFilter： 模糊效果  EmbossMaskFilter： 浮雕效果
        SpannableString spannableString13 = new SpannableString("模糊效果，浮雕效果");
        MaskFilterSpan maskFilterSpan01 = new MaskFilterSpan(new BlurMaskFilter(5, BlurMaskFilter.Blur.OUTER));
        MaskFilterSpan maskFilterSpan02 = new MaskFilterSpan(new EmbossMaskFilter(new float[]{2, 3, 6}, 3.0f, 12, 16));
        spannableString13.setSpan(maskFilterSpan01, 0, 4, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString13.setSpan(maskFilterSpan02, 4, 9, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_13.setLayerType(View.LAYER_TYPE_SOFTWARE, null);//关闭硬件加速。浮雕效果才能有效
        tv_13.setText(spannableString13);


    }

    public class MyClickableSpan extends ClickableSpan {


        @Override
        public void updateDrawState(TextPaint ds) {
            super.updateDrawState(ds);
            ds.setColor(Color.GREEN);//设置字体颜色
            ds.setUnderlineText(false);//设置无下划线

        }

        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, "点击了Clickable", Toast.LENGTH_SHORT).show();

        }
    }


}
