package com.cursor.lviv.service.impl;

import com.cursor.lviv.service.Sender;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("wa")
public class WASender implements Sender {
    @Override
    public void send(String msg) {

    }
}
