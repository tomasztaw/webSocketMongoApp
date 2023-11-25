/**
 * Created by tomasz_taw
 * Date: 25.11.2023
 * Time: 13:23
 * Project Name: websocket
 * Description:
 */
package pl.taw.chatroom;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class ChatRoom {

    @Id
    private String id;
    private String chatId;
    private String senderId;
    private String recipientId;

}
