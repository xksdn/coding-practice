package webjava.servlet.student.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepos {
    private static final Map<Long, Member> cache = new HashMap<>();
    //private static long seq = 0L;
    private static long seq = 20240000L;

    public Member save(Member member) {
        member.setId(++seq);
        cache.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id) {

        return cache.get(id);
    }

    public List<Member> findAll() {
        return new ArrayList<>(cache.values());
    }

    public void clearCache() {
        cache.clear();
    }
}
