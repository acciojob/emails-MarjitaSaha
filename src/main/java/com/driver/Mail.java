package com.driver;

import java.util.Date;

public class Mail {
    Date date;
    String senderId;
    String message;
    Mail(Date date, String senderId,String message)
    {
        this.date=date;
        this.senderId=senderId;
        this.message=message;
    }
}
