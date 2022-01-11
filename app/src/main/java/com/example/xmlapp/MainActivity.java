package com.example.xmlapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.util.Xml;
import android.widget.Toast;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s = new String("<plop><blup attr=\"45\">Coucou !</blup></plop>");
        InputStream f = new ByteArrayInputStream(s.getBytes());
        XmlPullParser parser = Xml.newPullParser();
        try
        {

            parser.setInput(f, null);
            parser.next();
            parser.next();
            parser.next();
            Log.i("my",parser.getText());
            //Toast.makeText(this, parser.getText(), Toast.LENGTH_LONG).show();

        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }





}