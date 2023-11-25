/**
 * Created by tomasz_taw
 * Date: 25.11.2023
 * Time: 12:10
 * Project Name: websocket
 * Description:
 */
package pl.taw.user;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class User {

    @Id
    private String nickName;
    private String fullName;
    private Status status;
}
