package it.slyce.messaging.message.messageItem;

import it.slyce.messaging.message.Message;
import it.slyce.messaging.message.MessageSource;
import it.slyce.messaging.utils.DateUtils;
import com.squareup.picasso.Picasso;

/**
 * Created by John C. Hunchar on 5/12/16.
 */
public abstract class MessageItem {

    protected boolean isFirstConsecutiveMessageFromSource;
    protected boolean isLastConsecutiveMessageFromSource;

    protected String avatarUrl;
    protected String initials;
    protected Message message;
    protected String date;

    public MessageItem(Message message) {
        this.message = message;
    }

    public abstract void buildMessageItem(
            MessageViewHolder messageViewHolder,
            Picasso picasso);

    public abstract MessageItemType getMessageItemType();

    public abstract MessageSource getMessageSource();

    public Message getMessage() {
        return message;
    }

    public int getMessageItemTypeOrdinal() {
        return getMessageItemType().ordinal();
    }

    public void setIsFirstConsecutiveMessageFromSource(boolean isFirstConsecutiveMessageFromSource) {
        this.isFirstConsecutiveMessageFromSource = isFirstConsecutiveMessageFromSource;
    }

    public void setIsLastConsecutiveMessageFromSource(boolean isLastConsecutiveMessageFromSource) {
        this.isLastConsecutiveMessageFromSource = isLastConsecutiveMessageFromSource;
    }

    public String getDate() {
        return date;
    }

    public void updateDate(long time) {
        this.date = DateUtils.getTimestamp(time);
    }
}
