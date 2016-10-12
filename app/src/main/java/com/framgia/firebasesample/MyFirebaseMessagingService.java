package com.framgia.firebasesample;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        // TODO(developer): Handle FCM messages here.
        // If the application is in the foreground handle both data and notification messages here.
        // Also if you intend on generating your own notifications as a result of a received FCM
        // message, here is where that should be initiated. See sendNotification method below.
        Map<String, String> data = remoteMessage.getData();
        Log.d("hung", "From: " + remoteMessage.getFrom());
        Log.d("hung", "Notification Message Body: " + remoteMessage.getNotification().getBody());
        Log.d("hung", "Notification Message Data: " + data.get("invoice_id"));
        Log.d("hung", "Notification Message Data: " + data.get("user_send_id"));
        Log.d("hung", "Notification Message Data: " + data.get("user_receive_id"));
    }
}
