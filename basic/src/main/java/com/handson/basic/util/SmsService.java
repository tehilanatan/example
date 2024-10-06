package com.handson.basic.util;

import okhttp3.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.handson.basic.model.MessageAndPhones;

import java.net.MalformedURLException;
import java.net.URL;

@Service
public class SmsService {
    protected final Log logger = LogFactory.getLog(getClass());

    @Value("${sms.ms.url}")
    String SMS_MS_URL;
    @Autowired
    RestTemplate  rTemplate;

    public String send(MessageAndPhones messageAndPhones) {
        return rTemplate.postForObject(SMS_MS_URL + "/api/sms/", messageAndPhones, String.class);
    }


}