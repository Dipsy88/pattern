package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

    String name;
    String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    String print (MenuComponent menuComponent){
        StringBuilder builder = new StringBuilder(this.name);
        builder.append(":");
        builder.append(this.url);
        builder.append("\n");
        return builder.toString();
    }


    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public abstract String toString();
}
