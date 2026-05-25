//Added JUnit tests for Message validation, hashing, and messaging functions 
import org.junit.Test;

import static org.junit.Assert.*;

public class MessageTest {

    @Test
    public void testMessageLengthSuccess() {

        Message msg = new Message(
                0,
                "+27821234567",
                "Hi tonight"
        );

        assertEquals(
                "Message ready to send.",
                msg.checkMessageLength()
        );
    }

    @Test
    public void testMessageLengthFailure() {

        String longMessage = "a".repeat(260);

        Message msg = new Message(
                0,
                "+27821234567",
                longMessage
        );

        assertEquals(
                "Message exceeds 250 characters by 10 [enterprise number here]; please reduce the size.",
                msg.checkMessageLength()
        );
    }

    @Test
    public void testRecipientSuccess() {

        Message msg = new Message(
                0,
                "+27821234567",
                "Hi"
        );

        assertEquals(
                "Cell phone number successfully captured.",
                msg.checkRecipientCell()
        );
    }

    @Test
    public void testRecipientFailure() {

        Message msg = new Message(
                0,
                "0821234567",
                "Hi"
        );

        assertEquals(
                "Cell phone number is incorrectly formatted or does not contain an international code. Please correct the number and try again.",
                msg.checkRecipientCell()
        );
    }

    @Test
    public void testMessageHash() {

        Message msg = new Message(
                0,
                "+27821234567",
                "Hi tonight"
        );

        assertEquals(
                "00:0:HITONIGHT",
                msg.createMessageHash()
        );
    }

    @Test
    public void testSendMessage() {

        Message msg = new Message(
                0,
                "+27821234567",
                "Hi"
        );

        assertEquals(
                "Message successfully sent.",
                msg.sentMessage(1)
        );
    }

    @Test
    public void testStoreMessage() {

        Message msg = new Message(
                0,
                "+27821234567",
                "Hi"
        );

        assertEquals(
                "Message successfully stored.",
                msg.sentMessage(3)
        );
    }
}
