package collectionsset;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class StringsHandler {

    public Set<String> filterUniqueStrings(Collection<String> strings) {
        Set<String> result = new HashSet<>(strings);
        return result;
    }

    public Set<String> selectIdenticalStrings(Set<String> strings, Set<String> anotherStrings) {
        strings.retainAll(anotherStrings);
        return strings;
    }
}
