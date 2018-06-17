package com.asan.dao;

import com.asan.pojo.Role;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class RoleDao implements IRoleDao {
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Role> listRoles(Role role, int skip, int rows) {
        if (rows < 0) {
            return null;
        }
        StringBuffer sb = new StringBuffer("SELECT id, create_time, role_name, role_info from role where 1=1 ");
        if (rows > 0) {
            sb.append(" limit " + skip + " , " + rows);
        }
        List<Role> roles = jdbcTemplate.query(sb.toString(), new RoleRowMapper());
        return roles;
    }

    @Override
    public String executSql(String sql) {

        this.jdbcTemplate.execute(sql);
        return "";
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    class RoleRowMapper implements RowMapper<Role> {
        public Role mapRow(ResultSet rs, int index) throws SQLException {
            Role log = new Role();
            log.setId(rs.getInt("id"));
            log.setCreateTime(rs.getTimestamp("create_time"));
            log.setRoleName(rs.getString("role_name"));
            log.setRoleInfo(rs.getString("role_info"));
            return log;
        }
    }

}
