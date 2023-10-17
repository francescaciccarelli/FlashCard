package it.univaq.flash_card;

import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

public class Utils {

    public static void setHtmlTextView(TextView tv, String html) {
        Spanned htmlAsSpanned = Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY);
        tv.setText(htmlAsSpanned);
    }

}
