package it.slyce.slyce_messaging.messenger.message.messageItem.spinner;

import android.view.View;

import it.slyce.slyce_messaging.messenger.message.MessageSource;
import it.slyce.slyce_messaging.messenger.message.messageItem.MessageItem;
import it.slyce.slyce_messaging.messenger.message.messageItem.MessageItemType;
import it.slyce.slyce_messaging.messenger.message.messageItem.MessageViewHolder;
import com.squareup.picasso.Picasso;

/**
 * Created by matthewpage on 7/5/16.
 */
public class SpinnerItem extends MessageItem {
    public SpinnerItem() {
        super(null);
    }

    @Override
    public void buildMessageItem(MessageViewHolder messageViewHolder, Picasso picasso, View.OnClickListener onClickListener) {

    }

    @Override
    public MessageItemType getMessageItemType() {
        return MessageItemType.SPINNER;
    }

    @Override
    public MessageSource getMessageSource() {
        return MessageSource.EXTERNAL_USER;
    }

    @Override
    public String getMessageLink() {
        return null;
    }
}
