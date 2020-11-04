package template.jdbc.dao;

import template.jdbc.AbstractJdbcTemplate;
import template.jdbc.Member;
import template.jdbc.RowMapper;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author jill
 */
public class MemberDao extends AbstractJdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll() {
        @SuppressWarnings("unused") final String sql = "select * from t_member";
        return super.executeQuery((RowMapper<Member>) (rs, rowNum) -> {
            Member member = new Member();
            //字段过多，原型模式
            member.setUsername(rs.getString("username"));
            member.setPassword(rs.getString("password"));
            member.setAge(rs.getInt("age"));
            member.setAddr(rs.getString("addr"));
            return member;
        });
    }
}
