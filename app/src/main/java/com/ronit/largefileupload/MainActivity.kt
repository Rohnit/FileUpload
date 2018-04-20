package com.ronit.largefileupload

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.ronit.fileupload.R
import com.ronit.fileuploadservice.MultipartUploadRequest

import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    companion object {
        var MAX_RETRIES: Int = 3
        var FIXED_LENGTH_STREAMING_MODE: Boolean = false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()*/
            uploadFile()
        }


    }

    private fun uploadFile(){
        /*val serverUrl = "http://172.16.16.153/csginmatfte-web/api/web/index.php/visitor/visitor/send-file"
        val uploadId : String = UUID.randomUUID().toString()
        val request = MultipartUploadRequest(this, uploadId, serverUrl)
                .setMethod("POST")
                .setUtf8Charset()
                //.setNotificationConfig(getNotificationConfig(uploadId, R.string.multipart_upload))
                .setMaxRetries(MAX_RETRIES)
                //.setCustomUserAgent(getUserAgent())
                .setUsesFixedLengthStreamingMode(FIXED_LENGTH_STREAMING_MODE)

        request.addHeader("X-appVersion","1.0")
        request.addHeader("X-localization","US")
        request.addHeader("X-device","Motorola Moto E (4) Plus")
        request.addHeader("X-platform","android")
        request.addHeader("X-OSVersion","25")
        request.addHeader("visitorid","236")
        request.addHeader("token","bQJw-afIlxaCS8h0cnP0T8jkIOhbNvQl")

        request.addParameter("inmate_id","301")
        request.addParameter("file_type","image")

        request.addFileToUpload("file","/storage/emulated/0/Pictures/msg-1-fc-40.jpg")

        request.startUpload()*/


    }

}
