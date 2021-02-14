package lambdaoptional;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class SocialNetwork {
    private List<Member> members;

    public SocialNetwork(List<Member> members) {
        this.members = members;
    }

    public Optional<Member> findFirst(Predicate<Member> predicate) {
        for (Member item : members) {
            if (predicate.test(item)) {
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }

    public Optional<Double> averageNumberOfSkills() {
        if (members.isEmpty()){
            return Optional.empty();
        }
        double sum = 0.0;
        for (Member item: members){
            sum += item.getSkills().size();
        }
        return Optional.of(sum/members.size());
    }

}
