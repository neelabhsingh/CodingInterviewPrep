package com.codinginterviewprep.interviews.companies.infogain;

interface MessageType{
    public void readDB();
    public void sendNotification();
}

class MessageSystem{
    MessageType messageType;

    public MessageSystem(MessageType messageType){
        this.messageType = messageType;
    }
    public void readDB(){
        messageType.readDB();
    }
    public void sendNotification(){
        messageType.sendNotification();
    }
}

class OrderMessageType implements MessageType{


    @Override
    public void readDB() {
        System.out.println("Send Order Type of Message to Offer Topic in Message Queue");
    }

    @Override
    public void sendNotification() {
        System.out.println("Send Order Type Notification to Notification 'Topic' in Message queue");
    }
}

class PromotionMessageType implements MessageType{


    @Override
    public void readDB() {
        System.out.println("Send Promotion Type of Message to offerMessage Topic in Message Queue");
    }

    @Override
    public void sendNotification() {
        System.out.println("Send Promotion Type Notification to Notification 'Topic' in Message queue");
    }
}

class OfferMessageType implements MessageType{


    @Override
    public void readDB() {
        System.out.println("Send Offer Message to Offer Topic in Message Queue");
    }

    @Override
    public void sendNotification() {
        System.out.println("Send Offer Notification to Notification 'Topic' in Message queue");
    }
}
public class MessageSystemDemo {
    public static void main(String[] args) {
        MessageType orderMessage= new OrderMessageType();
        MessageType promotionMessage = new PromotionMessageType();
        MessageType offerMessage = new OfferMessageType();

        MessageSystem orderMessageSystem = new MessageSystem(orderMessage);
        orderMessageSystem.readDB();
        orderMessageSystem.sendNotification();

        MessageSystem promotionMessageSystem = new MessageSystem(promotionMessage);
        promotionMessageSystem.readDB();
        promotionMessageSystem.sendNotification();

        MessageSystem offerMessageSystem = new MessageSystem(offerMessage);
        offerMessageSystem.readDB();
        offerMessageSystem.sendNotification();
    }
}
