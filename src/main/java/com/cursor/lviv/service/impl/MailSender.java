package com.cursor.lviv.service.impl;

import com.cursor.lviv.service.Sender;
import org.springframework.stereotype.Service;

@Service("mail")
public class MailSender implements Sender {
    @Override
    public void send(String msg) {

    }
}
