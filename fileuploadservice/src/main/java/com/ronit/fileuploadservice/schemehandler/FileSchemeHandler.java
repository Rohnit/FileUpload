package com.ronit.fileuploadservice.schemehandler;

import android.content.Context;

import com.ronit.fileuploadservice.ContentType;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Handler for normal file paths, wraps java.io.File
 */
class FileSchemeHandler implements SchemeHandler {

    private String path;

    @Override
    public void init(String path) {
        this.path = path;
    }

    @Override
    public long getLength(Context context) {
        return new File(path).length();
    }

    @Override
    public InputStream getInputStream(Context context) throws FileNotFoundException {
        return new FileInputStream(new File(path));
    }

    @Override
    public String getContentType(Context context) {
        return ContentType.autoDetect(new File(path).getAbsolutePath());
    }

    @Override
    public String getName(Context context) {
        return new File(path).getName();
    }
}
