package lk.example.test.util;

import lombok.*;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 1/20/22
 **/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StandardResponse {

    private String code;
    private String message;
    private Object data;
}
