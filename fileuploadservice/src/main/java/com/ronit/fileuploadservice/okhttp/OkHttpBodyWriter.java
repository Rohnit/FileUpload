package com.ronit.fileuploadservice.okhttp;

import com.ronit.fileuploadservice.http.BodyWriter;

import java.io.IOException;

import okio.BufferedSink;

public class OkHttpBodyWriter extends BodyWriter {

    private BufferedSink mSink;

    protected OkHttpBodyWriter(BufferedSink sink) {
        mSink = sink;
    }

    @Override
    public void write(byte[] bytes) throws IOException {
        mSink.write(bytes);
    }

    @Override
    public void write(byte[] bytes, int lengthToWriteFromStart) throws IOException {
        mSink.write(bytes, 0, lengthToWriteFromStart);
    }

    @Override
    public void flush() throws IOException {
        mSink.flush();
    }
}
