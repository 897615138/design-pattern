package template.jdbc;


import template.jdbc.dao.MemberDao;

import java.util.List;

/**
 * @author jill
 */
public class MemberDaoTest {

    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
        System.out.println(result);
    }
}
