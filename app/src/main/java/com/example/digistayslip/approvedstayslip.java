package com.example.digistayslip;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class approvedstayslip extends Activity {

    LinearLayout mainLayout;

    int navy = Color.rgb(25, 65, 115);
    int blue = Color.rgb(90, 130, 175);
    int lightBlue = Color.rgb(235, 242, 250);
    int yellow = Color.rgb(255, 239, 180);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setStatusBarColor(navy);
        getWindow().setNavigationBarColor(navy);

        ScrollView scrollView = new ScrollView(this);
        scrollView.setBackgroundColor(lightBlue);

        mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setPadding(12, 12, 12, 12);

        scrollView.addView(mainLayout);

        // Portal Header
        TextView portal = text("STUDENT PORTAL", 10, navy);
        mainLayout.addView(portal);

        // Title
        TextView title = text("Approved Stay Slip", 23, navy);
        title.setTypeface(null, Typeface.BOLD);
        mainLayout.addView(title);

        TextView subtitle = text(
                "Your official campus stay authorization.", 11, blue);
        mainLayout.addView(subtitle);

        addDivider();

        // Approval Banner
        LinearLayout approval = new LinearLayout(this);
        approval.setGravity(Gravity.CENTER_VERTICAL);
        approval.setPadding(12, 12, 12, 12);
        approval.setBackground(background(
                Color.rgb(218, 238, 222),
                Color.rgb(120, 160, 125), 5));

        TextView check = text("✓", 27, Color.rgb(40, 120, 65));
        check.setGravity(Gravity.CENTER);
        check.setBackground(background(Color.WHITE,
                Color.LTGRAY, 2));

        approval.addView(check, new LinearLayout.LayoutParams(
                45, 45));

        LinearLayout approvalText = new LinearLayout(this);
        approvalText.setOrientation(LinearLayout.VERTICAL);
        approvalText.setPadding(12, 0, 0, 0);

        TextView approved = text("REQUEST APPROVED", 14,
                Color.rgb(35, 85, 50));
        approved.setTypeface(null, Typeface.BOLD);

        TextView ready = text(
                "Your stay slip is ready for verification.", 10,
                Color.DKGRAY);

        approvalText.addView(approved);
        approvalText.addView(ready);

        approval.addView(approvalText);

        mainLayout.addView(approval, params());

        // Main Stay Slip Card
        LinearLayout card = new LinearLayout(this);
        card.setOrientation(LinearLayout.VERTICAL);
        card.setPadding(12, 12, 12, 15);
        card.setBackground(background(Color.WHITE,
                Color.LTGRAY, 5));

        mainLayout.addView(card);

        // Card Header
        TextView heading = text("STUDENT STAY SLIP", 18, navy);
        heading.setGravity(Gravity.CENTER);
        heading.setTypeface(null, Typeface.BOLD);
        card.addView(heading);

        addCardDivider(card);

        TextView authorization = text(
                "CAMPUS AUTHORIZATION PASS", 10, blue);
        authorization.setGravity(Gravity.CENTER);
        card.addView(authorization);

        addCardDivider(card);

        // QR Code Placeholder
        TextView qr = text("▣", 65, blue);
        qr.setGravity(Gravity.CENTER);
        qr.setBackground(background(lightBlue,
                Color.LTGRAY, 3));

        LinearLayout.LayoutParams qrParams =
                new LinearLayout.LayoutParams(120, 120);
        qrParams.gravity = Gravity.CENTER;
        qrParams.setMargins(0, 12, 0, 5);

        card.addView(qr, qrParams);

        TextView scan = text(
                "SCAN TO VERIFY STAY SLIP", 10, navy);
        scan.setGravity(Gravity.CENTER);
        card.addView(scan);

        addCardDivider(card);

        // Student Information
        addField(card, "STUDENT NAME", "Juan Dela Cruz");
        addField(card, "GRADE & SECTION", "Grade 12 - ICT");

        // Date and Time
        LinearLayout dateTime = new LinearLayout(this);
        dateTime.setOrientation(LinearLayout.HORIZONTAL);

        LinearLayout.LayoutParams half =
                new LinearLayout.LayoutParams(0,
                        ViewGroup.LayoutParams.WRAP_CONTENT, 1);

        dateTime.addView(createInfo(
                "VALID DATE", "November 12, 2026"), half);

        dateTime.addView(createInfo(
                "ALLOWED TIME", "3:00 PM - 5:00 PM"), half);

        card.addView(dateTime);

        // Purpose
        addField(card, "PURPOSE OF STAY",
                "Completion of school project.");

        // Validity Badge
        TextView validity = text(
                "✓  VALID FOR APPROVED DATE", 11, navy);
        validity.setGravity(Gravity.CENTER);
        validity.setTypeface(null, Typeface.BOLD);
        validity.setPadding(15, 10, 15, 10);
        validity.setBackground(background(yellow,
                Color.rgb(210, 190, 120), 3));

        LinearLayout.LayoutParams validParams =
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);

        validParams.gravity = Gravity.CENTER;
        validParams.setMargins(0, 18, 0, 12);

        card.addView(validity, validParams);

        // Footer
        TextView footer = text(
                "STUDENT STAY SLIP | OFFICIAL CAMPUS DOCUMENT",
                9, navy);
        footer.setGravity(Gravity.CENTER);
        footer.setPadding(0, 15, 0, 5);

        mainLayout.addView(footer);

        setContentView(scrollView);
    }

    // TextView Creator
    private TextView text(String value, int size, int color) {
        TextView view = new TextView(this);
        view.setText(value);
        view.setTextSize(size);
        view.setTextColor(color);
        return view;
    }

    // Student Information Field
    private void addField(LinearLayout parent,
                          String label, String value) {

        LinearLayout field = new LinearLayout(this);
        field.setOrientation(LinearLayout.VERTICAL);
        field.setPadding(0, 8, 0, 5);

        TextView title = text(label, 10, navy);
        title.setTypeface(null, Typeface.BOLD);

        TextView content = text(value, 13, Color.DKGRAY);
        content.setPadding(5, 7, 5, 7);
        content.setBackground(background(
                Color.WHITE, Color.LTGRAY, 1));

        field.addView(title);
        field.addView(content);

        parent.addView(field);
    }

    // Date and Time Information
    private LinearLayout createInfo(String label, String value) {

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(4, 8, 4, 8);
        layout.setBackground(background(
                lightBlue, Color.LTGRAY, 1));

        TextView title = text(label, 10, navy);
        title.setTypeface(null, Typeface.BOLD);

        TextView content = text(value, 11, Color.DKGRAY);

        layout.addView(title);
        layout.addView(content);

        return layout;
    }

    // Divider
    private void addDivider() {
        ViewGroup.LayoutParams params =
                new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT, 1);

        android.view.View line = new android.view.View(this);
        line.setBackgroundColor(Color.LTGRAY);
        mainLayout.addView(line, params);
    }

    private void addCardDivider(LinearLayout parent) {
        android.view.View line = new android.view.View(this);
        line.setBackgroundColor(Color.LTGRAY);

        parent.addView(line, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 1));
    }

    // Background Design
    private GradientDrawable background(
            int color, int stroke, int radius) {

        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(color);
        drawable.setCornerRadius(radius);
        drawable.setStroke(1, stroke);

        return drawable;
    }

    private LinearLayout.LayoutParams params() {

        LinearLayout.LayoutParams p =
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        70);

        p.setMargins(0, 0, 0, 15);
        return p;
    }
}

