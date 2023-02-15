package horstmann.topics.inner_classes.anonymous_inner.example4;

import java.util.ArrayList;
import java.util.List;

public class AnonymousArrayListTest {
    public static void main(String[] args) {
        var friends = new ArrayList<String>();
        friends.add("Harry");
        friends.add("Tony");
        invite(friends);

        invite(new ArrayList<String>() {{
            add("Harry");
            add("Tony");
        }});
    }

    private static void invite(List<String> friends) {

    }
}
