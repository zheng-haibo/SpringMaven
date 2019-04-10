package cn.serviceImpl;

import cn.service.IMessageService;

public class MessageServiceImpl implements IMessageService {

    @Override
    public String out() {
        return "haibo";
    }
}
