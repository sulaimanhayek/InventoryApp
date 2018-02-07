package com.example.lost.inventoryapp;

import android.os.Bundle;

import java.io.FileDescriptor;
import java.io.PrintWriter;

public class MainActivity extends android.support.v4.app.LoaderManager {

    @Override
    public <D> android.support.v4.content.Loader<D> initLoader(int id, Bundle args, LoaderCallbacks<D> callback) {
        return null;
    }

    @Override
    public <D> android.support.v4.content.Loader<D> restartLoader(int id, Bundle args, LoaderCallbacks<D> callback) {
        return null;
    }

    @Override
    public void destroyLoader(int id) {

    }

    @Override
    public <D> android.support.v4.content.Loader<D> getLoader(int id) {
        return null;
    }

    @Override
    public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {

    }

    public void clickOnSale(long id, int quantity) {
    }
}
