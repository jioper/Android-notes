package com.example.a10449.notes;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;

import android.widget.EditText;
import android.widget.Toast;


import static com.example.a10449.notes.DatabaseHelper.TABLE_NAME;
import static com.example.a10449.notes.MainActivity.TAG_INSERT;
import static com.example.a10449.notes.MainActivity.TAG_UPDATE;
import static com.example.a10449.notes.MainActivity.dbHelper;
import static com.example.a10449.notes.MainActivity.getDbHelper;

public class Detail extends AppCompatActivity {


    private SQLiteDatabase db;
    EditText title;  //标题
    EditText content;  //内容
    public DatabaseHelper deHelper = getDbHelper();
    private int tag;
    private int id;


}