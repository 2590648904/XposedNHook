
package cn.mrack.xposed.nhook.menu;

import android.graphics.Color;
import android.text.Html;

/**
 * Menu configuration
 */
public class Config {
    protected final int RADIO_BUTTON_COLOR = Color.parseColor("#FFFFFF");
    protected final int COLLAPSE_BG_COLOR = Color.parseColor("#222D38");
    protected final int NUMBER_TEXT_COLOR = Color.parseColor("#41c300");
    protected final int SEEKBAR_NUMBER_NEG_COLOR = Color.parseColor("#FF0000");
    protected final int SEEKBAR_NUMBER_POS_COLOR = Color.parseColor("#00FF00");
    protected final int SEEKBAR_PROGRESS_COLOR = Color.parseColor("#80CBC4");
    protected final int SEEKBAR_COLOR = Color.parseColor("#80CBC4");
    protected final int CHECKBOX_COLOR = Color.parseColor("#80CBC4");
    protected final String MENU_TITLE = Html.fromHtml("Moded By (your name)").toString();
    protected final String MENU_SUBTITLE = "https://site.com lorem ipsum dolor sit amet consectetur adipiscing elit";
    protected final int MENU_WIDTH = 290;
    protected final int MENU_HEIGHT = 210;
    protected final int MENU_BG_COLOR = Color.parseColor("#EE1C2A35");
    protected final int MENU_FEATURE_BG_COLOR = Color.parseColor("#DD141C22");
    protected final int TEXT_COLOR_PRIMARY = Color.parseColor("#82CAFD");
    protected final int TEXT_COLOR_SECONDARY = Color.parseColor("#FFFFFF");
    protected final float MENU_COLLAPSED_ALPHA = 0.9f;
    protected final int MENU_BUTTON_BG_COLOR = Color.parseColor("#1C262D");
    protected final int MENU_CATEGORY_BG_COLOR = Color.parseColor("#2F3D4C");
    protected final String MENU_HIDE_BUTTON_TEXT = Html.fromHtml("&#x25B3;").toString();
    protected final String MENU_CLOSE_BUTTON_TEXT = Html.fromHtml("&#x2715;").toString();
    protected final int BTN_ON_BG_COLOR = Color.parseColor("#1b5e20");
    protected final int BTN_OFF_BG_COLOR = Color.parseColor("#7f0000");
    protected final int MENU_LAUNCHER_ICON_SIZE = 48;
    protected final String MENU_LAUNCHER_ICON = "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";

}

