package template.jdbc;

import java.sql.ResultSet;

/**
 * ORM映射定制化的接口
 *
 * @author jill
 */
public interface RowMapper<T> {
    /**
     * mapRow
     * @param rs rs
     * @param rowNum rowNum
     * @return return
     * @throws Exception 异常
     */
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
