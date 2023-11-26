/**
 * Created by tomasz_taw
 * Date: 26.11.2023
 * Time: 15:50
 * Project Name: websocket
 * Description:
 */
package pl.taw.chat;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChatNotification {

    private String id;
    private String senderId;
    private String recipientId;
    private String content;

}
