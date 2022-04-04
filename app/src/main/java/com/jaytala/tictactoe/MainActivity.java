package com.jaytala.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView i1, i2, i3, i4, i5, i6, i7, i8, i9;

    List<Integer> circle = new ArrayList<>();
    List<Integer> cross = new ArrayList<>();

    int r1, r2, r3, r4, r5, r6, r7, r8, r9;
    Button reset;
    int ope = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        r1 = r2 = r3 = r4 = r5 = r6 = r7 = r8 = r9 = 0;

        i1 = findViewById(R.id.i1);
        i2 = findViewById(R.id.i2);
        i3 = findViewById(R.id.i3);
        i4 = findViewById(R.id.i4);
        i5 = findViewById(R.id.i5);
        i6 = findViewById(R.id.i6);
        i7 = findViewById(R.id.i7);
        i8 = findViewById(R.id.i8);
        i9 = findViewById(R.id.i9);

        reset = findViewById(R.id.reset);


        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r1 == 0) {
                    if (ope % 2 == 0) {
                        circle.add(1);
                        i1.setImageResource(R.drawable.circle);
                        opecircle();

                    } else {
                        cross.add(1);
                        i1.setImageResource(R.drawable.cross);
                        checkcross();
                    }
                    ope++;
                }
                r1++;
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r2 == 0) {
                    if (ope % 2 == 0) {
                        circle.add(2);
                        i2.setImageResource(R.drawable.circle);
                        opecircle();
                    } else {
                        cross.add(2);
                        i2.setImageResource(R.drawable.cross);
                        checkcross();
                    }
                    ope++;
                }
                r2++;
            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r3 == 0) {
                    if (ope % 2 == 0) {
                        circle.add(3);
                        i3.setImageResource(R.drawable.circle);
                        opecircle();
                    } else {
                        cross.add(3);
                        i3.setImageResource(R.drawable.cross);
                        checkcross();
                    }
                    ope++;
                }
                r3++;
            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r4 == 0) {
                    if (ope % 2 == 0) {
                        circle.add(4);
                        i4.setImageResource(R.drawable.circle);
                        opecircle();
                    } else {
                        cross.add(4);
                        i4.setImageResource(R.drawable.cross);
                        checkcross();
                    }
                    ope++;
                }
                r4++;
            }
        });

        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r5 == 0) {
                    if (ope % 2 == 0) {
                        circle.add(5);
                        i5.setImageResource(R.drawable.circle);
                        opecircle();
                    } else {
                        cross.add(5);
                        i5.setImageResource(R.drawable.cross);
                        checkcross();
                    }
                    ope++;
                }
                r5++;
            }
        });

        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r6 == 0) {
                    if (ope % 2 == 0) {
                        circle.add(6);
                        i6.setImageResource(R.drawable.circle);
                        opecircle();
                    } else {
                        cross.add(6);
                        i6.setImageResource(R.drawable.cross);
                        checkcross();
                    }
                    ope++;
                }
                r6++;
            }
        });

        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r7 == 0) {
                    if (ope % 2 == 0) {
                        circle.add(7);
                        i7.setImageResource(R.drawable.circle);
                        opecircle();
                    } else {
                        cross.add(7);
                        i7.setImageResource(R.drawable.cross);
                        checkcross();
                    }
                    ope++;
                }
                r7++;
            }
        });

        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r8 == 0) {
                    if (ope % 2 == 0) {
                        circle.add(8);
                        i8.setImageResource(R.drawable.circle);
                        opecircle();
                    } else {
                        cross.add(8);
                        i8.setImageResource(R.drawable.cross);
                        checkcross();
                    }
                    ope++;
                }
                r8++;
            }
        });

        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r9 == 0) {
                    if (ope % 2 == 0) {
                        circle.add(9);
                        i9.setImageResource(R.drawable.circle);
                        opecircle();
                    } else {
                        cross.add(9);
                        i9.setImageResource(R.drawable.cross);
                        checkcross();
                    }
                    ope++;
                }
                r9++;
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                circle.clear();
                cross.clear();

                r1 = r2 = r3 = r4 = r5 = r6 = r7 = r8 = r9 = 0;
                i1.setImageResource(0);
                i2.setImageResource(0);
                i3.setImageResource(0);
                i4.setImageResource(0);
                i5.setImageResource(0);
                i6.setImageResource(0);
                i7.setImageResource(0);
                i8.setImageResource(0);
                i9.setImageResource(0);

            }


        });
    }

    private void opecircle() {
        for (int i = 0; i < circle.size(); i++) {
            for (int j = 0; j < circle.size(); j++) {
                for (int k = 0; k < circle.size(); k++) {

                    if (circle.get(i) == 1 && circle.get(j) == 2 && circle.get(k) == 3) {

                        wincircle();
                    }
                    if (circle.get(i) == 4 && circle.get(j) == 5 && circle.get(k) == 6) {

                        wincircle();
                    }
                    if (circle.get(i) == 7 && circle.get(j) == 8 && circle.get(k) == 9) {

                        wincircle();
                    }
                    if (circle.get(i) == 1 && circle.get(j) == 4 && circle.get(k) == 7) {

                        wincircle();
                    }
                    if (circle.get(i) == 2 && circle.get(j) == 5 && circle.get(k) == 8) {

                        wincircle();
                    }
                    if (circle.get(i) == 3 && circle.get(j) == 6 && circle.get(k) == 9) {

                        wincircle();
                    }
                    if (circle.get(i) == 1 && circle.get(j) == 5 && circle.get(k) == 9) {

                        wincircle();
                    }
                    if (circle.get(i) == 3 && circle.get(j) == 5 && circle.get(k) == 7) {

                        wincircle();
                    }
                }
            }
        }
    }

    private void checkcross() {
        for (int i = 0; i < cross.size(); i++) {
            for (int j = 0; j < cross.size(); j++) {
                for (int k = 0; k < cross.size(); k++) {

                    if (cross.get(i) == 1 && cross.get(j) == 2 && cross.get(k) == 3) {

                        wincircle();
                    }
                    if (cross.get(i) == 4 && cross.get(j) == 5 && cross.get(k) == 6) {

                        wincircle();
                    }
                    if (cross.get(i) == 7 && cross.get(j) == 8 && cross.get(k) == 9) {

                        wincircle();
                    }
                    if (cross.get(i) == 1 && cross.get(j) == 4 && cross.get(k) == 7) {

                        wincircle();
                    }
                    if (cross.get(i) == 2 && cross.get(j) == 5 && cross.get(k) == 8) {

                        wincircle();
                    }
                    if (cross.get(i) == 3 && cross.get(j) == 6 && cross.get(k) == 9) {

                        wincircle();
                    }
                    if (cross.get(i) == 1 && cross.get(j) == 5 && cross.get(k) == 9) {

                        wincircle();
                    }
                    if (cross.get(i) == 3 && cross.get(j) == 5 && cross.get(k) == 7) {

                        wincircle();
                    }
                }
            }
        }
    }


    void wincircle() {
        Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
    }
}








