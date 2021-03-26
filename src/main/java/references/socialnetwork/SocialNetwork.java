package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {
    private List<Member> members = new ArrayList<>();

    private Member findByName(String name) {
        for (Member item: members) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        throw new IllegalArgumentException("not found");
    }

    public void addMember(String name) {
        members.add(new Member(name));
    }

    public void connect(String name,String otherName) {
        findByName(name).connectMember(findByName(otherName));
    }

    public List<String> bidirectionalConnections() {
        List<String> result = new ArrayList<>();
        for (Member item: members) {
            for (Member conn: item.getConnections()) {
                if (conn.getConnections().contains(item)) {
                    result.add(item+" - "+conn);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork();
        socialNetwork.addMember("Joe");
        socialNetwork.addMember("John");
        socialNetwork.addMember("Jane");
        socialNetwork.addMember("Richard");

        socialNetwork.connect("Joe", "John");
        socialNetwork.connect("John", "Joe");

        System.out.println(socialNetwork.bidirectionalConnections());
    }
}
