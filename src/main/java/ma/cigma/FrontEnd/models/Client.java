package ma.cigma.FrontEnd.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
    private long id;
    private String name;
    public Client() {
    }
    public Client(long id, String name) {
        this.id = id;
        this.name = name;
    }
}