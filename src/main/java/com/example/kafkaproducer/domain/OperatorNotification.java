package com.example.kafkaproducer.domain;

public class OperatorNotification {
    private Integer operatorNotificationId;
    private Integer operatorNotificationType;
    private Integer operatorNotificationUserId;
    private Integer operatorNotificationIsRead;
    private String operatorNotificationMessage;
    private String operatorNotificationCreationDate;
    private String operatorNotificationModifiedDate;

    public Integer getOperatorNotificationId() {
        return operatorNotificationId;
    }

    public void setOperatorNotificationId(Integer operatorNotificationId) {
        this.operatorNotificationId = operatorNotificationId;
    }

    public Integer getOperatorNotificationType() {
        return operatorNotificationType;
    }

    public void setOperatorNotificationType(Integer operatorNotificationType) {
        this.operatorNotificationType = operatorNotificationType;
    }

    public Integer getOperatorNotificationUserId() {
        return operatorNotificationUserId;
    }

    public void setOperatorNotificationUserId(Integer operatorNotificationUserId) {
        this.operatorNotificationUserId = operatorNotificationUserId;
    }

    public Integer getOperatorNotificationIsRead() {
        return operatorNotificationIsRead;
    }

    public void setOperatorNotificationIsRead(Integer operatorNotificationIsRead) {
        this.operatorNotificationIsRead = operatorNotificationIsRead;
    }

    public String getOperatorNotificationMessage() {
        return operatorNotificationMessage;
    }

    public void setOperatorNotificationMessage(String operatorNotificationMessage) {
        this.operatorNotificationMessage = operatorNotificationMessage;
    }

    public String getOperatorNotificationCreationDate() {
        return operatorNotificationCreationDate;
    }

    public void setOperatorNotificationCreationDate(String operatorNotificationCreationDate) {
        this.operatorNotificationCreationDate = operatorNotificationCreationDate;
    }

    public String getOperatorNotificationModifiedDate() {
        return operatorNotificationModifiedDate;
    }

    public void setOperatorNotificationModifiedDate(String operatorNotificationModifiedDate) {
        this.operatorNotificationModifiedDate = operatorNotificationModifiedDate;
    }
}